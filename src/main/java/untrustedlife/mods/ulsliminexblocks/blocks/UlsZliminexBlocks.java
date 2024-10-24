package untrustedlife.mods.ulsliminexblocks.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import untrustedlife.mods.ulsliminexblocks.UlsZliminex;
import untrustedlife.mods.ulsliminexblocks.items.UlsZliminexItems;

public class UlsZliminexBlocks {

    // Create the DeferredRegister for Blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UlsZliminex.MODID);

    public static final RegistryObject<Block> POOL_TILE = BLOCKS.register("pooltile", 
        () -> new BaseBlock("Pool Tiles"));
    public static final RegistryObject<Item> POOL_TILE_ITEM = UlsZliminexItems.ITEMS.register("pooltile", 
        () -> new BlockItem(POOL_TILE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    // Register the DeferredRegister to the event bus
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}