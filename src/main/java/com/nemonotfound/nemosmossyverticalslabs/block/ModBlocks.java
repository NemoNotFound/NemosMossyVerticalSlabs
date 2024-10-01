package com.nemonotfound.nemosmossyverticalslabs.block;

import com.nemonotfound.nemosverticalslabs.block.VerticalSlabBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static com.nemonotfound.nemosmossyverticalslabs.NemosMossyVerticalSlabs.MOD_ID;
import static com.nemonotfound.nemosmossyverticalslabs.NemosMossyVerticalSlabs.log;
import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {

    public static final Block MOSSY_OAK_VERTICAL_SLAB = registerBlock("mossy_oak_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(OAK_SLAB)));
    public static final Block MOSSY_SPRUCE_VERTICAL_SLAB = registerBlock("mossy_spruce_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(SPRUCE_SLAB)));
    public static final Block MOSSY_BIRCH_VERTICAL_SLAB = registerBlock("mossy_birch_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(BIRCH_SLAB)));
    public static final Block MOSSY_JUNGLE_VERTICAL_SLAB = registerBlock("mossy_jungle_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(JUNGLE_SLAB)));
    public static final Block MOSSY_ACACIA_VERTICAL_SLAB = registerBlock("mossy_acacia_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(ACACIA_SLAB)));
    public static final Block MOSSY_DARK_OAK_VERTICAL_SLAB = registerBlock("mossy_dark_oak_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(DARK_OAK_SLAB)));
    public static final Block MOSSY_MANGROVE_VERTICAL_SLAB = registerBlock("mossy_mangrove_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(MANGROVE_SLAB)));
    public static final Block MOSSY_CHERRY_VERTICAL_SLAB = registerBlock("mossy_cherry_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(CHERRY_SLAB)));
    public static final Block MOSSY_BAMBOO_VERTICAL_SLAB = registerBlock("mossy_bamboo_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(BAMBOO_SLAB)));
    public static final Block MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerBlock("mossy_bamboo_mosaic_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(BAMBOO_MOSAIC_SLAB)));
    public static final Block MOSSY_CRIMSON_VERTICAL_SLAB = registerBlock("mossy_crimson_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(CRIMSON_SLAB)));
    public static final Block MOSSY_WARPED_VERTICAL_SLAB = registerBlock("mossy_warped_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(WARPED_SLAB)));
    public static final Block MOSSY_STONE_VERTICAL_SLAB = registerBlock("mossy_stone_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(STONE_SLAB)));
    public static final Block MOSSY_BRICK_VERTICAL_SLAB = registerBlock("mossy_brick_vertical_slab",
            new VerticalSlabBlock(BlockBehaviour.Properties.ofFullCopy(BRICK_SLAB)));

    public static void registerBlocks() {
        log.info("Registering blocks");
    }

    private static Block registerBlock(String path, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, path), block);
    }
}
