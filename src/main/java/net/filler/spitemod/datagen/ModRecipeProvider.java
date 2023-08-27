package net.filler.spitemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.filler.spitemod.block.ModBlocks;
import net.filler.spitemod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

import static net.minecraft.item.Items.BEDROCK;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static List<ItemConvertible> TEST_SMELTABLES = List.of(ModBlocks.TEST_ORE);
    private static List<ItemConvertible> BEDROCK_SMELTABLES = List.of(ModBlocks.TEST_BLOCK);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, TEST_SMELTABLES, RecipeCategory.MISC, ModItems.TEST, 2, 600, "testobj");
        offerBlasting(exporter, TEST_SMELTABLES, RecipeCategory.MISC, ModItems.TEST, 2, 100, "testobj");

        offerSmelting(exporter, BEDROCK_SMELTABLES, RecipeCategory.MISC, BEDROCK, 2, 600, "testobj");
        offerBlasting(exporter, BEDROCK_SMELTABLES, RecipeCategory.MISC, BEDROCK, 2, 100, "testobj");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TEST, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEST_BLOCK);
    }
}
