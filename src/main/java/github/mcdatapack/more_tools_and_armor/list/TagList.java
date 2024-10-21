package github.mcdatapack.more_tools_and_armor.list;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TagList {
    public static class BlockTags {
        public static final TagKey<Block> INCORRECT_FOR_DEEPSLATE_EMERALD_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("incorrect_for_deepslate_emerald_tool"));
        public static final TagKey<Block> INCORRECT_FOR_END_DIAMOND_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("incorrect_for_end_diamond_tool"));
        public static final TagKey<Block> INCORRECT_FOR_VOID_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("incorrect_for_void_tool"));
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("needs_netherite_tool"));
        public static final TagKey<Block> INCORRECT_FOR_ONETHDENDERITE_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("incorrect_for_onethdenderite_tool"));
        public static final TagKey<Block> NEEDS_DEEPSLATE_EMERALD_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("needs_deepslate_emerald_tool"));
    }
    public static class ItemTags {
        public static final TagKey<Item> BUDDING_AMETHYST_REPAIR_ITEMS = TagKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("budding_amethyst_repair_items"));
        public static final TagKey<Item> COPPER_REPAIR_ITEMS = TagKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("copper_repair_items"));
        public static final TagKey<Item> EMERALD_REPAIR_ITEMS = TagKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("emerald_repair_items"));
        public static final TagKey<Item> OBSIDIAN_REPAIR_ITEMS = TagKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("obsidian_repair_items"));
        public static final TagKey<Item> DEEPSLATE_EMERALD_REPAIR_ITEMS = TagKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_repair_items"));
        public static final TagKey<Item> END_DIAMOND_REPAIR_ITEMS = TagKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_repair_items"));
        public static final TagKey<Item> VOID_REPAIR_ITEMS = TagKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("void_repair_items"));
        public static final TagKey<Item> ONETHDENDERITE_REPAIR_ITEMS = TagKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("onethdenderite_repair_items"));
    }
}
