package com.nemonotfound.nemosmossyverticalslabs.block;

import com.nemonotfound.nemosverticalslabs.block.VerticalSlabBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

import static com.nemonotfound.nemosmossyverticalslabs.NemosMossyVerticalSlabs.MOD_ID;
import static com.nemonotfound.nemosmossyverticalslabs.NemosMossyVerticalSlabs.log;
import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {

    public static final Block MOSSY_OAK_VERTICAL_SLAB = register("mossy_oak_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_SLAB));
    public static final Block MOSSY_SPRUCE_VERTICAL_SLAB = register("mossy_spruce_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_SLAB));
    public static final Block MOSSY_BIRCH_VERTICAL_SLAB = register("mossy_birch_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_SLAB));
    public static final Block MOSSY_JUNGLE_VERTICAL_SLAB = register("mossy_jungle_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(JUNGLE_SLAB));
    public static final Block MOSSY_ACACIA_VERTICAL_SLAB = register("mossy_acacia_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(ACACIA_SLAB));
    public static final Block MOSSY_DARK_OAK_VERTICAL_SLAB = register("mossy_dark_oak_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(DARK_OAK_SLAB));
    public static final Block MOSSY_MANGROVE_VERTICAL_SLAB = register("mossy_mangrove_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(MANGROVE_SLAB));
    public static final Block MOSSY_CHERRY_VERTICAL_SLAB = register("mossy_cherry_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(CHERRY_SLAB));
    public static final Block MOSSY_BAMBOO_VERTICAL_SLAB = register("mossy_bamboo_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(BAMBOO_SLAB));
    public static final Block MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = register("mossy_bamboo_mosaic_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(BAMBOO_MOSAIC_SLAB));
    public static final Block MOSSY_CRIMSON_VERTICAL_SLAB = register("mossy_crimson_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(CRIMSON_SLAB));
    public static final Block MOSSY_WARPED_VERTICAL_SLAB = register("mossy_warped_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(WARPED_SLAB));
    public static final Block MOSSY_STONE_VERTICAL_SLAB = register("mossy_stone_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(STONE_SLAB));
    public static final Block MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = register("mossy_cobbled_deepslate_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(COBBLED_DEEPSLATE_SLAB));
    public static final Block MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = register("mossy_deepslate_brick_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_BRICK_SLAB));
    public static final Block MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = register("mossy_deepslate_tile_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_TILE_SLAB));
    public static final Block MOSSY_TUFF_VERTICAL_SLAB = register("mossy_tuff_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(TUFF_SLAB));
    public static final Block MOSSY_TUFF_BRICK_VERTICAL_SLAB = register("mossy_tuff_brick_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(TUFF_BRICK_SLAB));
    public static final Block MOSSY_BRICK_VERTICAL_SLAB = register("mossy_brick_vertical_slab",
            VerticalSlabBlock::new, BlockBehaviour.Properties.ofFullCopy(BRICK_SLAB));

    public static void registerBlocks() {
        log.info("Registering blocks");
    }

    private static Block register(String path, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        return Blocks.register(keyOf(path), factory, properties);
    }

    private static ResourceKey<Block> keyOf(String path) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, path));
    }
}
