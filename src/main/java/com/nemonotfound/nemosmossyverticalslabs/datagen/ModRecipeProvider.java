package com.nemonotfound.nemosmossyverticalslabs.datagen;

import com.nemonotfound.nemosmossyblocks.registry.tag.ModItemTags;
import com.nemonotfound.nemosmossyverticalslabs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemosmossyblocks.item.ModItems.*;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {
            @Override
            public void buildRecipes() {
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_OAK_VERTICAL_SLAB, MOSSY_OAK_PLANKS);
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_SPRUCE_VERTICAL_SLAB, MOSSY_SPRUCE_PLANKS);
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BIRCH_VERTICAL_SLAB, MOSSY_BIRCH_PLANKS);
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_JUNGLE_VERTICAL_SLAB, MOSSY_JUNGLE_PLANKS);
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_ACACIA_VERTICAL_SLAB, MOSSY_ACACIA_PLANKS);
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DARK_OAK_VERTICAL_SLAB, MOSSY_DARK_OAK_PLANKS);
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_MANGROVE_VERTICAL_SLAB, MOSSY_MANGROVE_PLANKS);
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_CHERRY_VERTICAL_SLAB, MOSSY_CHERRY_PLANKS);
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BAMBOO_VERTICAL_SLAB, MOSSY_BAMBOO_PLANKS);
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, MOSSY_BAMBOO_MOSAIC);
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_CRIMSON_VERTICAL_SLAB, MOSSY_CRIMSON_PLANKS);
                createWoodenVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_WARPED_VERTICAL_SLAB, MOSSY_WARPED_PLANKS);
                createVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_VERTICAL_SLAB, MOSSY_STONE);
                createVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, MOSSY_COBBLED_DEEPSLATE);
                createVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, MOSSY_DEEPSLATE_BRICKS);
                createVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, MOSSY_DEEPSLATE_TILES);
                createVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_VERTICAL_SLAB, MOSSY_TUFF);
                createVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB, MOSSY_TUFF_BRICKS);
                createVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BRICK_VERTICAL_SLAB, MOSSY_BRICKS);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_STONE_VERTICAL_SLAB, MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_VERTICAL_SLAB, MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB, MOSSY_TUFF_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModItems.MOSSY_BRICK_VERTICAL_SLAB, MOSSY_BRICKS);
            }

            public void createWoodenVerticalSlabRecipe(RecipeCategory category, ItemLike output, ItemLike input) {
                this.shaped(category, output, 6)
                        .define('#', input)
                        .pattern("#")
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_wood", has(ModItemTags.MOSSY_PLANKS))
                        .group("wooden_mossy_vertical_slabs")
                        .save(this.output);
            }

            public void createVerticalSlabRecipe(RecipeCategory category, ItemLike output, ItemLike input) {
                this.shaped(category, output, 6)
                        .define('#', input)
                        .pattern("#")
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy(VanillaRecipeProvider.getHasName(input), has(input))
                        .save(this.output);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Mossy Vertical Slabs Recipes";
    }
}
