package com.snek152.reworks.events;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Map;

public class ModEvents {
    @SubscribeEvent
    public void onTridentAttack(AttackEntityEvent event) {
        Map<Enchantment,Integer> test = EnchantmentHelper.getEnchantments(event.getPlayer().getMainHandItem());
        if (event.getPlayer().getMainHandItem().getItem() == Items.TRIDENT && test.containsKey(Enchantments.CHANNELING) && event.getPlayer().getCommandSenderWorld().isThundering()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                PlayerEntity player = event.getPlayer();
                LightningBoltEntity bolt = new LightningBoltEntity(EntityType.LIGHTNING_BOLT,target.getCommandSenderWorld());
                bolt.setPos(target.getX(),target.getY(),target.getZ());
                target.getCommandSenderWorld().addFreshEntity(bolt);
            }
        }
    }
}
