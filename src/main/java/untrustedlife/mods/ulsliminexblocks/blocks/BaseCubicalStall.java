package untrustedlife.mods.ulsliminexblocks.blocks;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.fml.ModList;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
public class BaseCubicalStall  extends IronBarsBlock  {
      public static final BooleanProperty CONNECT_BACK = BooleanProperty.create("connect_back");

        /**
     * Constructor for BaseBlock. 
     * Sets the block material to specified material.
     */
    public BaseCubicalStall(String name, Material material, SoundType sound, float strength, float resistance) {
        super(createProperties(material, sound, strength, resistance));
        this.blockNameForId = name;
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
      BlockGetter blockgetter = context.getLevel();
      BlockPos blockpos = context.getClickedPos();
      FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
      BlockPos blockpos1 = blockpos.north();
      BlockPos blockpos2 = blockpos.south();
      BlockPos blockpos3 = blockpos.west();
      BlockPos blockpos4 = blockpos.east();
      BlockState blockstate = blockgetter.getBlockState(blockpos1);
      BlockState blockstate1 = blockgetter.getBlockState(blockpos2);
      BlockState blockstate2 = blockgetter.getBlockState(blockpos3);
      BlockState blockstate3 = blockgetter.getBlockState(blockpos4);
      BlockState currentState = context.getLevel().getBlockState(blockpos); // Get the current state if it exists
      // Preserve CONNECT_BACK if the block is being replaced and already has this property
      boolean connectBack = currentState.hasProperty(CONNECT_BACK) ? currentState.getValue(CONNECT_BACK) : false;
      return this.defaultBlockState().
      setValue(NORTH, Boolean.valueOf(this.attachTo(blockstate,false,context.getLevel().getBlockState(blockpos)))).
      setValue(SOUTH, Boolean.valueOf(this.attachTo(blockstate1,false,context.getLevel().getBlockState(blockpos)))).
      setValue(WEST, Boolean.valueOf(this.attachTo(blockstate2,false,context.getLevel().getBlockState(blockpos)))).
      setValue(EAST, Boolean.valueOf(this.attachTo(blockstate3,false,context.getLevel().getBlockState(blockpos)))).
      setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER)).
      setValue(CONNECT_BACK,Boolean.valueOf(connectBack));
   }

   public BlockState updateShape(BlockState blockstate, Direction p_54212_, BlockState p_54213_, LevelAccessor p_54214_, BlockPos p_54215_, BlockPos p_54216_) {
      if (blockstate.getValue(WATERLOGGED)) {
         p_54214_.scheduleTick(p_54215_, Fluids.WATER, Fluids.WATER.getTickDelay(p_54214_));
      }
      return p_54212_.getAxis().isHorizontal() ? blockstate.setValue(PROPERTY_BY_DIRECTION.get(p_54212_), Boolean.valueOf(this.attachTo(p_54213_, Boolean.valueOf(p_54213_.isFaceSturdy(p_54214_, p_54216_, p_54212_.getOpposite())),blockstate))) : super.updateShape(blockstate, p_54212_, p_54213_, p_54214_, p_54215_, p_54216_);
   }

   public VoxelShape getVisualShape(BlockState p_54202_, BlockGetter p_54203_, BlockPos p_54204_, CollisionContext p_54205_) {
      return Shapes.empty();
   }

   public boolean skipRendering(BlockState p_54207_, BlockState p_54208_, Direction p_54209_) {
      if (p_54208_.is(this)) {
         if (!p_54209_.getAxis().isHorizontal()) {
            return true;
         }

         if (p_54207_.getValue(PROPERTY_BY_DIRECTION.get(p_54209_)) && p_54208_.getValue(PROPERTY_BY_DIRECTION.get(p_54209_.getOpposite()))) {
            return true;
         }
      }

      return super.skipRendering(p_54207_, p_54208_, p_54209_);
   }

   public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_54221_) {
      p_54221_.add(NORTH, EAST, WEST, SOUTH, WATERLOGGED,CONNECT_BACK);
   }

   @SuppressWarnings("deprecation")
   @Override
   public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
      if (player.isCrouching()) { // Allow toggling only when sneaking
         boolean current = state.getValue(CONNECT_BACK);
         // Update the block state with the new CONNECT_BACK value
         if (!world.isClientSide){
            var newSTate = state.setValue(CONNECT_BACK, Boolean.valueOf(!current));
            world.setBlockAndUpdate(pos, newSTate);
            // Force the neighbors to re-check their shape/connection
            world.updateNeighborsAt(pos, this); 

            BlockState finalState = newSTate;
            for (Direction dir : Direction.Plane.HORIZONTAL) {
               BlockPos neighborPos = pos.relative(dir);
               BlockState neighbor = world.getBlockState(neighborPos);
               finalState = finalState.updateShape(dir, neighbor, world, pos, neighborPos);
            }

            world.setBlockAndUpdate(pos, finalState);
         }
         // Send action bar text to the player
         player.displayClientMessage(Component.literal("Sturdy Block connection: " + (!current ? "Enabled" : "Disabled")), true);
         return InteractionResult.SUCCESS;
      }
      return super.use(state, world, pos, player, hand, hit);
   }

    /**
     * Helper method to create block properties based on whether or not this block is "glass-like."
     */
    private static Properties createProperties(Material material, SoundType sound, float strength, float resistance) {
        Properties props = Properties.of(material)
                .strength(strength, resistance)
                .sound(sound);
            props=props.noOcclusion();
            // If you want to prevent suffocation or rendering the inside of the block, also override isViewBlocking
            props=props.isSuffocating((state, level, pos) -> false);
            props=props.isViewBlocking((state, level, pos) -> false);
        return props;
    }

    public boolean attachTo(BlockState block, Boolean faceIsSturdy, BlockState thisBlock) {
      boolean connectsToCustomTag = false;
      if (ModList.get().isLoaded("cfm")) { 
        connectsToCustomTag = block.is(BlockTags.create(new ResourceLocation("cfm", "fence_gates/picket")));
      }
      if (thisBlock.hasProperty(CONNECT_BACK)){
         boolean connectBack = thisBlock.getValue(CONNECT_BACK);
         if (!connectBack){
            faceIsSturdy=false;
         }
      }
      else {
         faceIsSturdy=false;
      }
      return !isExceptionForConnection(block) && (block.getBlock() instanceof IronBarsBlock || 
      faceIsSturdy ||
      block.is(BlockTags.WALLS) ||
      block.is(BlockTags.DOORS) || 
      block.is(BlockTags.FENCE_GATES) || 
      block.is(BlockTags.FENCES) ||
       connectsToCustomTag);
   }

      @Override
       public BlockState rotate(BlockState p_52341_, Rotation p_52342_) {
      switch (p_52342_) {
         case CLOCKWISE_180:
            return p_52341_.setValue(NORTH, p_52341_.getValue(SOUTH)).setValue(EAST, p_52341_.getValue(WEST)).setValue(SOUTH, p_52341_.getValue(NORTH)).setValue(WEST, p_52341_.getValue(EAST));
         case COUNTERCLOCKWISE_90:
            return p_52341_.setValue(NORTH, p_52341_.getValue(EAST)).setValue(EAST, p_52341_.getValue(SOUTH)).setValue(SOUTH, p_52341_.getValue(WEST)).setValue(WEST, p_52341_.getValue(NORTH));
         case CLOCKWISE_90:
            return p_52341_.setValue(NORTH, p_52341_.getValue(WEST)).setValue(EAST, p_52341_.getValue(NORTH)).setValue(SOUTH, p_52341_.getValue(EAST)).setValue(WEST, p_52341_.getValue(SOUTH));
         default:
            return p_52341_;
      }
   }

   @Override
   public BlockState mirror(BlockState p_52338_, Mirror p_52339_) {
      switch (p_52339_) {
         case LEFT_RIGHT:
            return p_52338_.setValue(NORTH, p_52338_.getValue(SOUTH)).setValue(SOUTH, p_52338_.getValue(NORTH));
         case FRONT_BACK:
            return p_52338_.setValue(EAST, p_52338_.getValue(WEST)).setValue(WEST, p_52338_.getValue(EAST));
         default:
            return super.mirror(p_52338_, p_52339_);
      }
   }

    private final String blockNameForId;
}
