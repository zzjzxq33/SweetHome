package com.akuamar1n.sweethome.init;

import com.akuamar1n.sweethome.Constants;
import com.akuamar1n.sweethome.block.BlockCream;
import com.akuamar1n.sweethome.block.CreamType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(Registries.BLOCK, Constants.MOD_ID);
    public static final DeferredHolder<Block, Block> CREAM = REGISTRY.register("cream", key -> new BlockCream(ResourceKey.create(Registries.BLOCK, key), CreamType.CREAM));
    public static final DeferredHolder<Block, Block> CREAM_COCOA = REGISTRY.register("cream_cocoa", key -> new BlockCream(ResourceKey.create(Registries.BLOCK, key), CreamType.CREAM_COCOA));
    public static final DeferredHolder<Block, Block> CREAM_PILLAR = REGISTRY.register("cream_pillar", key -> new BlockCream(ResourceKey.create(Registries.BLOCK, key), CreamType.CREAM_PILLAR));
    public static final DeferredHolder<Block, Block> CREAM_COCOA_PILLAR = REGISTRY.register("cream_cocoa_pillar", key -> new BlockCream(ResourceKey.create(Registries.BLOCK, key), CreamType.CREAM_COCOA_PILLAR));
    public static final DeferredHolder<Block, Block> CREAM_PATTERN = REGISTRY.register("cream_pattern", key -> new BlockCream(ResourceKey.create(Registries.BLOCK, key), CreamType.CREAM_PATTERN));
    public static final DeferredHolder<Block, Block> CREAM_COCOA_PATTERN = REGISTRY.register("cream_cocoa_pattern", key -> new BlockCream(ResourceKey.create(Registries.BLOCK, key), CreamType.CREAM_COCOA_PATTERN));
}
