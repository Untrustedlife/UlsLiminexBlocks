package untrustedlife.mods.ulsliminexblocks.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import untrustedlife.mods.ulsliminexblocks.UlsZliminex;

@Mod.EventBusSubscriber(modid = UlsZliminex.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class UlsZLiminexDatagen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        if (event.includeServer()) {
            // Add data providers for server-side data like loot tables, recipes, tags
            generator.addProvider(true, new UlsZLiminexBlockLootTableProvider(generator));
            generator.addProvider(true, new UlsLiminexBlockRecipeProvider(generator));
        }

        if (event.includeClient()) {
        }
    }
}