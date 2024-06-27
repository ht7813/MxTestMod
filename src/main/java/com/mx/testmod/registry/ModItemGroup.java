package com.mx.testmod.registry;

import com.mx.testmod.MxTestMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CITRINE = FabricItemGroup.builder(new Identifier(MxTestMod.MOD_ID, "citrine"))
            .displayName(Text.translatable("itemgroup.mxtestmod.citrine"))
            .icon(() -> new ItemStack(ModItems.CITRINE))
            .build();
    public static void registerModItemGroup() {
        MxTestMod.LOGGER.debug("Registering mod item group for" + MxTestMod.MOD_ID);
    }
}
