package com.akuamar1n.sweethome.block;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockFruits extends Block {
    public BlockFruits(ResourceKey<Block> key, FruitsType type) {
        super(BlockBehaviour.Properties.of()
                .setId(key)
                .destroyTime(0.2F)
                .explosionResistance(3.0F)
                .sound(SoundType.SNOW));
    }
}
