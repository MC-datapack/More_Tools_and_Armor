package github.mcdatapack.more_tools_and_armor.list;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TagList {
    public static class BlockTags {
        public static final TagKey<Block> INCORRECT_FOR_DEEPSLATE_EMERALD_TOOL = register("incorrect_for_deepslate_emerald_tool");
        public static final TagKey<Block> INCORRECT_FOR_END_DIAMOND_TOOL = register("incorrect_for_end_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_VOID_TOOL = register("incorrect_for_void_tool");
        public static final TagKey<Block> INCORRECT_FOR_ONETHDENDERITE_TOOL = register("incorrect_for_onethdenderite_tool");
        public static final TagKey<Block> INCORRECT_FOR_OLED_TOOL = register("incorrect_for_oled_tool");
        public static final TagKey<Block> INCORRECT_FOR_ANCIENT_TOOL = register("incorrect_for_ancient_tool");
        public static final TagKey<Block> PAXEL_MINEABLE = register("mineable/paxel");


        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = register("needs_netherite_tool");
        public static final TagKey<Block> NEEDS_DEEPSLATE_EMERALD_TOOL = register("needs_deepslate_emerald_tool");
        public static final TagKey<Block> NEEDS_END_DIAMOND_TOOL = register("needs_end_diamond_tool");
        public static final TagKey<Block> NEEDS_VOID_TOOL = register("needs_void_tool");
        public static final TagKey<Block> NEEDS_ONETHDENDERITE_TOOL = register("needs_onethdenderite_tool");
        public static final TagKey<Block> NEEDS_OLED_TOOL = register("needs_oled_tool");
        public static final TagKey<Block> NEEDS_ANCIENT_TOOL = register("needs_ancient_tool");

        private static TagKey<Block> register(String path) {
            return TagKey.create(Registries.BLOCK, MoreToolsAndArmor.id(path));
        }
    }

    public static class ItemTags {
        public static final TagKey<Item> HAMMER_ENCHANTABLE = TagKey.create(Registries.ITEM, MoreToolsAndArmor.id("enchantable/hammer"));

        public static final TagKey<Item> BUDDING_AMETHYSTS = TagKey.create(Registries.ITEM, MoreToolsAndArmor.id("budding_amethysts"));
        public static final TagKey<Item> DEEPSLATE_EMERALDS = TagKey.create(Registries.ITEM, MoreToolsAndArmor.id("deepslate_emeralds"));
        public static final TagKey<Item> END_DIAMONDS = TagKey.create(Registries.ITEM, MoreToolsAndArmor.id("end_diamonds"));
        public static final TagKey<Item> VOID_INGOTS = TagKey.create(Registries.ITEM, MoreToolsAndArmor.id("void_ingots"));
        public static final TagKey<Item> ONETHDENDERITE_INGOTS = TagKey.create(Registries.ITEM, MoreToolsAndArmor.id("onethdenderite_ingots"));
        public static final TagKey<Item> OLED_INGOTS = TagKey.create(Registries.ITEM, MoreToolsAndArmor.id("oled_ingots"));
        public static final TagKey<Item> ANCIENT_INGOTS = TagKey.create(Registries.ITEM, MoreToolsAndArmor.id("ancient_ingots"));
    }
}
