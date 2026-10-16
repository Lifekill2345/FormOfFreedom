package com.nyx.formoffreedom.Item;

import com.nyx.formoffreedom.FormofFreedom;
import com.nyx.formoffreedom.Item.custom.biochaffItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FormofFreedom.MODID);

    public static final DeferredItem<Item> FLUIDCANISTER = ITEMS.register("fluid_canister",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SOLIDCANISTER = ITEMS.register("solid_canister",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RFCANISTER = ITEMS.register("rf_canister",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BIOCHAFF = ITEMS.register("bio_chaff",
            () -> new biochaffItem(new Item.Properties()));

    public static final DeferredItem<Item> SILICON_BRASS_MIX = ITEMS.register("silicon_brass_mix",
            () -> new biochaffItem(new Item.Properties()));

    public static final DeferredItem<Item> SILICON_BRASS_INGOT = ITEMS.register("silicon_brass_ingot",
            () -> new biochaffItem(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
}
}
