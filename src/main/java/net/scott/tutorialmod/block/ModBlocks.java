package net.scott.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.scott.tutorialmod.TutorialMod;
import net.scott.tutorialmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block SHUNGITE_BLOCK = registerBlock("shungite_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().luminance(10)), ModItemGroup.FUNNIES);

    public static final Block SHUNGITE_ORE = registerBlock("shungite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().luminance(10),
                    UniformIntProvider.create(12, 15)), ModItemGroup.FUNNIES);

    public static final Block DEEPSLATE_SHUNGITE_ORE = registerBlock("deepslate_shungite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().luminance(10),
                    UniformIntProvider.create(12, 15)), ModItemGroup.FUNNIES);


    // Register Block and Item
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        TutorialMod.LOGGER.debug("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
