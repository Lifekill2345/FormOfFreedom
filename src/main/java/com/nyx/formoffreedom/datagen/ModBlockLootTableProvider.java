package com.nyx.formoffreedom.datagen;

import com.nyx.formoffreedom.block.ModBlocks;
import com.nyx.formoffreedom.Item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }
//add blocks here
    @Override
    protected void generate() {
        dropSelf(ModBlocks.CANISTER_WORKBENCH.get());
        dropSelf(ModBlocks.FLUID_COMPOSTER.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.Blocks.getEntries().stream().map(Holder::value)::iterator;
    }
}