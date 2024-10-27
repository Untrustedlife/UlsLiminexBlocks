package untrustedlife.mods.ulsliminexblocks.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import untrustedlife.mods.ulsliminexblocks.UlsZliminex;
import untrustedlife.mods.ulsliminexblocks.blocks.UlsZliminexBlocks;

public class UlsZliminexEntities {
        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, UlsZliminex.MODID);

        public static final RegistryObject<BlockEntityType<UlsZLiminexSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("grayscale_sign_entity", () ->
                    BlockEntityType.Builder.of(UlsZLiminexSignBlockEntity::new,
                            UlsZliminexBlocks.GRAYSCALE_PLANK_SIGN.get(),
                            UlsZliminexBlocks.GRAYSCALE_PLANK_WALL_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
