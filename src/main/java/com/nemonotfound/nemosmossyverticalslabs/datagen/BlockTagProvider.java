package com.nemonotfound.nemosmossyverticalslabs.datagen;

import com.nemonotfound.nemosmossyverticalslabs.block.ModBlocks;
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
                .add(ModBlocks.MOSSY_BAMBOO_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_CRIMSON_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_WARPED_VERTICAL_SLAB);

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MOSSY_STONE_VERTICAL_SLAB)
                .add(ModBlocks.MOSSY_BRICK_VERTICAL_SLAB);
    }
}
