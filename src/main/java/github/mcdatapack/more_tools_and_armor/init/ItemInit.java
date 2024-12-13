package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.enums.ToolMaterials;
import github.mcdatapack.more_tools_and_armor.item.PaxelItem;
import net.minecraft.item.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class ItemInit {
    public static final Item BUDDING_AMETHYST_CRYSTAL = register("budding_amethyst_crystal", new Item(new Item.Settings()));
    public static final Item DEEPSLATE_EMERALD = register("deepslate_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96)));
    public static final Item DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE = register("deepslate_emerald_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof()));
    public static final Item END_DIAMOND = register("end_diamond", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96)));
    public static final Item END_DIAMOND_UPGRADE_SMITHING_TEMPLATE = register("end_diamond_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof()));
    public static final Item VOID_INGOT = register("void_ingot", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96)));
    public static final Item VOID_UPGRADE_SMITHING_TEMPLATE = register("void_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96)));
    public static final Item SCULK_EMERALD = register("sculk_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96)));
    public static final Item BLACKSTONE_EMERALD = register("blackstone_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96)));
    public static final Item END_EMERALD = register("end_emerald", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96)));
    public static final Item ONETHDENDERITE_INGOT = register("onethdenderite_ingot", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96)));
    public static final Item ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE = register("onethdenderite_upgrade_smithing_template", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).fireproof().maxCount(96)));

    public static final PaxelItem WOODEN_PAXEL = register("wooden_paxel", new PaxelItem(net.minecraft.item.ToolMaterials.WOOD, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(net.minecraft.item.ToolMaterials.WOOD, 6.0F, -2.4F))));
    public static final PaxelItem STONE_PAXEL = register("stone_paxel", new PaxelItem(net.minecraft.item.ToolMaterials.STONE, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(net.minecraft.item.ToolMaterials.STONE, 7.0F, -2.4F))));
    public static final PaxelItem IRON_PAXEL = register("iron_paxel", new PaxelItem(net.minecraft.item.ToolMaterials.IRON, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(net.minecraft.item.ToolMaterials.IRON, 6.0F, -2.4F))));
    public static final PaxelItem GOLDEN_PAXEL = register("golden_paxel", new PaxelItem(net.minecraft.item.ToolMaterials.GOLD, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(net.minecraft.item.ToolMaterials.GOLD, 6.0F, -2.4F))));
    public static final PaxelItem DIAMOND_PAXEL = register("diamond_paxel", new PaxelItem(net.minecraft.item.ToolMaterials.DIAMOND, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(net.minecraft.item.ToolMaterials.DIAMOND, 6.0F, -2.4F))));
    public static final PaxelItem NETHERITE_PAXEL = register("netherite_paxel", new PaxelItem(net.minecraft.item.ToolMaterials.NETHERITE,
            new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(net.minecraft.item.ToolMaterials.NETHERITE, 6.0F, -2.4F))));
    public static final PaxelItem COPPER_PAXEL = register("copper_paxel", new PaxelItem(ToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.COPPER, 7, -2.4F))));
    public static final PaxelItem BUDDING_AMETHYST_PAXEL = register("budding_amethyst_paxel", new PaxelItem(ToolMaterials.BUDDING_AMETHYST, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.BUDDING_AMETHYST, 7, -2.4F))));
    public static final PaxelItem EMERALD_PAXEL = register("emerald_paxel", new PaxelItem(ToolMaterials.EMERALD, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.EMERALD, 5, -2.4F))));
    public static final PaxelItem OBSIDIAN_PAXEL = register("obsidian_paxel", new PaxelItem(ToolMaterials.OBSIDIAN, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.OBSIDIAN, 7, -2.6F))));
    public static final PaxelItem DEEPSLATE_EMERALD_PAXEL = register("deepslate_emerald_paxel", new PaxelItem(ToolMaterials.DEEPSLATE_EMERALD,
            new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.DEEPSLATE_EMERALD, 15, -2.0F))));
    public static final PaxelItem END_DIAMOND_PAXEL = register("end_diamond_paxel", new PaxelItem(ToolMaterials.END_DIAMOND, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.END_DIAMOND, 17, -2.0F))));
    public static final PaxelItem VOID_PAXEL = register("void_paxel", new PaxelItem(ToolMaterials.VOID, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.VOID, 22, -1.8F))));
    public static final PaxelItem ONETHDENDERITE_PAXEL = register("onethdenderite_paxel", new PaxelItem(ToolMaterials.ONETHDENDERITE, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.ONETHDENDERITE, 33, -1.6F))));

