package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import github.mcdatapack.more_tools_and_armor.init.EquipmentModelInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

import static github.mcdatapack.more_tools_and_armor.init.ItemInit.*;
import static github.mcdatapack.more_tools_and_armor.init.ItemInit.ONETHDENDERITE_PAXEL;

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
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.OVERWORLD_UNSTABLE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.NETHER_UNSTABLE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.END_UNSTABLE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.OVERWORLD_SHARD, Models.GENERATED);
        itemModelGenerator.register(ItemInit.NETHER_SHARD, Models.GENERATED);
        itemModelGenerator.register(ItemInit.END_SHARD, Models.GENERATED);
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
        itemModelGenerator.register(ANCIENT_HONEY_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ANCIENT_COIN, Models.GENERATED);
        itemModelGenerator.register(BAT_WING, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ANCIENT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ANCIENT_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_HELMET, EquipmentModelInit.BUDDING_AMETHYST, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_CHESTPLATE, EquipmentModelInit.BUDDING_AMETHYST, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_LEGGINGS, EquipmentModelInit.BUDDING_AMETHYST, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_BOOTS, EquipmentModelInit.BUDDING_AMETHYST, "boots", false);

        itemModelGenerator.register(ItemInit.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.COPPER_HELMET, EquipmentModelInit.COPPER, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.COPPER_CHESTPLATE, EquipmentModelInit.COPPER, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.COPPER_LEGGINGS, EquipmentModelInit.COPPER, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.COPPER_BOOTS, EquipmentModelInit.COPPER, "boots", false);

        itemModelGenerator.register(ItemInit.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_HELMET, EquipmentModelInit.EMERALD, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_CHESTPLATE, EquipmentModelInit.EMERALD, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_LEGGINGS, EquipmentModelInit.EMERALD, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_BOOTS, EquipmentModelInit.EMERALD, "boots", false);

        itemModelGenerator.register(ItemInit.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_HELMET, EquipmentModelInit.OBSIDIAN, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_CHESTPLATE, EquipmentModelInit.OBSIDIAN, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_LEGGINGS, EquipmentModelInit.OBSIDIAN, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_BOOTS, EquipmentModelInit.OBSIDIAN, "boots", false);

        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_HELMET, EquipmentModelInit.DEEPSLATE_EMERALD, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_CHESTPLATE, EquipmentModelInit.DEEPSLATE_EMERALD, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_LEGGINGS, EquipmentModelInit.DEEPSLATE_EMERALD, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_BOOTS, EquipmentModelInit.DEEPSLATE_EMERALD, "boots", false);

        itemModelGenerator.register(ItemInit.END_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_HELMET, EquipmentModelInit.END_DIAMOND, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_CHESTPLATE, EquipmentModelInit.END_DIAMOND, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_LEGGINGS, EquipmentModelInit.END_DIAMOND, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_BOOTS, EquipmentModelInit.END_DIAMOND, "boots", false);

        itemModelGenerator.register(ItemInit.VOID_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.VOID_HELMET, EquipmentModelInit.VOID, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.VOID_CHESTPLATE, EquipmentModelInit.VOID, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.VOID_LEGGINGS, EquipmentModelInit.VOID, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.VOID_BOOTS, EquipmentModelInit.VOID, "boots", false);

        itemModelGenerator.register(ItemInit.ONETHDENDERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_HELMET, EquipmentModelInit.ONETHDENDERITE, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_CHESTPLATE, EquipmentModelInit.ONETHDENDERITE, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_LEGGINGS, EquipmentModelInit.ONETHDENDERITE, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_BOOTS, EquipmentModelInit.ONETHDENDERITE, "boots", false);

        itemModelGenerator.register(OLED_INGOT, Models.GENERATED);
        itemModelGenerator.register(OLED_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ItemInit.OLED_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.OLED_HELMET, EquipmentModelInit.OLED, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.OLED_CHESTPLATE, EquipmentModelInit.OLED, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.OLED_LEGGINGS, EquipmentModelInit.OLED, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.OLED_BOOTS, EquipmentModelInit.OLED, "boots", false);

        itemModelGenerator.register(ItemInit.ANCIENT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ANCIENT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ANCIENT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ANCIENT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ANCIENT_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.ANCIENT_HELMET, EquipmentModelInit.ANCIENT, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.ANCIENT_CHESTPLATE, EquipmentModelInit.ANCIENT, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.ANCIENT_LEGGINGS, EquipmentModelInit.ANCIENT, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.ANCIENT_BOOTS, EquipmentModelInit.ANCIENT, "boots", false);

        itemModelGenerator.register(ItemInit.COAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COAL_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.COAL_HELMET, EquipmentModelInit.COAL, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.COAL_CHESTPLATE, EquipmentModelInit.COAL, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.COAL_LEGGINGS, EquipmentModelInit.COAL, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.COAL_BOOTS, EquipmentModelInit.COAL, "boots", false);
        itemModelGenerator.register(ItemInit.REDSTONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.REDSTONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.REDSTONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.REDSTONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.REDSTONE_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.REDSTONE_HELMET, EquipmentModelInit.REDSTONE, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.REDSTONE_CHESTPLATE, EquipmentModelInit.REDSTONE, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.REDSTONE_LEGGINGS, EquipmentModelInit.REDSTONE, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.REDSTONE_BOOTS, EquipmentModelInit.REDSTONE, "boots", false);
        itemModelGenerator.register(ItemInit.LAPIS_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.LAPIS_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.LAPIS_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.LAPIS_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.LAPIS_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.LAPIS_HELMET, EquipmentModelInit.LAPIS, "helmet", false);
        itemModelGenerator.registerArmor(ItemInit.LAPIS_CHESTPLATE, EquipmentModelInit.LAPIS, "chestplate", false);
        itemModelGenerator.registerArmor(ItemInit.LAPIS_LEGGINGS, EquipmentModelInit.LAPIS, "leggings", false);
        itemModelGenerator.registerArmor(ItemInit.LAPIS_BOOTS, EquipmentModelInit.LAPIS, "boots", false);

        itemModelGenerator.register(WOODEN_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(COAL_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(LAPIS_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(REDSTONE_PAXEL, Models.HANDHELD);
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
        itemModelGenerator.register(WOODEN_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(COAL_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(LAPIS_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(REDSTONE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(STONE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(IRON_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(GOLDEN_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(DIAMOND_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(NETHERITE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(COPPER_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(BUDDING_AMETHYST_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(EMERALD_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(OBSIDIAN_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(DEEPSLATE_EMERALD_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(END_DIAMOND_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(VOID_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ONETHDENDERITE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(OLED_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ANCIENT_HAMMER, Models.HANDHELD);
    }
}
