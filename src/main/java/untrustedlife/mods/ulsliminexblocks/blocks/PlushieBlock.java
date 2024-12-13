package untrustedlife.mods.ulsliminexblocks.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

/**
 * A block representing a normal block.
 * 
 * @author Untrustedlife
 */
public class PlushieBlock extends Block {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    // For simplicity, define some voxel shapes that represent the plushie from different angles.
    // These coordinates are just examples: block shapes go from 0 to 16 in each dimension.
    // Adjust these to match your model.
    private static final VoxelShape SHAPE_NORTH = Block.box(4, 0, 4, 12, 12, 12);
    private static final VoxelShape SHAPE_SOUTH = rotateShape(SHAPE_NORTH, Rotation.CLOCKWISE_180);
    private static final VoxelShape SHAPE_EAST = rotateShape(SHAPE_NORTH, Rotation.CLOCKWISE_90);
    private static final VoxelShape SHAPE_WEST = rotateShape(SHAPE_NORTH, Rotation.COUNTERCLOCKWISE_90);

    /**
     * Constructor for PlushieBlock. 
     * Sets the block material to specified material.
     */
    public PlushieBlock(String name, Material material, SoundType sound, float strength, float resistance) {
        super(Properties.of(material)
                .strength(strength, resistance)
                .sound(sound)
                .isSuffocating(PlushieBlock::isBlockSuffocating)
                .noOcclusion());
        this.blockNameForId = name;
    }

    protected static boolean isBlockSuffocating(BlockState state, BlockGetter world, BlockPos pos) {
        return false;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        // Set the facing based on the direction the player is looking horizontally
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }
    /**
     * Rotates the block state when the player rotates the block or when the block is placed in a rotated structure.
     * 
     * @param state The current state of the block.
     * @param rotation The rotation that should be applied.
     * @return The new BlockState with the updated FACING property.
     */
    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    /**
     * Mirrors the block state along the specified axis by first converting the mirror action into a rotation
     * and then calling the rotate method.
     * 
     * @param state The current state of the block.
     * @param mirrorIn The mirror transformation to apply.
     * @return The new BlockState after the mirror has been applied.
     */
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        // Use the block's existing rotation logic to flip the direction and call rotate without using a deprecated method
        return this.rotate(state, mirrorIn.getRotation(state.getValue(FACING)));
    }

    /**
     * Returns the shape of the block. This is the visual outline used for selection.
     */
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Direction dir = state.getValue(FACING);
        return switch (dir) {
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case EAST  -> SHAPE_EAST;
            case WEST  -> SHAPE_WEST;
            default -> SHAPE_NORTH;
        };
    }

    /**
     * If you want the collision shape to match the shape:
     */
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return getShape(state, worldIn, pos, context);
    }

    /**
     * Utility method to rotate a VoxelShape. 
     */
    private static VoxelShape rotateShape(VoxelShape shape, Rotation rot) {
        return shape;
    }

    private final String blockNameForId;
}