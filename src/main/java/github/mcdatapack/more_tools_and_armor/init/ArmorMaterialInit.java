package github.mcdatapack.more_tools_and_armor.init;

import java.util.Map;

import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ArmorMaterialInit {
    public static final ArmorMaterial COAL = register("coal", Map.of(
                    EquipmentType.HELMET, 2,
                    EquipmentType.CHESTPLATE, 3,
                    EquipmentType.LEGGINGS, 2,
                    EquipmentType.BOOTS, 1),
            6,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            ItemTags.COALS,
            0,
            0,
            12, EquipmentModelInit.COAL);

    public static final ArmorMaterial COPPER = register("copper", Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 5,
                    EquipmentType.LEGGINGS, 4,
                    EquipmentType.BOOTS, 2),
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            ConventionalItemTags.COPPER_INGOTS,
            0,
            0,
            20, EquipmentModelInit.COPPER);

    public static final ArmorMaterial LAPIS = register("lapis", Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 6,
                    EquipmentType.LEGGINGS, 5,
                    EquipmentType.BOOTS, 2),
            12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            ConventionalItemTags.LAPIS_GEMS,
            1,
            0,
            21, EquipmentModelInit.LAPIS);

    public static final ArmorMaterial BUDDING_AMETHYST = register("budding_amethyst", Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 7,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.BOOTS, 2),
            12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            TagList.ItemTags.BUDDING_AMETHYSTS,
            1,
            0,
            20, EquipmentModelInit.BUDDING_AMETHYST);

    public static final ArmorMaterial EMERALD = register("emerald", Map.of(
                    EquipmentType.HELMET, 2,
                    EquipmentType.CHESTPLATE, 6,
                    EquipmentType.LEGGINGS, 5,
                    EquipmentType.BOOTS, 3),
            14,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            ConventionalItemTags.EMERALD_GEMS,
            0,
            0,
            21, EquipmentModelInit.EMERALD);

    public static final ArmorMaterial REDSTONE = register("redstone", Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 7,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.BOOTS, 3),
            10,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            ConventionalItemTags.REDSTONE_DUSTS,
            2,
            0,
            28, EquipmentModelInit.REDSTONE);

    public static final ArmorMaterial OBSIDIAN = register("obsidian", Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 8,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.BOOTS, 3),
            10,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            ConventionalItemTags.OBSIDIANS,
            4,
            4,
            40, EquipmentModelInit.OBSIDIAN);

    public static final ArmorMaterial DEEPSLATE_EMERALD = register("deepslate_emerald", Map.of(
                    EquipmentType.HELMET, 7,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 8,
                    EquipmentType.BOOTS, 5),
            100,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.DEEPSLATE_EMERALDS,
            5,
            1,
            280, EquipmentModelInit.DEEPSLATE_EMERALD);
    public static final ArmorMaterial END_DIAMOND = register("end_diamond", Map.of(
                    EquipmentType.HELMET, 7,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 8,
                    EquipmentType.BOOTS, 5),
            100,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.END_DIAMONDS,
            10,
            1,
            280, EquipmentModelInit.END_DIAMOND
    );
    public static final ArmorMaterial VOID = register("void", Map.of(
                    EquipmentType.HELMET, 7,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 8,
                    EquipmentType.BOOTS, 5),
            100,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.VOID_INGOTS,
            24,
            1.2F,
            1800, EquipmentModelInit.VOID
    );
    public static final ArmorMaterial ONETHDENDERITE = register("onethdenderite", Map.of(
                    EquipmentType.HELMET, 7,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 8,
                    EquipmentType.BOOTS, 5),
            100,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.ONETHDENDERITE_INGOTS,
            96,
            1.2F,
            3600, EquipmentModelInit.ONETHDENDERITE);

    public static final ArmorMaterial OLED = register("oled", Map.of(
                    EquipmentType.HELMET, 140,
                    EquipmentType.CHESTPLATE, 200,
                    EquipmentType.LEGGINGS, 160,
                    EquipmentType.BOOTS, 100),
            100,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.OLED_INGOTS,
            1024,
            1.2F,
            1600, EquipmentModelInit.OLED);
    public static final ArmorMaterial ANCIENT = register("ancient", Map.of(
                    EquipmentType.HELMET, 1400,
                    EquipmentType.CHESTPLATE, 2000,
                    EquipmentType.LEGGINGS, 1600,
                    EquipmentType.BOOTS, 1000),
            100,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.ANCIENT_INGOTS,
            4096,
            1.2F,
            360000, EquipmentModelInit.ANCIENT);


    public static ArmorMaterial register(String id, Map<EquipmentType, Integer> defensePoints,
                                         int enchantablilty,
                                         RegistryEntry<SoundEvent> equipSound,
                                         TagKey<Item> repairIngredient,
                                         float toughness,
                                         float knockbackResistance,
                                         int durability,
                                         RegistryKey<EquipmentAsset> model) {
        return new ArmorMaterial(durability, defensePoints,enchantablilty, equipSound, toughness, knockbackResistance,
                repairIngredient, model);
    }


    public static void load() {}
}