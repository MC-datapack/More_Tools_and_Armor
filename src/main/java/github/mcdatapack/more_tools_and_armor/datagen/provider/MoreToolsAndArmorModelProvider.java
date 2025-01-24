package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import github.mcdatapack.more_tools_and_armor.init.CustomEquipmentModels;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.util.Identifier;

import static github.mcdatapack.more_tools_and_armor.init.ItemInit.*;
import static github.mcdatapack.more_tools_and_armor.init.ItemInit.ONETHDENDERITE_PAXEL;
import static net.minecraft.client.data.ItemModelGenerator.getTrimAssetIdPrefix;

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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
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
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_HELMET, CustomEquipmentModels.BUDDING_AMETHYST, getTrimAssetIdPrefix("helmet"),false);
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_CHESTPLATE, CustomEquipmentModels.BUDDING_AMETHYST, getTrimAssetIdPrefix("chestplate"),false);
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_LEGGINGS, CustomEquipmentModels.BUDDING_AMETHYST, getTrimAssetIdPrefix("leggings"),false);
        itemModelGenerator.registerArmor(ItemInit.BUDDING_AMETHYST_BOOTS, CustomEquipmentModels.BUDDING_AMETHYST, getTrimAssetIdPrefix("boots"),false);

        itemModelGenerator.register(ItemInit.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.COPPER_HELMET, CustomEquipmentModels.COPPER, getTrimAssetIdPrefix("helmet"),false);
        itemModelGenerator.registerArmor(ItemInit.COPPER_CHESTPLATE,CustomEquipmentModels.COPPER, getTrimAssetIdPrefix("chestplate"),false);
        itemModelGenerator.registerArmor(ItemInit.COPPER_LEGGINGS, CustomEquipmentModels.COPPER, getTrimAssetIdPrefix("leggings"),false);
        itemModelGenerator.registerArmor(ItemInit.COPPER_BOOTS, CustomEquipmentModels.COPPER, getTrimAssetIdPrefix("boots"),false);

        itemModelGenerator.register(ItemInit.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_HELMET, CustomEquipmentModels.EMERALD, getTrimAssetIdPrefix("helmet"),false);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_CHESTPLATE,CustomEquipmentModels.EMERALD, getTrimAssetIdPrefix("chestplate"),false);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_LEGGINGS, CustomEquipmentModels.EMERALD, getTrimAssetIdPrefix("leggings"),false);
        itemModelGenerator.registerArmor(ItemInit.EMERALD_BOOTS, CustomEquipmentModels.EMERALD, getTrimAssetIdPrefix("boots"),false);

        itemModelGenerator.register(ItemInit.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_HELMET, CustomEquipmentModels.OBSIDIAN, getTrimAssetIdPrefix("helmet"),false);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_CHESTPLATE,CustomEquipmentModels.OBSIDIAN, getTrimAssetIdPrefix("chestplate"),false);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_LEGGINGS, CustomEquipmentModels.OBSIDIAN, getTrimAssetIdPrefix("leggings"),false);
        itemModelGenerator.registerArmor(ItemInit.OBSIDIAN_BOOTS, CustomEquipmentModels.OBSIDIAN, getTrimAssetIdPrefix("boots"),false);

        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_HELMET, CustomEquipmentModels.DEEPSLATE_EMERALD, getTrimAssetIdPrefix("helmet"),false);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_CHESTPLATE,CustomEquipmentModels.DEEPSLATE_EMERALD, getTrimAssetIdPrefix("chestplate"),false);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_LEGGINGS, CustomEquipmentModels.DEEPSLATE_EMERALD, getTrimAssetIdPrefix("leggings"),false);
        itemModelGenerator.registerArmor(ItemInit.DEEPSLATE_EMERALD_BOOTS, CustomEquipmentModels.DEEPSLATE_EMERALD, getTrimAssetIdPrefix("boots"),false);

        itemModelGenerator.register(ItemInit.END_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_HELMET, CustomEquipmentModels.END_DIAMOND, getTrimAssetIdPrefix("helmet"),false);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_CHESTPLATE,CustomEquipmentModels.END_DIAMOND, getTrimAssetIdPrefix("chestplate"),false);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_LEGGINGS, CustomEquipmentModels.END_DIAMOND, getTrimAssetIdPrefix("leggings"),false);
        itemModelGenerator.registerArmor(ItemInit.END_DIAMOND_BOOTS, CustomEquipmentModels.END_DIAMOND, getTrimAssetIdPrefix("boots"),false);

        itemModelGenerator.register(ItemInit.VOID_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.VOID_HELMET, CustomEquipmentModels.VOID, getTrimAssetIdPrefix("helmet"),false);
        itemModelGenerator.registerArmor(ItemInit.VOID_CHESTPLATE,CustomEquipmentModels.VOID, getTrimAssetIdPrefix("chestplate"),false);
        itemModelGenerator.registerArmor(ItemInit.VOID_LEGGINGS, CustomEquipmentModels.VOID, getTrimAssetIdPrefix("leggings"),false);
        itemModelGenerator.registerArmor(ItemInit.VOID_BOOTS, CustomEquipmentModels.VOID, getTrimAssetIdPrefix("boots"),false);

        itemModelGenerator.register(ItemInit.ONETHDENDERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ONETHDENDERITE_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_HELMET, CustomEquipmentModels.ONETHDENDERITE, getTrimAssetIdPrefix("helmet"),false);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_CHESTPLATE,CustomEquipmentModels.ONETHDENDERITE, getTrimAssetIdPrefix("chestplate"),false);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_LEGGINGS, CustomEquipmentModels.ONETHDENDERITE, getTrimAssetIdPrefix("leggings"),false);
        itemModelGenerator.registerArmor(ItemInit.ONETHDENDERITE_BOOTS, CustomEquipmentModels.ONETHDENDERITE, getTrimAssetIdPrefix("boots"),false);

        itemModelGenerator.register(OLED_INGOT, Models.GENERATED);
        itemModelGenerator.register(OLED_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ItemInit.OLED_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OLED_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ItemInit.OLED_HELMET, CustomEquipmentModels.OLED, getTrimAssetIdPrefix("helmet"), false);
        itemModelGenerator.registerArmor(ItemInit.OLED_CHESTPLATE, CustomEquipmentModels.OLED, getTrimAssetIdPrefix("chestplate"), false);
        itemModelGenerator.registerArmor(ItemInit.OLED_LEGGINGS, CustomEquipmentModels.OLED, getTrimAssetIdPrefix("leggings"), false);
        itemModelGenerator.registerArmor(ItemInit.OLED_BOOTS, CustomEquipmentModels.OLED, getTrimAssetIdPrefix("boots"), false);

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
    }
}