//Budding Amethyst
    public static final SwordItem BUDDING_AMETHYST_SWORD = register("budding_amethyst_sword", new SwordItem(ToolMaterials.BUDDING_AMETHYST, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.BUDDING_AMETHYST, 5, -2.4F))));
    public static final AxeItem BUDDING_AMETHYST_AXE = register("budding_amethyst_axe", new AxeItem(ToolMaterials.BUDDING_AMETHYST, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.BUDDING_AMETHYST, 7, -3F))));
    public static final PickaxeItem BUDDING_AMETHYST_PICKAXE = register("budding_amethyst_pickaxe", new PickaxeItem(ToolMaterials.BUDDING_AMETHYST, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.BUDDING_AMETHYST, 2, -2.8F))));
    public static final ShovelItem BUDDING_AMETHYST_SHOVEL = register("budding_amethyst_shovel", new ShovelItem(ToolMaterials.BUDDING_AMETHYST, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.BUDDING_AMETHYST, 3, -3F))));
    public static final HoeItem BUDDING_AMETHYST_HOE = register("budding_amethyst_hoe", new HoeItem(ToolMaterials.BUDDING_AMETHYST, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.BUDDING_AMETHYST, -1, -0F))));
    public static final ArmorItem BUDDING_AMETHYST_HELMET = register("budding_amethyst_helmet", new ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20))));
    public static final ArmorItem BUDDING_AMETHYST_CHESTPLATE = register("budding_amethyst_chestplate", new ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))));;
    public static final ArmorItem BUDDING_AMETHYST_LEGGINGS = register("budding_amethyst_leggings", new ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20))));;
    public static final ArmorItem BUDDING_AMETHYST_BOOTS = register("budding_amethyst_boots", new ArmorItem(ArmorMaterialInit.BUDDING_AMETHYST, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20))));;
//Copper
    public static final SwordItem COPPER_SWORD = register("copper_sword", new SwordItem(ToolMaterials.COPPER, new Item.Settings()
        .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.COPPER, 3, -2.4F))));
    public static final AxeItem COPPER_AXE = register("copper_axe", new AxeItem(ToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.COPPER, 7, -3.2F))));
    public static final PickaxeItem COPPER_PICKAXE = register("copper_pickaxe", new PickaxeItem(ToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.COPPER, 1, -2.8F))));
    public static final ShovelItem COPPER_SHOVEL = register("copper_shovel", new ShovelItem(ToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.COPPER, 2, -3F))));
    public static final HoeItem COPPER_HOE = register("copper_hoe", new HoeItem(ToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.COPPER, -1, -2F))));
    public static final ArmorItem COPPER_HELMET = register("copper_helmet", new ArmorItem(ArmorMaterialInit.COPPER, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final ArmorItem COPPER_CHESTPLATE = register("copper_chestplate", new ArmorItem(ArmorMaterialInit.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));;
    public static final ArmorItem COPPER_LEGGINGS = register("copper_leggings", new ArmorItem(ArmorMaterialInit.COPPER, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));;
    public static final ArmorItem COPPER_BOOTS = register("copper_boots", new ArmorItem(ArmorMaterialInit.COPPER, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));;

//Emerald
    public static final SwordItem EMERALD_SWORD = register("emerald_sword", new SwordItem(ToolMaterials.EMERALD, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.EMERALD, 5, -2.4F))));
    public static final AxeItem EMERALD_AXE = register("emerald_axe", new AxeItem(ToolMaterials.EMERALD, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.EMERALD, 7, -3))));
    public static final PickaxeItem EMERALD_PICKAXE = register("emerald_pickaxe", new PickaxeItem(ToolMaterials.EMERALD, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.EMERALD, 2, -2.8F))));
    public static final ShovelItem EMERALD_SHOVEL = register("emerald_shovel", new ShovelItem(ToolMaterials.EMERALD, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.EMERALD, 3, -3F))));
    public static final HoeItem EMERALD_HOE = register("emerald_hoe", new HoeItem(ToolMaterials.EMERALD, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.EMERALD, -1, -0F))));
    public static final ArmorItem EMERALD_HELMET = register("emerald_helmet", new ArmorItem(ArmorMaterialInit.EMERALD, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(21))));
    public static final ArmorItem EMERALD_CHESTPLATE = register("emerald_chestplate", new ArmorItem(ArmorMaterialInit.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(21))));;
    public static final ArmorItem EMERALD_LEGGINGS = register("emerald_leggings", new ArmorItem(ArmorMaterialInit.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(21))));;
    public static final ArmorItem EMERALD_BOOTS = register("emerald_boots", new ArmorItem(ArmorMaterialInit.EMERALD, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(21))));

