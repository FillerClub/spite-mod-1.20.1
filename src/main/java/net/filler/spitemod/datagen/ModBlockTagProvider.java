package net.filler.spitemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.filler.spitemod.block.ModBlocks;
import net.filler.spitemod.util.ModTags;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TEST_BLOCK)
                .add(ModBlocks.TEST_ORE)
                .add(ModBlocks.TEST_BLOCK_USABLE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.TEST_BLOCK)
                .add(ModBlocks.TEST_ORE)
                .add(ModBlocks.TEST_BLOCK_USABLE);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.TEST_BLOCK)
                .add(ModBlocks.TEST_ORE)
                .add(ModBlocks.TEST_BLOCK_USABLE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.TEST_BLOCK)
                .add(ModBlocks.TEST_ORE)
                .add(ModBlocks.TEST_BLOCK_USABLE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.TEST_BLOCK)
                .add(ModBlocks.TEST_ORE)
                .add(ModBlocks.TEST_BLOCK_USABLE);
    }
}
