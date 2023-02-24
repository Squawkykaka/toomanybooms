package me.squawkykaka.toomanybooms.Item;

import me.squawkykaka.toomanybooms.Toomanybooms;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup TOOMANYBOOMS;

    public static void registerItemGroups() {
        TOOMANYBOOMS = FabricItemGroup.builder(new Identifier(Toomanybooms.MOD_ID, "citrine"))
                .displayName(Text.translatable("itemgroup.toomanybooms"))
                .icon(() -> new ItemStack(ModItems.RUBIDIUM)).build();
    }
}
