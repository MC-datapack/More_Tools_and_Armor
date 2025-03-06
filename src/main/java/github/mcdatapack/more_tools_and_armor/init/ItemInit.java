package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.item.MoreToolsAndArmorArmorItem;
import github.mcdatapack.more_tools_and_armor.item.PaxelItem;
import github.mcdatapack.more_tools_and_armor.list.ConsumableComponentList;
import github.mcdatapack.more_tools_and_armor.list.FoodList;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Rarity;
import net.minecraft.util.Unit;

import java.util.function.Function;

public class ItemInit {
    public static final Item ANCIENT_HONEY_BOTTLE = register("ancient_honey_bottle", settings -> new Item(settings
            .recipeRemainder(Items.GLASS_BOTTLE)
            .useRemainder(Items.GLASS_BOTTLE)
            .food(FoodList.ANCIENT_HONEY_BOTTLE, ConsumableComponentList.ANCIENT_HONEY_BOTTLE)));
    public static final Item BAT_WING = register("bat_wing", Item::new);
    public static final Item ANCIENT_COIN = register("ancient_coin", Item::new);

    public static final Item ANCIENT_INGOT = register("ancient_ingot", settings -> new Item(settings.rarity(Rarity.EPIC).fireproof().maxCount(96)));
    public static final Item ANCIENT_UPGRADE_SMITHING_TEMPLATE = register("ancient_upgrade_smithing_template", settings -> new Item(settings.rarity(Rarity.EPIC).fireproof().maxCount(96)));

