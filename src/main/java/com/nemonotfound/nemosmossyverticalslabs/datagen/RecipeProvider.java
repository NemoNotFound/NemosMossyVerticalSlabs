package com.nemonotfound.nemosmossyverticalslabs.datagen;

import com.nemonotfound.nemosmossyverticalslabs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_OAK_VERTICAL_SLAB, Items.OAK_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_SPRUCE_VERTICAL_SLAB, Items.SPRUCE_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BIRCH_VERTICAL_SLAB, Items.BIRCH_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_JUNGLE_VERTICAL_SLAB, Items.JUNGLE_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_ACACIA_VERTICAL_SLAB, Items.ACACIA_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DARK_OAK_VERTICAL_SLAB, Items.DARK_OAK_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_MANGROVE_VERTICAL_SLAB, Items.MANGROVE_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_CHERRY_VERTICAL_SLAB, Items.CHERRY_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BAMBOO_VERTICAL_SLAB, Items.BAMBOO_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, Items.BAMBOO_MOSAIC);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_CRIMSON_VERTICAL_SLAB, Items.CRIMSON_PLANKS);
        createWoodenVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_WARPED_VERTICAL_SLAB, Items.WARPED_PLANKS);
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_VERTICAL_SLAB, Items.STONE);
        createVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BRICK_VERTICAL_SLAB, Items.BRICKS);

        VanillaRecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_VERTICAL_SLAB, Items.STONE);
        VanillaRecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BRICK_VERTICAL_SLAB, Items.BRICKS);
    }

    public static void createWoodenVerticalSlabRecipe(RecipeOutput exporter, RecipeCategory category, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(category, output, 6)
                .define('#', input)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_wood", VanillaRecipeProvider.has(ItemTags.PLANKS))
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
