package com.akuamar1n.sweethome.block;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ItemFruits extends BlockItem {
    private final BlockFruits fruits;

    public ItemFruits(ResourceKey<Item> key, Block block) {
        super(block, new Item.Properties().setId(key).durability(0).food(ModFoods.FRUITS));
        this.fruits = (BlockFruits) block;
    }
}
