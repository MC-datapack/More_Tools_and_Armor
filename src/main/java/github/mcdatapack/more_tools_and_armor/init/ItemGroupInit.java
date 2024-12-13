package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import static github.mcdatapack.more_tools_and_armor.init.ItemInit.*;
import static github.mcdatapack.more_tools_and_armor.init.BlockInit.*;

public class ItemGroupInit {
    private static final Text MORE_TOOLS_AND_ARMOR_GROUP_TITLE = Text.translatable("itemGroup." + MoreToolsAndArmor.MOD_ID + ".more_tools_and_armor_group");
    public static final ItemGroup MORE_TOOLS_AND_ARMOR_GROUP = register("more_tools_and_armor_group", FabricItemGroup.builder()
            .displayName(MORE_TOOLS_AND_ARMOR_GROUP_TITLE)
            .icon(BUDDING_AMETHYST_PICKAXE::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(END_COAL_ORE);
                entries.add(END_COPPER_ORE);
                entries.add(Items.COPPER_INGOT);
                entries.add(END_LAPIS_LAZULI_ORE);
                entries.add(END_IRON_ORE);
                entries.add(BUDDING_AMETHYST_CRYSTAL);
                entries.add(END_GOLD_ORE);
                entries.add(Items.EMERALD);
                entries.add(SCULK_EMERALD);
                entries.add(SCULK_EMERALD_BLOCK);
                entries.add(BLACKSTONE_EMERALD);
                entries.add(BLACKSTONE_EMERALD_BLOCK);
                entries.add(END_EMERALD);
                entries.add(END_EMERALD_BLOCK);
                entries.add(END_EMERALD_ORE);
                entries.add(SCULK_EMERALD_ORE);
                entries.add(BLACKSTONE_EMERALD_ORE);
                entries.add(END_REDSTONE_ORE);
                entries.add(Items.OBSIDIAN);
                entries.add(DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE);
                entries.add(DEEPSLATE_EMERALD);
                entries.add(DEEPSLATE_EMERALD_BLOCK);
                entries.add(END_DIAMOND_UPGRADE_SMITHING_TEMPLATE);
                entries.add(END_DIAMOND_ORE);
                entries.add(END_DIAMOND);
                entries.add(END_DIAMOND_BLOCK);
                entries.add(VOID_INGOT);
                entries.add(VOID_UPGRADE_SMITHING_TEMPLATE);
                entries.add(ONETHDENDERITE_INGOT);
                entries.add(ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE);
                entries.add(WOODEN_PAXEL);
                entries.add(STONE_PAXEL);
                entries.add(IRON_PAXEL);
                entries.add(GOLDEN_PAXEL);
                entries.add(DIAMOND_PAXEL);
                entries.add(NETHERITE_PAXEL);
                entries.add(COPPER_PAXEL);
                entries.add(BUDDING_AMETHYST_PAXEL);
                entries.add(EMERALD_PAXEL);
                entries.add(OBSIDIAN_PAXEL);
                entries.add(DEEPSLATE_EMERALD_PAXEL);
                entries.add(END_DIAMOND_PAXEL);
                entries.add(VOID_PAXEL);
                entries.add(ONETHDENDERITE_PAXEL);
                entries.add(COPPER_HELMET);
                entries.add(COPPER_CHESTPLATE);
                entries.add(COPPER_LEGGINGS);
                entries.add(COPPER_BOOTS);
                entries.add(COPPER_SWORD);
                entries.add(COPPER_AXE);
                entries.add(COPPER_PICKAXE);
                entries.add(COPPER_SHOVEL);
                entries.add(COPPER_HOE);
                entries.add(BUDDING_AMETHYST_HELMET);
                entries.add(BUDDING_AMETHYST_CHESTPLATE);
                entries.add(BUDDING_AMETHYST_LEGGINGS);
                entries.add(BUDDING_AMETHYST_BOOTS);
                entries.add(BUDDING_AMETHYST_SWORD);
                entries.add(BUDDING_AMETHYST_AXE);
                entries.add(BUDDING_AMETHYST_PICKAXE);
                entries.add(BUDDING_AMETHYST_SHOVEL);
                entries.add(BUDDING_AMETHYST_HOE);
                entries.add(EMERALD_HELMET);
                entries.add(EMERALD_CHESTPLATE);
                entries.add(EMERALD_LEGGINGS);
                entries.add(EMERALD_BOOTS);
                entries.add(EMERALD_SWORD);
                entries.add(EMERALD_AXE);
                entries.add(EMERALD_PICKAXE);
                entries.add(EMERALD_SHOVEL);
                entries.add(EMERALD_HOE);
                entries.add(OBSIDIAN_HELMET);
                entries.add(OBSIDIAN_CHESTPLATE);
                entries.add(OBSIDIAN_LEGGINGS);
                entries.add(OBSIDIAN_BOOTS);
                entries.add(OBSIDIAN_SWORD);
                entries.add(OBSIDIAN_AXE);
                entries.add(OBSIDIAN_PICKAXE);
                entries.add(OBSIDIAN_SHOVEL);
                entries.add(OBSIDIAN_HOE);
                entries.add(DEEPSLATE_EMERALD_HELMET);
                entries.add(DEEPSLATE_EMERALD_CHESTPLATE);
                entries.add(DEEPSLATE_EMERALD_LEGGINGS);
                entries.add(DEEPSLATE_EMERALD_BOOTS);
                entries.add(DEEPSLATE_EMERALD_SWORD);
                entries.add(DEEPSLATE_EMERALD_AXE);
                entries.add(DEEPSLATE_EMERALD_PICKAXE);
                entries.add(DEEPSLATE_EMERALD_SHOVEL);
                entries.add(DEEPSLATE_EMERALD_HOE);
                entries.add(END_DIAMOND_HELMET);
                entries.add(END_DIAMOND_CHESTPLATE);
                entries.add(END_DIAMOND_LEGGINGS);
                entries.add(END_DIAMOND_BOOTS);
                entries.add(END_DIAMOND_SWORD);
                entries.add(END_DIAMOND_AXE);
                entries.add(END_DIAMOND_PICKAXE);
                entries.add(END_DIAMOND_SHOVEL);
                entries.add(END_DIAMOND_HOE);
                entries.add(VOID_HELMET);
                entries.add(VOID_CHESTPLATE);
                entries.add(VOID_LEGGINGS);
                entries.add(VOID_BOOTS);
                entries.add(VOID_SWORD);
                entries.add(VOID_AXE);
                entries.add(VOID_PICKAXE);
                entries.add(VOID_SHOVEL);
                entries.add(VOID_HOE);
                entries.add(ONETHDENDERITE_HELMET);
                entries.add(ONETHDENDERITE_CHESTPLATE);
                entries.add(ONETHDENDERITE_LEGGINGS);
                entries.add(ONETHDENDERITE_BOOTS);
                entries.add(ONETHDENDERITE_SWORD);
                entries.add(ONETHDENDERITE_AXE);
                entries.add(ONETHDENDERITE_PICKAXE);
                entries.add(ONETHDENDERITE_SHOVEL);
                entries.add(ONETHDENDERITE_HOE);
            })
            .build());

    public static <T extends ItemGroup> T register(String name, T ItemGroup) {
        return Registry.register(Registries.ITEM_GROUP, MoreToolsAndArmor.id(name), ItemGroup);
    }

    public static void load() {}
}
