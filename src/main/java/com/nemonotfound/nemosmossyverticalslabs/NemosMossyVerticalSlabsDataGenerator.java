package com.nemonotfound.nemosmossyverticalslabs;

import com.nemonotfound.nemosmossyverticalslabs.datagen.langdatagen.EnglishLanguageProvider;
import com.nemonotfound.nemosmossyverticalslabs.datagen.BlockTagProvider;
import com.nemonotfound.nemosmossyverticalslabs.datagen.LootTableProvider;
import com.nemonotfound.nemosmossyverticalslabs.datagen.ModelProvider;
import com.nemonotfound.nemosmossyverticalslabs.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NemosMossyVerticalSlabsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModelProvider::new);
		pack.addProvider(LootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(EnglishLanguageProvider::new);
	}
}
