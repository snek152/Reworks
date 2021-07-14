package com.snek152.reworks.item;

import com.snek152.reworks.util.Registration;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> AQUAMARINE = Registration.ITEMS.register("aquamarine",
            () -> new Aquamarine(new Item.Properties().tab(ItemGroup.TAB_MATERIALS).rarity(Rarity.UNCOMMON).fireResistant().stacksTo(1)));
    public static final RegistryObject<Item> TOPAZ = Registration.ITEMS.register("topaz",
            () -> new Topaz(new Item.Properties().tab(ItemGroup.TAB_MATERIALS).rarity(Rarity.UNCOMMON).stacksTo(1)));
    public static void register() {}
}
