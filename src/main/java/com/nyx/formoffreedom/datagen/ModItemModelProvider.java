package com.nyx.formoffreedom.datagen;

import com.nyx.formoffreedom.FormofFreedom;
import com.nyx.formoffreedom.Item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FormofFreedom.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BIOCHAFF.get());

        basicItem(ModItems.RFCANISTER.get());
        basicItem(ModItems.FLUIDCANISTER.get());
        basicItem(ModItems.SOLIDCANISTER.get());

        basicItem(ModItems.SILICON_BRASS_MIX.get());
        basicItem(ModItems.SILICON_BRASS_INGOT.get());
    }
}