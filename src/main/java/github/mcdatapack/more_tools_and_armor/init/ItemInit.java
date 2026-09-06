package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.enums.ToolMaterials;
import github.mcdatapack.more_tools_and_armor.item.*;
import github.mcdatapack.more_tools_and_armor.list.FoodList;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class ItemInit {
    public static final Item ANCIENT_HONEY_BOTTLE = register("ancient_honey_bottle", settings -> new Item(settings
            .craftRemainder(Items.GLASS_BOTTLE)
            .food(FoodList.ANCIENT_HONEY_BOTTLE, Consumables.HONEY_BOTTLE)));
    public static final Item BAT_WING = register("bat_wing", Item::new);
    public static final Item ANCIENT_COIN = register("ancient_coin", Item::new);

    public static final Item ANCIENT_INGOT = register("ancient_ingot", settings -> new Item(settings.rarity(Rarity.EPIC).fireResistant().stacksTo(96)));
    public static final Item ANCIENT_UPGRADE_SMITHING_TEMPLATE = register("ancient_upgrade_smithing_template", settings -> new Item(settings.rarity(Rarity.EPIC).fireResistant().stacksTo(96)));

    public static final Item OVERWORLD_SHARD = register("overworld_shard", settings -> new Item(settings.rarity(Rarity.EPIC)));
    public static final Item NETHER_SHARD = register("nether_shard", settings -> new Item(settings.rarity(Rarity.EPIC)));
    public static final Item END_SHARD = register("end_shard", settings -> new Item(settings.rarity(Rarity.EPIC)));

    public static final Item BUDDING_AMETHYST_CRYSTAL = register("budding_amethyst_crystal", Item::new);
    public static final Item DEEPSLATE_EMERALD = register("deepslate_emerald", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant().stacksTo(96)));
    public static final Item DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE = register("deepslate_emerald_upgrade_smithing_template", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant()));
    public static final Item END_DIAMOND = register("end_diamond", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant().stacksTo(96)));
    public static final Item END_DIAMOND_UPGRADE_SMITHING_TEMPLATE = register("end_diamond_upgrade_smithing_template", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant()));
    public static final Item VOID_INGOT = register("void_ingot", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant().stacksTo(96)));
    public static final Item VOID_UPGRADE_SMITHING_TEMPLATE = register("void_upgrade_smithing_template", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant().stacksTo(96)));
    public static final Item SCULK_EMERALD = register("sculk_emerald", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant().stacksTo(96)));
    public static final Item BLACKSTONE_EMERALD = register("blackstone_emerald", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant().stacksTo(96)));
    public static final Item END_EMERALD = register("end_emerald", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant().stacksTo(96)));
    public static final Item ONETHDENDERITE_INGOT = register("onethdenderite_ingot", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant().stacksTo(96)));
    public static final Item ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE = register("onethdenderite_upgrade_smithing_template", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant().stacksTo(96)));

    public static final Item OLED_INGOT = register("oled_ingot", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant().stacksTo(96)));
    public static final Item OLED_UPGRADE_SMITHING_TEMPLATE = register("oled_upgrade_smithing_template", settings -> new Item(settings
            .rarity(Rarity.EPIC).fireResistant().stacksTo(96)));

    public static final PaxelItem WOODEN_PAXEL = register("wooden_paxel",
            settings -> new PaxelItem(ToolMaterial.WOOD, 6, -2.4f, settings));
    public static final PaxelItem COAL_PAXEL = register("coal_paxel",
            settings -> new PaxelItem(ToolMaterials.COAL, 6, -2.4f, settings));
    public static final PaxelItem LAPIS_PAXEL = register("lapis_paxel",
            settings -> new PaxelItem(ToolMaterials.LAPIS, 6, -2.4f, settings));
    public static final PaxelItem REDSTONE_PAXEL = register("redstone_paxel",
            settings -> new PaxelItem(ToolMaterials.REDSTONE, 6, -2.4f, settings));
    public static final PaxelItem STONE_PAXEL = register("stone_paxel",
            settings -> new PaxelItem(ToolMaterial.STONE, 7, -2.4f, settings));
    public static final PaxelItem IRON_PAXEL = register("iron_paxel",
            settings -> new PaxelItem(ToolMaterial.IRON, 6, -2.4f, settings));
    public static final PaxelItem GOLDEN_PAXEL = register("golden_paxel",
            settings -> new PaxelItem(ToolMaterial.GOLD, 6, -2.4f, settings));
    public static final PaxelItem DIAMOND_PAXEL = register("diamond_paxel",
            settings -> new PaxelItem(ToolMaterial.DIAMOND, 6, -2.4f, settings));
    public static final PaxelItem NETHERITE_PAXEL = register("netherite_paxel",
            settings -> new PaxelItem(ToolMaterial.NETHERITE, 6, -2.4f, settings.fireResistant()));
    public static final PaxelItem COPPER_PAXEL = register("copper_paxel",
            settings -> new PaxelItem(ToolMaterial.COPPER, 7, -2.4f, settings));
    public static final PaxelItem BUDDING_AMETHYST_PAXEL = register("budding_amethyst_paxel",
            settings -> new PaxelItem(ToolMaterials.BUDDING_AMETHYST, 7, -2.4f, settings));
    public static final PaxelItem EMERALD_PAXEL = register("emerald_paxel",
            settings -> new PaxelItem(ToolMaterials.EMERALD, 5, -2.4f, settings));
    public static final PaxelItem OBSIDIAN_PAXEL = register("obsidian_paxel",
            settings -> new PaxelItem(ToolMaterials.OBSIDIAN, 7, -2.6f, settings));
    public static final PaxelItem DEEPSLATE_EMERALD_PAXEL = register("deepslate_emerald_paxel",
            settings -> new PaxelItem(ToolMaterials.DEEPSLATE_EMERALD, 15, -2, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final PaxelItem END_DIAMOND_PAXEL = register("end_diamond_paxel",
            settings -> new PaxelItem(ToolMaterials.END_DIAMOND, 17, -2, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final PaxelItem VOID_PAXEL = register("void_paxel",
            settings -> new PaxelItem(ToolMaterials.VOID, 22, -1.8f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ConvertPaxelItem ONETHDENDERITE_PAXEL = register("onethdenderite_paxel",
            settings -> new ConvertPaxelItem(3, ToolMaterials.ONETHDENDERITE, 33, -1.6f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ConvertPaxelItem OLED_PAXEL = register("oled_paxel",
            settings -> new ConvertPaxelItem(5, ToolMaterials.OLED, 100, 0, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ConvertPaxelItem ANCIENT_PAXEL = register("ancient_paxel",
            settings -> new ConvertPaxelItem(100, ToolMaterials.ANCIENT, 100, 0, settings.fireResistant().rarity(Rarity.EPIC)));

    public static final HammerItem WOODEN_HAMMER = register("wooden_hammer",
            settings -> new HammerItem(ToolMaterial.WOOD, 6, -2.4f, settings, 1));
    public static final HammerItem COAL_HAMMER = register("coal_hammer",
            settings -> new HammerItem(ToolMaterials.COAL, 6, -2.4f, settings, 1));
    public static final HammerItem LAPIS_HAMMER = register("lapis_hammer",
            settings -> new HammerItem(ToolMaterials.LAPIS, 6, -2.4f, settings, 1));
    public static final HammerItem REDSTONE_HAMMER = register("redstone_hammer",
            settings -> new HammerItem(ToolMaterials.REDSTONE, 6, -2.4f, settings, 1));
    public static final HammerItem STONE_HAMMER = register("stone_hammer",
            settings -> new HammerItem(ToolMaterial.STONE, 7, -2.4f, settings, 1));
    public static final HammerItem IRON_HAMMER = register("iron_hammer",
            settings -> new HammerItem(ToolMaterial.IRON, 6, -2.4f, settings, 1));
    public static final HammerItem GOLDEN_HAMMER = register("golden_hammer",
            settings -> new HammerItem(ToolMaterial.GOLD, 6, -2.4f, settings, 1));
    public static final HammerItem DIAMOND_HAMMER = register("diamond_hammer",
            settings -> new HammerItem(ToolMaterial.DIAMOND, 6, -2.4f, settings, 1));
    public static final HammerItem NETHERITE_HAMMER = register("netherite_hammer",
            settings -> new HammerItem(ToolMaterial.NETHERITE, 6, -2.4f, settings, 1));
    public static final HammerItem COPPER_HAMMER = register("copper_hammer",
            settings -> new HammerItem(ToolMaterial.COPPER, 7, -2.4f, settings, 1));
    public static final HammerItem BUDDING_AMETHYST_HAMMER = register("budding_amethyst_hammer",
            settings -> new HammerItem(ToolMaterials.BUDDING_AMETHYST, 7, -2.4f, settings, 1));
    public static final HammerItem EMERALD_HAMMER = register("emerald_hammer",
            settings -> new HammerItem(ToolMaterials.EMERALD, 5, -2.4f, settings, 1));
    public static final HammerItem OBSIDIAN_HAMMER = register("obsidian_hammer",
            settings -> new HammerItem(ToolMaterials.OBSIDIAN, 7, -2.6f, settings, 1));
    public static final HammerItem DEEPSLATE_EMERALD_HAMMER = register("deepslate_emerald_hammer",
            settings -> new HammerItem(ToolMaterials.DEEPSLATE_EMERALD, 15, -2, settings.fireResistant().rarity(Rarity.EPIC), 1));
    public static final HammerItem END_DIAMOND_HAMMER = register("end_diamond_hammer",
            settings -> new HammerItem(ToolMaterials.END_DIAMOND, 17, -2, settings.fireResistant().rarity(Rarity.EPIC), 1));
    public static final HammerItem VOID_HAMMER = register("void_hammer",
            settings -> new HammerItem(ToolMaterials.VOID, 22, -1.8f, settings.fireResistant().rarity(Rarity.EPIC), 1));
    public static final ConvertHammerItem ONETHDENDERITE_HAMMER = register("onethdenderite_hammer", settings -> 
            new ConvertHammerItem(3, ToolMaterials.ONETHDENDERITE, 33, -1.6f, settings.fireResistant().rarity(Rarity.EPIC), 1));
    public static final ConvertHammerItem OLED_HAMMER = register("oled_hammer",
            settings -> new ConvertHammerItem(5, ToolMaterials.OLED, 100, 0, settings.fireResistant().rarity(Rarity.EPIC), 1));
    public static final ConvertHammerItem ANCIENT_HAMMER = register("ancient_hammer",
            settings -> new ConvertHammerItem(100, ToolMaterials.ANCIENT, 100, 0, settings.fireResistant().rarity(Rarity.EPIC), 1));

//Budding Amethyst
    public static final SwordItem BUDDING_AMETHYST_SWORD = register("budding_amethyst_sword",
        settings -> new SwordItem(ToolMaterials.BUDDING_AMETHYST, 5, -2.4f, settings));
    public static final AxeItem BUDDING_AMETHYST_AXE = register("budding_amethyst_axe",
            settings -> new AxeItem(ToolMaterials.BUDDING_AMETHYST, 7, -3, settings));
    public static final PickaxeItem BUDDING_AMETHYST_PICKAXE = register("budding_amethyst_pickaxe",
            settings -> new PickaxeItem(ToolMaterials.BUDDING_AMETHYST, 2, -2.8f, settings));
    public static final ShovelItem BUDDING_AMETHYST_SHOVEL = register("budding_amethyst_shovel",
            settings -> new ShovelItem(ToolMaterials.BUDDING_AMETHYST, 3, -3, settings));
    public static final HoeItem BUDDING_AMETHYST_HOE = register("budding_amethyst_hoe",
            settings -> new HoeItem(ToolMaterials.BUDDING_AMETHYST, -1, 0, settings));
    public static final ArmorItem BUDDING_AMETHYST_HELMET = register("budding_amethyst_helmet", settings -> 
            new ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, ArmorType.HELMET, settings));
    public static final ArmorItem BUDDING_AMETHYST_CHESTPLATE = register("budding_amethyst_chestplate", settings -> 
            new ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, ArmorType.CHESTPLATE, settings));
    public static final ArmorItem BUDDING_AMETHYST_LEGGINGS = register("budding_amethyst_leggings", settings -> 
            new ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, ArmorType.LEGGINGS, settings));
    public static final ArmorItem BUDDING_AMETHYST_BOOTS = register("budding_amethyst_boots", settings -> 
            new ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, ArmorType.BOOTS, settings));
    public static final SpearItem BUDDING_AMETHYST_SPEAR = register("budding_amethyst_spear", settings ->
            new SpearItem(settings, ToolMaterials.BUDDING_AMETHYST,
                    1f, 1f, 0.55f, 2.75f, 10.5f, 6.6f, 10.5f));

    public static final SwordItem COAL_SWORD = register("coal_sword",
            settings -> new SwordItem(ToolMaterials.COAL, 2, -2.4f, settings));
    public static final AxeItem COAL_AXE = register("coal_axe",
            settings -> new AxeItem(ToolMaterials.COAL, 6, -3.2f, settings));
    public static final PickaxeItem COAL_PICKAXE = register("coal_pickaxe",
            settings -> new PickaxeItem(ToolMaterials.COAL, 1, -2.8f, settings));
    public static final ShovelItem COAL_SHOVEL = register("coal_shovel",
            settings -> new ShovelItem(ToolMaterials.COAL, 2, -3, settings));
    public static final HoeItem COAL_HOE = register("coal_hoe",
            settings -> new HoeItem(ToolMaterials.COAL, -1, -2, settings));
    public static final ArmorItem COAL_HELMET = register("coal_helmet", settings -> new ArmorItem(ArmorMaterialInit.COAL, ArmorType.HELMET, settings));
    public static final ArmorItem COAL_CHESTPLATE = register("coal_chestplate", settings -> new ArmorItem(ArmorMaterialInit.COAL, ArmorType.CHESTPLATE, settings));
    public static final ArmorItem COAL_LEGGINGS = register("coal_leggings", settings -> new ArmorItem(ArmorMaterialInit.COAL, ArmorType.LEGGINGS, settings));
    public static final ArmorItem COAL_BOOTS = register("coal_boots", settings -> new ArmorItem(ArmorMaterialInit.COAL, ArmorType.BOOTS, settings));
    public static final SpearItem COAL_SPEAR = register("coal_spear", settings ->
            new SpearItem(settings, ToolMaterials.COAL,
                    0.7f, 0.8f, 0.725f, 4.75f, 13.5f, 9.5f, 14.25f));

    public static final SwordItem LAPIS_SWORD = register("lapis_sword",
            settings -> new SwordItem(ToolMaterials.LAPIS, 4, -2.4f, settings));
    public static final AxeItem LAPIS_AXE = register("lapis_axe", settings -> 
            new AxeItem(ToolMaterials.LAPIS, 6, -3, settings));
    public static final PickaxeItem LAPIS_PICKAXE = register("lapis_pickaxe", settings -> 
            new PickaxeItem(ToolMaterials.LAPIS, 1, -2.8f, settings));
    public static final ShovelItem LAPIS_SHOVEL = register("lapis_shovel", settings -> 
            new ShovelItem(ToolMaterials.LAPIS, 2, -3, settings));
    public static final HoeItem LAPIS_HOE = register("lapis_hoe", settings -> 
            new HoeItem(ToolMaterials.LAPIS, -1, 0, settings));
    public static final ArmorItem LAPIS_HELMET = register("lapis_helmet", settings -> new ArmorItem(ArmorMaterialInit.LAPIS, ArmorType.HELMET, settings));
    public static final ArmorItem LAPIS_CHESTPLATE = register("lapis_chestplate", settings -> new ArmorItem(ArmorMaterialInit.LAPIS, ArmorType.CHESTPLATE, settings));
    public static final ArmorItem LAPIS_LEGGINGS = register("lapis_leggings", settings -> new ArmorItem(ArmorMaterialInit.LAPIS, ArmorType.LEGGINGS, settings));
    public static final ArmorItem LAPIS_BOOTS = register("lapis_boots", settings -> new ArmorItem(ArmorMaterialInit.LAPIS, ArmorType.BOOTS, settings));
    public static final SpearItem LAPIS_SPEAR = register("lapis_spear", settings ->
            new SpearItem(settings, ToolMaterials.LAPIS,
                    0.8f, 0.9f, 0.65f, 3f, 12f, 8f, 12.5f));

//Emerald
    public static final SwordItem EMERALD_SWORD = register("emerald_sword",
        settings -> new SwordItem(ToolMaterials.EMERALD, 5, -2.4f, settings));
    public static final AxeItem EMERALD_AXE = register("emerald_axe", settings -> 
            new AxeItem(ToolMaterials.EMERALD, 7, -3, settings));
    public static final PickaxeItem EMERALD_PICKAXE = register("emerald_pickaxe", settings -> 
            new PickaxeItem(ToolMaterials.EMERALD, 2, -2.8f, settings));
    public static final ShovelItem EMERALD_SHOVEL = register("emerald_shovel", settings -> 
            new ShovelItem(ToolMaterials.EMERALD, 3, -3, settings));
    public static final HoeItem EMERALD_HOE = register("emerald_hoe", settings -> 
            new HoeItem(ToolMaterials.EMERALD, 1, 0, settings));
    public static final ArmorItem EMERALD_HELMET = register("emerald_helmet", settings -> new ArmorItem(ArmorMaterialInit.EMERALD, ArmorType.HELMET, settings));
    public static final ArmorItem EMERALD_CHESTPLATE = register("emerald_chestplate", settings -> new ArmorItem(ArmorMaterialInit.EMERALD, ArmorType.CHESTPLATE, settings));
    public static final ArmorItem EMERALD_LEGGINGS = register("emerald_leggings", settings -> new ArmorItem(ArmorMaterialInit.EMERALD, ArmorType.LEGGINGS, settings));
    public static final ArmorItem EMERALD_BOOTS = register("emerald_boots", settings -> new ArmorItem(ArmorMaterialInit.EMERALD, ArmorType.BOOTS, settings));
    public static final SpearItem EMERALD_SPEAR = register("emerald_spear", settings ->
            new SpearItem(settings, ToolMaterials.EMERALD,
                    0.9f, 0.9f, 0.625f, 3.25f, 11.5f, 7.5f, 12.25f));

    public static final SwordItem REDSTONE_SWORD = register("redstone_sword",
            settings -> new SwordItem(ToolMaterials.REDSTONE, 6, -2.6f, settings));
    public static final AxeItem REDSTONE_AXE = register("redstone_axe", settings -> 
            new AxeItem(ToolMaterials.REDSTONE, 9, -3.2f, settings));
    public static final PickaxeItem REDSTONE_PICKAXE = register("redstone_pickaxe", settings -> 
            new PickaxeItem(ToolMaterials.REDSTONE, 4, -2.8f, settings));
    public static final ShovelItem REDSTONE_SHOVEL = register("redstone_shovel", settings -> 
            new ShovelItem(ToolMaterials.REDSTONE, 4, -3, settings));
    public static final HoeItem REDSTONE_HOE = register("redstone_hoe", settings -> 
            new HoeItem(ToolMaterials.REDSTONE, 0, 0, settings));
    public static final ArmorItem REDSTONE_HELMET = register("redstone_helmet", settings -> new ArmorItem(ArmorMaterialInit.REDSTONE, ArmorType.HELMET, settings));
    public static final ArmorItem REDSTONE_CHESTPLATE = register("redstone_chestplate", settings -> new ArmorItem(ArmorMaterialInit.REDSTONE, ArmorType.CHESTPLATE, settings));
    public static final ArmorItem REDSTONE_LEGGINGS = register("redstone_leggings", settings -> new ArmorItem(ArmorMaterialInit.REDSTONE, ArmorType.LEGGINGS, settings));
    public static final ArmorItem REDSTONE_BOOTS = register("redstone_boots", settings -> new ArmorItem(ArmorMaterialInit.REDSTONE, ArmorType.BOOTS, settings));
    public static final SpearItem REDSTONE_SPEAR = register("redstone_spear", settings ->
            new SpearItem(settings, ToolMaterials.REDSTONE,
                    1f, 1.05f, 0.5f, 2.8f, 10.25f, 6.55f, 10.25f));

//Obsidian
    public static final SwordItem OBSIDIAN_SWORD = register("obsidian_sword", settings -> new SwordItem(ToolMaterials.OBSIDIAN, 7, -2.6f,
        settings));
    public static final AxeItem OBSIDIAN_AXE = register("obsidian_axe", settings -> 
            new AxeItem(ToolMaterials.OBSIDIAN, 9, -3.2f, settings));
    public static final PickaxeItem OBSIDIAN_PICKAXE = register("obsidian_pickaxe", settings -> 
            new PickaxeItem(ToolMaterials.OBSIDIAN, 4, -2.8f, settings));
    public static final ShovelItem OBSIDIAN_SHOVEL = register("obsidian_shovel", settings -> 
            new ShovelItem(ToolMaterials.OBSIDIAN, 4, -3, settings));
    public static final HoeItem OBSIDIAN_HOE = register("obsidian_hoe", settings -> 
            new HoeItem(ToolMaterials.OBSIDIAN, 0, 0, settings));
    public static final ArmorItem OBSIDIAN_HELMET = register("obsidian_helmet", settings -> new ArmorItem(ArmorMaterialInit.OBSIDIAN, ArmorType.HELMET, settings));
    public static final ArmorItem OBSIDIAN_CHESTPLATE = register("obsidian_chestplate", settings -> new ArmorItem(ArmorMaterialInit.OBSIDIAN, ArmorType.CHESTPLATE, settings));
    public static final ArmorItem OBSIDIAN_LEGGINGS = register("obsidian_leggings", settings -> new ArmorItem(ArmorMaterialInit.OBSIDIAN, ArmorType.LEGGINGS, settings));
    public static final ArmorItem OBSIDIAN_BOOTS = register("obsidian_boots", settings -> new ArmorItem(ArmorMaterialInit.OBSIDIAN, ArmorType.BOOTS, settings));
    public static final SpearItem OBSIDIAN_SPEAR = register("obsidian_spear", settings ->
            new SpearItem(settings, ToolMaterials.OBSIDIAN,
                    1.1f, 1.1f, 0.45f, 2.75f, 9.5f, 6f, 9.5f));

//Deepslate Emerald
    public static final SwordItem DEEPSLATE_EMERALD_SWORD = register("deepslate_emerald_sword",
        settings -> new SwordItem(ToolMaterials.DEEPSLATE_EMERALD, 13, -2, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final AxeItem DEEPSLATE_EMERALD_AXE = register("deepslate_emerald_axe", settings -> 
            new AxeItem(ToolMaterials.DEEPSLATE_EMERALD, 15, -2.5f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final PickaxeItem DEEPSLATE_EMERALD_PICKAXE = register("deepslate_emerald_pickaxe", settings -> 
            new PickaxeItem(ToolMaterials.DEEPSLATE_EMERALD, 8, -2.4f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ShovelItem DEEPSLATE_EMERALD_SHOVEL = register("deepslate_emerald_shovel", settings -> 
            new ShovelItem(ToolMaterials.DEEPSLATE_EMERALD, 9, -2.5f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final HoeItem DEEPSLATE_EMERALD_HOE = register("deepslate_emerald_hoe", settings -> 
            new HoeItem(ToolMaterials.DEEPSLATE_EMERALD, 1, 1, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem DEEPSLATE_EMERALD_HELMET = register("deepslate_emerald_helmet", settings -> new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, ArmorType.HELMET, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem DEEPSLATE_EMERALD_CHESTPLATE = register("deepslate_emerald_chestplate", settings -> new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, ArmorType.CHESTPLATE, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem DEEPSLATE_EMERALD_LEGGINGS = register("deepslate_emerald_leggings", settings -> new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, ArmorType.LEGGINGS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem DEEPSLATE_EMERALD_BOOTS = register("deepslate_emerald_boots", settings -> new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, ArmorType.BOOTS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final SpearItem DEEPSLATE_EMERALD_SPEAR = register("deepslate_emerald_spear", settings ->
            new SpearItem(settings.fireResistant().rarity(Rarity.EPIC), ToolMaterials.DEEPSLATE_EMERALD,
                    0.9f/*↓jabt*/, 2f/*↑damage*/, 0.35f/*↓delay*/, 3.5f/*↑stage1t*/, 8f/*↓dism.thr.*/, 8f/*↑stage2t*/, 12f/*↑stage3t*/));


    //End Diamond
    public static final SwordItem END_DIAMOND_SWORD = register("end_diamond_sword",
            settings -> new SwordItem(ToolMaterials.END_DIAMOND, 15, -2, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final AxeItem END_DIAMOND_AXE = register("end_diamond_axe", settings -> 
            new AxeItem(ToolMaterials.END_DIAMOND, 17, -2.4f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final PickaxeItem END_DIAMOND_PICKAXE = register("end_diamond_pickaxe", settings -> 
            new PickaxeItem(ToolMaterials.END_DIAMOND, 10, -2.2f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ShovelItem END_DIAMOND_SHOVEL = register("end_diamond_shovel", settings -> 
            new ShovelItem(ToolMaterials.END_DIAMOND, 11, -2.4f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final HoeItem END_DIAMOND_HOE = register("end_diamond_hoe", settings -> 
            new HoeItem(ToolMaterials.END_DIAMOND, 2, 2, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem END_DIAMOND_HELMET = register("end_diamond_helmet", settings -> new ArmorItem(ArmorMaterialInit.END_DIAMOND, ArmorType.HELMET, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem END_DIAMOND_CHESTPLATE = register("end_diamond_chestplate", settings -> new ArmorItem(ArmorMaterialInit.END_DIAMOND, ArmorType.CHESTPLATE, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem END_DIAMOND_LEGGINGS = register("end_diamond_leggings", settings -> new ArmorItem(ArmorMaterialInit.END_DIAMOND, ArmorType.LEGGINGS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem END_DIAMOND_BOOTS = register("end_diamond_boots", settings -> new ArmorItem(ArmorMaterialInit.END_DIAMOND, ArmorType.BOOTS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final SpearItem END_DIAMOND_SPEAR = register("end_diamond_spear", settings ->
            new SpearItem(settings.fireResistant().rarity(Rarity.EPIC), ToolMaterials.END_DIAMOND,
                    0.7f/*↓jabt*/, 3f/*↑damage*/, 0.3f/*↓delay*/, 5f/*↑stage1t*/, 7f/*↓dism.thr.*/, 10f/*↑stage2t*/, 15f/*↑stage3t*/));


    //Void
    public static final SwordItem VOID_SWORD = register("void_sword",
            settings -> new SwordItem(ToolMaterials.VOID, 22, -1.8f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final AxeItem VOID_AXE = register("void_axe", settings -> 
            new AxeItem(ToolMaterials.VOID, 21 ,-2.4f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final PickaxeItem VOID_PICKAXE = register("void_pickaxe", settings -> 
            new PickaxeItem(ToolMaterials.VOID, 13, -2, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ShovelItem VOID_SHOVEL = register("void_shovel", settings -> 
            new ShovelItem(ToolMaterials.VOID, 14, -2.2f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final HoeItem VOID_HOE = register("void_hoe", settings -> 
            new HoeItem(ToolMaterials.VOID, 3, 3, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem VOID_HELMET = register("void_helmet", settings -> new ArmorItem(ArmorMaterialInit.VOID, ArmorType.HELMET, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem VOID_CHESTPLATE = register("void_chestplate", settings -> new ArmorItem(ArmorMaterialInit.VOID, ArmorType.CHESTPLATE, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem VOID_LEGGINGS = register("void_leggings", settings -> new ArmorItem(ArmorMaterialInit.VOID, ArmorType.LEGGINGS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem VOID_BOOTS = register("void_boots", settings -> new ArmorItem(ArmorMaterialInit.VOID, ArmorType.BOOTS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final SpearItem VOID_SPEAR = register("void_spear", settings ->
            new SpearItem(settings.fireResistant().rarity(Rarity.EPIC), ToolMaterials.VOID,
                    0.6f/*↓jabt*/, 5f/*↑damage*/, 0.25f/*↓delay*/, 6f/*↑stage1t*/, 6f/*↓dism.thr.*/, 15f/*↑stage2t*/, 25f/*↑stage3t*/));

    //ONETHDENDERITE
    public static final SwordItem ONETHDENDERITE_SWORD = register("onethdenderite_sword",
            settings -> new SwordItem(ToolMaterials.ONETHDENDERITE, 33, -1.6f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final AxeItem ONETHDENDERITE_AXE = register("onethdenderite_axe", settings -> 
            new AxeItem(ToolMaterials.ONETHDENDERITE, 28, -2.2f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ConvertPickaxeItem ONETHDENDERITE_PICKAXE = register("onethdenderite_pickaxe", settings -> 
            new ConvertPickaxeItem(3, ToolMaterials.ONETHDENDERITE, 18, -1.8f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ShovelItem ONETHDENDERITE_SHOVEL = register("onethdenderite_shovel", settings -> 
            new ShovelItem(ToolMaterials.ONETHDENDERITE, 23, -2, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final HoeItem ONETHDENDERITE_HOE = register("onethdenderite_hoe",
            settings -> new HoeItem(ToolMaterials.ONETHDENDERITE, 8, 3.2f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem ONETHDENDERITE_HELMET = register("onethdenderite_helmet", settings -> new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, ArmorType.HELMET, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem ONETHDENDERITE_CHESTPLATE = register("onethdenderite_chestplate", settings -> new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, ArmorType.CHESTPLATE, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem ONETHDENDERITE_LEGGINGS = register("onethdenderite_leggings", settings -> new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, ArmorType.LEGGINGS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem ONETHDENDERITE_BOOTS = register("onethdenderite_boots", settings -> new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, ArmorType.BOOTS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final SpearItem ONETHDENDERITE_SPEAR = register("onethdenderite_spear", settings ->
            new SpearItem(settings.fireResistant().rarity(Rarity.EPIC), ToolMaterials.ONETHDENDERITE,
                    0.5f/*↓jabt*/, 10f/*↑damage*/, 0.2f/*↓delay*/, 10f/*↑stage1t*/, 5f/*↓dism.thr.*/, 25f/*↑stage2t*/, 50f/*↑stage3t*/));

    //OLED
    public static final SwordItem OLED_SWORD = register("oled_sword",
            settings -> new SwordItem(ToolMaterials.OLED, 100, 0, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final AxeItem OLED_AXE = register("oled_axe", settings -> 
            new AxeItem(ToolMaterials.OLED, 90, -1.1f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ConvertPickaxeItem OLED_PICKAXE = register("oled_pickaxe", settings -> 
            new ConvertPickaxeItem(5, ToolMaterials.OLED, 70, -0.2f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ShovelItem OLED_SHOVEL = register("oled_shovel", settings -> 
            new ShovelItem(ToolMaterials.OLED, 80, -1.1f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final HoeItem OLED_HOE = register("oled_hoe", settings -> 
            new HoeItem(ToolMaterials.OLED, 50, 50, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem OLED_HELMET = register("oled_helmet", settings -> new ArmorItem(ArmorMaterialInit.OLED, ArmorType.HELMET, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem OLED_CHESTPLATE = register("oled_chestplate", settings -> new ArmorItem(ArmorMaterialInit.OLED, ArmorType.CHESTPLATE, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem OLED_LEGGINGS = register("oled_leggings", settings -> new ArmorItem(ArmorMaterialInit.OLED, ArmorType.LEGGINGS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem OLED_BOOTS = register("oled_boots", settings -> new ArmorItem(ArmorMaterialInit.OLED, ArmorType.BOOTS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final SpearItem OLED_SPEAR = register("oled_spear", settings ->
            new SpearItem(settings.fireResistant().rarity(Rarity.EPIC), ToolMaterials.OLED,
                    0.35f/*↓jabt*/, 20f/*↑damage*/, 0.15f/*↓delay*/, 25f/*↑stage1t*/, 4f/*↓dism.thr.*/, 50f/*↑stage2t*/, 100f/*↑stage3t*/));


    //ANCIENT
    public static final SwordItem ANCIENT_SWORD = register("ancient_sword",
            settings -> new SwordItem(ToolMaterials.ANCIENT, 100, 0, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final AxeItem ANCIENT_AXE = register("ancient_axe", settings -> 
            new AxeItem(ToolMaterials.ANCIENT, 90, -1.1f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ConvertPickaxeItem ANCIENT_PICKAXE = register("ancient_pickaxe", settings -> 
            new ConvertPickaxeItem(100, ToolMaterials.ANCIENT, 70, -0.2f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ShovelItem ANCIENT_SHOVEL = register("ancient_shovel", settings -> 
            new ShovelItem(ToolMaterials.ANCIENT, 80, -1.1f, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final HoeItem ANCIENT_HOE = register("ancient_hoe", settings -> 
            new HoeItem(ToolMaterials.ANCIENT, 50, 50, settings.fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem ANCIENT_HELMET = register("ancient_helmet", settings -> new ArmorItem(ArmorMaterialInit.ANCIENT, ArmorType.HELMET, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem ANCIENT_CHESTPLATE = register("ancient_chestplate", settings -> new ArmorItem(ArmorMaterialInit.ANCIENT, ArmorType.CHESTPLATE, settings
            .fireResistant().rarity(Rarity.EPIC).component(DataComponents.GLIDER, Unit.INSTANCE)));
    public static final ArmorItem ANCIENT_LEGGINGS = register("ancient_leggings", settings -> new ArmorItem(ArmorMaterialInit.ANCIENT, ArmorType.LEGGINGS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final ArmorItem ANCIENT_BOOTS = register("ancient_boots", settings -> new ArmorItem(ArmorMaterialInit.ANCIENT, ArmorType.BOOTS, settings
            .fireResistant().rarity(Rarity.EPIC)));
    public static final SpearItem ANCIENT_SPEAR = register("ancient_spear", settings ->
            new SpearItem(settings.fireResistant().rarity(Rarity.EPIC), ToolMaterials.ANCIENT,
                    0.25f/*↓jabt*/, 50f/*↑damage*/, 0.1f/*↓delay*/, 50f/*↑stage1t*/, 2.5f/*↓dism.thr.*/, 125f/*↑stage2t*/, 200f/*↑stage3t*/));


    public static <T extends Item> T register(String name, Function<Item.Properties, T> item) {
        return Registry.register(BuiltInRegistries.ITEM, MoreToolsAndArmor.id(name), item.apply(new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM, MoreToolsAndArmor.id(name)))));
    }

    public static void load() {}
}
