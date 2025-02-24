package com.nemonotfound.nemos.mossy.vertical.slabs.datagen;

import com.nemonotfound.nemos.mossy.vertical.slabs.item.ModItems;
import com.nemonotfound.nemosmossyblocks.registry.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemosmossyblocks.item.ModItems.*;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput recipeOutput) {
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_OAK_VERTICAL_SLAB, MOSSY_OAK_PLANKS);
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_SPRUCE_VERTICAL_SLAB, MOSSY_SPRUCE_PLANKS);
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BIRCH_VERTICAL_SLAB, MOSSY_BIRCH_PLANKS);
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_JUNGLE_VERTICAL_SLAB, MOSSY_JUNGLE_PLANKS);
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_ACACIA_VERTICAL_SLAB, MOSSY_ACACIA_PLANKS);
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DARK_OAK_VERTICAL_SLAB, MOSSY_DARK_OAK_PLANKS);
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_MANGROVE_VERTICAL_SLAB, MOSSY_MANGROVE_PLANKS);
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_CHERRY_VERTICAL_SLAB, MOSSY_CHERRY_PLANKS);
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BAMBOO_VERTICAL_SLAB, MOSSY_BAMBOO_PLANKS);
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, MOSSY_BAMBOO_MOSAIC);
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_CRIMSON_VERTICAL_SLAB, MOSSY_CRIMSON_PLANKS);
        createWoodenVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_WARPED_VERTICAL_SLAB, MOSSY_WARPED_PLANKS);
        createVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_VERTICAL_SLAB, MOSSY_STONE);
        createVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, MOSSY_COBBLED_DEEPSLATE);
        createVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, MOSSY_DEEPSLATE_BRICKS);
        createVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, MOSSY_DEEPSLATE_TILES);
        createVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_VERTICAL_SLAB, MOSSY_TUFF);
        createVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB, MOSSY_TUFF_BRICKS);
        createVerticalSlabRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BRICK_VERTICAL_SLAB, MOSSY_BRICKS);

        RecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_VERTICAL_SLAB, MOSSY_STONE, 2);
        RecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, MOSSY_COBBLED_DEEPSLATE, 2);
        RecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, MOSSY_DEEPSLATE_BRICKS, 2);
        RecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, MOSSY_DEEPSLATE_TILES, 2);
        RecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_VERTICAL_SLAB, MOSSY_TUFF, 2);
        RecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB, MOSSY_TUFF_BRICKS, 2);
        RecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BRICK_VERTICAL_SLAB, MOSSY_BRICKS, 2);
    }

    public void createWoodenVerticalSlabRecipe(RecipeOutput recipeOutput, RecipeCategory category, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(category, output, 6)
                .define('#', input)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_wood", has(ModItemTags.MOSSY_PLANKS))
                .group("wooden_mossy_vertical_slabs")
                .save(recipeOutput);
    }

    public void createVerticalSlabRecipe(RecipeOutput recipeOutput, RecipeCategory category, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(category, output, 6)
                .define('#', input)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .unlockedBy(VanillaRecipeProvider.getHasName(input), has(input))
                .save(recipeOutput);
    }
}
