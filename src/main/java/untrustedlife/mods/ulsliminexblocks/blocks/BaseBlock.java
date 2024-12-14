package untrustedlife.mods.ulsliminexblocks.blocks;

import net.minecraft.core.BlockPos;
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
public class BaseBlock extends Block {
    private final boolean glassLike;
    /**
     * Constructor for BaseBlock. 
     * Sets the block material to specified material.
     */
    public BaseBlock(String name, Material material, SoundType sound, float strength, float resistance) {
        super(createProperties(material, sound, strength, resistance, false));
        this.blockNameForId = name;
        this.glassLike = false;
    }

    public BaseBlock(String name, Material material, SoundType sound, float strength, float resistance, boolean glassLike) {
        super(createProperties(material, sound, strength, resistance, glassLike));
        this.blockNameForId = name;
        this.glassLike = glassLike;
    }

    protected static boolean isBlockSuffocating(BlockState state, BlockGetter world, BlockPos pos) {
        return true;
    }

    public boolean isGlassLike() {
        return glassLike;
    }

    public String getBlockNameForId() {
        return blockNameForId;
    }

    /**
     * Helper method to create block properties based on whether or not this block is "glass-like."
     */
    private static Properties createProperties(Material material, SoundType sound, float strength, float resistance, boolean glassLike) {
        Properties props = Properties.of(material)
                .strength(strength, resistance)
                .sound(sound);

        // For glass-like blocks, disable occlusion and set suffocating to false
        if (glassLike) {
            props.noOcclusion();
            // If you want to prevent suffocation or rendering the inside of the block, also override isViewBlocking
            props.isSuffocating((state, level, pos) -> false);
            props.isViewBlocking((state, level, pos) -> false);
        } else {
            // If not glass, keep the default suffocation logic or override as needed
            props.isSuffocating(BaseBlock::isBlockSuffocating);
        }

        return props;
    }

    private final String blockNameForId;
}