package me.squawkykaka.toomanybooms.Item;

import me.squawkykaka.toomanybooms.Toomanybooms;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBIDIUM = registerItem("rubidium",
            new Item(new FabricItemSettings().maxCount(16)));
    public static final Item RAW_RUBIDIUM = registerItem("raw_rubidium",
            new Item(new FabricItemSettings().maxCount(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Toomanybooms.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Toomanybooms.LOGGER.info("Registering Mod Items for " + Toomanybooms.MOD_ID);
    }
}
