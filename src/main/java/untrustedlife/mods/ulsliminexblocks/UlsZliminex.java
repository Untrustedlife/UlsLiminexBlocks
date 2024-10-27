package untrustedlife.mods.ulsliminexblocks;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import untrustedlife.mods.ulsliminexblocks.blocks.UlsZliminexBlocks;
import untrustedlife.mods.ulsliminexblocks.entity.UlsZliminexEntities;
import untrustedlife.mods.ulsliminexblocks.entity.UlsZliminexWoodTypes;
import untrustedlife.mods.ulsliminexblocks.features.UlsZliminexConfiguredFeatures;
import untrustedlife.mods.ulsliminexblocks.features.UlsZliminexPlacedFeatures;
import untrustedlife.mods.ulsliminexblocks.items.UlsZliminexItems;

/**
 * Actually creates the mod.
 *
 * @author Untrustedlife
 */
@Mod(UlsZliminex.MODID)
@Mod.EventBusSubscriber(modid = UlsZliminex.MODID, bus = Bus.MOD)
public class UlsZliminex {
    public static final String MODID = "ulsliminexblocks";
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public UlsZliminex() {
        // Register the setup method for modloading
        LOGGER.info("ulsliminexblocks loaded.");
         IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
         bus.addListener(this::onSetupEvent);
         
        UlsZliminexItems.register(bus);
        LOGGER.info("Items loaded.");

        UlsZliminexBlocks.register(bus);
        LOGGER.info("Blocks loaded.");

        UlsZliminexEntities.register(bus);
        LOGGER.info("Entities loaded.");

        BlockEntityRenderers.register(UlsZliminexEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);

        UlsZliminexConfiguredFeatures.register(bus);
        LOGGER.info("Configured Features loaded.");

        UlsZliminexPlacedFeatures.register(bus);
        LOGGER.info("Placed Features loaded.");
    }

    public void onSetupEvent(final FMLCommonSetupEvent event) {
        LOGGER.info("Common setup event triggered");

        Sheets.addWoodType(UlsZliminexWoodTypes.GRAYSCALE);
    }

}