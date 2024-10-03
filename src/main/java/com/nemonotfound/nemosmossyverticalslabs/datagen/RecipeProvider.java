package com.nemonotfound.nemosmossyverticalslabs.datagen;

import com.nemonotfound.nemosmossyblocks.registry.tag.ModItemTags;
import com.nemonotfound.nemosmossyverticalslabs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemosmossyblocks.item.ModItems.*;

public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_OAK_VERTICAL_SLAB, MOSSY_OAK_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_SPRUCE_VERTICAL_SLAB, MOSSY_SPRUCE_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BIRCH_VERTICAL_SLAB, MOSSY_BIRCH_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_JUNGLE_VERTICAL_SLAB, MOSSY_JUNGLE_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_ACACIA_VERTICAL_SLAB, MOSSY_ACACIA_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DARK_OAK_VERTICAL_SLAB, MOSSY_DARK_OAK_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_MANGROVE_VERTICAL_SLAB, MOSSY_MANGROVE_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_CHERRY_VERTICAL_SLAB, MOSSY_CHERRY_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BAMBOO_VERTICAL_SLAB, MOSSY_BAMBOO_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, MOSSY_BAMBOO_MOSAIC);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_CRIMSON_VERTICAL_SLAB, MOSSY_CRIMSON_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_WARPED_VERTICAL_SLAB, MOSSY_WARPED_PLANKS);
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_VERTICAL_SLAB, MOSSY_STONE);
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, MOSSY_COBBLED_DEEPSLATE);
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, MOSSY_DEEPSLATE_BRICKS);
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, MOSSY_DEEPSLATE_TILES);
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_VERTICAL_SLAB, MOSSY_TUFF);
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB, MOSSY_TUFF_BRICKS);
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BRICK_VERTICAL_SLAB, MOSSY_BRICKS);

        VanillaRecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_VERTICAL_SLAB, MOSSY_STONE);
        VanillaRecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, MOSSY_COBBLED_DEEPSLATE);
        VanillaRecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, MOSSY_DEEPSLATE_BRICKS);
        VanillaRecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, MOSSY_DEEPSLATE_TILES);
        VanillaRecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_VERTICAL_SLAB, MOSSY_TUFF);
        VanillaRecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB, MOSSY_TUFF_BRICKS);
        VanillaRecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BRICK_VERTICAL_SLAB, MOSSY_BRICKS);
    }

    public static void createWoodenVerticalSlabRecipe(RecipeOutput exporter, RecipeCategory category, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(category, output, 6)
                .define('#', input)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_wood", VanillaRecipeProvider.has(ModItemTags.MOSSY_PLANKS))
                .group("wooden_mossy_vertical_slabs")
                .save(exporter);
    }

    public static void createVerticalSlabRecipe(RecipeOutput exporter, RecipeCategory category, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(category, output, 6)
                .define('#', input)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .unlockedBy(VanillaRecipeProvider.getHasName(input), VanillaRecipeProvider.has(input))
                .save(exporter);
    }
}
