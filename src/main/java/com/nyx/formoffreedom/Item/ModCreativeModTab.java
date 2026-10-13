package com.nyx.formoffreedom.Item;

import com.nyx.formoffreedom.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.nyx.formoffreedom.FormofFreedom.MODID;


public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    //CREATIVE_MODE_TABS is a DeferredRegister<CreativeModeTab>
    public static final Supplier<CreativeModeTab> FORMSOFFREEDOM_UTILITY_TAB = CREATIVE_MODE_TAB.register("forms_of_freedom_utility", () -> CreativeModeTab.builder()
            //Set the title of the tab. Don't forget to add a translation!
            .title(Component.translatable("itemGroup." + MODID + ".forms_of_freedom_utility_tab"))
            //Set the icon of the tab.
            .icon(() -> new ItemStack(ModItems.SOLIDCANISTER.get()))
            //Add your items to the tab.
            .displayItems((params, output) -> {
                output.accept(ModItems.SOLIDCANISTER.get());
                output.accept(ModItems.FLUIDCANISTER.get());
                output.accept(ModItems.RFCANISTER.get());

                // Accepts an ItemLike. This assumes that MY_BLOCK has a corresponding item.
                output.accept(ModBlocks.FLUID_COMPOSTER.get());
                output.accept(ModBlocks.CANISTER_WORKBENCH.get());

            })
            .build()
    );




public static void register(IEventBus EventBus) {
    CREATIVE_MODE_TAB.register(EventBus);
}
}
