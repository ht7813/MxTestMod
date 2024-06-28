package com.mx.testmod.registry;

import com.mx.testmod.MxTestMod;
import com.mx.testmod.material.CitrineArmorMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings()),
            ModItemGroup.CITRINE, ItemGroups.INGREDIENTS);
    public static final Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings()),
            ModItemGroup.CITRINE, ItemGroups.INGREDIENTS);
    public static final Item CITRINE_HELMET = registerItem("citrine_helmet",
            new ArmorItem(CitrineArmorMaterial.CITRINE, ArmorItem.Type.HELMET, new FabricItemSettings()),
            ModItemGroup.CITRINE, ItemGroups.COMBAT);
    public static final Item CITRINE_CHESTPLATE = registerItem("citrine_chestplate",
            new ArmorItem(CitrineArmorMaterial.CITRINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()),
            ModItemGroup.CITRINE, ItemGroups.COMBAT);
    public static final Item CITRINE_LEGGINGS = registerItem("citrine_leggings",
            new ArmorItem(CitrineArmorMaterial.CITRINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()),
            ModItemGroup.CITRINE, ItemGroups.COMBAT);
    public static final Item CITRINE_BOOTS = registerItem("citrine_boots",
            new ArmorItem(CitrineArmorMaterial.CITRINE, ArmorItem.Type.BOOTS, new FabricItemSettings()),
            ModItemGroup.CITRINE, ItemGroups.COMBAT);
    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Item registerItem = Registry.register(Registries.ITEM, new Identifier(MxTestMod.MOD_ID, name), item);
        for (ItemGroup itemGroup: itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registerItem));
        }
        return registerItem;
    }
    public static void registerModItems() {
        MxTestMod.LOGGER.debug("Registering mod items for" + MxTestMod.MOD_ID);
    }
}
