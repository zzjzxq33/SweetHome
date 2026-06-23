package com.akuamar1n.sweethome.block;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Map;

public class ItemCream extends BlockItem {
    private final BlockCream cream;

    public ItemCream(ResourceKey<Item> key, Block block) {
        super(block, new Item.Properties().setId(key).food(ModFoods.CREAM));
        this.cream = (BlockCream) block;
    }

    @Override
    public void registerBlocks(Map<Block, Item> map, Item item) {
        super.registerBlocks(map, item);
        map.put(this.cream, item);
    }
}
