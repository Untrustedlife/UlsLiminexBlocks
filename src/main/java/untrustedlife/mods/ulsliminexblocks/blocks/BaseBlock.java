package untrustedlife.mods.ulsliminexblocks.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.SoundType;


/**
 * A block representing a normal block.
 * 
 * @author Untrustedlife
 */
public class BaseBlock extends Block {
    /**
     * Constructor for BaseBlock. 
     * Sets the block material to STONE with standard properties.
     */
    public BaseBlock(String name) {
        super(Properties.of(Material.STONE)
                .strength(1.5F, 6.0F)  // Standard stone strength: 1.5 hardness, 6 resistance
                .sound(SoundType.STONE)); // Stone sound type
        this.blockNameForId = name;
    }

    // Optional: You could remove this if you aren't using it
    private final String blockNameForId;
}