package untrustedlife.mods.ulsliminexblocks.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class BaseCarpet extends CarpetBlock {
    public BaseCarpet(String name, Material material, SoundType sound, float strength, float resistance) {
        super(Properties.of(material)
                .strength(strength, resistance)
                .sound(sound)
                .noOcclusion()
                .isSuffocating(BaseCarpet::isBlockSuffocating));
        this.blockNameForId = name;
    }

    protected static boolean isBlockSuffocating(BlockState state, BlockGetter world, BlockPos pos) {
        return false;
    }
    private final String blockNameForId;
}
