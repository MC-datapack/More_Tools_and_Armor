package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

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

        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.BUDDING_AMETHYST_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ItemInit.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.COPPER_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.COPPER_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.COPPER_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.COPPER_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ItemInit.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EMERALD_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.EMERALD_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.EMERALD_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.EMERALD_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ItemInit.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.OBSIDIAN_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.OBSIDIAN_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.OBSIDIAN_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.OBSIDIAN_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.DEEPSLATE_EMERALD_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ItemInit.END_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.END_DIAMOND_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.END_DIAMOND_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.END_DIAMOND_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.END_DIAMOND_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ItemInit.VOID_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.VOID_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.VOID_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.VOID_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.VOID_BOOTS, Models.GENERATED);
    }
}
