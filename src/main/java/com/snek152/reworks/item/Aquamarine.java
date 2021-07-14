package com.snek152.reworks.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class Aquamarine extends Item {
    public Aquamarine(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entity, int slot, boolean isSelected) {
        PlayerEntity playerIn = (PlayerEntity) entity;
        if (playerIn.getMainHandItem().getItem() == ModItems.AQUAMARINE.get() || playerIn.getOffhandItem().getItem() == ModItems.AQUAMARINE.get()) {
            if (playerIn.isOnFire() && playerIn.getCommandSenderWorld().dimension() != World.NETHER) {
                playerIn.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 0, 0, false, false, false));
            }
            if (playerIn.isInWater()) {
                playerIn.addEffect(new EffectInstance(Effects.WATER_BREATHING, 0, 0, false, false, false));
            }

        }
    }
}
