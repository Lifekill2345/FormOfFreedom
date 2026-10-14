package com.nyx.formoffreedom.block.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;


public class biocomposterBlock extends Block {
    public biocomposterBlock(Properties properties) {
        super(properties);
    }


    public static float getValue(ItemStack item) {
        Compostable value = (Compostable)item.getItemHolder().getData(NeoForgeDataMaps.COMPOSTABLES);
        return value != null ? value.chance() : -1.0F;
    }



}
