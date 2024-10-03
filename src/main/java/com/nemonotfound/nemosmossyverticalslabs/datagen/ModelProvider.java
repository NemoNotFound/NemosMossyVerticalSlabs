package com.nemonotfound.nemosmossyverticalslabs.datagen;

import com.nemonotfound.nemosmossyverticalslabs.block.ModBlocks;
import com.nemonotfound.nemosverticalslabs.block.enums.VerticalSlabType;
import com.nemonotfound.nemosverticalslabs.datagen.ModModels;
import com.nemonotfound.nemosverticalslabs.property.ModProperties;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import static com.nemonotfound.nemosmossyblocks.block.ModBlocks.*;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_BAMBOO_MOSAIC, ModBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_STONE, ModBlocks.MOSSY_STONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_COBBLED_DEEPSLATE, ModBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_DEEPSLATE_BRICKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_DEEPSLATE_TILES, ModBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_TUFF, ModBlocks.MOSSY_TUFF_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_TUFF_BRICKS, ModBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_BRICKS, ModBlocks.MOSSY_BRICK_VERTICAL_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }

    private void generateVerticalSlabBlockModel(BlockModelGenerators blockModelGenerators, Block textureBlock, Block block) {
        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.TOP, TextureMapping.getBlockTexture(textureBlock))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(textureBlock))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(textureBlock))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(textureBlock));

        generateVerticalSlabBlockModel(blockModelGenerators, textureMapping, textureBlock, block);
    }

    private void generateVerticalSlabBlockModel(BlockModelGenerators blockModelGenerators, TextureMapping textureMapping, Block fullBlock, Block block) {
        ResourceLocation modelId = ModModels.VERTICAL_SLAB.create(block, textureMapping, blockModelGenerators.modelOutput);
        ResourceLocation leftModelId = ModModels.VERTICAL_SLAB_LEFT.createWithSuffix(block, "_left", textureMapping, blockModelGenerators.modelOutput);
        ResourceLocation rightModelId = ModModels.VERTICAL_SLAB_RIGHT.createWithSuffix(block, "_right", textureMapping, blockModelGenerators.modelOutput);
        ResourceLocation backModelId = ModModels.VERTICAL_SLAB_BACK.createWithSuffix(block, "_back", textureMapping, blockModelGenerators.modelOutput);

        blockModelGenerators.blockStateOutput.accept(createVerticalSlabBlockState(block, modelId, leftModelId, rightModelId, backModelId, TextureMapping.getBlockTexture(fullBlock)));
    }

    public static BlockStateGenerator createVerticalSlabBlockState(Block verticalSlabBlock, ResourceLocation modelId,
                                                                   ResourceLocation leftModelId, ResourceLocation rightModelId,
                                                                   ResourceLocation backModelId, ResourceLocation fullModelId) {
        return MultiVariantGenerator.multiVariant(verticalSlabBlock)
                .with(PropertyDispatch.property(ModProperties.VERTICAL_SLAB_TYPE)
                        .select(VerticalSlabType.FRONT, Variant.variant().with(VariantProperties.MODEL, modelId))
                        .select(VerticalSlabType.LEFT, Variant.variant().with(VariantProperties.MODEL, leftModelId))
                        .select(VerticalSlabType.RIGHT, Variant.variant().with(VariantProperties.MODEL, rightModelId))
                        .select(VerticalSlabType.BACK, Variant.variant().with(VariantProperties.MODEL, backModelId))
                        .select(VerticalSlabType.DOUBLE, Variant.variant().with(VariantProperties.MODEL, fullModelId))
                );
    }
}
