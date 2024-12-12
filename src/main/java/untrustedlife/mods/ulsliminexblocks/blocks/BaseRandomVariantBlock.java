package untrustedlife.mods.ulsliminexblocks.blocks;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import untrustedlife.mods.ulsliminexblocks.UntrustedDiceRolling;


/**
 * A block representing a block that cna randomly change texture when placed.
 * 
 * @author Untrustedlife
 */
public class BaseRandomVariantBlock extends BaseBlock {
    /**
     * Constructor for BaseBlock. 
     * Sets the block material to specified material.
     */
    public int maxVarientForRandomization=0;
    public static final IntegerProperty VARIANT=IntegerProperty.create("variant", 1, 100);;

    public BaseRandomVariantBlock(String name, Material material, SoundType sound, float strength, float resistance,int maxVarient) {
        super(name,material,sound,strength,resistance);
        this.blockNameForId = name;
        this.registerDefaultState(this.stateDefinition.any()
        .setValue(this.VARIANT, 1)); // Default variant 1
        this.maxVarientForRandomization = maxVarient;
    }


    /**
     * Defines the block state properties, in this case, only VARIANT.
     * 
     * @param builder The state definition builder used to add properties for the block.
     */
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(this.VARIANT); // Add VARIANT properties
    }

    /**
     * Determines the default facing variant when the block is placed.
     * The block will have a random variant.
     * 
     * @param context Provides information about the placement event such as player and position.
     * @return The BlockState with the appropriate VARIANT value.
     */
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        int randomVariant = UntrustedDiceRolling.rollDice(maxVarientForRandomization);
        return this.defaultBlockState()
            .setValue(this.VARIANT, randomVariant);  // Set the variant to the random variant
    }

    protected static boolean isBlockSuffocating(BlockState state, BlockGetter world, BlockPos pos) {
        return true;
    }
    private final String blockNameForId;
}