package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorMaterialInit {
//Armor Materials

    public static final RegistryEntry<ArmorMaterial> COPPER = register("copper", Map.of(
                    ArmorItem.Type.HELMET, 2,
                    ArmorItem.Type.CHESTPLATE, 5,
                    ArmorItem.Type.LEGGINGS, 4,
                    ArmorItem.Type.BOOTS, 1),
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            () -> Ingredient.ofItems(Items.COPPER_INGOT),
            0,
            0,
            false);

    public static final RegistryEntry<ArmorMaterial> BUDDING_AMETHYST = register("budding_amethyst", Map.of(
                ArmorItem.Type.HELMET, 3,
                ArmorItem.Type.CHESTPLATE, 7,
                ArmorItem.Type.LEGGINGS, 6,
                ArmorItem.Type.BOOTS, 2),
            12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(ItemInit.BUDDING_AMETHYST_CRYSTAL),
            1,
            0,
            false);

    public static final RegistryEntry<ArmorMaterial> EMERALD = register("emerald", Map.of(
            ArmorItem.Type.HELMET, 2,
            ArmorItem.Type.CHESTPLATE, 6,
            ArmorItem.Type.LEGGINGS, 5,
            ArmorItem.Type.BOOTS, 3),
            14,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(Items.EMERALD),
            0,
            0,
            false);

    public static final RegistryEntry<ArmorMaterial> OBSIDIAN = register("obsidian", Map.of(
                    ArmorItem.Type.HELMET, 3,
                    ArmorItem.Type.CHESTPLATE, 8,
                    ArmorItem.Type.LEGGINGS, 6,
                    ArmorItem.Type.BOOTS, 3),
            10,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(Items.OBSIDIAN),
            4,
            4,
            false);

    public static final RegistryEntry<ArmorMaterial> DEEPSLATE_EMERALD = register("deepslate_emerald", Map.of(
                    ArmorItem.Type.HELMET, 7,
                    ArmorItem.Type.CHESTPLATE, 10,
                    ArmorItem.Type.LEGGINGS, 8,
                    ArmorItem.Type.BOOTS, 5),
            100,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ItemInit.DEEPSLATE_EMERALD),
            5,
            1,
            false);
    public static final RegistryEntry<ArmorMaterial> END_DIAMOND = register("end_diamond", Map.of(
                ArmorItem.Type.HELMET, 7,
                ArmorItem.Type.CHESTPLATE, 10,
                ArmorItem.Type.LEGGINGS, 8,
                ArmorItem.Type.BOOTS, 5),
            100,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ItemInit.END_DIAMOND),
            10,
            1,
            false
    );
    public static final RegistryEntry<ArmorMaterial> VOID = register("void", Map.of(
                    ArmorItem.Type.HELMET, 7,
                    ArmorItem.Type.CHESTPLATE, 10,
                    ArmorItem.Type.LEGGINGS, 8,
                    ArmorItem.Type.BOOTS, 5),
            100,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ItemInit.VOID_INGOT),
            24,
            1.2F,
            false
    );
    public static final RegistryEntry<ArmorMaterial> ONETHDENDERITE = register("onethdenderite", Map.of(
            ArmorItem.Type.HELMET, 7,
            ArmorItem.Type.CHESTPLATE, 10,
            ArmorItem.Type.LEGGINGS, 8,
            ArmorItem.Type.BOOTS, 5),
            100,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ItemInit.ONETHDENDERITE_INGOT),
            96,
            1.2F,
            false);

//Armor Materials Setup Help
        public static RegistryEntry<ArmorMaterial> register(String id, Map<ArmorItem.Type, Integer> defensePoints,
                                                        int enchantablilty,
                                                        RegistryEntry<SoundEvent> equipSound,
                                                        Supplier<Ingredient> repairIngredient,
                                                        float toughness,
                                                        float knockbackResistance,
                                                        boolean dyeable) {
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(MoreToolsAndArmor.id(id), "", dyeable)
        );

        var material = new ArmorMaterial(defensePoints,enchantablilty, equipSound, repairIngredient, layers,
                toughness, knockbackResistance);
        material = Registry.register(Registries.ARMOR_MATERIAL, MoreToolsAndArmor.id(id), material);

        return RegistryEntry.of(material);
    }


    public static void load() {}
}
