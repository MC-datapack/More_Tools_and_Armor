package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ItemGroupInit {
    private static final Text MORE_TOOLS_AND_ARMOR_GROUP_TITLE = Text.translatable("itemGroup." + MoreToolsAndArmor.MOD_ID + ".more_tools_and_armor_group");
    public static final ItemGroup MORE_TOOLS_AND_ARMOR_GROUP = register("more_tools_and_armor_group", FabricItemGroup.builder()
            .displayName(MORE_TOOLS_AND_ARMOR_GROUP_TITLE)
            .icon(ItemInit.BUDDING_AMETHYST_PICKAXE::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(BlockInit.END_COAL_ORE);
                entries.add(BlockInit.END_COPPER_ORE);
                entries.add(Items.COPPER_INGOT);
                entries.add(BlockInit.END_LAPIS_LAZULI_ORE);
                entries.add(BlockInit.END_IRON_ORE);
                entries.add(ItemInit.BUDDING_AMETHYST_CRYSTAL);
                entries.add(BlockInit.END_GOLD_ORE);
                entries.add(Items.EMERALD);
                entries.add(BlockInit.END_EMERALD_ORE);
                entries.add(BlockInit.END_REDSTONE_ORE);
                entries.add(Items.OBSIDIAN);
                entries.add(ItemInit.DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE);
                entries.add(ItemInit.DEEPSLATE_EMERALD);
                entries.add(BlockInit.DEEPSLATE_EMERALD_BLOCK);
                entries.add(ItemInit.END_DIAMOND_UPGRADE_SMITHING_TEMPLATE);
                entries.add(BlockInit.END_DIAMOND_ORE);
                entries.add(ItemInit.END_DIAMOND);
                entries.add(BlockInit.END_DIAMOND_BLOCK);
                entries.add(ItemInit.COPPER_HELMET);
                entries.add(ItemInit.COPPER_CHESTPLATE);
                entries.add(ItemInit.COPPER_LEGGINGS);
                entries.add(ItemInit.COPPER_BOOTS);
                entries.add(ItemInit.COPPER_SWORD);
                entries.add(ItemInit.COPPER_AXE);
                entries.add(ItemInit.COPPER_PICKAXE);
                entries.add(ItemInit.COPPER_SHOVEL);
                entries.add(ItemInit.COPPER_HOE);
                entries.add(ItemInit.BUDDING_AMETHYST_HELMET);
                entries.add(ItemInit.BUDDING_AMETHYST_CHESTPLATE);
                entries.add(ItemInit.BUDDING_AMETHYST_LEGGINGS);
                entries.add(ItemInit.BUDDING_AMETHYST_BOOTS);
                entries.add(ItemInit.BUDDING_AMETHYST_SWORD);
                entries.add(ItemInit.BUDDING_AMETHYST_AXE);
                entries.add(ItemInit.BUDDING_AMETHYST_PICKAXE);
                entries.add(ItemInit.BUDDING_AMETHYST_SHOVEL);
                entries.add(ItemInit.BUDDING_AMETHYST_HOE);
                entries.add(ItemInit.EMERALD_HELMET);
                entries.add(ItemInit.EMERALD_CHESTPLATE);
                entries.add(ItemInit.EMERALD_LEGGINGS);
                entries.add(ItemInit.EMERALD_BOOTS);
                entries.add(ItemInit.EMERALD_SWORD);
                entries.add(ItemInit.EMERALD_AXE);
                entries.add(ItemInit.EMERALD_PICKAXE);
                entries.add(ItemInit.EMERALD_SHOVEL);
                entries.add(ItemInit.EMERALD_HOE);
                entries.add(ItemInit.OBSIDIAN_HELMET);
                entries.add(ItemInit.OBSIDIAN_CHESTPLATE);
                entries.add(ItemInit.OBSIDIAN_LEGGINGS);
                entries.add(ItemInit.OBSIDIAN_BOOTS);
                entries.add(ItemInit.OBSIDIAN_SWORD);
                entries.add(ItemInit.OBSIDIAN_AXE);
                entries.add(ItemInit.OBSIDIAN_PICKAXE);
                entries.add(ItemInit.OBSIDIAN_SHOVEL);
                entries.add(ItemInit.OBSIDIAN_HOE);
                entries.add(ItemInit.DEEPSLATE_EMERALD_HELMET);
                entries.add(ItemInit.DEEPSLATE_EMERALD_CHESTPLATE);
                entries.add(ItemInit.DEEPSLATE_EMERALD_LEGGINGS);
                entries.add(ItemInit.DEEPSLATE_EMERALD_BOOTS);
                entries.add(ItemInit.DEEPSLATE_EMERALD_SWORD);
                entries.add(ItemInit.DEEPSLATE_EMERALD_AXE);
                entries.add(ItemInit.DEEPSLATE_EMERALD_PICKAXE);
                entries.add(ItemInit.DEEPSLATE_EMERALD_SHOVEL);
                entries.add(ItemInit.DEEPSLATE_EMERALD_HOE);
                entries.add(ItemInit.END_DIAMOND_HELMET);
                entries.add(ItemInit.END_DIAMOND_CHESTPLATE);
                entries.add(ItemInit.END_DIAMOND_LEGGINGS);
                entries.add(ItemInit.END_DIAMOND_BOOTS);
                entries.add(ItemInit.END_DIAMOND_SWORD);
                entries.add(ItemInit.END_DIAMOND_AXE);
                entries.add(ItemInit.END_DIAMOND_PICKAXE);
                entries.add(ItemInit.END_DIAMOND_SHOVEL);
                entries.add(ItemInit.END_DIAMOND_HOE);
            })
            .build());

    public static <T extends ItemGroup> T register(String name, T ItemGroup) {
        return Registry.register(Registries.ITEM_GROUP, MoreToolsAndArmor.id(name), ItemGroup);
    }

    public static void load() {}
}
