package github.mcdatapack.more_tools_and_armor.init;

import java.util.EnumMap;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.ArmorMaterials;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import static github.mcdatapack.more_tools_and_armor.list.TagList.ItemTags.*;

public class ArmorMaterialInit implements ArmorMaterials {
//Durability, Enchantability, SoundEvent, Toughness, Knockback Resistance, Repair Tag Key, Equipment Model
    public static final  ArmorMaterial COPPER = new ArmorMaterial(15, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 4);
        map.put(EquipmentType.HELMET, 1);
    }), 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0, COPPER_REPAIR_ITEMS, CustomEquipmentModels.COPPER);

    public static final ArmorMaterial BUDDING_AMETHYST = new ArmorMaterial(20, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 7);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 2);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1, 0, BUDDING_AMETHYST_REPAIR_ITEMS, CustomEquipmentModels.BUDDING_AMETHYST);

    public static final ArmorMaterial EMERALD = new ArmorMaterial(21, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 2);
    }), 14, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, EMERALD_REPAIR_ITEMS, CustomEquipmentModels.EMERALD);

    public static final ArmorMaterial OBSIDIAN = new ArmorMaterial(40, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4, 4, OBSIDIAN_REPAIR_ITEMS, CustomEquipmentModels.OBSIDIAN);

    public static final ArmorMaterial DEEPSLATE_EMERALD = new ArmorMaterial(280, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 5);
        map.put(EquipmentType.LEGGINGS, 8);
        map.put(EquipmentType.CHESTPLATE, 10);
        map.put(EquipmentType.HELMET, 7);
    }), 100, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5, 1, DEEPSLATE_EMERALD_REPAIR_ITEMS, CustomEquipmentModels.DEEPSLATE_EMERALD);

    public static final ArmorMaterial END_DIAMOND = new ArmorMaterial(280, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 5);
        map.put(EquipmentType.LEGGINGS, 8);
        map.put(EquipmentType.CHESTPLATE, 10);
        map.put(EquipmentType.HELMET, 7);
    }), 100, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 10, 1, END_DIAMOND_REPAIR_ITEMS, CustomEquipmentModels.END_DIAMOND);

    public static final ArmorMaterial VOID = new ArmorMaterial(1800, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 5);
        map.put(EquipmentType.LEGGINGS, 8);
        map.put(EquipmentType.CHESTPLATE, 10);
        map.put(EquipmentType.HELMET, 7);
    }), 100, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 24, 1.2F, VOID_REPAIR_ITEMS, CustomEquipmentModels.VOID);
    public static final ArmorMaterial ONETHDENDERITE = new ArmorMaterial(3600, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 5);
        map.put(EquipmentType.LEGGINGS, 8);
        map.put(EquipmentType.CHESTPLATE, 10);
        map.put(EquipmentType.HELMET, 7);
    }), 100, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 96, 1.2F, OBSIDIAN_REPAIR_ITEMS, CustomEquipmentModels.ONETHDENDERITE);

    public static void load() {}
}
