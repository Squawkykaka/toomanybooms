package me.squawkykaka.toomanybooms.data;

import me.squawkykaka.toomanybooms.Item.ModItems;
import me.squawkykaka.toomanybooms.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBIDIUM_BLOCK);
        addDrop(ModBlocks.RUBIDIUM_ORE, oreDrops(ModBlocks.RUBIDIUM_ORE, ModItems.RAW_RUBIDIUM));
        addDrop(ModBlocks.DEEPSLATE_RUBIDIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBIDIUM_ORE, ModItems.RAW_RUBIDIUM));
    }
}
