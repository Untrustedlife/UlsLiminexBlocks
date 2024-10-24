package untrustedlife.mods.ulsliminexblocks.features;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import untrustedlife.mods.ulsliminexblocks.UlsZliminex;
import net.minecraft.core.Registry;


public class UlsZliminexPlacedFeatures {
        public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, UlsZliminex.MODID);


        /*public static final RegistryObject<PlacedFeature> TRASH_PATCH_PLACED = PLACED_FEATURES.register("add_trash_tier_0_dump",
            () ->  new PlacedFeature(
                Holder.direct(UlsZliminexConfiguredFeatures.TRASH_DUMP_1.get()), // Link to the ConfiguredFeature
                List.of(
                    RarityFilter.onAverageOnceEvery(100),
                    HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES), // Place on surface
                    BiomeFilter.biome(), // Spawn in all biomes
                    BlockPredicateFilter.forPredicate(BlockPredicate.solid(new Vec3i(0,-1,0)))
                )
            ));

        public static final RegistryObject<PlacedFeature> LARGE_TRASH_PATCH_PLACED = PLACED_FEATURES.register("trash_large_dump",
        () ->  new PlacedFeature(
            Holder.direct(UlsZliminexConfiguredFeatures.TRASH_DUMP_1.get()), // Link to the ConfiguredFeature
            List.of(
                RarityFilter.onAverageOnceEvery(200),
                HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES), // Place on surface
                BiomeFilter.biome(), // Spawn in all biomes
                BlockPredicateFilter.forPredicate(BlockPredicate.solid(new Vec3i(0,-1,0)))
            )
        ));*/

    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }
}
