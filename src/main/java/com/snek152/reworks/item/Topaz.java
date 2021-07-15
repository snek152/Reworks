package com.snek152.reworks.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class Topaz extends Item {
    public Topaz(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }
    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE,30,2,false,true,true));
        playerIn.addEffect(new EffectInstance(Effects.GLOWING,10,0,false,false,false));
        playerIn.addEffect(new EffectInstance(Effects.BLINDNESS,30,0,false,false,false));
        worldIn.playSound(playerIn,playerIn, SoundEvents.BEACON_AMBIENT, SoundCategory.AMBIENT,0.5f,1);

//        if (playerIn.getMainHandItem().getItem() == ModItems.TOPAZ.get() || playerIn.getOffhandItem().getItem() == ModItems.TOPAZ.get()) {
//            playerIn.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE,0,1,false,false,true));
//        }
        return ActionResult.pass(playerIn.getItemInHand(handIn));
    }
}
