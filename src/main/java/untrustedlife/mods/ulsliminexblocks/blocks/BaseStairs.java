package untrustedlife.mods.ulsliminexblocks.blocks;

import java.util.function.Supplier;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;

public class BaseStairs extends StairBlock {
    /**
     * Constructor for BaseStairs. 
     * Sets the block material to specified material.
     */
    public BaseStairs(Supplier<BlockState> baseStateSupplier, String name, Material material, SoundType sound, float strength, float resistance) {
        super(baseStateSupplier, Properties.of(material)
            .strength(strength, resistance)
            .sound(sound)
            .isSuffocating(BaseStairs::isBlockSuffocating).dynamicShape());

        this.blockNameForId = name;
        
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(HALF, Half.BOTTOM).setValue(SHAPE, StairsShape.STRAIGHT).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    protected static boolean isBlockSuffocating(BlockState state, BlockGetter world, BlockPos pos) {
        return false;
    }
    private final String blockNameForId;

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, HALF, SHAPE, WATERLOGGED);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
     public BlockState rotate(BlockState p_56922_, Rotation p_56923_) {
        return p_56922_.setValue(FACING, p_56923_.rotate(p_56922_.getValue(FACING)));
     }


     @Override
    public BlockState mirror(BlockState p_56919_, Mirror p_56920_) {
      Direction direction = p_56919_.getValue(FACING);
      StairsShape stairsshape = p_56919_.getValue(SHAPE);
      switch (p_56920_) {
         case LEFT_RIGHT:
            if (direction.getAxis() == Direction.Axis.Z) {
               switch (stairsshape) {
                  case INNER_LEFT:
                     return p_56919_.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.INNER_RIGHT);
                  case INNER_RIGHT:
                     return p_56919_.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.INNER_LEFT);
                  case OUTER_LEFT:
                     return p_56919_.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.OUTER_RIGHT);
                  case OUTER_RIGHT:
                     return p_56919_.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.OUTER_LEFT);
                  default:
                     return p_56919_.rotate(Rotation.CLOCKWISE_180);
               }
            }
            break;
         case FRONT_BACK:
            if (direction.getAxis() == Direction.Axis.X) {
               switch (stairsshape) {
                  case INNER_LEFT:
                     return p_56919_.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.INNER_LEFT);
                  case INNER_RIGHT:
                     return p_56919_.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.INNER_RIGHT);
                  case OUTER_LEFT:
                     return p_56919_.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.OUTER_RIGHT);
                  case OUTER_RIGHT:
                     return p_56919_.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.OUTER_LEFT);
                  case STRAIGHT:
                     return p_56919_.rotate(Rotation.CLOCKWISE_180);
               }
            }
      }

      return super.mirror(p_56919_, p_56920_);
   }
}
