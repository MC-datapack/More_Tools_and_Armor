package github.mcdatapack.more_tools_and_armor.list;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TagList {
    public static class BlockTags {
        public static final TagKey<Block> INCORRECT_FOR_DEEPSLATE_EMERALD_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("incorrect_for_deepslate_emerald_tool"));
        public static final TagKey<Block> INCORRECT_FOR_END_DIAMOND_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("incorrect_for_end_diamond_tool"));
        public static final TagKey<Block> INCORRECT_FOR_VOID_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("incorrect_for_void_tool"));
        public static final TagKey<Block> INCORRECT_FOR_ONETHDENDERITE_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("incorrect_for_onethdenderite_tool"));
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("needs_netherite_tool"));
        public static final TagKey<Block> NEEDS_DEEPSLATE_EMERALD_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("needs_deepslate_emerald_tool"));
    }
    public static class ItemTags {

    }
}
