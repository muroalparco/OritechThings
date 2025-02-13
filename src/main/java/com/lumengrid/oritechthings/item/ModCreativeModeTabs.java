package com.lumengrid.oritechthings.item;

import com.lumengrid.oritechthings.main.OritechThings;
import com.lumengrid.oritechthings.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OritechThings.MOD_ID);

    public static final Supplier<CreativeModeTab> ORITECH_THINGS_TAB = CREATIVE_MODE_TAB.register("oritech_things_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ADDON_BLOCK_SPEED_TIER_9.get()))
                    .title(Component.translatable("itemGroup.oritechthings"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ADDON_BLOCK_SPEED_TIER_2);
                        output.accept(ModBlocks.ADDON_BLOCK_SPEED_TIER_3);
                        output.accept(ModBlocks.ADDON_BLOCK_SPEED_TIER_4);
                        output.accept(ModBlocks.ADDON_BLOCK_SPEED_TIER_5);
                        output.accept(ModBlocks.ADDON_BLOCK_SPEED_TIER_6);
                        output.accept(ModBlocks.ADDON_BLOCK_SPEED_TIER_7);
                        output.accept(ModBlocks.ADDON_BLOCK_SPEED_TIER_8);
                        output.accept(ModBlocks.ADDON_BLOCK_SPEED_TIER_9);
                        output.accept(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_2);
                        output.accept(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_3);
                        output.accept(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_4);
                        output.accept(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_5);
                        output.accept(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_6);
                        output.accept(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_7);
                        output.accept(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_8);
                        output.accept(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_9);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
