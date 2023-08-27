package net.filler.spitemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.filler.spitemod.SpiteMod;
import net.filler.spitemod.item.custom.TestUsable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST = registerItem("testobj", new Item(new FabricItemSettings()));
    public static final Item TEST_USABLE = registerItem("test_usable", new TestUsable(new FabricItemSettings()));
    public static final Item TEST_EDIBLE = registerItem("test_edible", new Item(new FabricItemSettings().food(ModFoodComponents.TEST_EDIBLE)));
    public static final Item TEST_FUEL = registerItem("test_fuel", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(TEST);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SpiteMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SpiteMod.LOGGER.info("Registering Mod Items for " + SpiteMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
