package untrustedlife.mods.ulsliminexblocks.features;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import untrustedlife.mods.ulsliminexblocks.UlsZliminex;

public class UlsZliminexConfiguredFeatures {

    // Correctly parameterized generic type
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
    DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, UlsZliminex.MODID);

    /*public static SimpleWeightedRandomList<BlockState> createTier0DumpWeights() {
        SimpleWeightedRandomList.Builder<BlockState> tier_0_dump_weights = SimpleWeightedRandomList.<BlockState>builder();
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            // Add lower-tier trash blocks (higher weight)
            tier_0_dump_weights.add(
                MinecraftSweepingDetailBlocks.TRASH_BLOCK.get()
                    .defaultBlockState()
                    .setValue(TrashBaseBlock.FACING, direction)  // Set the direction
                    .setValue(TrashBaseBlock.VARIANT, 2), 80);  // Set the variant and weight
        }
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            tier_0_dump_weights.add(
                MinecraftSweepingDetailBlocks.TRASH_BLOCK.get()
                    .defaultBlockState()
                    .setValue(TrashBaseBlock.FACING, direction)  // Set the direction
                    .setValue(TrashBaseBlock.VARIANT, 1), 30);  // Set the variant and weight
        }

        for (Direction direction : Direction.Plane.HORIZONTAL) {
            // Add lower-tier trash blocks (higher weight)
            tier_0_dump_weights.add(
                MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER2.get()
                    .defaultBlockState()
                    .setValue(TrashBaseBlock.FACING, direction)  // Set the direction
                    .setValue(TrashBaseBlock.VARIANT, 2), 40);  // Set the variant and weight
        }
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            tier_0_dump_weights.add(
                MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER2.get()
                    .defaultBlockState()
                    .setValue(TrashBaseBlock.FACING, direction)  // Set the direction
                    .setValue(TrashBaseBlock.VARIANT, 1), 15);  // Set the variant and weight
        }


        for (Direction direction : Direction.Plane.HORIZONTAL) {
            // Add lower-tier trash blocks (higher weight)
            tier_0_dump_weights.add(
                MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER3.get()
                    .defaultBlockState()
                    .setValue(TrashBaseBlock.FACING, direction)  // Set the direction
                    .setValue(TrashBaseBlock.VARIANT, 2), 20);  // Set the variant and weight
        }
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            tier_0_dump_weights.add(
                MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER3.get()
                    .defaultBlockState()
                    .setValue(TrashBaseBlock.FACING, direction)  // Set the direction
                    .setValue(TrashBaseBlock.VARIANT, 1), 8);  // Set the variant and weight
        }
        return tier_0_dump_weights.build();
    }*/


    // RegistryObject for  trash dump feature, now with properly parameterized types
    /*public static final RegistryObject<ConfiguredFeature<RandomPatchConfiguration, ?>> TRASH_DUMP_1 =
        CONFIGURED_FEATURES.register("trash_tier_0_dump",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(96,6,3, PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(
                    new WeightedStateProvider(createTier0DumpWeights())),
                BlockPredicate.allOf(
                BlockPredicate.solid(new Vec3i(0,-1,0)),
                BlockPredicate.not(BlockPredicate.solid(new Vec3i(0,0,0))),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, 1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, -1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, 1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER2.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, -1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER2.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, 1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER3.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, -1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER3.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, 0, 0), Blocks.WATER))
                )))));


        public static final RegistryObject<ConfiguredFeature<RandomPatchConfiguration, ?>> LARGE_TRASH_DUMP =
        CONFIGURED_FEATURES.register("trash_large_dump",
            () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(200,10,5, PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(
                    new WeightedStateProvider(createTier0DumpWeights())),
                BlockPredicate.allOf(
                BlockPredicate.solid(new Vec3i(0,-1,0)),
                BlockPredicate.not(BlockPredicate.solid(new Vec3i(0,0,0))),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, 1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, -1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, 1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER2.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, -1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER2.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, 1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER3.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, -1, 0), MinecraftSweepingDetailBlocks.TRASH_BLOCK_TIER3.get())),
                BlockPredicate.not(BlockPredicate.matchesBlocks(new Vec3i(0, 0, 0), Blocks.WATER))
                )))));*/
            // Method to register all features with the event bus
    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus); // Register Configured Features
    }


}
