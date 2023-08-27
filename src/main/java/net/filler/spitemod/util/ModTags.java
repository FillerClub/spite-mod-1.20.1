package net.filler.spitemod.util;

import net.filler.spitemod.SpiteMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(SpiteMod.MOD_ID));
        }

        public static final TagKey<Block> ABSTRACT_TEST = createTag("abstract_test");
        }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(SpiteMod.MOD_ID));
        }
    }
}
