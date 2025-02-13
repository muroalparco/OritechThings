package com.lumengrid.oritechthings.datagen;

import com.lumengrid.oritechthings.block.ModBlocks;
import com.lumengrid.oritechthings.main.OritechThings;
import com.lumengrid.oritechthings.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags,
                              @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, OritechThings.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(ModTags.Items.TIERED_ADDON_EFFICIENCY)
                .add(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_2.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_3.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_4.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_5.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_6.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_2.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_2.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_EFFICIENCY_TIER_2.get().asItem());

        tag(ModTags.Items.TIERED_ADDON_SPEED)
                .add(ModBlocks.ADDON_BLOCK_SPEED_TIER_2.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_SPEED_TIER_3.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_SPEED_TIER_4.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_SPEED_TIER_5.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_SPEED_TIER_6.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_SPEED_TIER_2.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_SPEED_TIER_2.get().asItem())
                .add(ModBlocks.ADDON_BLOCK_SPEED_TIER_2.get().asItem());
    }
}