//Obsidian
    public static final SwordItem OBSIDIAN_SWORD = register("obsidian_sword", new SwordItem(ToolMaterials.OBSIDIAN, new Item.Settings()
        .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.OBSIDIAN, 7, -2.6F))));
    public static final AxeItem OBSIDIAN_AXE = register("obsidian_axe", new AxeItem(ToolMaterials.OBSIDIAN, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.OBSIDIAN, 9, -3.2F))));
    public static final PickaxeItem OBSIDIAN_PICKAXE = register("obsidian_pickaxe", new PickaxeItem(ToolMaterials.OBSIDIAN, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.OBSIDIAN, 4, -2.8F))));
    public static final ShovelItem OBSIDIAN_SHOVEL = register("obsidian_shovel", new ShovelItem(ToolMaterials.OBSIDIAN, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.OBSIDIAN, 4, -3F))));
    public static final HoeItem OBSIDIAN_HOE = register("obsidian_hoe", new HoeItem(ToolMaterials.OBSIDIAN, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.OBSIDIAN, 0, -0F))));
    public static final ArmorItem OBSIDIAN_HELMET = register("obsidian_helmet", new ArmorItem(ArmorMaterialInit.OBSIDIAN, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));
    public static final ArmorItem OBSIDIAN_CHESTPLATE = register("obsidian_chestplate", new ArmorItem(ArmorMaterialInit.OBSIDIAN, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));;
    public static final ArmorItem OBSIDIAN_LEGGINGS = register("obsidian_leggings", new ArmorItem(ArmorMaterialInit.OBSIDIAN, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));;
    public static final ArmorItem OBSIDIAN_BOOTS = register("obsidian_boots", new ArmorItem(ArmorMaterialInit.OBSIDIAN, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));

