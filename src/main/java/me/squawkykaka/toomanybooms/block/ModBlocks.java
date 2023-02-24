package me.squawkykaka.toomanybooms.block;

import me.squawkykaka.toomanybooms.Item.ModItemGroup;
import me.squawkykaka.toomanybooms.Toomanybooms;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RUBIDIUM_BLOCK = registerBlock("rubidium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
                ModItemGroup.TOOMANYBOOMS);

    public static final Block RUBIDIUM_ORE = registerBlock("rubidium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),
            ModItemGroup.TOOMANYBOOMS);

    public static final Block DEEPSLATE_RUBIDIUM_ORE = registerBlock("deepslate_rubidium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),
            ModItemGroup.TOOMANYBOOMS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Toomanybooms.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Toomanybooms.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        Toomanybooms.LOGGER.info("Registering ModBlocks for " + Toomanybooms.MOD_ID);
    }
}