    private static final RegistryKey<Item> BUDDING_AMETHYST_CRYSTAL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_crystal"));
    public static final Item BUDDING_AMETHYST_CRYSTAL = registerDefault("budding_amethyst_crystal", new Item(new Item.Settings()
            .registryKey(BUDDING_AMETHYST_CRYSTAL_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald"));
    public static final Item DEEPSLATE_EMERALD = registerDefault("deepslate_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(DEEPSLATE_EMERALD_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_upgrade_smithing_template"));
    public static final Item DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE = registerDefault("deepslate_emerald_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().registryKey(DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE_k)));
    private static final RegistryKey<Item> END_DIAMOND_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond"));
    public static final Item END_DIAMOND = registerDefault("end_diamond", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(END_DIAMOND_k)));
    private static final RegistryKey<Item> END_DIAMOND_UPGRADE_SMITHING_TEMPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_upgrade_smithing_template"));
    public static final Item END_DIAMOND_UPGRADE_SMITHING_TEMPLATE = registerDefault("end_diamond_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().registryKey(END_DIAMOND_UPGRADE_SMITHING_TEMPLATE_k)));
    private static final RegistryKey<Item> VOID_INGOT_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_ingot"));
    public static final Item VOID_INGOT = registerDefault("void_ingot", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(VOID_INGOT_k)));
    private static final RegistryKey<Item> VOID_UPGRADE_SMITHING_TEMPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_upgrade_smithing_template"));
    public static final Item VOID_UPGRADE_SMITHING_TEMPLATE = registerDefault("void_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(VOID_UPGRADE_SMITHING_TEMPLATE_k)));
    private static final RegistryKey<Item> SCULK_EMERALD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("sculk_emerald"));
    public static final Item SCULK_EMERALD = registerDefault("sculk_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(SCULK_EMERALD_k)));
    private static final RegistryKey<Item> BLACKSTONE_EMERALD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("blackstone_emerald"));
    public static final Item BLACKSTONE_EMERALD = registerDefault("blackstone_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(BLACKSTONE_EMERALD_k)));
    private static final RegistryKey<Item> END_EMERALD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_emerald"));
    public static final Item END_EMERALD = registerDefault("end_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(END_EMERALD_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_INGOT_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_ingot"));
    public static final Item ONETHDENDERITE_INGOT = registerDefault("onethdenderite_ingot", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(ONETHDENDERITE_INGOT_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_upgrade_smithing_template"));
    public static final Item ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE = registerDefault("onethdenderite_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE_k)));

    public static final Item OLED_INGOT = registerDefault("oled_ingot", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(key("oled_ingot"))));
    public static final Item OLED_UPGRADE_SMITHING_TEMPLATE = registerDefault("oled_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96).registryKey(key("oled_upgrade_smithing_template"))));

    public static final PaxelItem WOODEN_PAXEL = registerDefault("wooden_paxel", new PaxelItem(ToolMaterial.WOOD, 6.0F, -2.4F, new Item.Settings()
            .registryKey(key("wooden_paxel"))));
    public static final PaxelItem STONE_PAXEL = registerDefault("stone_paxel", new PaxelItem(ToolMaterial.STONE, 7.0F, -2.4F,new Item.Settings()
            .registryKey(key("stone_paxel"))));
    public static final PaxelItem IRON_PAXEL = registerDefault("iron_paxel", new PaxelItem(ToolMaterial.IRON, -6.0F, -2.4F,new Item.Settings()
            .registryKey(key("iron_paxel"))));
    public static final PaxelItem GOLDEN_PAXEL = registerDefault("golden_paxel", new PaxelItem(ToolMaterial.GOLD,6.0F, -2.4F, new Item.Settings()
            .registryKey(key("golden_paxel"))));
    public static final PaxelItem DIAMOND_PAXEL = registerDefault("diamond_paxel", new PaxelItem(ToolMaterial.DIAMOND, 6.0F, -2.4F,new Item.Settings()
            .registryKey(key("diamond_paxel"))));
    public static final PaxelItem NETHERITE_PAXEL = registerDefault("netherite_paxel", new PaxelItem(ToolMaterial.NETHERITE,6.0F, -2.4F,
            new Item.Settings().registryKey(key("netherite_paxel"))));
    public static final PaxelItem COPPER_PAXEL = registerDefault("copper_paxel", new PaxelItem(ToolMaterialInit.COPPER,7, -2.4F,
            new Item.Settings().registryKey(key("copper_paxel"))));
    public static final PaxelItem BUDDING_AMETHYST_PAXEL = registerDefault("budding_amethyst_paxel", new PaxelItem(ToolMaterialInit.BUDDING_AMETHYST, 7, -2.4F,
            new Item.Settings().registryKey(key("budding_amethyst_paxel"))));
    public static final PaxelItem EMERALD_PAXEL = registerDefault("emerald_paxel", new PaxelItem(ToolMaterialInit.EMERALD, 5, -2.4F,
            new Item.Settings().registryKey(key("emerald_paxel"))));
    public static final PaxelItem OBSIDIAN_PAXEL = registerDefault("obsidian_paxel", new PaxelItem(ToolMaterialInit.OBSIDIAN, 7, -2.6F,
            new Item.Settings().registryKey(key("obsidian_paxel"))));
    public static final PaxelItem DEEPSLATE_EMERALD_PAXEL = registerDefault("deepslate_emerald_paxel", new PaxelItem(ToolMaterialInit.DEEPSLATE_EMERALD, 15, -2.0F,
            new Item.Settings().registryKey(key("deepslate_emerald_paxel")).fireproof().rarity(Rarity.EPIC)));
    public static final PaxelItem END_DIAMOND_PAXEL = registerDefault("end_diamond_paxel", new PaxelItem(ToolMaterialInit.END_DIAMOND, 17, -2.0F,
            new Item.Settings().registryKey(key("end_diamond_paxel")).fireproof().rarity(Rarity.EPIC)));
    public static final PaxelItem VOID_PAXEL = registerDefault("void_paxel", new PaxelItem(ToolMaterialInit.VOID, 22, -1.8F,
            new Item.Settings().registryKey(key("void_paxel")).fireproof().rarity(Rarity.EPIC)));
    public static final PaxelItem ONETHDENDERITE_PAXEL = registerDefault("onethdenderite_paxel", new PaxelItem(ToolMaterialInit.ONETHDENDERITE, 33, -1.6F,
            new Item.Settings().registryKey(key("onethdenderite_paxel")).fireproof().rarity(Rarity.EPIC)));
    public static final PaxelItem OLED_PAXEL = registerDefault("oled_paxel", new PaxelItem(ToolMaterialInit.OLED, 100, 0,new Item.Settings()
            .fireproof().rarity(Rarity.EPIC).registryKey(key("oled_paxel"))));
    public static final PaxelItem ANCIENT_PAXEL = register("ancient_paxel", settings -> new PaxelItem(ToolMaterialInit.ANCIENT, 100, 0, settings
            .fireproof().rarity(Rarity.EPIC)));


    //Budding Amethyst
    private static final RegistryKey<Item> BUDDING_AMETHYST_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_sword"));
    public static final SwordItem BUDDING_AMETHYST_SWORD = registerDefault("budding_amethyst_sword",
            new SwordItem(ToolMaterialInit.BUDDING_AMETHYST, 5, -2.4F, new Item.Settings().registryKey(BUDDING_AMETHYST_SWORD_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_axe"));
    public static final AxeItem BUDDING_AMETHYST_AXE = registerDefault("budding_amethyst_axe",
            new AxeItem(ToolMaterialInit.BUDDING_AMETHYST,7, -3F, new Item.Settings().registryKey(BUDDING_AMETHYST_AXE_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_pickaxe"));
    public static final PickaxeItem BUDDING_AMETHYST_PICKAXE = registerDefault("budding_amethyst_pickaxe",
            new PickaxeItem(ToolMaterialInit.BUDDING_AMETHYST,2, -2.8F, new Item.Settings().registryKey(BUDDING_AMETHYST_PICKAXE_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_shovel"));
    public static final ShovelItem BUDDING_AMETHYST_SHOVEL = registerDefault("budding_amethyst_shovel",
            new ShovelItem(ToolMaterialInit.BUDDING_AMETHYST,3, -3F, new Item.Settings().registryKey(BUDDING_AMETHYST_SHOVEL_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_hoe"));
    public static final HoeItem BUDDING_AMETHYST_HOE = registerDefault("budding_amethyst_hoe",
            new HoeItem(ToolMaterialInit.BUDDING_AMETHYST, -1, -0F, new Item.Settings().registryKey(BUDDING_AMETHYST_HOE_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_helmet"));
    public static final MoreToolsAndArmorArmorItem BUDDING_AMETHYST_HELMET = registerDefault("budding_amethyst_helmet",
            new MoreToolsAndArmorArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, EquipmentType.HELMET, new Item.Settings().registryKey(BUDDING_AMETHYST_HELMET_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_chestplate"));
    public static final MoreToolsAndArmorArmorItem BUDDING_AMETHYST_CHESTPLATE = registerDefault("budding_amethyst_chestplate",
            new MoreToolsAndArmorArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, EquipmentType.CHESTPLATE, new Item.Settings().registryKey(BUDDING_AMETHYST_CHESTPLATE_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_leggings"));
    public static final MoreToolsAndArmorArmorItem BUDDING_AMETHYST_LEGGINGS = registerDefault("budding_amethyst_leggings",
            new MoreToolsAndArmorArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, EquipmentType.LEGGINGS, new Item.Settings().registryKey(BUDDING_AMETHYST_LEGGINGS_k)));
    private static final RegistryKey<Item> BUDDING_AMETHYST_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_boots"));
    public static final MoreToolsAndArmorArmorItem BUDDING_AMETHYST_BOOTS = registerDefault("budding_amethyst_boots", new
            MoreToolsAndArmorArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, EquipmentType.BOOTS, new Item.Settings().registryKey(BUDDING_AMETHYST_BOOTS_k)));
    //Copper
    private static final RegistryKey<Item> COPPER_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_sword"));
    public static final SwordItem COPPER_SWORD = registerDefault("copper_sword", new SwordItem(ToolMaterialInit.COPPER,3, -2.4F,
            new Item.Settings().registryKey(COPPER_SWORD_k)));
    private static final RegistryKey<Item> COPPER_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_axe"));
    public static final AxeItem COPPER_AXE = registerDefault("copper_axe", new AxeItem(ToolMaterialInit.COPPER,7, -3.2F,
            new Item.Settings().registryKey(COPPER_AXE_k)));
    private static final RegistryKey<Item> COPPER_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_pickaxe"));
    public static final PickaxeItem COPPER_PICKAXE = registerDefault("copper_pickaxe", new PickaxeItem(ToolMaterialInit.COPPER,0, -2.8F,
            new Item.Settings().registryKey(COPPER_PICKAXE_k)));
    private static final RegistryKey<Item> COPPER_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_shovel"));
    public static final ShovelItem COPPER_SHOVEL = registerDefault("copper_shovel", new ShovelItem(ToolMaterialInit.COPPER,2, -3,
            new Item.Settings().registryKey(COPPER_SHOVEL_k)));
    private static final RegistryKey<Item> COPPER_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_hoe"));
    public static final HoeItem COPPER_HOE = registerDefault("copper_hoe", new HoeItem(ToolMaterialInit.COPPER,-1, -2F,
            new Item.Settings().registryKey(COPPER_HOE_k)));
    private static final RegistryKey<Item> COPPER_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_helmet"));
    public static final MoreToolsAndArmorArmorItem COPPER_HELMET = registerDefault("copper_helmet", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.COPPER, EquipmentType.HELMET,
            new Item.Settings().registryKey(COPPER_HELMET_k)));
    private static final RegistryKey<Item> COPPER_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_chestplate"));
    public static final MoreToolsAndArmorArmorItem COPPER_CHESTPLATE = registerDefault("copper_chestplate", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.COPPER, EquipmentType.CHESTPLATE,
            new Item.Settings().registryKey(COPPER_CHESTPLATE_k)));
    private static final RegistryKey<Item> COPPER_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_leggings"));
    public static final MoreToolsAndArmorArmorItem COPPER_LEGGINGS = registerDefault("copper_leggings", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.COPPER, EquipmentType.LEGGINGS,
            new Item.Settings().registryKey(COPPER_LEGGINGS_k)));
    private static final RegistryKey<Item> COPPER_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_boots"));
    public static final MoreToolsAndArmorArmorItem COPPER_BOOTS = registerDefault("copper_boots", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.COPPER, EquipmentType.BOOTS,
            new Item.Settings().registryKey(COPPER_BOOTS_k)));

    //Emerald
    private static final RegistryKey<Item> EMERALD_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_sword"));
    public static final SwordItem EMERALD_SWORD = registerDefault("emerald_sword", new SwordItem(ToolMaterialInit.EMERALD,5, -2.4F,
            new Item.Settings().registryKey(EMERALD_SWORD_k)));
    private static final RegistryKey<Item> EMERALD_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_axe"));
    public static final AxeItem EMERALD_AXE = registerDefault("emerald_axe", new AxeItem(ToolMaterialInit.EMERALD,7, -3,
            new Item.Settings().registryKey(EMERALD_AXE_k)));
    private static final RegistryKey<Item> EMERALD_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_pickaxe"));
    public static final PickaxeItem EMERALD_PICKAXE = registerDefault("emerald_pickaxe", new PickaxeItem(ToolMaterialInit.EMERALD,2, -2.8F,
            new Item.Settings().registryKey(EMERALD_PICKAXE_k)));
    private static final RegistryKey<Item> EMERALD_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_shovel"));
    public static final ShovelItem EMERALD_SHOVEL = registerDefault("emerald_shovel", new ShovelItem(ToolMaterialInit.EMERALD,3, -3,
            new Item.Settings().registryKey(EMERALD_SHOVEL_k)));
    private static final RegistryKey<Item> EMERALD_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_hoe"));
    public static final HoeItem EMERALD_HOE = registerDefault("emerald_hoe", new HoeItem(ToolMaterialInit.EMERALD,-1, -0,
            new Item.Settings().registryKey(EMERALD_HOE_k)));
    private static final RegistryKey<Item> EMERALD_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_helmet"));
    public static final MoreToolsAndArmorArmorItem EMERALD_HELMET = registerDefault("emerald_helmet", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.EMERALD, EquipmentType.HELMET,
            new Item.Settings().registryKey(EMERALD_HELMET_k)));
    private static final RegistryKey<Item> EMERALD_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_chestplate"));
    public static final MoreToolsAndArmorArmorItem EMERALD_CHESTPLATE = registerDefault("emerald_chestplate", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.EMERALD, EquipmentType.CHESTPLATE,
            new Item.Settings().registryKey(EMERALD_CHESTPLATE_k)));
    private static final RegistryKey<Item> EMERALD_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_leggings"));
    public static final MoreToolsAndArmorArmorItem EMERALD_LEGGINGS = registerDefault("emerald_leggings", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.EMERALD, EquipmentType.LEGGINGS,
            new Item.Settings().registryKey(EMERALD_LEGGINGS_k)));
    private static final RegistryKey<Item> EMERALD_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_boots"));
    public static final MoreToolsAndArmorArmorItem EMERALD_BOOTS = registerDefault("emerald_boots", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.EMERALD, EquipmentType.BOOTS,
            new Item.Settings().registryKey(EMERALD_BOOTS_k)));

    //Obsidian
    private static final RegistryKey<Item> OBSIDIAN_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_sword"));
    public static final SwordItem OBSIDIAN_SWORD = registerDefault("obsidian_sword", new SwordItem(ToolMaterialInit.OBSIDIAN,7, -2.6F,
            new Item.Settings().registryKey(OBSIDIAN_SWORD_k)));
    private static final RegistryKey<Item> OBSIDIAN_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_axe"));
    public static final AxeItem OBSIDIAN_AXE = registerDefault("obsidian_axe", new AxeItem(ToolMaterialInit.OBSIDIAN,9, -3.2F,
            new Item.Settings().registryKey(OBSIDIAN_AXE_k)));
    private static final RegistryKey<Item> OBSIDIAN_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_pickaxe"));
    public static final PickaxeItem OBSIDIAN_PICKAXE = registerDefault("obsidian_pickaxe", new PickaxeItem(ToolMaterialInit.OBSIDIAN,4, -2.8F,
            new Item.Settings().registryKey(OBSIDIAN_PICKAXE_k)));
    private static final RegistryKey<Item> OBSIDIAN_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_shovel"));
    public static final ShovelItem OBSIDIAN_SHOVEL = registerDefault("obsidian_shovel", new ShovelItem(ToolMaterialInit.OBSIDIAN,4, -3,
            new Item.Settings().registryKey(OBSIDIAN_SHOVEL_k)));
    private static final RegistryKey<Item> OBSIDIAN_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_hoe"));
    public static final HoeItem OBSIDIAN_HOE = registerDefault("obsidian_hoe", new HoeItem(ToolMaterialInit.OBSIDIAN, 0, -0,
            new Item.Settings().registryKey(OBSIDIAN_HOE_k)));
    private static final RegistryKey<Item> OBSIDIAN_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_helmet"));
    public static final MoreToolsAndArmorArmorItem OBSIDIAN_HELMET = registerDefault("obsidian_helmet", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.OBSIDIAN, EquipmentType.HELMET,
            new Item.Settings().registryKey(OBSIDIAN_HELMET_k)));
    private static final RegistryKey<Item> OBSIDIAN_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_chestplate"));
    public static final MoreToolsAndArmorArmorItem OBSIDIAN_CHESTPLATE = registerDefault("obsidian_chestplate", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.OBSIDIAN, EquipmentType.CHESTPLATE,
            new Item.Settings().registryKey(OBSIDIAN_CHESTPLATE_k)));
    private static final RegistryKey<Item> OBSIDIAN_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_leggings"));
    public static final MoreToolsAndArmorArmorItem OBSIDIAN_LEGGINGS = registerDefault("obsidian_leggings", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.OBSIDIAN, EquipmentType.LEGGINGS,
            new Item.Settings().registryKey(OBSIDIAN_LEGGINGS_k)));
    private static final RegistryKey<Item> OBSIDIAN_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_boots"));
    public static final MoreToolsAndArmorArmorItem OBSIDIAN_BOOTS = registerDefault("obsidian_boots", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.OBSIDIAN, EquipmentType.BOOTS,
            new Item.Settings().registryKey(OBSIDIAN_BOOTS_k)));

    //Deepslate Emerald
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_sword"));
    public static final SwordItem DEEPSLATE_EMERALD_SWORD = registerDefault("deepslate_emerald_sword", new SwordItem(ToolMaterialInit.DEEPSLATE_EMERALD,13,-2,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_SWORD_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_axe"));
    public static final AxeItem DEEPSLATE_EMERALD_AXE = registerDefault("deepslate_emerald_axe", new AxeItem(ToolMaterialInit.DEEPSLATE_EMERALD,15, -2.5F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_AXE_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_pickaxe"));
    public static final PickaxeItem DEEPSLATE_EMERALD_PICKAXE = registerDefault("deepslate_emerald_pickaxe", new PickaxeItem(ToolMaterialInit.DEEPSLATE_EMERALD,8, -2.4F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_PICKAXE_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_shovel"));
    public static final ShovelItem DEEPSLATE_EMERALD_SHOVEL = registerDefault("deepslate_emerald_shovel", new ShovelItem(ToolMaterialInit.DEEPSLATE_EMERALD,9, -2.5F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_SHOVEL_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_hoe"));
    public static final HoeItem DEEPSLATE_EMERALD_HOE = registerDefault("deepslate_emerald_hoe", new HoeItem(ToolMaterialInit.DEEPSLATE_EMERALD,1, 1,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_HOE_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_helmet"));
    public static final MoreToolsAndArmorArmorItem DEEPSLATE_EMERALD_HELMET = registerDefault("deepslate_emerald_helmet", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, EquipmentType.HELMET,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_HELMET_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_chestplate"));
    public static final MoreToolsAndArmorArmorItem DEEPSLATE_EMERALD_CHESTPLATE = registerDefault("deepslate_emerald_chestplate", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, EquipmentType.CHESTPLATE,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_CHESTPLATE_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_leggings"));
    public static final MoreToolsAndArmorArmorItem DEEPSLATE_EMERALD_LEGGINGS = registerDefault("deepslate_emerald_leggings", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, EquipmentType.LEGGINGS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_LEGGINGS_k)));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_boots"));
    public static final MoreToolsAndArmorArmorItem DEEPSLATE_EMERALD_BOOTS = registerDefault("deepslate_emerald_boots", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, EquipmentType.BOOTS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(DEEPSLATE_EMERALD_BOOTS_k)));


    //End Diamond
    private static final RegistryKey<Item> END_DIAMOND_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_sword"));
    public static final SwordItem END_DIAMOND_SWORD = registerDefault("end_diamond_sword", new SwordItem(ToolMaterialInit.END_DIAMOND,15,-2,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_SWORD_k)));
    private static final RegistryKey<Item> END_DIAMOND_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_axe"));
    public static final AxeItem END_DIAMOND_AXE = registerDefault("end_diamond_axe", new AxeItem(ToolMaterialInit.END_DIAMOND,17,-2.4F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_AXE_k)));
    private static final RegistryKey<Item> END_DIAMOND_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_pickaxe"));
    public static final PickaxeItem END_DIAMOND_PICKAXE = registerDefault("end_diamond_pickaxe", new PickaxeItem(ToolMaterialInit.END_DIAMOND,10,-2.2F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_PICKAXE_k)));
    private static final RegistryKey<Item> END_DIAMOND_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_shovel"));
    public static final ShovelItem END_DIAMOND_SHOVEL = registerDefault("end_diamond_shovel", new ShovelItem(ToolMaterialInit.END_DIAMOND,11,-2.4F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_SHOVEL_k)));
    private static final RegistryKey<Item> END_DIAMOND_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_hoe"));
    public static final HoeItem END_DIAMOND_HOE = registerDefault("end_diamond_hoe", new HoeItem(ToolMaterialInit.END_DIAMOND,2, 2,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_HOE_k)));
    private static final RegistryKey<Item> END_DIAMOND_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_helmet"));
    public static final MoreToolsAndArmorArmorItem END_DIAMOND_HELMET = registerDefault("end_diamond_helmet", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.END_DIAMOND, EquipmentType.HELMET,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_HELMET_k)));
    private static final RegistryKey<Item> END_DIAMOND_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_chestplate"));
    public static final MoreToolsAndArmorArmorItem END_DIAMOND_CHESTPLATE = registerDefault("end_diamond_chestplate", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.END_DIAMOND, EquipmentType.CHESTPLATE,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_CHESTPLATE_k)));
    private static final RegistryKey<Item> END_DIAMOND_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_leggings"));
    public static final MoreToolsAndArmorArmorItem END_DIAMOND_LEGGINGS = registerDefault("end_diamond_leggings", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.END_DIAMOND, EquipmentType.LEGGINGS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_LEGGINGS_k)));
    private static final RegistryKey<Item> END_DIAMOND_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_boots"));
    public static final MoreToolsAndArmorArmorItem END_DIAMOND_BOOTS = registerDefault("end_diamond_boots", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.END_DIAMOND, EquipmentType.BOOTS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(END_DIAMOND_BOOTS_k)));


    //Void
    private static final RegistryKey<Item> VOID_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_sword"));
    public static final SwordItem VOID_SWORD = registerDefault("void_sword", new SwordItem(ToolMaterialInit.VOID,22, -1.8F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_SWORD_k)));
    private static final RegistryKey<Item> VOID_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_axe"));
    public static final AxeItem VOID_AXE = registerDefault("void_axe", new AxeItem(ToolMaterialInit.VOID,21,2.4F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_AXE_k)));
    private static final RegistryKey<Item> VOID_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_pickaxe"));
    public static final PickaxeItem VOID_PICKAXE = registerDefault("void_pickaxe", new PickaxeItem(ToolMaterialInit.VOID,13,-2,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_PICKAXE_k)));
    private static final RegistryKey<Item> VOID_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_shovel"));
    public static final ShovelItem VOID_SHOVEL = registerDefault("void_shovel", new ShovelItem(ToolMaterialInit.VOID,14, -2.2F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_SHOVEL_k)));
    private static final RegistryKey<Item> VOID_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_hoe"));
    public static final HoeItem VOID_HOE = registerDefault("void_hoe", new HoeItem(ToolMaterialInit.VOID,3, 3,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_HOE_k)));
    private static final RegistryKey<Item> VOID_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_helmet"));
    public static final MoreToolsAndArmorArmorItem VOID_HELMET = registerDefault("void_helmet", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.VOID, EquipmentType.HELMET,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_HELMET_k)));
    private static final RegistryKey<Item> VOID_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_chestplate"));
    public static final MoreToolsAndArmorArmorItem VOID_CHESTPLATE = registerDefault("void_chestplate", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.VOID, EquipmentType.CHESTPLATE,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_CHESTPLATE_k)));
    private static final RegistryKey<Item> VOID_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_leggings"));
    public static final MoreToolsAndArmorArmorItem VOID_LEGGINGS = registerDefault("void_leggings", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.VOID, EquipmentType.LEGGINGS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_LEGGINGS_k)));
    private static final RegistryKey<Item> VOID_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_boots"));
    public static final MoreToolsAndArmorArmorItem VOID_BOOTS = registerDefault("void_boots", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.VOID, EquipmentType.BOOTS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(VOID_BOOTS_k)));

    private static final RegistryKey<Item> ONETHDENDERITE_SWORD_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_sword"));
    public static final SwordItem ONETHDENDERITE_SWORD = registerDefault("onethdenderite_sword", new SwordItem(ToolMaterialInit.ONETHDENDERITE,33, -1.6F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_SWORD_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_AXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_axe"));
    public static final AxeItem ONETHDENDERITE_AXE = registerDefault("onethdenderite_axe", new AxeItem(ToolMaterialInit.ONETHDENDERITE,28,2.2F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_AXE_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_PICKAXE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_pickaxe"));
    public static final PickaxeItem ONETHDENDERITE_PICKAXE = registerDefault("onethdenderite_pickaxe", new PickaxeItem(ToolMaterialInit.ONETHDENDERITE,18,-1.8F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_PICKAXE_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_SHOVEL_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_shovel"));
    public static final ShovelItem ONETHDENDERITE_SHOVEL = registerDefault("onethdenderite_shovel", new ShovelItem(ToolMaterialInit.ONETHDENDERITE,23, -2F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_SHOVEL_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_HOE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_hoe"));
    public static final HoeItem ONETHDENDERITE_HOE = registerDefault("onethdenderite_hoe", new HoeItem(ToolMaterialInit.ONETHDENDERITE,8, 3.2F,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_HOE_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_HELMET_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_helmet"));
    public static final MoreToolsAndArmorArmorItem ONETHDENDERITE_HELMET = registerDefault("onethdenderite_helmet", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.ONETHDENDERITE, EquipmentType.HELMET,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_HELMET_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_CHESTPLATE_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_chestplate"));
    public static final MoreToolsAndArmorArmorItem ONETHDENDERITE_CHESTPLATE = registerDefault("onethdenderite_chestplate", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.ONETHDENDERITE, EquipmentType.CHESTPLATE,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_CHESTPLATE_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_LEGGINGS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_leggings"));
    public static final MoreToolsAndArmorArmorItem ONETHDENDERITE_LEGGINGS = registerDefault("onethdenderite_leggings", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.ONETHDENDERITE, EquipmentType.LEGGINGS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_LEGGINGS_k)));
    private static final RegistryKey<Item> ONETHDENDERITE_BOOTS_k = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_boots"));
    public static final MoreToolsAndArmorArmorItem ONETHDENDERITE_BOOTS = registerDefault("onethdenderite_boots", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.ONETHDENDERITE, EquipmentType.BOOTS,
            new Item.Settings().fireproof().rarity(Rarity.EPIC).registryKey(ONETHDENDERITE_BOOTS_k)));

    //OLED
    public static final SwordItem OLED_SWORD = registerDefault("oled_sword", new SwordItem(ToolMaterialInit.OLED, 100, 0, new Item.Settings()
            .fireproof().rarity(Rarity.EPIC).registryKey(key("oled_sword"))));
    public static final AxeItem OLED_AXE = registerDefault("oled_axe", new AxeItem(ToolMaterialInit.OLED, 90, -1.1F, new Item.Settings()
            .fireproof().rarity(Rarity.EPIC).registryKey(key("oled_axe"))));
    public static final PickaxeItem OLED_PICKAXE = registerDefault("oled_pickaxe", new PickaxeItem(ToolMaterialInit.OLED, 70, -0.2F,new Item.Settings()
            .fireproof().rarity(Rarity.EPIC).registryKey(key("oled_pickaxe"))));
    public static final ShovelItem OLED_SHOVEL = registerDefault("oled_shovel", new ShovelItem(ToolMaterialInit.OLED, 80, -1.1F,new Item.Settings()
            .fireproof().rarity(Rarity.EPIC).registryKey(key("oled_shovel"))));
    public static final HoeItem OLED_HOE = registerDefault("oled_hoe", new HoeItem(ToolMaterialInit.OLED, 50, 50,new Item.Settings()
            .fireproof().rarity(Rarity.EPIC).registryKey(key("oled_hoe"))));
    public static final MoreToolsAndArmorArmorItem OLED_HELMET = registerDefault("oled_helmet", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.OLED, EquipmentType.HELMET, new Item.Settings()
            .fireproof().rarity(Rarity.EPIC).registryKey(key("oled_helmet"))));
    public static final MoreToolsAndArmorArmorItem OLED_CHESTPLATE = registerDefault("oled_chestplate", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.OLED, EquipmentType.CHESTPLATE, new Item.Settings()
            .fireproof().rarity(Rarity.EPIC).registryKey(key("oled_chestplate"))));
    public static final MoreToolsAndArmorArmorItem OLED_LEGGINGS = registerDefault("oled_leggings", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.OLED, EquipmentType.LEGGINGS, new Item.Settings()
            .fireproof().rarity(Rarity.EPIC).registryKey(key("oled_leggings"))));
    public static final MoreToolsAndArmorArmorItem OLED_BOOTS = registerDefault("oled_boots", new MoreToolsAndArmorArmorItem(ArmorMaterialInit.OLED, EquipmentType.BOOTS, new Item.Settings()
            .fireproof().rarity(Rarity.EPIC).registryKey(key("oled_boots"))));


    //ANCIENT
    public static final SwordItem ANCIENT_SWORD = register("ancient_sword", settings -> new SwordItem(ToolMaterialInit.ANCIENT, 100, 0,settings
            .fireproof().rarity(Rarity.EPIC)));
    public static final AxeItem ANCIENT_AXE = register("ancient_axe", settings -> new AxeItem(ToolMaterialInit.ANCIENT, 90, -1.1F,settings
            .fireproof().rarity(Rarity.EPIC)));
    public static final PickaxeItem ANCIENT_PICKAXE = register("ancient_pickaxe", settings -> new PickaxeItem(ToolMaterialInit.ANCIENT, 70, -0.2F,settings
            .fireproof().rarity(Rarity.EPIC)));
    public static final ShovelItem ANCIENT_SHOVEL = register("ancient_shovel", settings -> new ShovelItem(ToolMaterialInit.ANCIENT, 80, -1.1F,settings
            .fireproof().rarity(Rarity.EPIC)));
    public static final HoeItem ANCIENT_HOE = register("ancient_hoe", settings -> new HoeItem(ToolMaterialInit.ANCIENT, 50, 50,settings
            .fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem ANCIENT_HELMET = register("ancient_helmet", settings -> new MoreToolsAndArmorArmorItem(ArmorMaterialInit.ANCIENT, EquipmentType.HELMET, settings
            .fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem ANCIENT_CHESTPLATE = register("ancient_chestplate", settings -> new MoreToolsAndArmorArmorItem(ArmorMaterialInit.ANCIENT, EquipmentType.CHESTPLATE, settings
            .fireproof().rarity(Rarity.EPIC).component(DataComponentTypes.GLIDER, Unit.INSTANCE)));
    public static final ArmorItem ANCIENT_LEGGINGS = register("ancient_leggings", settings -> new MoreToolsAndArmorArmorItem(ArmorMaterialInit.ANCIENT, EquipmentType.LEGGINGS, settings
            .fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem ANCIENT_BOOTS = register("ancient_boots", settings -> new MoreToolsAndArmorArmorItem(ArmorMaterialInit.ANCIENT, EquipmentType.BOOTS, settings
            .fireproof().rarity(Rarity.EPIC)));

    public static <T extends Item> T register(String name, Function<Item.Settings, T> item) {
        return Registry.register(Registries.ITEM, MoreToolsAndArmor.id(name), item.apply(
                new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id(name)))));
    }

    public static <T extends Item> T registerDefault(String name, T item) {
        return Registry.register(Registries.ITEM, MoreToolsAndArmor.id(name), item);
    }

    public static RegistryKey<Item> key(String s) {
        return RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id(s));
    }

    public static void load() {}
}