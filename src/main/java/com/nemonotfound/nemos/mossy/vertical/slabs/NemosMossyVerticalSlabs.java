package com.nemonotfound.nemos.mossy.vertical.slabs;

import com.nemonotfound.nemos.mossy.vertical.slabs.block.ModBlocks;
import com.nemonotfound.nemos.mossy.vertical.slabs.item.ModCreativeModeTabs;
import com.nemonotfound.nemos.mossy.vertical.slabs.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosMossyVerticalSlabs implements ModInitializer {
	public static final String MOD_ID = "nemos-mossy-vertical-slabs";
	public static final Logger log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		log.info("Thank you for using Nemo's Mossy Vertical Slabs!");

		ModBlocks.registerBlocks();
		ModItems.registerItems();
		ModCreativeModeTabs.registerCreativeModeTabs();
	}
}