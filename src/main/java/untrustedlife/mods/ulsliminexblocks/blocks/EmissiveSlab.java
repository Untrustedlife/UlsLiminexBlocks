package untrustedlife.mods.ulsliminexblocks.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;


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


}

