package untrustedlife.mods.ulsliminexblocks.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import untrustedlife.mods.ulsliminexblocks.UlsZliminex;
import untrustedlife.mods.ulsliminexblocks.entity.UlsZLiminexStandingSign;
import untrustedlife.mods.ulsliminexblocks.entity.UlsZLiminexWallSign;
import untrustedlife.mods.ulsliminexblocks.entity.UlsZliminexWoodTypes;
import untrustedlife.mods.ulsliminexblocks.items.UlsZliminexItems;

public class UlsZliminexBlocks {

    // Create the DeferredRegister for Blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UlsZliminex.MODID);

    // Standard stone strength: 1.5 hardness, 6 resistance
    //Pool Tiles
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

    //Yellow Wallpaper
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
    
    //Moist Carpet
    public static final RegistryObject<Block> MOIST_CARPET = BLOCKS.register("moist_carpet", 
        () -> new BaseBlock("Moist Carpet",  Material.WOOL, SoundType.MUD, 0.9f, 0.9f));
    public static final RegistryObject<Item> MOIST_CARPET_ITEM = UlsZliminexItems.ITEMS.register("moist_carpet", 
        () -> new BlockItem(MOIST_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> MOIST_CARPET_STAIRS = BLOCKS.register("moist_carpet_stairs", 
        () -> new BaseStairs(() -> MOIST_CARPET.get().defaultBlockState(),"Moist Carpet Stairs",  Material.WOOL, SoundType.MUD, 0.9f, 0.9f));
    public static final RegistryObject<Item> MOIST_CARPET_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("moist_carpet_stairs", 
        () -> new BlockItem(MOIST_CARPET_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> MOIST_CARPET_SLAB = BLOCKS.register("moist_carpet_slab", 
        () -> new BaseSlab("Moist Carpet Slab", Material.WOOL, SoundType.MUD, 0.9f, 0.9f));
    public static final RegistryObject<Item> MOIST_CARPET_SLAB_ITEM = UlsZliminexItems.ITEMS.register("moist_carpet_slab", 
        () -> new BlockItem(MOIST_CARPET_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    //This is a hilarious name and i'm keeping it
    public static final RegistryObject<Block> MOIST_CARPET_CARPET = BLOCKS.register("moist_carpet_carpet", 
        () -> new BaseCarpet("Moist Carpet Carpet", Material.WOOL, SoundType.MUD, 0.3f, 0.3f));
    public static final RegistryObject<Item> MOIST_CARPET_CARPET_ITEM = UlsZliminexItems.ITEMS.register("moist_carpet_carpet", 
        () -> new BlockItem(MOIST_CARPET_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    //Noderooms Carpet
        public static final RegistryObject<Block> NODEROOMS_CARPET = BLOCKS.register("noderooms_carpet", 
        () -> new BaseBlock("Noderooms Carpet",  Material.WOOL, SoundType.MUD, 0.9f, 0.9f));
    public static final RegistryObject<Item> NODEROOMS_CARPET_ITEM = UlsZliminexItems.ITEMS.register("noderooms_carpet", 
        () -> new BlockItem(NODEROOMS_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> NODEROOMS_CARPET_STAIRS = BLOCKS.register("noderooms_carpet_stairs", 
        () -> new BaseStairs(() -> NODEROOMS_CARPET.get().defaultBlockState(),"Noderooms Carpet Stairs",  Material.WOOL, SoundType.MUD, 0.9f, 0.9f));
    public static final RegistryObject<Item> NODEROOMS_CARPET_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("noderooms_carpet_stairs", 
        () -> new BlockItem(NODEROOMS_CARPET_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> NODEROOMS_CARPET_SLAB = BLOCKS.register("noderooms_carpet_slab", 
        () -> new BaseSlab("Noderooms Carpet Slab", Material.WOOL, SoundType.MUD, 0.9f, 0.9f));
    public static final RegistryObject<Item> NODEROOMS_CARPET_SLAB_ITEM = UlsZliminexItems.ITEMS.register("noderooms_carpet_slab", 
        () -> new BlockItem(NODEROOMS_CARPET_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    //This is a hilarious name and i'm keeping it
    public static final RegistryObject<Block> NODEROOMS_CARPET_CARPET = BLOCKS.register("noderooms_carpet_carpet", 
        () -> new BaseCarpet("Noderooms Carpet Carpet", Material.WOOL, SoundType.MUD, 0.1f, 0.3f));
    public static final RegistryObject<Item> NODEROOMS_CARPET_CARPET_ITEM = UlsZliminexItems.ITEMS.register("noderooms_carpet_carpet", 
        () -> new BlockItem(NODEROOMS_CARPET_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    //Dry Moldy Carpet
    public static final RegistryObject<Block> MOLDY_CARPET = BLOCKS.register("dry_moldy_carpet", 
    () -> new BaseBlock("Dry Moldy Carpet",  Material.WOOL, SoundType.WOOL, 1f, 1f));
    public static final RegistryObject<Item> MOLDY_CARPET_ITEM = UlsZliminexItems.ITEMS.register("dry_moldy_carpet", 
        () -> new BlockItem(MOLDY_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> MOLDY_CARPET_STAIRS = BLOCKS.register("dry_moldy_carpet_stairs", 
        () -> new BaseStairs(() -> MOLDY_CARPET.get().defaultBlockState(),"Dry Moldy Carpet Stairs",  Material.WOOL, SoundType.WOOL, 1f, 1f));
    public static final RegistryObject<Item> MOLDY_CARPET_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("dry_moldy_carpet_stairs", 
        () -> new BlockItem(MOLDY_CARPET_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> MOLDY_CARPET_SLAB = BLOCKS.register("dry_moldy_carpet_slab", 
        () -> new BaseSlab("Dry Moldy Carpet Slab", Material.WOOL, SoundType.WOOL, 1f, 1f));
    public static final RegistryObject<Item> MOLDY_CARPET_SLAB_ITEM = UlsZliminexItems.ITEMS.register("dry_moldy_carpet_slab", 
        () -> new BlockItem(MOLDY_CARPET_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    //This is a hilarious name and i'm keeping it
    public static final RegistryObject<Block>  MOLDY_CARPET_CARPET = BLOCKS.register("dry_moldy_carpet_carpet", 
        () -> new BaseCarpet("Dry Moldy Carpet Carpet", Material.WOOL, SoundType.WOOL, 0.5f, 0.5f));
    public static final RegistryObject<Item>  MOLDY_CARPET_CARPET_ITEM = UlsZliminexItems.ITEMS.register("dry_moldy_carpet_carpet", 
        () -> new BlockItem( MOLDY_CARPET_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    
    //Dry Carpet
    public static final RegistryObject<Block> DRY_CARPET = BLOCKS.register("dry_carpet", 
    () -> new BaseBlock("Dry Carpet",  Material.WOOL, SoundType.WOOL, 0.7f, 0.7f));
    public static final RegistryObject<Item> DRY_CARPET_ITEM = UlsZliminexItems.ITEMS.register("dry_carpet", 
        () -> new BlockItem(DRY_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> DRY_CARPET_STAIRS = BLOCKS.register("dry_carpet_stairs", 
        () -> new BaseStairs(() -> DRY_CARPET.get().defaultBlockState(),"Dry Carpet Stairs",  Material.WOOL, SoundType.WOOL, 0.7f, 0.7f));
    public static final RegistryObject<Item> DRY_CARPET_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("dry_carpet_stairs", 
        () -> new BlockItem(DRY_CARPET_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> DRY_CARPET_SLAB = BLOCKS.register("dry_carpet_slab", 
        () -> new BaseSlab("Dry Carpet Slab", Material.WOOL, SoundType.WOOL, 0.7f, 0.7f));
    public static final RegistryObject<Item> DRY_CARPET_SLAB_ITEM = UlsZliminexItems.ITEMS.register("dry_carpet_slab", 
        () -> new BlockItem(DRY_CARPET_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    //This is a hilarious name and i'm keeping it
    public static final RegistryObject<Block>  DRY_CARPET_CARPET = BLOCKS.register("dry_carpet_carpet", 
        () -> new BaseCarpet("Dry Carpet Carpet", Material.WOOL, SoundType.WOOL, 0.35f, 0.35f));
    public static final RegistryObject<Item>  DRY_CARPET_CARPET_ITEM = UlsZliminexItems.ITEMS.register("dry_carpet_carpet", 
        () -> new BlockItem( DRY_CARPET_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    //False Sky
    public static final RegistryObject<Block> FALSE_SKY = BLOCKS.register("false_sky", 
        () -> new BaseBlock("False Sky", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item>FALSE_SKY_ITEM = UlsZliminexItems.ITEMS.register("false_sky", 
        () -> new BlockItem(FALSE_SKY.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> FALSE_SKY_STAIRS = BLOCKS.register("false_sky_stairs", 
        () -> new BaseStairs(() -> FALSE_SKY.get().defaultBlockState(),"False Sky Stairs", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> FALSE_SKY_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("false_sky_stairs", 
        () -> new BlockItem(FALSE_SKY_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> FALSE_SKY_SLAB = BLOCKS.register("false_sky_slab", 
        () -> new BaseSlab("False Sky Slab", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> FALSE_SKY_SLAB_ITEM = UlsZliminexItems.ITEMS.register("false_sky_slab", 
        () -> new BlockItem(FALSE_SKY_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    
    //Moldy Pool Tile
    public static final RegistryObject<Block> MOLDY_POOL_TILE = BLOCKS.register("moldy_pooltile", 
    () -> new BaseBlock("Moldy Pool Tiles", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item>MOLDY_POOL_TILE_ITEM = UlsZliminexItems.ITEMS.register("moldy_pooltile", 
        () -> new BlockItem(MOLDY_POOL_TILE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> MOLDY_POOL_TILE_STAIRS = BLOCKS.register("moldy_pooltile_stairs", 
        () -> new BaseStairs(() -> MOLDY_POOL_TILE.get().defaultBlockState(),"Moldy Pool Stairs", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> MOLDY_POOL_TILE_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("moldy_pooltile_stairs", 
        () -> new BlockItem(MOLDY_POOL_TILE_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> MOLDY_POOL_TILE_SLAB = BLOCKS.register("moldy_pooltile_slab", 
        () -> new BaseSlab("Moldy Pool Slab", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> MOLDY_POOL_TILE_SLAB_ITEM = UlsZliminexItems.ITEMS.register("moldy_pooltile_slab", 
        () -> new BlockItem(MOLDY_POOL_TILE_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    //Concrete
    public static final RegistryObject<Block> BLACK_CRACKED_CONCRETE = BLOCKS.register("black_cracked_concrete", 
    () -> new BaseBlock("Cracked Black Concrete", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item>BLACK_CRACKED_CONCRETE_ITEM = UlsZliminexItems.ITEMS.register("black_cracked_concrete", 
    () -> new BlockItem(BLACK_CRACKED_CONCRETE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    public static final RegistryObject<Block> BROWN_CRACKED_CONCRETE = BLOCKS.register("brown_cracked_concrete", 
    () -> new BaseBlock("Cracked Brown Concrete", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item>BROWN_CRACKED_CONCRETE_ITEM = UlsZliminexItems.ITEMS.register("brown_cracked_concrete", 
    () -> new BlockItem(BROWN_CRACKED_CONCRETE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    public static final RegistryObject<Block> WHITE_CRACKED_CONCRETE = BLOCKS.register("white_cracked_concrete", 
    () -> new BaseBlock("Cracked White Concrete", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item>WHITE_CRACKED_CONCRETE_ITEM = UlsZliminexItems.ITEMS.register("white_cracked_concrete", 
    () -> new BlockItem(WHITE_CRACKED_CONCRETE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    public static final RegistryObject<Block> YELLOW_CRACKED_CONCRETE = BLOCKS.register("yellow_cracked_concrete", 
    () -> new BaseBlock("Cracked Yellow Concrete", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item>YELLOW_CRACKED_CONCRETE_ITEM = UlsZliminexItems.ITEMS.register("yellow_cracked_concrete", 
    () -> new BlockItem(YELLOW_CRACKED_CONCRETE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    //Grayscale Wood
    public static final RegistryObject<Block> GRAYSCALE_PLANK = BLOCKS.register("grayscale_plank", 
    () -> new BaseBlock("Grayscale Plank",  Material.WOOD, SoundType.WOOD, 2.0f, 2.0f));
    public static final RegistryObject<Item> GRAYSCALE_PLANK_ITEM = UlsZliminexItems.ITEMS.register("grayscale_plank", 
    () -> new BlockItem(GRAYSCALE_PLANK.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> GRAYSCALE_PLANK_STAIRS = BLOCKS.register("grayscale_plank_stairs", 
    () -> new BaseStairs(() -> GRAYSCALE_PLANK.get().defaultBlockState(),"Grayscale Plank Stairs",  Material.WOOD, SoundType.WOOD, 2.0f, 2.0f));
    public static final RegistryObject<Item> GRAYSCALE_PLANK_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("grayscale_plank_stairs", 
    () -> new BlockItem(GRAYSCALE_PLANK_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> GRAYSCALE_PLANK_SLAB = BLOCKS.register("grayscale_plank_slab", 
    () -> new BaseSlab("Grayscale Plank Slab", Material.WOOD, SoundType.WOOD, 2.0f, 2.0f));
    public static final RegistryObject<Item> GRAYSCALE_PLANK_SLAB_ITEM = UlsZliminexItems.ITEMS.register("grayscale_plank_slab", 
    () -> new BlockItem(GRAYSCALE_PLANK_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> GRAYSCALE_PLANK_SIGN = BLOCKS.register("grayscale_sign", () ->
        new UlsZLiminexStandingSign(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), UlsZliminexWoodTypes.GRAYSCALE)
    );
    public static final RegistryObject<Block> GRAYSCALE_PLANK_WALL_SIGN = BLOCKS.register("grayscale_wall_sign", () ->
        new UlsZLiminexWallSign(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), UlsZliminexWoodTypes.GRAYSCALE)
    );
    public static final RegistryObject<Item> GRAYSCALE_PLANK_SIGN_ITEM = UlsZliminexItems.ITEMS.register("grayscale_sign", () ->
        new SignItem(new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB), GRAYSCALE_PLANK_SIGN.get(), GRAYSCALE_PLANK_WALL_SIGN.get(
    ))

    );
    // Register the DeferredRegister to the event bus
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}