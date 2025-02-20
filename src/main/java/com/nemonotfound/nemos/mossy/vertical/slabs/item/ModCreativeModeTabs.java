package com.nemonotfound.nemos.mossy.vertical.slabs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemos.mossy.vertical.slabs.NemosMossyVerticalSlabs.log;

public class ModCreativeModeTabs {

    public static void registerCreativeModeTabs() {
        log.info("Adding items to creative mode tabs");

        registerNemosVerticalSlabsItemGroup();
    }

    private static void registerNemosVerticalSlabsItemGroup() {
        CreativeModeTab creativeModeTab = FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.MOSSY_OAK_VERTICAL_SLAB))
                .title(Component.literal("Nemo's Mossy Vertical Slabs"))
                .displayItems((displayContext, entries) -> {
                    entries.accept(ModItems.MOSSY_OAK_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_SPRUCE_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_BIRCH_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_JUNGLE_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_ACACIA_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_DARK_OAK_VERTICAL_SLAB);
                    entries.accept( ModItems.MOSSY_MANGROVE_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_CHERRY_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_PALE_OAK_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_BAMBOO_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_CRIMSON_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_WARPED_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_STONE_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_TUFF_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB);
                    entries.accept(ModItems.MOSSY_BRICK_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_OAK_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_SPRUCE_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_BIRCH_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_JUNGLE_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_ACACIA_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB);
                    entries.accept( ModItems.PALE_MOSSY_MANGROVE_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_CHERRY_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_BAMBOO_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_CRIMSON_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_WARPED_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_STONE_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_TUFF_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
                    entries.accept(ModItems.PALE_MOSSY_BRICK_VERTICAL_SLAB);
                })
                .build();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, MOD_ID), creativeModeTab);
    }
}
