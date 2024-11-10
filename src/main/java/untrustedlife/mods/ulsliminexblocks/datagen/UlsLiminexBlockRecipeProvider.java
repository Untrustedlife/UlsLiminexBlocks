package untrustedlife.mods.ulsliminexblocks.datagen;

import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import untrustedlife.mods.ulsliminexblocks.blocks.UlsZliminexBlocks;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class UlsLiminexBlockRecipeProvider extends RecipeProvider {
    public UlsLiminexBlockRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // Define patterns for block types
        Pattern carpetPattern = Pattern.compile("_carpet_carpet$");
        Pattern slabPattern = Pattern.compile("_slab$");
        Pattern stairsPattern = Pattern.compile("_stairs$");

        UlsZliminexBlocks.BLOCKS.getEntries().stream()
            .map(RegistryObject::get)
            .filter(block -> {
                ResourceLocation id = Registry.BLOCK.getKey(block);
                return id != null && id.getNamespace().equals("ulsliminexblocks");
            })
            .forEach(block -> {
                ResourceLocation blockId = Registry.BLOCK.getKey(block);
                String blockName = blockId.getPath();

                // Generate recipes based on block name patterns
                if (carpetPattern.matcher(blockName).find()) {
                    String baseBlockName = blockName.replaceFirst("_carpet_carpet$", "_carpet");
                    generateCarpetRecipe(consumer, block, baseBlockName);
                } else if (slabPattern.matcher(blockName).find()) {
                    String baseBlockName = blockName.replace("_slab", "");
                    generateSlabRecipe(consumer, block, baseBlockName);
                } else if (stairsPattern.matcher(blockName).find()) {
                    String baseBlockName = blockName.replace("_stairs", "");
                    generateStairsRecipe(consumer, block, baseBlockName);
                }
            });
    }

    private void generateCarpetRecipe(Consumer<FinishedRecipe> consumer, Block block, String baseBlockName) {
        Block baseBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("ulsliminexblocks", baseBlockName));
        ShapedRecipeBuilder.shaped(block,3)
            .define('B', baseBlock.asItem())
            .pattern("BB")
            .unlockedBy("has_" + baseBlockName, has(baseBlock.asItem()))
            .save(consumer);
    }

    private void generateSlabRecipe(Consumer<FinishedRecipe> consumer, Block block, String baseBlockName) {
        Block baseBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("ulsliminexblocks", baseBlockName));
        ShapedRecipeBuilder.shaped(block, 6)
            .define('B', baseBlock.asItem())
            .pattern("BBB")
            .unlockedBy("has_" + baseBlockName, has(baseBlock.asItem()))
            .save(consumer);
    }

    private void generateStairsRecipe(Consumer<FinishedRecipe> consumer, Block block, String baseBlockName) {
        Block baseBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("ulsliminexblocks", baseBlockName));
        ShapedRecipeBuilder.shaped(block, 4)
            .define('B', baseBlock.asItem())
            .pattern("B  ")
            .pattern("BB ")
            .pattern("BBB")
            .unlockedBy("has_" + baseBlockName, has(baseBlock.asItem()))
            .save(consumer);
    }
}