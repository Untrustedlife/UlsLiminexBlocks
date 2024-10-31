package untrustedlife.mods.ulsliminexblocks.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class EmissiveSlab extends SlabBlock {
    protected int lightLevel;
    private final String blockNameForId;

    /**
     * Constructor for EmissiveSlab. 
     * Sets the block material to specified material and light level.
     */
    public EmissiveSlab(String name, Material material, SoundType sound, float strength, float resistance, int initialLightLevel) {
        super(Properties.of(material)
            .strength(strength, resistance)
            .sound(sound)
            .noOcclusion() 
            .isRedstoneConductor((state, world, pos) -> false) 
            .isSuffocating(BaseSlab::isBlockSuffocating).emissiveRendering(EmissiveSlab::emissiveRendering).dynamicShape());
        this.lightLevel = initialLightLevel;
        this.blockNameForId = name;
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

