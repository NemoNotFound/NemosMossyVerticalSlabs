package com.nemonotfound.nemos.mossy.vertical.slabs.datagen;

import com.nemonotfound.nemos.mossy.vertical.slabs.block.ModBlocks;
import com.nemonotfound.nemos.vertical.slabs.block.enums.VerticalSlabType;
import com.nemonotfound.nemos.vertical.slabs.datagen.ModModels;
import com.nemonotfound.nemos.vertical.slabs.property.ModProperties;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.world.level.block.Block;

import static com.nemonotfound.nemos.mossy.blocks.block.Blocks.*;
import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

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
        generateVerticalSlabBlockModel(blockModelGenerators, MOSSY_PALE_OAK_PLANKS, ModBlocks.MOSSY_PALE_OAK_VERTICAL_SLAB);
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
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_OAK_PLANKS, ModBlocks.PALE_MOSSY_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_SPRUCE_PLANKS, ModBlocks.PALE_MOSSY_SPRUCE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_BIRCH_PLANKS, ModBlocks.PALE_MOSSY_BIRCH_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_JUNGLE_PLANKS, ModBlocks.PALE_MOSSY_JUNGLE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_ACACIA_PLANKS, ModBlocks.PALE_MOSSY_ACACIA_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_DARK_OAK_PLANKS, ModBlocks.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_MANGROVE_PLANKS, ModBlocks.PALE_MOSSY_MANGROVE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_CHERRY_PLANKS, ModBlocks.PALE_MOSSY_CHERRY_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_PALE_OAK_PLANKS, ModBlocks.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_BAMBOO_PLANKS, ModBlocks.PALE_MOSSY_BAMBOO_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_BAMBOO_MOSAIC, ModBlocks.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_CRIMSON_PLANKS, ModBlocks.PALE_MOSSY_CRIMSON_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_WARPED_PLANKS, ModBlocks.PALE_MOSSY_WARPED_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_STONE, ModBlocks.PALE_MOSSY_STONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_COBBLED_DEEPSLATE, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_DEEPSLATE_BRICKS, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_DEEPSLATE_TILES, ModBlocks.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_TUFF, ModBlocks.PALE_MOSSY_TUFF_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_TUFF_BRICKS, ModBlocks.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, PALE_MOSSY_BRICKS, ModBlocks.PALE_MOSSY_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_OAK_PLANKS, ModBlocks.CRIMSON_MOSSY_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_SPRUCE_PLANKS, ModBlocks.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_BIRCH_PLANKS, ModBlocks.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_JUNGLE_PLANKS, ModBlocks.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_ACACIA_PLANKS, ModBlocks.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_DARK_OAK_PLANKS, ModBlocks.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_MANGROVE_PLANKS, ModBlocks.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_CHERRY_PLANKS, ModBlocks.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_PALE_OAK_PLANKS, ModBlocks.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_BAMBOO_PLANKS, ModBlocks.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_BAMBOO_MOSAIC, ModBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_CRIMSON_PLANKS, ModBlocks.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_WARPED_PLANKS, ModBlocks.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_STONE, ModBlocks.CRIMSON_MOSSY_STONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_COBBLED_DEEPSLATE, ModBlocks.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_DEEPSLATE_BRICKS, ModBlocks.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_DEEPSLATE_TILES, ModBlocks.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_TUFF, ModBlocks.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_TUFF_BRICKS, ModBlocks.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, CRIMSON_MOSSY_BRICKS, ModBlocks.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_OAK_PLANKS, ModBlocks.WARPED_MOSSY_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_SPRUCE_PLANKS, ModBlocks.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_BIRCH_PLANKS, ModBlocks.WARPED_MOSSY_BIRCH_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_JUNGLE_PLANKS, ModBlocks.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_ACACIA_PLANKS, ModBlocks.WARPED_MOSSY_ACACIA_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_DARK_OAK_PLANKS, ModBlocks.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_MANGROVE_PLANKS, ModBlocks.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_CHERRY_PLANKS, ModBlocks.WARPED_MOSSY_CHERRY_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_PALE_OAK_PLANKS, ModBlocks.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_BAMBOO_PLANKS, ModBlocks.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_BAMBOO_MOSAIC, ModBlocks.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_CRIMSON_PLANKS, ModBlocks.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_WARPED_PLANKS, ModBlocks.WARPED_MOSSY_WARPED_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_STONE, ModBlocks.WARPED_MOSSY_STONE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_COBBLED_DEEPSLATE, ModBlocks.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_DEEPSLATE_BRICKS, ModBlocks.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_DEEPSLATE_TILES, ModBlocks.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_TUFF, ModBlocks.WARPED_MOSSY_TUFF_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_TUFF_BRICKS, ModBlocks.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockModelGenerators, WARPED_MOSSY_BRICKS, ModBlocks.WARPED_MOSSY_BRICK_VERTICAL_SLAB);
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
        var multiVariant = plainVariant(ModModels.VERTICAL_SLAB.create(block, textureMapping, blockModelGenerators.modelOutput));
        var leftMultiVariant = plainVariant(ModModels.VERTICAL_SLAB_LEFT.createWithSuffix(block, "_left", textureMapping, blockModelGenerators.modelOutput));
        var rightMultiVariant = plainVariant(ModModels.VERTICAL_SLAB_RIGHT.createWithSuffix(block, "_right", textureMapping, blockModelGenerators.modelOutput));
        var backMultiVariant = plainVariant(ModModels.VERTICAL_SLAB_BACK.createWithSuffix(block, "_back", textureMapping, blockModelGenerators.modelOutput));
        var fullMultiVariant = plainVariant(TextureMapping.getBlockTexture(fullBlock));

        blockModelGenerators.blockStateOutput.accept(createVerticalSlabBlockState(block, multiVariant, leftMultiVariant, rightMultiVariant, backMultiVariant, fullMultiVariant));
    }

    public static BlockModelDefinitionGenerator createVerticalSlabBlockState(Block verticalSlabBlock, MultiVariant multiVariant,
                                                                             MultiVariant leftMultiVariant, MultiVariant rightMultiVariant,
                                                                             MultiVariant backMultiVariant, MultiVariant fullMultiVariant) {
        return MultiVariantGenerator.dispatch(verticalSlabBlock)
                .with(PropertyDispatch.initial(ModProperties.VERTICAL_SLAB_TYPE)
                        .select(VerticalSlabType.FRONT, multiVariant)
                        .select(VerticalSlabType.LEFT, leftMultiVariant)
                        .select(VerticalSlabType.RIGHT, rightMultiVariant)
                        .select(VerticalSlabType.BACK, backMultiVariant)
                        .select(VerticalSlabType.DOUBLE, fullMultiVariant)
                );
    }
}
