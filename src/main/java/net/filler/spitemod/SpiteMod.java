package net.filler.spitemod;

import net.fabricmc.api.ModInitializer;

import net.filler.spitemod.block.ModBlocks;
import net.filler.spitemod.item.ModItemGroups;
import net.filler.spitemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpiteMod implements ModInitializer {

	public static final String MOD_ID = "spitemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}