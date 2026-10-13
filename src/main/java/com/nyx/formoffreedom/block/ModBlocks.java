package com.nyx.formoffreedom.block;

import com.nyx.formoffreedom.FormofFreedom;
import com.nyx.formoffreedom.Item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks Blocks =
            DeferredRegister.createBlocks(FormofFreedom.MODID);

    public static final DeferredBlock<Block> FLUID_COMPOSTER = registerBlock("fluid_composter",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> CANISTER_WORKBENCH = registerBlock("canister_workbench",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = Blocks.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        Blocks.register(eventBus);
    }
}
