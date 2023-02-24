package me.squawkykaka.toomanybooms;

import me.squawkykaka.toomanybooms.Item.ModItemGroup;
import me.squawkykaka.toomanybooms.Item.ModItems;
import me.squawkykaka.toomanybooms.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Toomanybooms implements ModInitializer {
    public static final String MOD_ID = "toomanybooms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric World!");
        ModItems.registerModItems();
        ModItemGroup.registerItemGroups();
        ModBlocks.registerModBlocks();
    }
}
