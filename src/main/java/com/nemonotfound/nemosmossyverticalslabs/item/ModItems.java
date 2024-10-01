package com.nemonotfound.nemosmossyverticalslabs.item;

import com.nemonotfound.nemosmossyverticalslabs.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static com.nemonotfound.nemosmossyverticalslabs.NemosMossyVerticalSlabs.MOD_ID;
import static com.nemonotfound.nemosmossyverticalslabs.NemosMossyVerticalSlabs.log;

public class ModItems {

    public static final Item MOSSY_OAK_VERTICAL_SLAB = registerBlockItem("mossy_oak_vertical_slab", ModBlocks.MOSSY_OAK_VERTICAL_SLAB);
    public static final Item MOSSY_SPRUCE_VERTICAL_SLAB = registerBlockItem("mossy_spruce_vertical_slab", ModBlocks.MOSSY_SPRUCE_VERTICAL_SLAB);
    public static final Item MOSSY_BIRCH_VERTICAL_SLAB = registerBlockItem("mossy_birch_vertical_slab", ModBlocks.MOSSY_BIRCH_VERTICAL_SLAB);
    public static final Item MOSSY_JUNGLE_VERTICAL_SLAB = registerBlockItem("mossy_jungle_vertical_slab", ModBlocks.MOSSY_JUNGLE_VERTICAL_SLAB);
    public static final Item MOSSY_ACACIA_VERTICAL_SLAB = registerBlockItem("mossy_acacia_vertical_slab", ModBlocks.MOSSY_ACACIA_VERTICAL_SLAB);
    public static final Item MOSSY_DARK_OAK_VERTICAL_SLAB = registerBlockItem("mossy_dark_oak_vertical_slab", ModBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB);
    public static final Item MOSSY_MANGROVE_VERTICAL_SLAB = registerBlockItem("mossy_mangrove_vertical_slab", ModBlocks.MOSSY_MANGROVE_VERTICAL_SLAB);
    public static final Item MOSSY_CHERRY_VERTICAL_SLAB = registerBlockItem("mossy_cherry_vertical_slab", ModBlocks.MOSSY_CHERRY_VERTICAL_SLAB);
    public static final Item MOSSY_BAMBOO_VERTICAL_SLAB = registerBlockItem("mossy_bamboo_vertical_slab", ModBlocks.MOSSY_BAMBOO_VERTICAL_SLAB);
    public static final Item MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerBlockItem("mossy_bamboo_mosaic_vertical_slab", ModBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
    public static final Item MOSSY_CRIMSON_VERTICAL_SLAB = registerBlockItem("mossy_crimson_vertical_slab", ModBlocks.MOSSY_CRIMSON_VERTICAL_SLAB);
    public static final Item MOSSY_WARPED_VERTICAL_SLAB = registerBlockItem("mossy_warped_vertical_slab", ModBlocks.MOSSY_WARPED_VERTICAL_SLAB);
    public static final Item MOSSY_STONE_VERTICAL_SLAB = registerBlockItem("mossy_stone_vertical_slab", ModBlocks.MOSSY_STONE_VERTICAL_SLAB);
    public static final Item MOSSY_BRICK_VERTICAL_SLAB = registerBlockItem("mossy_brick_vertical_slab", ModBlocks.MOSSY_BRICK_VERTICAL_SLAB);

    public static void registerItems() {
        log.info("Registering items");
    }

    private static Item registerBlockItem(String path, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Properties());

        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, path), blockItem);
    }
}
