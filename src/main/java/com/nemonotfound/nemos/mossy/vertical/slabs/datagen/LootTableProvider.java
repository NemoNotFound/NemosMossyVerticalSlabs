package com.nemonotfound.nemos.mossy.vertical.slabs.datagen;

import com.nemonotfound.nemos.mossy.vertical.slabs.block.ModBlocks;
import com.nemonotfound.nemos.vertical.slabs.block.VerticalSlabBlock;
import com.nemonotfound.nemos.vertical.slabs.block.enums.VerticalSlabType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        this.add(ModBlocks.MOSSY_OAK_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_OAK_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_SPRUCE_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_SPRUCE_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_BIRCH_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_BIRCH_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_JUNGLE_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_JUNGLE_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_ACACIA_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_ACACIA_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_MANGROVE_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_MANGROVE_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_CHERRY_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_CHERRY_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_BAMBOO_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_BAMBOO_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_CRIMSON_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_CRIMSON_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_WARPED_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_WARPED_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_STONE_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_STONE_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_BRICK_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_TUFF_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_TUFF_VERTICAL_SLAB));
        this.add(ModBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB));
    }

    public LootTable.Builder slabDrops(Block drop) {
        LootPool.Builder lootPoolBuilder = LootPool.lootPool().setRolls((ConstantValue.exactly(1.0F)))
                .add(this.applyExplosionDecay(drop, LootItem.lootTableItem(drop)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(drop)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE))))));

        return LootTable.lootTable()
                .withPool(lootPoolBuilder);
    }
}
