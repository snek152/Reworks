package com.snek152.reworks.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class Ruby extends Item {
    public Ruby(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entity, int slot, boolean isSelected) {
        PlayerEntity playerIn = (PlayerEntity) entity;
        if (playerIn.getMainHandItem().getItem() == ModItems.RUBY.get() || playerIn.getOffhandItem().getItem() == ModItems.RUBY.get()) {
            if (playerIn.isOnFire() || playerIn.isInLava()) {
                playerIn.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 1, 0, false, false, true));
                playerIn.clearFire();
            }
        }
    }
}
