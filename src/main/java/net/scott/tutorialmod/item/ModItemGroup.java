package net.scott.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scott.tutorialmod.TutorialMod;

public class ModItemGroup {
    public static final ItemGroup FUNNIES = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID))
            .displayName(Text.literal("Funnies"))
            .icon(() -> new ItemStack(ModItems.SHUNGITE))
            .build();

}
