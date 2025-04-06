package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import github.mcdatapack.more_tools_and_armor.init.EquipmentModelInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

import static github.mcdatapack.more_tools_and_armor.init.ItemInit.*;
import static github.mcdatapack.more_tools_and_armor.init.ItemInit.ONETHDENDERITE_PAXEL;
import static net.minecraft.client.data.ItemModelGenerator.*;

public class MoreToolsAndArmorModelProvider extends FabricModelProvider {
    public MoreToolsAndArmorModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DEEPSLATE_EMERALD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.END_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.END_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.END_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.END_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.END_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.END_LAPIS_LAZULI_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.END_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.END_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.END_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.END_EMERALD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SCULK_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.BLACKSTONE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SCULK_EMERALD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.BLACKSTONE_EMERALD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ANCIENT_HONEY_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ANCIENT_HONEY_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ANCIENT_COIN, Models.GENERATED);
        itemModelGenerator.register(BAT_WING, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ANCIENT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ANCIENT_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD, Models.GENERATED);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.END_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ItemInit.END_DIAMOND_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.VOID_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.VOID_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SCULK_EMERALD, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BLACKSTONE_EMERALD, Models.GENERATED);
        itemModelGenerator.register(ItemInit.END_EMERALD, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_HELMET, EquipmentModelInit.BUDDING_AMETHYST, HELMET_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_CHESTPLATE, EquipmentModelInit.BUDDING_AMETHYST, CHESTPLATE_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_LEGGINGS, EquipmentModelInit.BUDDING_AMETHYST, LEGGINGS_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_BOOTS, EquipmentModelInit.BUDDING_AMETHYST, BOOTS_TRIM_ID_PREFIX,false);

        itemModelGenerator.register(ItemInit.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.COPPER_HELMET, EquipmentModelInit.COPPER, HELMET_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.COPPER_CHESTPLATE,EquipmentModelInit.COPPER, CHESTPLATE_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.COPPER_LEGGINGS, EquipmentModelInit.COPPER, LEGGINGS_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.COPPER_BOOTS, EquipmentModelInit.COPPER, BOOTS_TRIM_ID_PREFIX,false);

        itemModelGenerator.register(ItemInit.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_HELMET, EquipmentModelInit.EMERALD, HELMET_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_CHESTPLATE,EquipmentModelInit.EMERALD, CHESTPLATE_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_LEGGINGS, EquipmentModelInit.EMERALD, LEGGINGS_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_BOOTS, EquipmentModelInit.EMERALD, BOOTS_TRIM_ID_PREFIX,false);

        itemModelGenerator.register(ItemInit.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_HELMET, EquipmentModelInit.OBSIDIAN, HELMET_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_CHESTPLATE,EquipmentModelInit.OBSIDIAN, CHESTPLATE_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_LEGGINGS, EquipmentModelInit.OBSIDIAN, LEGGINGS_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_BOOTS, EquipmentModelInit.OBSIDIAN, BOOTS_TRIM_ID_PREFIX,false);

        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_HELMET, EquipmentModelInit.DEEPSLATE_EMERALD, HELMET_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_CHESTPLATE,EquipmentModelInit.DEEPSLATE_EMERALD, CHESTPLATE_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_LEGGINGS, EquipmentModelInit.DEEPSLATE_EMERALD, LEGGINGS_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_BOOTS, EquipmentModelInit.DEEPSLATE_EMERALD, BOOTS_TRIM_ID_PREFIX,false);

        itemModelGenerator.register(ItemInit.END_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_HELMET, EquipmentModelInit.END_DIAMOND, HELMET_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_CHESTPLATE,EquipmentModelInit.END_DIAMOND, CHESTPLATE_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_LEGGINGS, EquipmentModelInit.END_DIAMOND, LEGGINGS_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_BOOTS, EquipmentModelInit.END_DIAMOND, BOOTS_TRIM_ID_PREFIX,false);

        itemModelGenerator.register(ItemInit.VOID_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.VOID_HELMET, EquipmentModelInit.VOID, HELMET_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.VOID_CHESTPLATE,EquipmentModelInit.VOID, CHESTPLATE_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.VOID_LEGGINGS, EquipmentModelInit.VOID, LEGGINGS_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.VOID_BOOTS, EquipmentModelInit.VOID, BOOTS_TRIM_ID_PREFIX,false);

        itemModelGenerator.register(ItemInit.ONETHDENDERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_HELMET, EquipmentModelInit.ONETHDENDERITE, HELMET_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_CHESTPLATE,EquipmentModelInit.ONETHDENDERITE, CHESTPLATE_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_LEGGINGS, EquipmentModelInit.ONETHDENDERITE, LEGGINGS_TRIM_ID_PREFIX,false);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_BOOTS, EquipmentModelInit.ONETHDENDERITE, BOOTS_TRIM_ID_PREFIX,false);

        itemModelGenerator.register(OLED_INGOT, Models.GENERATED);
        itemModelGenerator.register(OLED_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ItemInit.OLED_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.OLED_HELMET, EquipmentModelInit.OLED, HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ItemInit.OLED_CHESTPLATE, EquipmentModelInit.OLED, CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ItemInit.OLED_LEGGINGS, EquipmentModelInit.OLED, LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ItemInit.OLED_BOOTS, EquipmentModelInit.OLED, BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.register(ItemInit.ANCIENT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ANCIENT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ANCIENT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ANCIENT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ANCIENT_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.ANCIENT_HELMET, EquipmentModelInit.ANCIENT, HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ItemInit.ANCIENT_CHESTPLATE, EquipmentModelInit.ANCIENT, CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ItemInit.ANCIENT_LEGGINGS, EquipmentModelInit.ANCIENT, LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ItemInit.ANCIENT_BOOTS, EquipmentModelInit.ANCIENT, BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.register(WOODEN_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(STONE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(IRON_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(GOLDEN_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(DIAMOND_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(NETHERITE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(COPPER_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(BUDDING_AMETHYST_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(EMERALD_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(OBSIDIAN_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(DEEPSLATE_EMERALD_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(END_DIAMOND_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(VOID_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ONETHDENDERITE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(OLED_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ANCIENT_PAXEL, Models.HANDHELD);
    }
}