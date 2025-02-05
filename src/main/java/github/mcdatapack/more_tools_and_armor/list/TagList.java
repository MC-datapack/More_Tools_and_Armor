package github.mcdatapack.more_tools_and_armor.list;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagList {
    public static class BlockTags {
        public static final TagKey<Block> INCORRECT_FOR_DEEPSLATE_EMERALD_TOOL = register("incorrect_for_deepslate_emerald_tool");
        public static final TagKey<Block> INCORRECT_FOR_END_DIAMOND_TOOL = register("incorrect_for_end_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_VOID_TOOL = register("incorrect_for_void_tool");
        public static final TagKey<Block> INCORRECT_FOR_ONETHDENDERITE_TOOL = register("incorrect_for_onethdenderite_tool");
        public static final TagKey<Block> INCORRECT_FOR_OLED_TOOL = register("incorrect_for_oled_tool");
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = register("needs_netherite_tool");
        public static final TagKey<Block> NEEDS_DEEPSLATE_EMERALD_TOOL = register("needs_deepslate_emerald_tool");
        public static final TagKey<Block> PAXEL_MINEABLE = register("mineable/paxel");

        private static TagKey<Block> register(String path) {
            return TagKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id(path));
        }
    }

    public static class ItemTags {}
}
