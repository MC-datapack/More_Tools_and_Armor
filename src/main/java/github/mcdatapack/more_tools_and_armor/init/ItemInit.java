package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.enums.ToolMaterials;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Rarity;

public class ItemInit {
    private static final RegistryKey<Item> BUDDING_AMETHYST_CRYSTAL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_crystal"));
    public static final Item BUDDING_AMETHYST_CRYSTAL = register("budding_amethyst_crystal", new Item(new Item.Settings()
            .registryKey(BUDDING_AMETHYST_CRYSTAL_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald"));
    public static final Item DEEPSLATE_EMERALD = register("deepslate_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(DEEPSLATE_EMERALD_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_upgrade_smithing_template"));
    public static final Item DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE = register("deepslate_emerald_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().registryKey(DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE_k)));
    private static final RegistryKey<Item> END_DIAMOND_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond"));
    public static final Item END_DIAMOND = register("end_diamond", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(END_DIAMOND_k)));
    private static final RegistryKey<Item> END_DIAMOND_UPGRADE_SMITHING_TEMPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_upgrade_smithing_template"));
    public static final Item END_DIAMOND_UPGRADE_SMITHING_TEMPLATE = register("end_diamond_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().registryKey(END_DIAMOND_UPGRADE_SMITHING_TEMPLATE_k)));
    private static final RegistryKey<Item> VOID_INGOT_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_ingot"));
    public static final Item VOID_INGOT = register("void_ingot", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(VOID_INGOT_k)));
    private static final RegistryKey<Item> VOID_UPGRADE_SMITHING_TEMPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_upgrade_smithing_template"));
    public static final Item VOID_UPGRADE_SMITHING_TEMPLATE = register("void_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(VOID_UPGRADE_SMITHING_TEMPLATE_k)));
    private static final RegistryKey<Item> SCULK_EMERALD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("sculk_emerald"));
    public static final Item SCULK_EMERALD = register("sculk_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(SCULK_EMERALD_k)));
    private static final RegistryKey<Item> BLACKSTONE_EMERALD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("blackstone_emerald"));
    public static final Item BLACKSTONE_EMERALD = register("blackstone_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(BLACKSTONE_EMERALD_k)));
    private static final RegistryKey<Item> END_EMERALD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_emerald"));
    public static final Item END_EMERALD = register("end_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(END_EMERALD_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_INGOT_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_ingot"));
    public static final Item ONETHDENDERITE_INGOT = register("onethdenderite_ingot", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(ONETHDENDERITE_INGOT_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_upgrade_smithing_template"));
    public static final Item ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE = register("onethdenderite_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE_k)));


//Budding Amethyst
private static final RegistryKey<Item> BUDDING_AMETHYST_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_sword"));
    public static final SwordItem BUDDING_AMETHYST_SWORD = register("budding_amethyst_sword",
        new SwordItem(ToolMaterials.BUDDING_AMETHYST.getMaterial(), 5, -2.4F, new Item.Settings().registryKey(BUDDING_AMETHYST_SWORD_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_axe"));
    public static final AxeItem BUDDING_AMETHYST_AXE = register("budding_amethyst_axe",
            new AxeItem(ToolMaterials.BUDDING_AMETHYST.getMaterial(),7, -3F, new Item.Settings().registryKey(BUDDING_AMETHYST_AXE_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_pickaxe"));
    public static final PickaxeItem BUDDING_AMETHYST_PICKAXE = register("budding_amethyst_pickaxe",
            new PickaxeItem(ToolMaterials.BUDDING_AMETHYST.getMaterial(),2, -2.8F, new Item.Settings().registryKey(BUDDING_AMETHYST_PICKAXE_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_shovel"));
    public static final ShovelItem BUDDING_AMETHYST_SHOVEL = register("budding_amethyst_shovel",
            new ShovelItem(ToolMaterials.BUDDING_AMETHYST.getMaterial(),3, -3F, new Item.Settings().registryKey(BUDDING_AMETHYST_SHOVEL_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_hoe"));
    public static final HoeItem BUDDING_AMETHYST_HOE = register("budding_amethyst_hoe",
            new HoeItem(ToolMaterials.BUDDING_AMETHYST.getMaterial(), -1, -0F, new Item.Settings().registryKey(BUDDING_AMETHYST_HOE_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_helmet"));
    public static final ArmorItem BUDDING_AMETHYST_HELMET = register("budding_amethyst_helmet",
            new ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, EquipmentType.HELMET, new Item.Settings().registryKey(BUDDING_AMETHYST_HELMET_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_chestplate"));
    public static final ArmorItem BUDDING_AMETHYST_CHESTPLATE = register("budding_amethyst_chestplate",
            new ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, EquipmentType.CHESTPLATE, new Item.Settings().registryKey(BUDDING_AMETHYST_CHESTPLATE_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_leggings"));
    public static final ArmorItem BUDDING_AMETHYST_LEGGINGS = register("budding_amethyst_leggings",
            new ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, EquipmentType.LEGGINGS, new Item.Settings().registryKey(BUDDING_AMETHYST_LEGGINGS_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_boots"));
    public static final ArmorItem BUDDING_AMETHYST_BOOTS = register("budding_amethyst_boots", new
            ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, EquipmentType.BOOTS, new Item.Settings().registryKey(BUDDING_AMETHYST_BOOTS_k)));
//Copper
private static final RegistryKey<Item> COPPER_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_sword"));
    public static final SwordItem COPPER_SWORD = register("copper_sword", new SwordItem(ToolMaterials.COPPER.getMaterial(),3, -2.4F,
            new Item.Settings().registryKey(COPPER_SWORD_k)));
    private static final RegistryKey<Item> COPPER_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_axe"));
    public static final AxeItem COPPER_AXE = register("copper_axe", new AxeItem(ToolMaterials.COPPER.getMaterial(),7, -3.2F,
            new Item.Settings().registryKey(COPPER_AXE_k)));
    private static final RegistryKey<Item> COPPER_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_pickaxe"));
    public static final PickaxeItem COPPER_PICKAXE = register("copper_pickaxe", new PickaxeItem(ToolMaterials.COPPER.getMaterial(),0, -2.8F,
            new Item.Settings().registryKey(COPPER_PICKAXE_k)));
    private static final RegistryKey<Item> COPPER_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_shovel"));
    public static final ShovelItem COPPER_SHOVEL = register("copper_shovel", new ShovelItem(ToolMaterials.COPPER.getMaterial(),2, -3,
            new Item.Settings().registryKey(COPPER_SHOVEL_k)));
    private static final RegistryKey<Item> COPPER_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_hoe"));
    public static final HoeItem COPPER_HOE = register("copper_hoe", new HoeItem(ToolMaterials.COPPER.getMaterial(),-1, -2F,
            new Item.Settings().registryKey(COPPER_HOE_k)));
    private static final RegistryKey<Item> COPPER_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_helmet"));
    public static final ArmorItem COPPER_HELMET = register("copper_helmet", new ArmorItem(ArmorMaterialInit.COPPER, EquipmentType.HELMET,
            new Item.Settings().registryKey(COPPER_HELMET_k)));
    private static final RegistryKey<Item> COPPER_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_chestplate"));
    public static final ArmorItem COPPER_CHESTPLATE = register("copper_chestplate", new ArmorItem(ArmorMaterialInit.COPPER, EquipmentType.CHESTPLATE,
            new Item.Settings().registryKey(COPPER_CHESTPLATE_k)));
    private static final RegistryKey<Item> COPPER_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_leggings"));
    public static final ArmorItem COPPER_LEGGINGS = register("copper_leggings", new ArmorItem(ArmorMaterialInit.COPPER, EquipmentType.LEGGINGS,
            new Item.Settings().registryKey(COPPER_LEGGINGS_k)));
    private static final RegistryKey<Item> COPPER_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_boots"));
    public static final ArmorItem COPPER_BOOTS = register("copper_boots", new ArmorItem(ArmorMaterialInit.COPPER, EquipmentType.BOOTS,
            new Item.Settings().registryKey(COPPER_BOOTS_k)));

//Emerald
private static final RegistryKey<Item> EMERALD_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_sword"));
    public static final SwordItem EMERALD_SWORD = register("emerald_sword", new SwordItem(ToolMaterials.EMERALD.getMaterial(),5, -2.4F,
            new Item.Settings().registryKey(EMERALD_SWORD_k)));
    private static final RegistryKey<Item> EMERALD_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_axe"));
    public static final AxeItem EMERALD_AXE = register("emerald_axe", new AxeItem(ToolMaterials.EMERALD.getMaterial(),7, -3,
            new Item.Settings().registryKey(EMERALD_AXE_k)));
    private static final RegistryKey<Item> EMERALD_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_pickaxe"));
    public static final PickaxeItem EMERALD_PICKAXE = register("emerald_pickaxe", new PickaxeItem(ToolMaterials.EMERALD.getMaterial(),2, -2.8F,
            new Item.Settings().registryKey(EMERALD_PICKAXE_k)));
    private static final RegistryKey<Item> EMERALD_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_shovel"));
    public static final ShovelItem EMERALD_SHOVEL = register("emerald_shovel", new ShovelItem(ToolMaterials.EMERALD.getMaterial(),3, -3,
            new Item.Settings().registryKey(EMERALD_SHOVEL_k)));
    private static final RegistryKey<Item> EMERALD_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_hoe"));
    public static final HoeItem EMERALD_HOE = register("emerald_hoe", new HoeItem(ToolMaterials.EMERALD.getMaterial(),-1, -0,
            new Item.Settings().registryKey(EMERALD_HOE_k)));
    private static final RegistryKey<Item> EMERALD_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_helmet"));
    public static final ArmorItem EMERALD_HELMET = register("emerald_helmet", new ArmorItem(ArmorMaterialInit.EMERALD, EquipmentType.HELMET,
            new Item.Settings().registryKey(EMERALD_HELMET_k)));
    private static final RegistryKey<Item> EMERALD_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_chestplate"));
    public static final ArmorItem EMERALD_CHESTPLATE = register("emerald_chestplate", new ArmorItem(ArmorMaterialInit.EMERALD, EquipmentType.CHESTPLATE,
            new Item.Settings().registryKey(EMERALD_CHESTPLATE_k)));
    private static final RegistryKey<Item> EMERALD_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_leggings"));
    public static final ArmorItem EMERALD_LEGGINGS = register("emerald_leggings", new ArmorItem(ArmorMaterialInit.EMERALD, EquipmentType.LEGGINGS,
            new Item.Settings().registryKey(EMERALD_LEGGINGS_k)));
    private static final RegistryKey<Item> EMERALD_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_boots"));
    public static final ArmorItem EMERALD_BOOTS = register("emerald_boots", new ArmorItem(ArmorMaterialInit.EMERALD, EquipmentType.BOOTS,
            new Item.Settings().registryKey(EMERALD_BOOTS_k)));

//Obsidian
private static final RegistryKey<Item> OBSIDIAN_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_sword"));
    public static final SwordItem OBSIDIAN_SWORD = register("obsidian_sword", new SwordItem(ToolMaterials.OBSIDIAN.getMaterial(),7, -2.6F,
            new Item.Settings().registryKey(OBSIDIAN_SWORD_k)));
    private static final RegistryKey<Item> OBSIDIAN_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_axe"));
    public static final AxeItem OBSIDIAN_AXE = register("obsidian_axe", new AxeItem(ToolMaterials.OBSIDIAN.getMaterial(),9, -3.2F,
            new Item.Settings().registryKey(OBSIDIAN_AXE_k)));
    private static final RegistryKey<Item> OBSIDIAN_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_pickaxe"));
    public static final PickaxeItem OBSIDIAN_PICKAXE = register("obsidian_pickaxe", new PickaxeItem(ToolMaterials.OBSIDIAN.getMaterial(),4, -2.8F,
            new Item.Settings().registryKey(OBSIDIAN_PICKAXE_k)));
    private static final RegistryKey<Item> OBSIDIAN_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_shovel"));
    public static final ShovelItem OBSIDIAN_SHOVEL = register("obsidian_shovel", new ShovelItem(ToolMaterials.OBSIDIAN.getMaterial(),4, -3,
            new Item.Settings().registryKey(OBSIDIAN_SHOVEL_k)));
    private static final RegistryKey<Item> OBSIDIAN_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_hoe"));
    public static final HoeItem OBSIDIAN_HOE = register("obsidian_hoe", new HoeItem(ToolMaterials.OBSIDIAN.getMaterial(), 0, -0,
            new Item.Settings().registryKey(OBSIDIAN_HOE_k)));
    private static final RegistryKey<Item> OBSIDIAN_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_helmet"));
    public static final ArmorItem OBSIDIAN_HELMET = register("obsidian_helmet", new ArmorItem(ArmorMaterialInit.OBSIDIAN, EquipmentType.HELMET,
            new Item.Settings().registryKey(OBSIDIAN_HELMET_k)));
    private static final RegistryKey<Item> OBSIDIAN_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_chestplate"));
    public static final ArmorItem OBSIDIAN_CHESTPLATE = register("obsidian_chestplate", new ArmorItem(ArmorMaterialInit.OBSIDIAN, EquipmentType.CHESTPLATE,
            new Item.Settings().registryKey(OBSIDIAN_CHESTPLATE_k)));
    private static final RegistryKey<Item> OBSIDIAN_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_leggings"));
    public static final ArmorItem OBSIDIAN_LEGGINGS = register("obsidian_leggings", new ArmorItem(ArmorMaterialInit.OBSIDIAN, EquipmentType.LEGGINGS,
            new Item.Settings().registryKey(OBSIDIAN_LEGGINGS_k)));
    private static final RegistryKey<Item> OBSIDIAN_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_boots"));
    public static final ArmorItem OBSIDIAN_BOOTS = register("obsidian_boots", new ArmorItem(ArmorMaterialInit.OBSIDIAN, EquipmentType.BOOTS,
            new Item.Settings().registryKey(OBSIDIAN_BOOTS_k)));

//Deepslate Emerald
private static final RegistryKey<Item> DEEPSLATE_EMERALD_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_sword"));
    public static final SwordItem DEEPSLATE_EMERALD_SWORD = register("deepslate_emerald_sword", new SwordItem(ToolMaterials.DEEPSLATE_EMERALD.getMaterial(),13,-2,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_SWORD_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_axe"));
    public static final AxeItem DEEPSLATE_EMERALD_AXE = register("deepslate_emerald_axe", new AxeItem(ToolMaterials.DEEPSLATE_EMERALD.getMaterial(),15, -2.5F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_AXE_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_pickaxe"));
    public static final PickaxeItem DEEPSLATE_EMERALD_PICKAXE = register("deepslate_emerald_pickaxe", new PickaxeItem(ToolMaterials.DEEPSLATE_EMERALD.getMaterial(),8, -2.4F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_PICKAXE_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_shovel"));
    public static final ShovelItem DEEPSLATE_EMERALD_SHOVEL = register("deepslate_emerald_shovel", new ShovelItem(ToolMaterials.DEEPSLATE_EMERALD.getMaterial(),9, -2.5F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_SHOVEL_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_hoe"));
    public static final HoeItem DEEPSLATE_EMERALD_HOE = register("deepslate_emerald_hoe", new HoeItem(ToolMaterials.DEEPSLATE_EMERALD.getMaterial(),1, 1,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_HOE_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_helmet"));
    public static final ArmorItem DEEPSLATE_EMERALD_HELMET = register("deepslate_emerald_helmet", new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, EquipmentType.HELMET,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_HELMET_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_chestplate"));
    public static final ArmorItem DEEPSLATE_EMERALD_CHESTPLATE = register("deepslate_emerald_chestplate", new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, EquipmentType.CHESTPLATE,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_CHESTPLATE_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_leggings"));
    public static final ArmorItem DEEPSLATE_EMERALD_LEGGINGS = register("deepslate_emerald_leggings", new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, EquipmentType.LEGGINGS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_LEGGINGS_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_boots"));
    public static final ArmorItem DEEPSLATE_EMERALD_BOOTS = register("deepslate_emerald_boots", new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, EquipmentType.BOOTS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_BOOTS_k)));


    //End Diamond
    private static final RegistryKey<Item> END_DIAMOND_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_sword"));
    public static final SwordItem END_DIAMOND_SWORD = register("end_diamond_sword", new SwordItem(ToolMaterials.END_DIAMOND.getMaterial(),15,-2,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_SWORD_k)));
    private static final RegistryKey<Item> END_DIAMOND_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_axe"));
    public static final AxeItem END_DIAMOND_AXE = register("end_diamond_axe", new AxeItem(ToolMaterials.END_DIAMOND.getMaterial(),17,-2.4F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_AXE_k)));
    private static final RegistryKey<Item> END_DIAMOND_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_pickaxe"));
    public static final PickaxeItem END_DIAMOND_PICKAXE = register("end_diamond_pickaxe", new PickaxeItem(ToolMaterials.END_DIAMOND.getMaterial(),10,-2.2F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_PICKAXE_k)));
    private static final RegistryKey<Item> END_DIAMOND_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_shovel"));
    public static final ShovelItem END_DIAMOND_SHOVEL = register("end_diamond_shovel", new ShovelItem(ToolMaterials.END_DIAMOND.getMaterial(),11,-2.4F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_SHOVEL_k)));
    private static final RegistryKey<Item> END_DIAMOND_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_hoe"));
    public static final HoeItem END_DIAMOND_HOE = register("end_diamond_hoe", new HoeItem(ToolMaterials.END_DIAMOND.getMaterial(),2, 2,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_HOE_k)));
    private static final RegistryKey<Item> END_DIAMOND_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_helmet"));
    public static final ArmorItem END_DIAMOND_HELMET = register("end_diamond_helmet", new ArmorItem(ArmorMaterialInit.END_DIAMOND, EquipmentType.HELMET,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_HELMET_k)));
    private static final RegistryKey<Item> END_DIAMOND_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_chestplate"));
    public static final ArmorItem END_DIAMOND_CHESTPLATE = register("end_diamond_chestplate", new ArmorItem(ArmorMaterialInit.END_DIAMOND, EquipmentType.CHESTPLATE,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_CHESTPLATE_k)));
    private static final RegistryKey<Item> END_DIAMOND_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_leggings"));
    public static final ArmorItem END_DIAMOND_LEGGINGS = register("end_diamond_leggings", new ArmorItem(ArmorMaterialInit.END_DIAMOND, EquipmentType.LEGGINGS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_LEGGINGS_k)));
    private static final RegistryKey<Item> END_DIAMOND_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_boots"));
    public static final ArmorItem END_DIAMOND_BOOTS = register("end_diamond_boots", new ArmorItem(ArmorMaterialInit.END_DIAMOND, EquipmentType.BOOTS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_BOOTS_k)));


    //Void
    private static final RegistryKey<Item> VOID_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_sword"));
    public static final SwordItem VOID_SWORD = register("void_sword", new SwordItem(ToolMaterials.VOID.getMaterial(),22, -1.8F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_SWORD_k)));
    private static final RegistryKey<Item> VOID_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_axe"));
    public static final AxeItem VOID_AXE = register("void_axe", new AxeItem(ToolMaterials.VOID.getMaterial(),21,2.4F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_AXE_k)));
    private static final RegistryKey<Item> VOID_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_pickaxe"));
    public static final PickaxeItem VOID_PICKAXE = register("void_pickaxe", new PickaxeItem(ToolMaterials.VOID.getMaterial(),13,-2,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_PICKAXE_k)));
    private static final RegistryKey<Item> VOID_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_shovel"));
    public static final ShovelItem VOID_SHOVEL = register("void_shovel", new ShovelItem(ToolMaterials.VOID.getMaterial(),14, -2.2F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_SHOVEL_k)));
    private static final RegistryKey<Item> VOID_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_hoe"));
    public static final HoeItem VOID_HOE = register("void_hoe", new HoeItem(ToolMaterials.VOID.getMaterial(),3, 3,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_HOE_k)));
    private static final RegistryKey<Item> VOID_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_helmet"));
    public static final ArmorItem VOID_HELMET = register("void_helmet", new ArmorItem(ArmorMaterialInit.VOID, EquipmentType.HELMET,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_HELMET_k)));
    private static final RegistryKey<Item> VOID_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_chestplate"));
    public static final ArmorItem VOID_CHESTPLATE = register("void_chestplate", new ArmorItem(ArmorMaterialInit.VOID, EquipmentType.CHESTPLATE,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_CHESTPLATE_k)));
    private static final RegistryKey<Item> VOID_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_leggings"));
    public static final ArmorItem VOID_LEGGINGS = register("void_leggings", new ArmorItem(ArmorMaterialInit.VOID, EquipmentType.LEGGINGS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_LEGGINGS_k)));
    private static final RegistryKey<Item> VOID_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_boots"));
    public static final ArmorItem VOID_BOOTS = register("void_boots", new ArmorItem(ArmorMaterialInit.VOID, EquipmentType.BOOTS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_BOOTS_k)));

    private static final RegistryKey<Item> ONETHDENDERITE_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_sword"));
    public static final SwordItem ONETHDENDERITE_SWORD = register("onethdenderite_sword", new SwordItem(ToolMaterials.ONETHDENDERITE.getMaterial(),33, -1.6F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_SWORD_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_axe"));
    public static final AxeItem ONETHDENDERITE_AXE = register("onethdenderite_axe", new AxeItem(ToolMaterials.ONETHDENDERITE.getMaterial(),28,2.2F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_AXE_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_pickaxe"));
    public static final PickaxeItem ONETHDENDERITE_PICKAXE = register("onethdenderite_pickaxe", new PickaxeItem(ToolMaterials.ONETHDENDERITE.getMaterial(),18,-1.8F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_PICKAXE_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_shovel"));
    public static final ShovelItem ONETHDENDERITE_SHOVEL = register("onethdenderite_shovel", new ShovelItem(ToolMaterials.ONETHDENDERITE.getMaterial(),23, -2F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_SHOVEL_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_hoe"));
    public static final HoeItem ONETHDENDERITE_HOE = register("onethdenderite_hoe", new HoeItem(ToolMaterials.ONETHDENDERITE.getMaterial(),8, 3.2F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_HOE_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_helmet"));
    public static final ArmorItem ONETHDENDERITE_HELMET = register("onethdenderite_helmet", new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, EquipmentType.HELMET,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_HELMET_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_chestplate"));
    public static final ArmorItem ONETHDENDERITE_CHESTPLATE = register("onethdenderite_chestplate", new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, EquipmentType.CHESTPLATE,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_CHESTPLATE_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_leggings"));
    public static final ArmorItem ONETHDENDERITE_LEGGINGS = register("onethdenderite_leggings", new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, EquipmentType.LEGGINGS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_LEGGINGS_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_boots"));
    public static final ArmorItem ONETHDENDERITE_BOOTS = register("onethdenderite_boots", new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, EquipmentType.BOOTS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_BOOTS_k)));


    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, MoreToolsAndArmor.id(name), item);
    }

    public static void load() {}
}
