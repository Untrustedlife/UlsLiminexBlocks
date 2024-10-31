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
}
