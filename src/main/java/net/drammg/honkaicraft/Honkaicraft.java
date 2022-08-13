package net.drammg.honkaicraft;

import net.drammg.honkaicraft.block.ModBlocks;
import net.drammg.honkaicraft.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Honkaicraft implements ModInitializer {
	public static final String MOD_ID = "honkaicraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
