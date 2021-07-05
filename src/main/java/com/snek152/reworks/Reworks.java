package com.snek152.reworks;

import com.snek152.reworks.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Reworks implements ModInitializer {

    public static final String MOD_ID = "reworks";
    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}