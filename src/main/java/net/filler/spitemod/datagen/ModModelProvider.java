package net.filler.spitemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.filler.spitemod.block.ModBlocks;
import net.filler.spitemod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_BLOCK_USABLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TEST, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEST_FUEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEST_EDIBLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEST_USABLE, Models.GENERATED);
    }
}
