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

    //Pool Tiles
    public static final RegistryObject<Block> BLUE_POOL_TILE = BLOCKS.register("blue_pooltile", 
    () -> new BaseBlock("Blue Pool Tiles", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> BLUE_POOL_TILE_ITEM = UlsZliminexItems.ITEMS.register("blue_pooltile", 
    () -> new BlockItem(BLUE_POOL_TILE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> BLUE_POOL_TILE_STAIRS = BLOCKS.register("blue_pooltile_stairs", 
    () -> new BaseStairs(() -> BLUE_POOL_TILE.get().defaultBlockState(),"Blue Pool Stairs", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> BLUE_POOL_TILE_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("blue_pooltile_stairs", 
    () -> new BlockItem(BLUE_POOL_TILE_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> BLUE_POOL_TILE_SLAB = BLOCKS.register("blue_pooltile_slab", 
    () -> new BaseSlab("Blue Pool Slab", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> BLUE_POOL_TILE_SLAB_ITEM = UlsZliminexItems.ITEMS.register("blue_pooltile_slab", 
    () -> new BlockItem(BLUE_POOL_TILE_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    //Recessed Blue Pool Tiles
    public static final RegistryObject<Block> RECESSED_BLUE_POOL_TILE = BLOCKS.register("recessed_blue_pooltile", 
    () -> new BaseBlock("Recessed Blue Pool Tiles", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> RECESSED_BLUE_POOL_TILE_ITEM = UlsZliminexItems.ITEMS.register("recessed_blue_pooltile", 
    () -> new BlockItem(RECESSED_BLUE_POOL_TILE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> RECESSED_BLUE_POOL_TILE_STAIRS = BLOCKS.register("recessed_blue_pooltile_stairs", 
    () -> new BaseStairs(() -> RECESSED_BLUE_POOL_TILE.get().defaultBlockState(),"Recessed Blue Pool Stairs", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> RECESSED_BLUE_POOL_TILE_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("recessed_blue_pooltile_stairs", 
    () -> new BlockItem(RECESSED_BLUE_POOL_TILE_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> RECESSED_BLUE_POOL_TILE_SLAB = BLOCKS.register("recessed_blue_pooltile_slab", 
    () -> new BaseSlab("Recessed Blue Pool Slab", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> RECESSED_BLUE_POOL_TILE_SLAB_ITEM = UlsZliminexItems.ITEMS.register("recessed_blue_pooltile_slab", 
    () -> new BlockItem(RECESSED_BLUE_POOL_TILE_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    
    //Black Pool Tiles
    public static final RegistryObject<Block> BLACK_POOL_TILE = BLOCKS.register("black_pooltile", 
    () -> new BaseBlock("Black Pool Tiles", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> BLACK_POOL_TILE_ITEM = UlsZliminexItems.ITEMS.register("black_pooltile", 
    () -> new BlockItem(BLACK_POOL_TILE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> BLACK_POOL_TILE_STAIRS = BLOCKS.register("black_pooltile_stairs", 
    () -> new BaseStairs(() -> BLACK_POOL_TILE.get().defaultBlockState(),"Black Pool Stairs", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> BLACK_POOL_TILE_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("black_pooltile_stairs", 
    () -> new BlockItem(BLACK_POOL_TILE_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> BLACK_POOL_TILE_SLAB = BLOCKS.register("black_pooltile_slab", 
    () -> new BaseSlab("Black Pool Slab", Material.STONE, SoundType.STONE, 1.5f, 6.0f));
    public static final RegistryObject<Item> BLACK_POOL_TILE_SLAB_ITEM = UlsZliminexItems.ITEMS.register("black_pooltile_slab", 
    () -> new BlockItem(BLACK_POOL_TILE_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    

    //Pure White
    public static final RegistryObject<Block> PURE_WHITE = BLOCKS.register("white_pure", 
    () -> new EmissiveBlock("White Void", Material.METAL, SoundType.AMETHYST, 1.5f, 6.0f,15));
    public static final RegistryObject<Item> PURE_WHITE_ITEM = UlsZliminexItems.ITEMS.register("white_pure", 
    () -> new BlockItem(PURE_WHITE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> PURE_WHITE_STAIRS = BLOCKS.register("white_pure_stairs", 
    () -> new EmissiveStairs(() -> PURE_WHITE.get().defaultBlockState(),"White Void Stairs", Material.METAL, SoundType.AMETHYST, 1.5f, 6.0f,15));
    public static final RegistryObject<Item> PURE_WHITE_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("white_pure_stairs", 
    () -> new BlockItem(PURE_WHITE_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> PURE_WHITE_SLAB = BLOCKS.register("white_pure_slab", 
    () -> new EmissiveSlab("White Void Slab", Material.METAL, SoundType.AMETHYST, 1.5f, 6.0f,15));
    public static final RegistryObject<Item> PURE_WHITE_SLAB_ITEM = UlsZliminexItems.ITEMS.register("white_pure_slab", 
    () -> new BlockItem(PURE_WHITE_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

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

    //Arcade Carpet
    public static final RegistryObject<Block> ARCADE_CARPET = BLOCKS.register("arcade_carpet", 
    () -> new BaseBlock("Arcade Carpet",  Material.WOOL, SoundType.WOOL, 0.7f, 0.7f));
    public static final RegistryObject<Item> ARCADE_CARPET_ITEM = UlsZliminexItems.ITEMS.register("arcade_carpet", 
        () -> new BlockItem(ARCADE_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> ARCADE_CARPET_STAIRS = BLOCKS.register("arcade_carpet_stairs", 
        () -> new BaseStairs(() -> ARCADE_CARPET.get().defaultBlockState(),"Arcade Carpet Stairs",  Material.WOOL, SoundType.WOOL, 0.7f, 0.7f));
    public static final RegistryObject<Item> ARCADE_CARPET_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("arcade_carpet_stairs", 
        () -> new BlockItem(ARCADE_CARPET_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> ARCADE_CARPET_SLAB = BLOCKS.register("arcade_carpet_slab", 
        () -> new BaseSlab("Arcade Carpet Slab", Material.WOOL, SoundType.WOOL, 0.7f, 0.7f));
    public static final RegistryObject<Item> ARCADE_CARPET_SLAB_ITEM = UlsZliminexItems.ITEMS.register("arcade_carpet_slab", 
        () -> new BlockItem(ARCADE_CARPET_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    //This is a hilarious name and i'm keeping it
    public static final RegistryObject<Block>  ARCADE_CARPET_CARPET = BLOCKS.register("arcade_carpet_carpet", 
        () -> new BaseCarpet("Arcade Carpet Carpet", Material.WOOL, SoundType.WOOL, 0.35f, 0.35f));
    public static final RegistryObject<Item>  ARCADE_CARPET_CARPET_ITEM = UlsZliminexItems.ITEMS.register("arcade_carpet_carpet", 
        () -> new BlockItem( ARCADE_CARPET_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

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
    )));

    //Overlook Carpet
    public static final RegistryObject<Block> OVERLOOK_CARPET = BLOCKS.register("overlook_carpet", 
    () -> new BaseBlock("Abstract Carpet",  Material.WOOL, SoundType.WOOL, 1f, 1f));
    public static final RegistryObject<Item> OVERLOOK_CARPET_ITEM = UlsZliminexItems.ITEMS.register("overlook_carpet", 
        () -> new BlockItem(OVERLOOK_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> OVERLOOK_CARPET_STAIRS = BLOCKS.register("overlook_carpet_stairs", 
        () -> new BaseStairs(() -> OVERLOOK_CARPET.get().defaultBlockState(),"Abstract Carpet Stairs",  Material.WOOL, SoundType.WOOL, 1f, 1f));
    public static final RegistryObject<Item> OVERLOOK_CARPET_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("overlook_carpet_stairs", 
        () -> new BlockItem(OVERLOOK_CARPET_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> OVERLOOK_CARPET_SLAB = BLOCKS.register("overlook_carpet_slab", 
        () -> new BaseSlab("Abstract Carpet Slab", Material.WOOL, SoundType.WOOL, 1f, 1f));
    public static final RegistryObject<Item> OVERLOOK_CARPET_SLAB_ITEM = UlsZliminexItems.ITEMS.register("overlook_carpet_slab", 
        () -> new BlockItem(OVERLOOK_CARPET_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    //This is a hilarious name and i'm keeping it
    public static final RegistryObject<Block>  OVERLOOK_CARPET_CARPET = BLOCKS.register("overlook_carpet_carpet", 
        () -> new BaseCarpet("Abstract Carpet Carpet", Material.WOOL, SoundType.WOOL, 0.5f, 0.5f));
    public static final RegistryObject<Item>  OVERLOOK_CARPET_CARPET_ITEM = UlsZliminexItems.ITEMS.register("overlook_carpet_carpet", 
        () -> new BlockItem( OVERLOOK_CARPET_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    

    //Star Carpet
    public static final RegistryObject<Block> STAR_CARPET = BLOCKS.register("star_carpet", 
    () -> new BaseBlock("Star Carpet",  Material.WOOL, SoundType.WOOL, 1f, 1f));
    public static final RegistryObject<Item> STAR_CARPET_ITEM = UlsZliminexItems.ITEMS.register("star_carpet", 
        () -> new BlockItem(STAR_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> STAR_CARPET_STAIRS = BLOCKS.register("star_carpet_stairs", 
        () -> new BaseStairs(() -> STAR_CARPET.get().defaultBlockState(),"Star Carpet Stairs",  Material.WOOL, SoundType.WOOL, 1f, 1f));
    public static final RegistryObject<Item> STAR_CARPET_STAIRS_ITEM = UlsZliminexItems.ITEMS.register("star_carpet_stairs", 
        () -> new BlockItem(STAR_CARPET_STAIRS.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> STAR_CARPET_SLAB = BLOCKS.register("star_carpet_slab", 
        () -> new BaseSlab("Star Carpet Slab", Material.WOOL, SoundType.WOOL, 1f, 1f));
    public static final RegistryObject<Item> STAR_CARPET_SLAB_ITEM = UlsZliminexItems.ITEMS.register("star_carpet_slab", 
        () -> new BlockItem(STAR_CARPET_SLAB.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));
    //This is a hilarious name and i'm keeping it
    public static final RegistryObject<Block>  STAR_CARPET_CARPET = BLOCKS.register("star_carpet_carpet", 
        () -> new BaseCarpet("Star Carpet Carpet", Material.WOOL, SoundType.WOOL, 0.5f, 0.5f));
    public static final RegistryObject<Item>  STAR_CARPET_CARPET_ITEM = UlsZliminexItems.ITEMS.register("star_carpet_carpet", 
        () -> new BlockItem( STAR_CARPET_CARPET.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));


    //Night Sky
    public static final RegistryObject<Block> FALSE_NIGHT_SKY = BLOCKS.register("false_night_sky", 
    () -> new BaseRandomVariantBlock("False Night Sky", Material.STONE, SoundType.STONE, 1.5f, 6.0f,4));
    public static final RegistryObject<Item> FALSE_NIGHT_SKY_ITEM = UlsZliminexItems.ITEMS.register("false_night_sky", 
    () -> new BlockItem(FALSE_NIGHT_SKY.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    //Play Place Wall
    public static final RegistryObject<Block> PLAY_PLACE_WALL = BLOCKS.register("play_place_wall", 
    () -> new BaseRandomVariantBlock("Playplace Wall", Material.DECORATION, SoundType.SCAFFOLDING, 2.5f, 3.0f,7));
    public static final RegistryObject<Item> PLAY_PLACE_WALL_ITEM = UlsZliminexItems.ITEMS.register("play_place_wall", 
    () -> new BlockItem(PLAY_PLACE_WALL.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> HEROBRINE_PLUSHIE = BLOCKS.register("herobrine_plushie", 
    () -> new PlushieBlock("Herobrine Plushie",  Material.WOOL, SoundType.WOOL, 1f, 1f));
    public static final RegistryObject<Item> HEROBRINE_PLUSHIE_ITEM = UlsZliminexItems.ITEMS.register("herobrine_plushie", 
    () -> new BlockItem(HEROBRINE_PLUSHIE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    public static final RegistryObject<Block> HORROR_BABY_PLUSHIE = BLOCKS.register("horror_baby_plushie", 
    () -> new PlushieBlock("Horror Baby Plushie",  Material.WOOL, SoundType.WOOL, 1f, 1f));
    public static final RegistryObject<Item> HORROR_BABY_PLUSHIE_ITEM = UlsZliminexItems.ITEMS.register("horror_baby_plushie", 
    () -> new BlockItem(HORROR_BABY_PLUSHIE.get(), new Item.Properties().tab(UlsZliminexItems.LIMINEX_TAB)));

    // Register the DeferredRegister to the event bus
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}