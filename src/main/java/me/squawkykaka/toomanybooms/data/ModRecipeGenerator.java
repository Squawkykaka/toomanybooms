package me.squawkykaka.toomanybooms.data;

import me.squawkykaka.toomanybooms.Item.ModItems;
import me.squawkykaka.toomanybooms.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_RUBIDIUM), RecipeCategory.MISC, ModItems.RUBIDIUM,
                0.7f, 200, "citrine");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBIDIUM,
                RecipeCategory.MISC, ModBlocks.RUBIDIUM_BLOCK);
    }
}
