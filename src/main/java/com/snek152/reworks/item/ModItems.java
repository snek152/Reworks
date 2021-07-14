package com.snek152.reworks.item;

import com.snek152.reworks.util.Registration;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> AQUAMARINE = Registration.ITEMS.register("aquamarine",
            () -> new Aquamarine(new Item.Properties().tab(ItemGroup.TAB_MATERIALS).rarity(Rarity.UNCOMMON).food(new Food.Builder().saturationMod(10.0f).nutrition(10).build())));
    public static void register() {}
}
