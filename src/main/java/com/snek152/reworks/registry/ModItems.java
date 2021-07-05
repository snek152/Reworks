package com.snek152.reworks.registry;

import com.snek152.reworks.Reworks;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS).fireproof().maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item AQUAMARINE = new Item(new Item.Settings().group(ItemGroup.MATERIALS).maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item SAPPHIRE = new Item(new Item.Settings().group(ItemGroup.MATERIALS).maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item TOPAZ = new Item(new Item.Settings().group(ItemGroup.MATERIALS).maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item AMBER = new Item(new Item.Settings().group(ItemGroup.MATERIALS).maxCount(1).rarity(Rarity.UNCOMMON));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Reworks.MOD_ID,"ruby"),RUBY);
        Registry.register(Registry.ITEM, new Identifier(Reworks.MOD_ID,"sapphire"),SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(Reworks.MOD_ID,"aquamarine"),AQUAMARINE);
        Registry.register(Registry.ITEM, new Identifier(Reworks.MOD_ID,"topaz"),TOPAZ);
        Registry.register(Registry.ITEM, new Identifier(Reworks.MOD_ID,"amber"),AMBER);
    }
}
