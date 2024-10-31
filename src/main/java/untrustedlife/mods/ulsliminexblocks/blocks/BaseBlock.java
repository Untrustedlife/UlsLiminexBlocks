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
    /**
     * Constructor for BaseBlock. 
     * Sets the block material to specified material.
     */
    public BaseBlock(String name, Material material, SoundType sound, float strength, float resistance) {
        super(Properties.of(material)
                .strength(strength, resistance)
                .sound(sound)
                .isSuffocating(BaseBlock::isBlockSuffocating));
        this.blockNameForId = name;
    }

    protected static boolean isBlockSuffocating(BlockState state, BlockGetter world, BlockPos pos) {
        return true;
    }


    private final String blockNameForId;
}