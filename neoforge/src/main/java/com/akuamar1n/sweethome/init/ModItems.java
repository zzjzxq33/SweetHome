package com.akuamar1n.sweethome.init;

import com.akuamar1n.sweethome.Constants;
import com.akuamar1n.sweethome.block.ItemCream;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Registries.ITEM, Constants.MOD_ID);

    public static final DeferredHolder<Item, ItemCream> CREAM = REGISTRY.register("cream",
            key -> new ItemCream(ResourceKey.create(Registries.ITEM, key), ModBlocks.CREAM.get()));
    public static final DeferredHolder<Item, ItemCream> CREAM_COCOA = REGISTRY.register("cream_cocoa",
            key -> new ItemCream(ResourceKey.create(Registries.ITEM, key), ModBlocks.CREAM_COCOA.get()));
    public static final DeferredHolder<Item, ItemCream> CREAM_PILLAR = REGISTRY.register("cream_pillar",
            key -> new ItemCream(ResourceKey.create(Registries.ITEM, key), ModBlocks.CREAM_PILLAR.get()));
    public static final DeferredHolder<Item, ItemCream> CREAM_COCOA_PILLAR = REGISTRY.register("cream_cocoa_pillar",
            key -> new ItemCream(ResourceKey.create(Registries.ITEM, key), ModBlocks.CREAM_COCOA_PILLAR.get()));
    public static final DeferredHolder<Item, ItemCream> CREAM_PATTERN = REGISTRY.register("cream_pattern",
            key -> new ItemCream(ResourceKey.create(Registries.ITEM, key), ModBlocks.CREAM_PATTERN.get()));
    public static final DeferredHolder<Item, ItemCream> CREAM_COCOA_PATTERN = REGISTRY.register("cream_cocoa_pattern",
            key -> new ItemCream(ResourceKey.create(Registries.ITEM, key), ModBlocks.CREAM_PATTERN.get()));
}

