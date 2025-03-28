package com.nemonotfound.nemos.mossy.vertical.slabs.datagen;

import com.nemonotfound.nemos.mossy.vertical.slabs.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.MOSSY_OAK_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_SPRUCE_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_BIRCH_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_JUNGLE_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_ACACIA_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_MANGROVE_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_CHERRY_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_PALE_OAK_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_BAMBOO_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_CRIMSON_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_WARPED_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_OAK_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_SPRUCE_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_BIRCH_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_JUNGLE_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_ACACIA_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_MANGROVE_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_CHERRY_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_BAMBOO_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_CRIMSON_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_WARPED_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_OAK_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_OAK_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_BIRCH_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_ACACIA_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_CHERRY_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_WARPED_VERTICAL_SLAB);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MOSSY_STONE_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_TUFF_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_BRICK_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_STONE_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_TUFF_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB)
                .add(ModBlocks.PALE_MOSSY_BRICK_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_STONE_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB)
                .add(ModBlocks.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_STONE_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_TUFF_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB)
                .add(ModBlocks.WARPED_MOSSY_BRICK_VERTICAL_SLAB);
    }
}
