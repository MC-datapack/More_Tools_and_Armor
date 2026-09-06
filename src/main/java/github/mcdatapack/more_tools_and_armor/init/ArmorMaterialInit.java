package github.mcdatapack.more_tools_and_armor.init;

import java.util.Map;

import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ArmorMaterialInit {
    public static final ArmorMaterial COAL = register("coal", Map.of(
                    ArmorType.HELMET, 2,
                    ArmorType.CHESTPLATE, 3,
                    ArmorType.LEGGINGS, 2,
                    ArmorType.BOOTS, 1),
            6,
            SoundEvents.ARMOR_EQUIP_GENERIC,
            ItemTags.COALS,
            0,
            0,
            12, EquipmentModelInit.COAL);

    public static final ArmorMaterial LAPIS = register("lapis", Map.of(
                    ArmorType.HELMET, 3,
                    ArmorType.CHESTPLATE, 6,
                    ArmorType.LEGGINGS, 5,
                    ArmorType.BOOTS, 2),
            12,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            ConventionalItemTags.LAPIS_GEMS,
            1,
            0,
            21, EquipmentModelInit.LAPIS);

    public static final ArmorMaterial BUDDING_AMETHYST = register("budding_amethyst", Map.of(
                    ArmorType.HELMET, 3,
                    ArmorType.CHESTPLATE, 7,
                    ArmorType.LEGGINGS, 6,
                    ArmorType.BOOTS, 2),
            12,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            TagList.ItemTags.BUDDING_AMETHYSTS,
            1,
            0,
            20, EquipmentModelInit.BUDDING_AMETHYST);

    public static final ArmorMaterial EMERALD = register("emerald", Map.of(
                    ArmorType.HELMET, 2,
                    ArmorType.CHESTPLATE, 6,
                    ArmorType.LEGGINGS, 5,
                    ArmorType.BOOTS, 3),
            14,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            ConventionalItemTags.EMERALD_GEMS,
            0,
            0,
            21, EquipmentModelInit.EMERALD);

    public static final ArmorMaterial REDSTONE = register("redstone", Map.of(
                    ArmorType.HELMET, 3,
                    ArmorType.CHESTPLATE, 7,
                    ArmorType.LEGGINGS, 6,
                    ArmorType.BOOTS, 3),
            10,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            ConventionalItemTags.REDSTONE_DUSTS,
            2,
            0,
            28, EquipmentModelInit.REDSTONE);

    public static final ArmorMaterial OBSIDIAN = register("obsidian", Map.of(
                    ArmorType.HELMET, 3,
                    ArmorType.CHESTPLATE, 8,
                    ArmorType.LEGGINGS, 6,
                    ArmorType.BOOTS, 3),
            10,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            ConventionalItemTags.OBSIDIANS,
            4,
            4,
            40, EquipmentModelInit.OBSIDIAN);

    public static final ArmorMaterial DEEPSLATE_EMERALD = register("deepslate_emerald", Map.of(
                    ArmorType.HELMET, 7,
                    ArmorType.CHESTPLATE, 10,
                    ArmorType.LEGGINGS, 8,
                    ArmorType.BOOTS, 5),
            100,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.DEEPSLATE_EMERALDS,
            5,
            1,
            280, EquipmentModelInit.DEEPSLATE_EMERALD);
    public static final ArmorMaterial END_DIAMOND = register("end_diamond", Map.of(
                    ArmorType.HELMET, 7,
                    ArmorType.CHESTPLATE, 10,
                    ArmorType.LEGGINGS, 8,
                    ArmorType.BOOTS, 5),
            100,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.END_DIAMONDS,
            10,
            1,
            280, EquipmentModelInit.END_DIAMOND
    );
    public static final ArmorMaterial VOID = register("void", Map.of(
                    ArmorType.HELMET, 7,
                    ArmorType.CHESTPLATE, 10,
                    ArmorType.LEGGINGS, 8,
                    ArmorType.BOOTS, 5),
            100,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.VOID_INGOTS,
            24,
            1.2F,
            1800, EquipmentModelInit.VOID
    );
    public static final ArmorMaterial ONETHDENDERITE = register("onethdenderite", Map.of(
                    ArmorType.HELMET, 7,
                    ArmorType.CHESTPLATE, 10,
                    ArmorType.LEGGINGS, 8,
                    ArmorType.BOOTS, 5),
            100,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.ONETHDENDERITE_INGOTS,
            96,
            1.2F,
            3600, EquipmentModelInit.ONETHDENDERITE);

    public static final ArmorMaterial OLED = register("oled", Map.of(
                    ArmorType.HELMET, 140,
                    ArmorType.CHESTPLATE, 200,
                    ArmorType.LEGGINGS, 160,
                    ArmorType.BOOTS, 100),
            100,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.OLED_INGOTS,
            1024,
            1.2F,
            1600, EquipmentModelInit.OLED);
    public static final ArmorMaterial ANCIENT = register("ancient", Map.of(
                    ArmorType.HELMET, 1400,
                    ArmorType.CHESTPLATE, 2000,
                    ArmorType.LEGGINGS, 1600,
                    ArmorType.BOOTS, 1000),
            100,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            TagList.ItemTags.ANCIENT_INGOTS,
            4096,
            1.2F,
            360000, EquipmentModelInit.ANCIENT);


    public static ArmorMaterial register(String id, Map<ArmorType, Integer> defensePoints,
                                         int enchantablilty,
                                         Holder<SoundEvent> equipSound,
                                         TagKey<Item> repairIngredient,
                                         float toughness,
                                         float knockbackResistance,
                                         int durability,
                                         ResourceKey<EquipmentAsset> model) {
        return new ArmorMaterial(durability, defensePoints,enchantablilty, equipSound, toughness, knockbackResistance,
                repairIngredient, model);
    }


    public static void load() {}
}