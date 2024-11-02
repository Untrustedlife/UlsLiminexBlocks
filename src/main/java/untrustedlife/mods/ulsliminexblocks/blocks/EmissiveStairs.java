package untrustedlife.mods.ulsliminexblocks.blocks;

import java.util.function.Supplier;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class EmissiveStairs extends StairBlock {
    protected int lightLevel;
    private final String blockNameForId;

    /**
     * Constructor for EmissiveStairs. 
     * Sets the block material to specified material and light level..
     */
    public EmissiveStairs(Supplier<BlockState> baseStateSupplier, String name, Material material, SoundType sound, float strength, float resistance, int initialLightLevel) {
        super(baseStateSupplier, Properties.of(material)
            .strength(strength, resistance)
            .sound(sound)
            .noOcclusion() 
            .isRedstoneConductor((state, world, pos) -> false) 
            .isSuffocating(BaseStairs::isBlockSuffocating).emissiveRendering(EmissiveStairs::emissiveRendering).dynamicShape());
            this.blockNameForId = name;
            this.lightLevel = initialLightLevel;
        
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(HALF, Half.BOTTOM).setValue(SHAPE, StairsShape.STRAIGHT).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, HALF, SHAPE, WATERLOGGED);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    protected static boolean emissiveRendering(BlockState state, BlockGetter world, BlockPos pos) {
        return true;
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter world, BlockPos pos) {
        return this.lightLevel;
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter world, BlockPos pos) {
        return 0; // Sets block to not block light, removing shadows
    }

    @Override
    public float getShadeBrightness(BlockState state, BlockGetter world, BlockPos pos) {
        return 1.0f; // Ensures full brightness, minimizing shadows
    }
    
   @Override
   public boolean propagatesSkylightDown(BlockState p_48740_, BlockGetter p_48741_, BlockPos p_48742_) {
      return true;
   }

   @Override
   public boolean useShapeForLightOcclusion(BlockState state) {
       return false;
   }
}