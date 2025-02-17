package untrustedlife.mods.ulsliminexblocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class UlsZLiminexSignBlockEntity extends SignBlockEntity {

    public UlsZLiminexSignBlockEntity(BlockPos p_155700_, BlockState p_155701_) {
        super(p_155700_, p_155701_);
    }
    
    @Override
    public BlockEntityType<?> getType(){
        return UlsZliminexEntities.SIGN_BLOCK_ENTITIES.get();
    }
}
