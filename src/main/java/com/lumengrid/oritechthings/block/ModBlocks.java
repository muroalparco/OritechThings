package com.lumengrid.oritechthings.block;

import com.lumengrid.oritechthings.block.custom.TierAddonBlock;
import com.lumengrid.oritechthings.item.ModItems;
import com.lumengrid.oritechthings.main.OritechThings;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import rearth.oritech.block.blocks.addons.MachineAddonBlock;


import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(OritechThings.MOD_ID);
    public static final Map<String, Float> SPEED_ADDON_SPEED_MULTIPLIERS = Map.of(
            "addon_block_speed_tier_2", 0.80f,
            "addon_block_speed_tier_3", 0.70f,
            "addon_block_speed_tier_4", 0.60f,
            "addon_block_speed_tier_5", 0.50f,
            "addon_block_speed_tier_6", 0.40f,
            "addon_block_speed_tier_7", 0.30f,
            "addon_block_speed_tier_8", 0.20f,
            "addon_block_speed_tier_9", 0.10f
    );
    public static final Map<String, Float> SPEED_ADDON_EFFICIENCY_MULTIPLIERS = Map.of(
            "addon_block_speed_tier_2", 1.10f,
            "addon_block_speed_tier_3", 1.15f,
            "addon_block_speed_tier_4", 1.20f,
            "addon_block_speed_tier_5", 1.25f,
            "addon_block_speed_tier_6", 1.30f,
            "addon_block_speed_tier_7", 1.35f,
            "addon_block_speed_tier_8", 1.40f,
            "addon_block_speed_tier_9", 1.45f
    );
    public static final Map<String, Float> EFFICIENCY_ADDON_EFFICIENCY_MULTIPLIERS = Map.of(
            "addon_block_efficiency_tier_2", 0.79f,
            "addon_block_efficiency_tier_3", 0.75f,
            "addon_block_efficiency_tier_4", 0.70f,
            "addon_block_efficiency_tier_5", 0.65f,
            "addon_block_efficiency_tier_6", 0.60f,
            "addon_block_efficiency_tier_7", 0.55f,
            "addon_block_efficiency_tier_8", 0.50f,
            "addon_block_efficiency_tier_9", 0.45f
    );

    public static final DeferredBlock<Block> ADDON_BLOCK_SPEED_TIER_2 = registerBlock("addon_block_speed_tier_2", () -> SpeedAddonBlock("addon_block_speed_tier_2"));
    public static final DeferredBlock<Block> ADDON_BLOCK_SPEED_TIER_3 = registerBlock("addon_block_speed_tier_3", () -> SpeedAddonBlock("addon_block_speed_tier_3"));
    public static final DeferredBlock<Block> ADDON_BLOCK_SPEED_TIER_4 = registerBlock("addon_block_speed_tier_4", () -> SpeedAddonBlock("addon_block_speed_tier_4"));
    public static final DeferredBlock<Block> ADDON_BLOCK_SPEED_TIER_5 = registerBlock("addon_block_speed_tier_5", () -> SpeedAddonBlock("addon_block_speed_tier_5"));
    public static final DeferredBlock<Block> ADDON_BLOCK_SPEED_TIER_6 = registerBlock("addon_block_speed_tier_6", () -> SpeedAddonBlock("addon_block_speed_tier_6"));
    public static final DeferredBlock<Block> ADDON_BLOCK_SPEED_TIER_7 = registerBlock("addon_block_speed_tier_7", () -> SpeedAddonBlock("addon_block_speed_tier_7"));
    public static final DeferredBlock<Block> ADDON_BLOCK_SPEED_TIER_8 = registerBlock("addon_block_speed_tier_8", () -> SpeedAddonBlock("addon_block_speed_tier_8"));
    public static final DeferredBlock<Block> ADDON_BLOCK_SPEED_TIER_9 = registerBlock("addon_block_speed_tier_9", () -> SpeedAddonBlock("addon_block_speed_tier_9"));


    public static final DeferredBlock<Block> ADDON_BLOCK_EFFICIENCY_TIER_2 = registerBlock("addon_block_efficiency_tier_2", () -> EfficiencyAddonBlock("addon_block_efficiency_tier_2"));
    public static final DeferredBlock<Block> ADDON_BLOCK_EFFICIENCY_TIER_3 = registerBlock("addon_block_efficiency_tier_3", () -> EfficiencyAddonBlock("addon_block_efficiency_tier_3"));
    public static final DeferredBlock<Block> ADDON_BLOCK_EFFICIENCY_TIER_4 = registerBlock("addon_block_efficiency_tier_4", () -> EfficiencyAddonBlock("addon_block_efficiency_tier_4"));
    public static final DeferredBlock<Block> ADDON_BLOCK_EFFICIENCY_TIER_5 = registerBlock("addon_block_efficiency_tier_5", () -> EfficiencyAddonBlock("addon_block_efficiency_tier_5"));
    public static final DeferredBlock<Block> ADDON_BLOCK_EFFICIENCY_TIER_6 = registerBlock("addon_block_efficiency_tier_6", () -> EfficiencyAddonBlock("addon_block_efficiency_tier_6"));
    public static final DeferredBlock<Block> ADDON_BLOCK_EFFICIENCY_TIER_7 = registerBlock("addon_block_efficiency_tier_7", () -> EfficiencyAddonBlock("addon_block_efficiency_tier_7"));
    public static final DeferredBlock<Block> ADDON_BLOCK_EFFICIENCY_TIER_8 = registerBlock("addon_block_efficiency_tier_8", () -> EfficiencyAddonBlock("addon_block_efficiency_tier_8"));
    public static final DeferredBlock<Block> ADDON_BLOCK_EFFICIENCY_TIER_9 = registerBlock("addon_block_efficiency_tier_9", () -> EfficiencyAddonBlock("addon_block_efficiency_tier_9"));

    private static Block SpeedAddonBlock(String name) {
        float speedMultiplier = SPEED_ADDON_SPEED_MULTIPLIERS.get(name);
        float efficiencyMultiplier = SPEED_ADDON_EFFICIENCY_MULTIPLIERS.get(name);
        return new TierAddonBlock(
                MachineAddonBlock.AddonSettings.getDefaultSettings()
                        .withSpeedMultiplier(speedMultiplier)
                        .withEfficiencyMultiplier(efficiencyMultiplier)
                        .withNeedsSupport(false)
                        .withBoundingShape(MachineAddonBlock.MACHINE_SPEED_ADDON_SHAPE));
    }

    private static MachineAddonBlock EfficiencyAddonBlock(String name) {
        float efficiencyMultiplier = EFFICIENCY_ADDON_EFFICIENCY_MULTIPLIERS.get(name);
        return new TierAddonBlock(
                MachineAddonBlock.AddonSettings.getDefaultSettings()
                        .withEfficiencyMultiplier(efficiencyMultiplier)
                        .withNeedsSupport(false)
                        .withBoundingShape(MachineAddonBlock.MACHINE_EFFICIENCY_ADDON_SHAPE));
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
