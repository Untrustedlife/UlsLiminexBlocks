package untrustedlife.mods.ulsliminexblocks.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import untrustedlife.mods.ulsliminexblocks.blocks.UlsZliminexBlocks;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class UlsLiminexWanderingTraderTrades {

    @SubscribeEvent
    public static void onWanderingTraderTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> tradeList = new ArrayList<>();

        UlsZliminexBlocks.BLOCKS.getEntries().stream()
        .map(RegistryObject::get)  // Get the actual Block from each RegistryObject
        .filter(block -> {
            ResourceLocation id = Registry.BLOCK.getKey(block);
            String blockName = id.getPath();
            return id != null && id.getNamespace().equals("ulsliminexblocks") && !blockName.contains("_slab") && !blockName.contains("_stair") && !blockName.contains("_carpet_carpet") && !blockName.contains("_plushie"); 
        })
        .forEach(block -> {
            tradeList.add(new SimpleTrade(new ItemStack(Items.EMERALD, 1), new ItemStack(block.asItem(), 2)));
        });

        UlsZliminexBlocks.BLOCKS.getEntries().stream()
        .map(RegistryObject::get)  // Get the actual Block from each RegistryObject
        .filter(block -> {
            ResourceLocation id = Registry.BLOCK.getKey(block);
            String blockName = id.getPath();
            return id != null && id.getNamespace().equals("ulsliminexblocks") && blockName.contains("_plushie"); 
        })
        .forEach(block -> {
            tradeList.add(new SimpleTrade(new ItemStack(Items.EMERALD, 1), new ItemStack(block.asItem(), 15)));
        });

        // Add these trades to both regular and rare trade categories of the Wandering Trader
        event.getGenericTrades().addAll(tradeList);
    }

    // Custom trade class to define the trade offer
    private static class SimpleTrade implements VillagerTrades.ItemListing {
        private final ItemStack input;
        private final ItemStack output;

        public SimpleTrade(ItemStack input, ItemStack output) {
            this.input = input;
            this.output = output;
        }

        @Override
        public MerchantOffer getOffer(Entity p_219693_, RandomSource p_219694_) {
            return new MerchantOffer(input, output, 5, 1, 0.05F);  // max uses, experience, price multiplier
        }
    }
}