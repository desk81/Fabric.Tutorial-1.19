package net.scott.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scott.tutorialmod.TutorialMod;

public class ModItems {

    public static final Item RAW_SHUNGITE = registerItem("raw_shungite",
            new Item(new Item.Settings()),

            ModItemGroup.FUNNIES);

    public static final Item SHUNGITE = registerItem("shungite",
            new Item(new Item.Settings()),

            ModItemGroup.FUNNIES);



    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
