package github.mcdatapack.more_tools_and_armor.enums;

import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

public interface ToolMaterials {
    ToolMaterial COAL = material(
            135, 3F, 1F, BlockTags.INCORRECT_FOR_STONE_TOOL, 6,
            ItemTags.COALS
    );
    ToolMaterial BUDDING_AMETHYST = material(
            500, 7F, 1F, BlockTags.INCORRECT_FOR_IRON_TOOL, 12,
            TagList.ItemTags.BUDDING_AMETHYSTS
    );
    ToolMaterial COPPER = material(
            210, 6F, 1F, BlockTags.INCORRECT_FOR_STONE_TOOL, 15,
            ConventionalItemTags.COPPER_INGOTS
    );
    ToolMaterial LAPIS = material(280, 5F, 1F, BlockTags.INCORRECT_FOR_IRON_TOOL, 8,
            ConventionalItemTags.LAPIS_GEMS
    );
    ToolMaterial EMERALD = material(
            375, 6.5F, 1F, BlockTags.INCORRECT_FOR_IRON_TOOL, 14,
            ConventionalItemTags.EMERALD_GEMS
    );
    ToolMaterial REDSTONE = material(855, 7.5F, 1F, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 13,
            ConventionalItemTags.REDSTONE_DUSTS
    );
    ToolMaterial OBSIDIAN = material(
            1331, 8.5F, 1F, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 10,
            ConventionalItemTags.OBSIDIANS
    );
    ToolMaterial DEEPSLATE_EMERALD = material(
            14_571, 40F, 1F, TagList.BlockTags.INCORRECT_FOR_DEEPSLATE_EMERALD_TOOL, 100,
            TagList.ItemTags.DEEPSLATE_EMERALDS
    );
    ToolMaterial END_DIAMOND = material(
            24_581, 80F, 1F, TagList.BlockTags.INCORRECT_FOR_END_DIAMOND_TOOL, 100,
            TagList.ItemTags.END_DIAMONDS
    );
    ToolMaterial VOID = material(
            431_241, 256F, 1F, TagList.BlockTags.INCORRECT_FOR_VOID_TOOL, 100,
            TagList.ItemTags.VOID_INGOTS
    );
    ToolMaterial ONETHDENDERITE = material(
            3_141_592, 1256F, 1F, TagList.BlockTags.INCORRECT_FOR_ONETHDENDERITE_TOOL, 100,
            TagList.ItemTags.ONETHDENDERITE_INGOTS
    );
    ToolMaterial OLED = material(
            31_415_926, 3141F, 1F, TagList.BlockTags.INCORRECT_FOR_OLED_TOOL, 100,
            TagList.ItemTags.OLED_INGOTS
    );
    ToolMaterial ANCIENT = material(
            Integer.MAX_VALUE, 2712561F, 150F, TagList.BlockTags.INCORRECT_FOR_ANCIENT_TOOL, 100,
            TagList.ItemTags.ANCIENT_INGOTS
    );

    private static ToolMaterial material(int durability, float miningSpeedMulitplier, float attackDamage, TagKey<Block> incorrectFor, int enchantability, TagKey<Item> repair) {
        return new ToolMaterial(incorrectFor, durability, miningSpeedMulitplier, attackDamage, enchantability, repair);
    }
}
