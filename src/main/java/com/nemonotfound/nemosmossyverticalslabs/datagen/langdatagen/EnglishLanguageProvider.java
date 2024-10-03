package com.nemonotfound.nemosmossyverticalslabs.datagen.langdatagen;

import com.nemonotfound.nemosmossyverticalslabs.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class EnglishLanguageProvider extends FabricLanguageProvider {

    public EnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.MOSSY_OAK_VERTICAL_SLAB, "Mossy Oak Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_SPRUCE_VERTICAL_SLAB, "Mossy Spruce Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_BIRCH_VERTICAL_SLAB, "Mossy Birch Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_JUNGLE_VERTICAL_SLAB, "Mossy Jungle Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_ACACIA_VERTICAL_SLAB, "Mossy Acacia Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB, "Mossy Dark Oak Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_MANGROVE_VERTICAL_SLAB, "Mossy Mangrove Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_CHERRY_VERTICAL_SLAB, "Mossy Cherry Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_BAMBOO_VERTICAL_SLAB, "Mossy Bamboo Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, "Mossy Bamboo Mosaic Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_CRIMSON_VERTICAL_SLAB, "Mossy Crimson Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_WARPED_VERTICAL_SLAB, "Mossy Warped Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_STONE_VERTICAL_SLAB, "Mossy Stone Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, "Mossy Cobbled Deepslate Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, "Mossy Deepslate Brick Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, "Mossy Deepslate Tile Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_TUFF_VERTICAL_SLAB, "Mossy Tuff Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB, "Mossy Tuff Brick Vertical Slab");
        translationBuilder.add(ModBlocks.MOSSY_BRICK_VERTICAL_SLAB, "Mossy Brick Vertical Slab");
    }
}
