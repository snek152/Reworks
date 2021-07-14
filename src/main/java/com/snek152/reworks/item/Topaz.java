package com.snek152.reworks.item;

import net.minecraft.client.audio.BiomeSoundHandler;
import net.minecraft.client.audio.Sound;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.injection.Inject;

public class Topaz extends Item {
    public Topaz(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE,30,2,false,true,true));
        playerIn.addEffect(new EffectInstance(Effects.GLOWING,10,0,false,false,false));
        worldIn.playSound(playerIn,playerIn, SoundEvents.BEACON_AMBIENT, SoundCategory.AMBIENT,1,1);
//        if (playerIn.getMainHandItem().getItem() == ModItems.TOPAZ.get() || playerIn.getOffhandItem().getItem() == ModItems.TOPAZ.get()) {
//            playerIn.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE,0,1,false,false,true));
//        }
        return ActionResult.pass(playerIn.getItemInHand(handIn));
    }

    @Override
    public void onUseTick(World world, LivingEntity entity, ItemStack stack, int p_219972_4_) {
        world.playSound((PlayerEntity) entity,entity, SoundEvents.BEACON_AMBIENT, SoundCategory.AMBIENT,1,1);
    }
}
