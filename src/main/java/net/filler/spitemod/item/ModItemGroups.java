package net.filler.spitemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.filler.spitemod.SpiteMod;
import net.filler.spitemod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SPITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SpiteMod.MOD_ID, "spitemod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.spite"))
                    .icon(() -> new ItemStack(ModItems.TEST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TEST);

                        entries.add(ModBlocks.TEST_BLOCK);

                        entries.add(ModBlocks.TEST_ORE);

                    }).build());
    public static void registerItemGroups() {
        SpiteMod.LOGGER.info("Registering Item Groups for " + SpiteMod.MOD_ID);
    }
}
