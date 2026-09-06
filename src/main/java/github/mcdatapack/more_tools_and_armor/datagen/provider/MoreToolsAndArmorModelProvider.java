package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import github.mcdatapack.more_tools_and_armor.init.EquipmentModelInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

import static github.mcdatapack.more_tools_and_armor.init.ItemInit.*;
import static github.mcdatapack.more_tools_and_armor.init.ItemInit.ONETHDENDERITE_PAXEL;
import static net.minecraft.client.data.models.ItemModelGenerators.*;

public class MoreToolsAndArmorModelProvider extends FabricModelProvider {
    public MoreToolsAndArmorModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        generator.createTrivialCube(BlockInit.DEEPSLATE_EMERALD_BLOCK);
        generator.createTrivialCube(BlockInit.END_DIAMOND_BLOCK);
        generator.createTrivialCube(BlockInit.END_COAL_ORE);
        generator.createTrivialCube(BlockInit.END_COPPER_ORE);
        generator.createTrivialCube(BlockInit.END_IRON_ORE);
        generator.createTrivialCube(BlockInit.END_GOLD_ORE);
        generator.createTrivialCube(BlockInit.END_LAPIS_LAZULI_ORE);
        generator.createTrivialCube(BlockInit.END_EMERALD_ORE);
        generator.createTrivialCube(BlockInit.END_REDSTONE_ORE);
        generator.createTrivialCube(BlockInit.END_DIAMOND_ORE);
        generator.createTrivialCube(BlockInit.END_EMERALD_BLOCK);
        generator.createTrivialCube(BlockInit.SCULK_EMERALD_ORE);
        generator.createTrivialCube(BlockInit.BLACKSTONE_EMERALD_ORE);
        generator.createTrivialCube(BlockInit.SCULK_EMERALD_BLOCK);
        generator.createTrivialCube(BlockInit.BLACKSTONE_EMERALD_BLOCK);
        generator.createTrivialCube(BlockInit.ANCIENT_HONEY_BLOCK);
        generator.createTrivialCube(BlockInit.OVERWORLD_UNSTABLE_ORE);
        generator.createTrivialCube(BlockInit.NETHER_UNSTABLE_ORE);
        generator.createTrivialCube(BlockInit.END_UNSTABLE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(ItemInit.OVERWORLD_SHARD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.NETHER_SHARD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.END_SHARD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.BUDDING_AMETHYST_CRYSTAL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.DEEPSLATE_EMERALD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.END_DIAMOND, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.END_DIAMOND_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.VOID_INGOT, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.VOID_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.SCULK_EMERALD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.BLACKSTONE_EMERALD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.END_EMERALD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.ONETHDENDERITE_INGOT, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ANCIENT_HONEY_BOTTLE, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ANCIENT_COIN, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(BAT_WING, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.ANCIENT_INGOT, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ItemInit.ANCIENT_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);

        generator.generateFlatItem(ItemInit.BUDDING_AMETHYST_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.BUDDING_AMETHYST_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.BUDDING_AMETHYST_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.BUDDING_AMETHYST_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.BUDDING_AMETHYST_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.BUDDING_AMETHYST_HELMET, EquipmentModelInit.BUDDING_AMETHYST, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.BUDDING_AMETHYST_CHESTPLATE, EquipmentModelInit.BUDDING_AMETHYST, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.BUDDING_AMETHYST_LEGGINGS, EquipmentModelInit.BUDDING_AMETHYST, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.BUDDING_AMETHYST_BOOTS, EquipmentModelInit.BUDDING_AMETHYST, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(BUDDING_AMETHYST_SPEAR);

        generator.generateFlatItem(ItemInit.EMERALD_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.EMERALD_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.EMERALD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.EMERALD_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.EMERALD_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.EMERALD_HELMET, EquipmentModelInit.EMERALD, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.EMERALD_CHESTPLATE, EquipmentModelInit.EMERALD, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.EMERALD_LEGGINGS, EquipmentModelInit.EMERALD, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.EMERALD_BOOTS, EquipmentModelInit.EMERALD, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(EMERALD_SPEAR);

        generator.generateFlatItem(ItemInit.OBSIDIAN_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.OBSIDIAN_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.OBSIDIAN_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.OBSIDIAN_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.OBSIDIAN_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.OBSIDIAN_HELMET, EquipmentModelInit.OBSIDIAN, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.OBSIDIAN_CHESTPLATE, EquipmentModelInit.OBSIDIAN, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.OBSIDIAN_LEGGINGS, EquipmentModelInit.OBSIDIAN, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.OBSIDIAN_BOOTS, EquipmentModelInit.OBSIDIAN, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(OBSIDIAN_SPEAR);

        generator.generateFlatItem(ItemInit.DEEPSLATE_EMERALD_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.DEEPSLATE_EMERALD_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.DEEPSLATE_EMERALD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.DEEPSLATE_EMERALD_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.DEEPSLATE_EMERALD_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.DEEPSLATE_EMERALD_HELMET, EquipmentModelInit.DEEPSLATE_EMERALD, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.DEEPSLATE_EMERALD_CHESTPLATE, EquipmentModelInit.DEEPSLATE_EMERALD, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.DEEPSLATE_EMERALD_LEGGINGS, EquipmentModelInit.DEEPSLATE_EMERALD, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.DEEPSLATE_EMERALD_BOOTS, EquipmentModelInit.DEEPSLATE_EMERALD, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(DEEPSLATE_EMERALD_SPEAR);

        generator.generateFlatItem(ItemInit.END_DIAMOND_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.END_DIAMOND_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.END_DIAMOND_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.END_DIAMOND_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.END_DIAMOND_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.END_DIAMOND_HELMET, EquipmentModelInit.END_DIAMOND, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.END_DIAMOND_CHESTPLATE, EquipmentModelInit.END_DIAMOND, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.END_DIAMOND_LEGGINGS, EquipmentModelInit.END_DIAMOND, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.END_DIAMOND_BOOTS, EquipmentModelInit.END_DIAMOND, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(END_DIAMOND_SPEAR);

        generator.generateFlatItem(ItemInit.VOID_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.VOID_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.VOID_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.VOID_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.VOID_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.VOID_HELMET, EquipmentModelInit.VOID, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.VOID_CHESTPLATE, EquipmentModelInit.VOID, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.VOID_LEGGINGS, EquipmentModelInit.VOID, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.VOID_BOOTS, EquipmentModelInit.VOID, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(VOID_SPEAR);

        generator.generateFlatItem(ItemInit.ONETHDENDERITE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.ONETHDENDERITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.ONETHDENDERITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.ONETHDENDERITE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.ONETHDENDERITE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.ONETHDENDERITE_HELMET, EquipmentModelInit.ONETHDENDERITE, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.ONETHDENDERITE_CHESTPLATE, EquipmentModelInit.ONETHDENDERITE, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.ONETHDENDERITE_LEGGINGS, EquipmentModelInit.ONETHDENDERITE, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.ONETHDENDERITE_BOOTS, EquipmentModelInit.ONETHDENDERITE, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(ONETHDENDERITE_SPEAR);

        generator.generateFlatItem(OLED_INGOT, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(OLED_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);

        generator.generateFlatItem(ItemInit.OLED_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.OLED_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.OLED_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.OLED_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.OLED_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.OLED_HELMET, EquipmentModelInit.OLED, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.OLED_CHESTPLATE, EquipmentModelInit.OLED, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.OLED_LEGGINGS, EquipmentModelInit.OLED, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.OLED_BOOTS, EquipmentModelInit.OLED, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(OLED_SPEAR);

        generator.generateFlatItem(ItemInit.ANCIENT_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.ANCIENT_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.ANCIENT_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.ANCIENT_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.ANCIENT_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.ANCIENT_HELMET, EquipmentModelInit.ANCIENT, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.ANCIENT_CHESTPLATE, EquipmentModelInit.ANCIENT, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.ANCIENT_LEGGINGS, EquipmentModelInit.ANCIENT, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.ANCIENT_BOOTS, EquipmentModelInit.ANCIENT, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(ANCIENT_SPEAR);

        generator.generateFlatItem(ItemInit.COAL_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.COAL_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.COAL_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.COAL_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.COAL_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.COAL_HELMET, EquipmentModelInit.COAL, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.COAL_CHESTPLATE, EquipmentModelInit.COAL, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.COAL_LEGGINGS, EquipmentModelInit.COAL, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.COAL_BOOTS, EquipmentModelInit.COAL, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(COAL_SPEAR);

        generator.generateFlatItem(ItemInit.REDSTONE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.REDSTONE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.REDSTONE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.REDSTONE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.REDSTONE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.REDSTONE_HELMET, EquipmentModelInit.REDSTONE, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.REDSTONE_CHESTPLATE, EquipmentModelInit.REDSTONE, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.REDSTONE_LEGGINGS, EquipmentModelInit.REDSTONE, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.REDSTONE_BOOTS, EquipmentModelInit.REDSTONE, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(REDSTONE_SPEAR);

        generator.generateFlatItem(ItemInit.LAPIS_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.LAPIS_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.LAPIS_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.LAPIS_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ItemInit.LAPIS_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateTrimmableItem(ItemInit.LAPIS_HELMET, EquipmentModelInit.LAPIS, TRIM_PREFIX_HELMET, false);
        generator.generateTrimmableItem(ItemInit.LAPIS_CHESTPLATE, EquipmentModelInit.LAPIS, TRIM_PREFIX_CHESTPLATE, false);
        generator.generateTrimmableItem(ItemInit.LAPIS_LEGGINGS, EquipmentModelInit.LAPIS, TRIM_PREFIX_LEGGINGS, false);
        generator.generateTrimmableItem(ItemInit.LAPIS_BOOTS, EquipmentModelInit.LAPIS, TRIM_PREFIX_BOOTS, false);
        generator.generateSpear(LAPIS_SPEAR);

        generator.generateFlatItem(WOODEN_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(COAL_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(LAPIS_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(REDSTONE_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(STONE_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(IRON_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(GOLDEN_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(DIAMOND_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(NETHERITE_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(COPPER_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(BUDDING_AMETHYST_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(EMERALD_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(OBSIDIAN_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(DEEPSLATE_EMERALD_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(END_DIAMOND_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(VOID_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ONETHDENDERITE_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(OLED_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ANCIENT_PAXEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(WOODEN_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(COAL_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(LAPIS_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(REDSTONE_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(STONE_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(IRON_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(GOLDEN_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(DIAMOND_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(NETHERITE_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(COPPER_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(BUDDING_AMETHYST_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(EMERALD_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(OBSIDIAN_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(DEEPSLATE_EMERALD_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(END_DIAMOND_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(VOID_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ONETHDENDERITE_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(OLED_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(ANCIENT_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
