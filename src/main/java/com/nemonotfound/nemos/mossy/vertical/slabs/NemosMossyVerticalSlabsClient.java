package com.nemonotfound.nemos.mossy.vertical.slabs;

import com.nemonotfound.nemos.mossy.vertical.slabs.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class NemosMossyVerticalSlabsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_OAK_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_SPRUCE_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_BIRCH_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_JUNGLE_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_ACACIA_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_MANGROVE_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_CHERRY_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_BAMBOO_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_CRIMSON_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_WARPED_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_STONE_VERTICAL_SLAB, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_BRICK_VERTICAL_SLAB, RenderType.cutout());
	}
}