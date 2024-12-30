package untrustedlife.mods.ulsliminexblocks;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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

        //BlockEntityRenderers.register(UlsZliminexEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);

        UlsZliminexConfiguredFeatures.register(bus);
        LOGGER.info("Configured Features loaded.");

        UlsZliminexPlacedFeatures.register(bus);
        LOGGER.info("Placed Features loaded.");

        //UlsLiminexWanderingTraderTrades.register(bus);
        //LOGGER.info("Trades Loaded.");

    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event){
        WoodType.register(UlsZliminexWoodTypes.GRAYSCALE);
        BlockEntityRenderers.register(UlsZliminexEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
        ItemBlockRenderTypes.setRenderLayer(UlsZliminexBlocks.BROKEN_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(UlsZliminexBlocks.DIRTY_BROKEN_GLASS_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(UlsZliminexBlocks.DIRTY_GLASS_BLOCK.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(UlsZliminexBlocks.BROKEN_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(UlsZliminexBlocks.DIRTY_BROKEN_GLASS_PANE.get(), RenderType.translucent());
    }

    public void onSetupEvent(final FMLCommonSetupEvent event) {
        LOGGER.info("Common setup event triggered");
        Sheets.addWoodType(UlsZliminexWoodTypes.GRAYSCALE);
    }

}