package com.snek152.reworks.item;

import com.snek152.reworks.util.Registration;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> AQUAMARINE = Registration.ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).food(new Food.Builder().build())));
    public static void register() {}
}
