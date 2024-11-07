package untrustedlife.mods.ulsliminexblocks.datagen;

import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import untrustedlife.mods.ulsliminexblocks.blocks.UlsZliminexBlocks;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

import org.slf4j.Logger;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;

public class UlsZLiminexBlockLootTableProvider extends net.minecraft.data.loot.LootTableProvider {
    private static final Logger LOGGER = LogUtils.getLogger();
    private final DataGenerator.PathProvider pathProvider;

    public UlsZLiminexBlockLootTableProvider(DataGenerator generator) {
        super(generator);
        this.pathProvider = generator.createPathProvider(DataGenerator.Target.DATA_PACK, "blocks/loot_tables");
    }

    @Override
    public void run(CachedOutput cache) {
        // Map to store all block loot tables
        Map<ResourceLocation, LootTable> tables = Maps.newHashMap();

        // Define a loot table for a single block (e.g., MY_BLOCK)
        tables.put(UlsZliminexBlocks.ARCADE_CARPET.getId(), createSelfDropTable(UlsZliminexBlocks.ARCADE_CARPET.get()));

        // Validate and save the loot tables
        ValidationContext validationContext = new ValidationContext(LootContextParamSets.ALL_PARAMS, (p) -> null, tables::get);
        validate(tables, validationContext);

        validationContext.getProblems().forEach((location, problem) ->
                LOGGER.warn("Found validation problem in {}: {}", location, problem));

        tables.forEach((resourceLocation, lootTable) -> {
            Path path = this.pathProvider.json(resourceLocation);

            try {
                DataProvider.saveStable(cache, LootTables.serialize(lootTable), path);
            } catch (IOException e) {
                LOGGER.error("Couldn't save loot table {}", path, e);
            }
        });
    }

    // Method to create a simple self-drop loot table for a block
    private LootTable createSelfDropTable(Block block) {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .add(LootItem.lootTableItem(block)))
                .build();
    }
}