package untrustedlife.mods.ulsliminexblocks.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

/**
 * A block representing a normal block.
 * 
 * @author Untrustedlife
 */
public class EmissiveBlock extends Block {
    protected int lightLevel;
    private final String blockNameForId;
    /**
     * Constructor for EmissiveBlock. 
     * Sets the block material to specified material and light level.
     */
    public EmissiveBlock(String name, Material material, SoundType sound, float strength, float resistance, int initialLightLevel) {
        super(Properties.of(material)
                .strength(strength, resistance)
                .sound(sound)
                .isSuffocating(BaseBlock::isBlockSuffocating).emissiveRendering(EmissiveBlock::emissiveRendering));
        this.blockNameForId = name;
        this.lightLevel = initialLightLevel;
    }

    protected static boolean emissiveRendering(BlockState state, BlockGetter world, BlockPos pos) {
        return true;
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter world, BlockPos pos) {
        return this.lightLevel;
    }



}