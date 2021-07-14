package com.snek152.reworks.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Aquamarine extends Item {
    public Aquamarine(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entity, int slot, boolean isSelected) {
        if (stack.getItem().getClass() == Aquamarine.class && isSelected && entity.isOnFire()) {
            entity.clearFire();
        }
    }
}
