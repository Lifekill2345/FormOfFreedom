package com.nyx.formoffreedom.Attribute;


import com.nyx.formoffreedom.FormofFreedom;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.nyx.formoffreedom.FormofFreedom.MODID;

public class ModAttributes {

    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(
            BuiltInRegistries.ATTRIBUTE, FormofFreedom.MODID);

    public static final Holder<Attribute> CANISTER_DRAIN_ATTRIBUTE = ATTRIBUTES.register("canister_drain", () -> new RangedAttribute(
            // The translation key to use.
            "itemGroup." + MODID + ".canister_drain_attribute",
            // The default value.
            0,
            // Min and max values.
            -10000,
            10000
    ));
    public static final Holder<Attribute> ORIGIN_TYPE = ATTRIBUTES.register("canister_drain", () -> new RangedAttribute(
            // The translation key to use.
            "itemGroup." + MODID + ".canister_drain_attribute",
            // The default value.
            0,
            // Min and max values.
            -10000,
            10000
    ));





    public static void register(IEventBus EventBus) {
        ATTRIBUTES.register(EventBus);
    }
}