//Deepslate Emerald
    public static final SwordItem DEEPSLATE_EMERALD_SWORD = register("deepslate_emerald_sword", new SwordItem(ToolMaterials.DEEPSLATE_EMERALD, new Item.Settings()
        .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DEEPSLATE_EMERALD, 13, -2.0F)).fireproof().rarity(Rarity.EPIC)));
    public static final AxeItem DEEPSLATE_EMERALD_AXE = register("deepslate_emerald_axe", new AxeItem(ToolMaterials.DEEPSLATE_EMERALD, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.DEEPSLATE_EMERALD, 15, -2.5F)).fireproof().rarity(Rarity.EPIC)));
    public static final PickaxeItem DEEPSLATE_EMERALD_PICKAXE = register("deepslate_emerald_pickaxe", new PickaxeItem(ToolMaterials.DEEPSLATE_EMERALD, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.DEEPSLATE_EMERALD, 8, -2.4F)).fireproof().rarity(Rarity.EPIC)));
    public static final ShovelItem DEEPSLATE_EMERALD_SHOVEL = register("deepslate_emerald_shovel", new ShovelItem(ToolMaterials.DEEPSLATE_EMERALD, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.DEEPSLATE_EMERALD, 9, -2.5F)).fireproof().rarity(Rarity.EPIC)));
    public static final HoeItem DEEPSLATE_EMERALD_HOE = register("deepslate_emerald_hoe", new HoeItem(ToolMaterials.DEEPSLATE_EMERALD, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.DEEPSLATE_EMERALD, 1, 1.0F)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem DEEPSLATE_EMERALD_HELMET = register("deepslate_emerald_helmet", new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(280)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem DEEPSLATE_EMERALD_CHESTPLATE = register("deepslate_emerald_chestplate", new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(280)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem DEEPSLATE_EMERALD_LEGGINGS = register("deepslate_emerald_leggings", new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(280)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem DEEPSLATE_EMERALD_BOOTS = register("deepslate_emerald_boots", new ArmorItem(ArmorMaterialInit.DEEPSLATE_EMERALD, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(280)).fireproof().rarity(Rarity.EPIC)));


    //End Diamond
    public static final SwordItem END_DIAMOND_SWORD = register("end_diamond_sword", new SwordItem(ToolMaterials.END_DIAMOND, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.END_DIAMOND, 15, -2.0F)).fireproof().rarity(Rarity.EPIC)));
    public static final AxeItem END_DIAMOND_AXE = register("end_diamond_axe", new AxeItem(ToolMaterials.END_DIAMOND, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.END_DIAMOND, 17, -2.4F)).fireproof().rarity(Rarity.EPIC)));
    public static final PickaxeItem END_DIAMOND_PICKAXE = register("end_diamond_pickaxe", new PickaxeItem(ToolMaterials.END_DIAMOND, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.END_DIAMOND, 10, -2.2F)).fireproof().rarity(Rarity.EPIC)));
    public static final ShovelItem END_DIAMOND_SHOVEL = register("end_diamond_shovel", new ShovelItem(ToolMaterials.END_DIAMOND, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.END_DIAMOND, 11, -2.4F)).fireproof().rarity(Rarity.EPIC)));
    public static final HoeItem END_DIAMOND_HOE = register("end_diamond_hoe", new HoeItem(ToolMaterials.END_DIAMOND, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.END_DIAMOND, 2, 2.0F)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem END_DIAMOND_HELMET = register("end_diamond_helmet", new ArmorItem(ArmorMaterialInit.END_DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(280)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem END_DIAMOND_CHESTPLATE = register("end_diamond_chestplate", new ArmorItem(ArmorMaterialInit.END_DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(280)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem END_DIAMOND_LEGGINGS = register("end_diamond_leggings", new ArmorItem(ArmorMaterialInit.END_DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(280)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem END_DIAMOND_BOOTS = register("end_diamond_boots", new ArmorItem(ArmorMaterialInit.END_DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(280)).fireproof().rarity(Rarity.EPIC)));


    //Void
    public static final SwordItem VOID_SWORD = register("void_sword", new SwordItem(ToolMaterials.VOID, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.VOID, 22, -1.8F)).fireproof().rarity(Rarity.EPIC)));
    public static final AxeItem VOID_AXE = register("void_axe", new AxeItem(ToolMaterials.VOID, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.VOID, 21, -2.4F)).fireproof().rarity(Rarity.EPIC)));
    public static final PickaxeItem VOID_PICKAXE = register("void_pickaxe", new PickaxeItem(ToolMaterials.VOID, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.VOID, 13, -2.0F)).fireproof().rarity(Rarity.EPIC)));
    public static final ShovelItem VOID_SHOVEL = register("void_shovel", new ShovelItem(ToolMaterials.VOID, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.VOID, 14, -2.2F)).fireproof().rarity(Rarity.EPIC)));
    public static final HoeItem VOID_HOE = register("void_hoe", new HoeItem(ToolMaterials.VOID, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.VOID, 3, 3.0F)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem VOID_HELMET = register("void_helmet", new ArmorItem(ArmorMaterialInit.VOID, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(1800)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem VOID_CHESTPLATE = register("void_chestplate", new ArmorItem(ArmorMaterialInit.VOID, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(1800)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem VOID_LEGGINGS = register("void_leggings", new ArmorItem(ArmorMaterialInit.VOID, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(1800)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem VOID_BOOTS = register("void_boots", new ArmorItem(ArmorMaterialInit.VOID, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(1800)).fireproof().rarity(Rarity.EPIC)));

    //ONETHDENDERITE
    public static final SwordItem ONETHDENDERITE_SWORD = register("onethdenderite_sword", new SwordItem(ToolMaterials.ONETHDENDERITE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.ONETHDENDERITE, 33, -1.6F)).fireproof().rarity(Rarity.EPIC)));
    public static final AxeItem ONETHDENDERITE_AXE = register("onethdenderite_axe", new AxeItem(ToolMaterials.ONETHDENDERITE, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.ONETHDENDERITE, 28, -2.2F)).fireproof().rarity(Rarity.EPIC)));
    public static final PickaxeItem ONETHDENDERITE_PICKAXE = register("onethdenderite_pickaxe", new PickaxeItem(ToolMaterials.ONETHDENDERITE, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.ONETHDENDERITE, 18, -1.8F)).fireproof().rarity(Rarity.EPIC)));
    public static final ShovelItem ONETHDENDERITE_SHOVEL = register("onethdenderite_shovel", new ShovelItem(ToolMaterials.ONETHDENDERITE, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.ONETHDENDERITE, 23, -2.0F)).fireproof().rarity(Rarity.EPIC)));
    public static final HoeItem ONETHDENDERITE_HOE = register("onethdenderite_hoe", new HoeItem(ToolMaterials.ONETHDENDERITE, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.ONETHDENDERITE, 8, 3.2F)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem ONETHDENDERITE_HELMET = register("onethdenderite_helmet", new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(3600)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem ONETHDENDERITE_CHESTPLATE = register("onethdenderite_chestplate", new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(3600)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem ONETHDENDERITE_LEGGINGS = register("onethdenderite_leggings", new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(3600)).fireproof().rarity(Rarity.EPIC)));
    public static final ArmorItem ONETHDENDERITE_BOOTS = register("onethdenderite_boots", new ArmorItem(ArmorMaterialInit.ONETHDENDERITE, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(3600)).fireproof().rarity(Rarity.EPIC)));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, MoreToolsAndArmor.id(name), item);
    }

    public static void load() {}
}
