package untrustedlife.mods.ulsliminexblocks.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
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

    // Standard stone strength: 1.5 hardness, 6 resistance
    public static final RegistryObject<Block> POOL_TILE = BLOCKS.register("pooltile", 
        () -> new BaseBlock("Pool Tiles", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> POOL_TILE_ITEM = UlsZliminexItems.ITEMS.register("pooltile", 
        () -> new BlockItem(POOL_TILE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> POOL_TILE_STAIRS = BLOCKS.register("pooltile_stairs", 
        () -> new BaseStairs(() -> POOL_TILE.get().defaultBlockState(),"Pool Stairs", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> POOL_TILE_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("pooltile_stairs", 
        () -> new BlockItem(POOL_TILE_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> POOL_TILE_SLAB = BLOCKS.register("pooltile_slab", 
        () -> new BaseSlab("Pool Slab", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> POOL_TILE_SLAB_ITEM = UlsZliminexItems.ITEMS.register("pooltile_slab", 
        () -> new BlockItem(POOL_TILE_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

        public static final RegistryObject<Block> YELLOW_WALLPAPER = BLOCKS.register("yellow_wallpaper", 
        () -> new BaseBlock("Yellow Wallpaper",  Material.WOOD, SoundType.CALCITE, 2f, 3.5f));
    public static final RegistryObject<Item> YELLOW_WALLPAPER_ITEM = UlsZliminexItems.ITEMS.register("yellow_wallpaper", 
        () -> new BlockItem(YELLOW_WALLPAPER.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> YELLOW_WALLPAPER_STAIRS = BLOCKS.register("yellow_wallpaper_stairs", 
        () -> new BaseStairs(() -> YELLOW_WALLPAPER.get().defaultBlockState(),"Yellow Wallpaper Stairs",  Material.WOOD, SoundType.CALCITE, 2f, 3.5f));
    public static final RegistryObject<Item> YELLOW_WALLPAPER_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("yellow_wallpaper_stairs", 
        () -> new BlockItem(YELLOW_WALLPAPER_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> YELLOW_WALLPAPER_SLAB = BLOCKS.register("yellow_wallpaper_slab", 
        () -> new BaseSlab("Yellow Wallpaper Slab", Material.WOOD, SoundType.CALCITE, 2f, 3.5f));
    public static final RegistryObject<Item> YELLOW_WALLPAPER_SLAB_ITEM = UlsZliminexItems.ITEMS.register("yellow_wallpaper_slab", 
        () -> new BlockItem(YELLOW_WALLPAPER_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
        
    // Register the DeferredRegister to the event bus
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}