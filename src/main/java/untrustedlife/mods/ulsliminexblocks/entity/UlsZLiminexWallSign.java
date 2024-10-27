package untrustedlife.mods.ulsliminexblocks.entity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class UlsZLiminexWallSign  extends WallSignBlock {
        public UlsZLiminexWallSign(BlockBehaviour.Properties properties, WoodType woodType) {
        super(properties, woodType);
    }
    
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState){
        return new UlsZLiminexSignBlockEntity(blockPos, blockState);
    }
}
