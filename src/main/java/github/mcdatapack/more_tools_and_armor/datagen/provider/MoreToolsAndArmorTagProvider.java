package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class MoreToolsAndArmorTagProvider{
    public static class BlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
        public BlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
            super(output, registryLookupFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            valueLookupBuilder(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            valueLookupBuilder(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            valueLookupBuilder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            valueLookupBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            valueLookupBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            valueLookupBuilder(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            valueLookupBuilder(TagList.BlockTags.INCORRECT_FOR_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            valueLookupBuilder(TagList.BlockTags.INCORRECT_FOR_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            valueLookupBuilder(TagList.BlockTags.INCORRECT_FOR_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            valueLookupBuilder(TagList.BlockTags.INCORRECT_FOR_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            valueLookupBuilder(TagList.BlockTags.INCORRECT_FOR_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            valueLookupBuilder(TagList.BlockTags.INCORRECT_FOR_ANCIENT_TOOL);
            valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(BlockInit.DEEPSLATE_EMERALD_BLOCK)
                    .add(BlockInit.END_DIAMOND_BLOCK)
                    .add(BlockInit.END_COAL_ORE)
                    .add(BlockInit.END_COPPER_ORE)
                    .add(BlockInit.END_IRON_ORE)
                    .add(BlockInit.END_GOLD_ORE)
                    .add(BlockInit.END_LAPIS_LAZULI_ORE)
                    .add(BlockInit.END_EMERALD_ORE)
                    .add(BlockInit.END_REDSTONE_ORE)
                    .add(BlockInit.END_DIAMOND_ORE)
                    .add(BlockInit.END_EMERALD_BLOCK)
                    .add(BlockInit.BLACKSTONE_EMERALD_ORE)
                    .add(BlockInit.SCULK_EMERALD_BLOCK)
                    .add(BlockInit.BLACKSTONE_EMERALD_BLOCK)
                    .add(BlockInit.OVERWORLD_UNSTABLE_ORE)
                    .add(BlockInit.NETHER_UNSTABLE_ORE)
                    .add(BlockInit.END_UNSTABLE_ORE);
            valueLookupBuilder(BlockTags.MINEABLE_WITH_HOE)
                    .add(BlockInit.SCULK_EMERALD_ORE);
            valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
                    .add(BlockInit.END_IRON_ORE)
                    .add(BlockInit.END_COPPER_ORE)
                    .add(BlockInit.END_LAPIS_LAZULI_ORE);
            valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                    .add(BlockInit.END_GOLD_ORE)
                    .add(BlockInit.END_EMERALD_ORE)
                    .add(BlockInit.END_REDSTONE_ORE)
                    .add(BlockInit.END_DIAMOND_ORE)
                    .add(BlockInit.SCULK_EMERALD_ORE)
                    .add(BlockInit.BLACKSTONE_EMERALD_ORE);
            valueLookupBuilder(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .add(BlockInit.DEEPSLATE_EMERALD_BLOCK)
                    .add(BlockInit.END_DIAMOND_BLOCK)
                    .add(BlockInit.SCULK_EMERALD_BLOCK)
                    .add(BlockInit.BLACKSTONE_EMERALD_BLOCK);
            valueLookupBuilder(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .add(BlockInit.END_EMERALD_BLOCK);
            valueLookupBuilder(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL);
            valueLookupBuilder(TagList.BlockTags.NEEDS_VOID_TOOL);
            valueLookupBuilder(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL);
            valueLookupBuilder(TagList.BlockTags.NEEDS_OLED_TOOL);
            valueLookupBuilder(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
        }
    }
    public static class ItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
        public ItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
            super(output, registryLookupFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            valueLookupBuilder(ItemTags.SWORDS)
                    .add(ItemInit.BUDDING_AMETHYST_SWORD, ItemInit.COAL_SWORD, ItemInit.LAPIS_SWORD, ItemInit.REDSTONE_SWORD)
                    .add(ItemInit.EMERALD_SWORD)
                    .add(ItemInit.OBSIDIAN_SWORD)
                    .add(ItemInit.DEEPSLATE_EMERALD_SWORD)
                    .add(ItemInit.END_DIAMOND_SWORD)
                    .add(ItemInit.VOID_SWORD)
                    .add(ItemInit.ONETHDENDERITE_SWORD)
                    .add(ItemInit.OLED_SWORD)
                    .add(ItemInit.ANCIENT_SWORD);
            valueLookupBuilder(ItemTags.AXES)
                    .add(ItemInit.BUDDING_AMETHYST_AXE, ItemInit.COAL_AXE, ItemInit.LAPIS_AXE, ItemInit.REDSTONE_AXE)
                    .add(ItemInit.EMERALD_AXE)
                    .add(ItemInit.OBSIDIAN_AXE)
                    .add(ItemInit.DEEPSLATE_EMERALD_AXE)
                    .add(ItemInit.END_DIAMOND_AXE)
                    .add(ItemInit.VOID_AXE)
                    .add(ItemInit.ONETHDENDERITE_AXE)
                    .add(ItemInit.OLED_AXE)
                    .add(ItemInit.ANCIENT_AXE)
                    .add(ItemInit.WOODEN_PAXEL, ItemInit.STONE_PAXEL, ItemInit.IRON_PAXEL, ItemInit.GOLDEN_PAXEL, ItemInit.DIAMOND_PAXEL, ItemInit.COAL_PAXEL, ItemInit.LAPIS_PAXEL,
                            ItemInit.REDSTONE_PAXEL,
                            ItemInit.NETHERITE_PAXEL, ItemInit.COPPER_PAXEL, ItemInit.BUDDING_AMETHYST_PAXEL, ItemInit.EMERALD_PAXEL, ItemInit.OBSIDIAN_PAXEL,
                            ItemInit.DEEPSLATE_EMERALD_PAXEL, ItemInit.END_DIAMOND_PAXEL, ItemInit.VOID_PAXEL, ItemInit.ONETHDENDERITE_PAXEL, ItemInit.OLED_PAXEL, ItemInit.ANCIENT_PAXEL);
            valueLookupBuilder(ItemTags.PICKAXES)
                    .add(ItemInit.BUDDING_AMETHYST_PICKAXE, ItemInit.COAL_PICKAXE, ItemInit.LAPIS_PICKAXE, ItemInit.REDSTONE_PICKAXE)
                    .add(ItemInit.EMERALD_PICKAXE)
                    .add(ItemInit.OBSIDIAN_PICKAXE)
                    .add(ItemInit.DEEPSLATE_EMERALD_PICKAXE)
                    .add(ItemInit.END_DIAMOND_PICKAXE)
                    .add(ItemInit.VOID_PICKAXE)
                    .add(ItemInit.ONETHDENDERITE_PICKAXE)
                    .add(ItemInit.OLED_PICKAXE)
                    .add(ItemInit.ANCIENT_PICKAXE);
            valueLookupBuilder(ItemTags.SHOVELS)
                    .add(ItemInit.BUDDING_AMETHYST_SHOVEL, ItemInit.COAL_SHOVEL, ItemInit.LAPIS_SHOVEL, ItemInit.REDSTONE_SHOVEL)
                    .add(ItemInit.EMERALD_SHOVEL)
                    .add(ItemInit.OBSIDIAN_SHOVEL)
                    .add(ItemInit.DEEPSLATE_EMERALD_SHOVEL)
                    .add(ItemInit.END_DIAMOND_SHOVEL)
                    .add(ItemInit.VOID_SHOVEL)
                    .add(ItemInit.ONETHDENDERITE_SHOVEL)
                    .add(ItemInit.OLED_SHOVEL)
                    .add(ItemInit.ANCIENT_SHOVEL);
            valueLookupBuilder(ItemTags.HOES)
                    .add(ItemInit.BUDDING_AMETHYST_HOE, ItemInit.COAL_HOE, ItemInit.LAPIS_HOE, ItemInit.REDSTONE_HOE)
                    .add(ItemInit.EMERALD_HOE)
                    .add(ItemInit.OBSIDIAN_HOE)
                    .add(ItemInit.DEEPSLATE_EMERALD_HOE)
                    .add(ItemInit.END_DIAMOND_HOE)
                    .add(ItemInit.VOID_HOE)
                    .add(ItemInit.ONETHDENDERITE_HOE)
                    .add(ItemInit.OLED_HOE)
                    .add(ItemInit.ANCIENT_HOE);
            valueLookupBuilder(ItemTags.HEAD_ARMOR)
                    .add(ItemInit.BUDDING_AMETHYST_HELMET, ItemInit.COAL_HELMET, ItemInit.LAPIS_HELMET, ItemInit.REDSTONE_HELMET)
                    .add(ItemInit.EMERALD_HELMET)
                    .add(ItemInit.OBSIDIAN_HELMET)
                    .add(ItemInit.DEEPSLATE_EMERALD_HELMET)
                    .add(ItemInit.END_DIAMOND_HELMET)
                    .add(ItemInit.VOID_HELMET)
                    .add(ItemInit.ONETHDENDERITE_HELMET)
                    .add(ItemInit.OLED_HELMET)
                    .add(ItemInit.ANCIENT_HELMET);
            valueLookupBuilder(ItemTags.CHEST_ARMOR)
                    .add(ItemInit.BUDDING_AMETHYST_CHESTPLATE, ItemInit.COAL_CHESTPLATE, ItemInit.LAPIS_CHESTPLATE, ItemInit.REDSTONE_CHESTPLATE)
                    .add(ItemInit.EMERALD_CHESTPLATE)
                    .add(ItemInit.OBSIDIAN_CHESTPLATE)
                    .add(ItemInit.DEEPSLATE_EMERALD_CHESTPLATE)
                    .add(ItemInit.END_DIAMOND_CHESTPLATE)
                    .add(ItemInit.VOID_CHESTPLATE)
                    .add(ItemInit.ONETHDENDERITE_CHESTPLATE)
                    .add(ItemInit.OLED_CHESTPLATE)
                    .add(ItemInit.ANCIENT_CHESTPLATE);
            valueLookupBuilder(ItemTags.LEG_ARMOR)
                    .add(ItemInit.BUDDING_AMETHYST_LEGGINGS, ItemInit.COAL_LEGGINGS, ItemInit.LAPIS_LEGGINGS, ItemInit.REDSTONE_LEGGINGS)
                    .add(ItemInit.EMERALD_LEGGINGS)
                    .add(ItemInit.OBSIDIAN_LEGGINGS)
                    .add(ItemInit.DEEPSLATE_EMERALD_LEGGINGS)
                    .add(ItemInit.END_DIAMOND_LEGGINGS)
                    .add(ItemInit.VOID_LEGGINGS)
                    .add(ItemInit.ONETHDENDERITE_LEGGINGS)
                    .add(ItemInit.OLED_LEGGINGS)
                    .add(ItemInit.ANCIENT_LEGGINGS);
            valueLookupBuilder(ItemTags.FOOT_ARMOR)
                    .add(ItemInit.BUDDING_AMETHYST_BOOTS, ItemInit.COAL_BOOTS, ItemInit.LAPIS_BOOTS, ItemInit.REDSTONE_BOOTS)
                    .add(ItemInit.EMERALD_BOOTS)
                    .add(ItemInit.OBSIDIAN_BOOTS)
                    .add(ItemInit.DEEPSLATE_EMERALD_BOOTS)
                    .add(ItemInit.END_DIAMOND_BOOTS)
                    .add(ItemInit.VOID_BOOTS)
                    .add(ItemInit.ONETHDENDERITE_BOOTS)
                    .add(ItemInit.OLED_BOOTS)
                    .add(ItemInit.ANCIENT_BOOTS);
            valueLookupBuilder(ItemTags.SPEARS)
                    .add(ItemInit.COAL_SPEAR, ItemInit.LAPIS_SPEAR, ItemInit.REDSTONE_SPEAR, ItemInit.BUDDING_AMETHYST_SPEAR, ItemInit.EMERALD_SPEAR, ItemInit.OBSIDIAN_SPEAR,
                            ItemInit.DEEPSLATE_EMERALD_SPEAR, ItemInit.END_DIAMOND_SPEAR, ItemInit.VOID_SPEAR, ItemInit.ONETHDENDERITE_SPEAR, ItemInit.OLED_SPEAR, ItemInit.ANCIENT_SPEAR);
            valueLookupBuilder(TagList.ItemTags.HAMMER_ENCHANTABLE)
                    .add(ItemInit.WOODEN_HAMMER, ItemInit.STONE_HAMMER, ItemInit.IRON_HAMMER, ItemInit.GOLDEN_HAMMER, ItemInit.DIAMOND_HAMMER, ItemInit.COAL_HAMMER, ItemInit.LAPIS_HAMMER,
                            ItemInit.REDSTONE_HAMMER,
                            ItemInit.NETHERITE_HAMMER, ItemInit.COPPER_HAMMER, ItemInit.BUDDING_AMETHYST_HAMMER, ItemInit.EMERALD_HAMMER, ItemInit.OBSIDIAN_HAMMER,
                            ItemInit.DEEPSLATE_EMERALD_HAMMER, ItemInit.END_DIAMOND_HAMMER, ItemInit.VOID_HAMMER, ItemInit.ONETHDENDERITE_HAMMER, ItemInit.OLED_HAMMER, ItemInit.ANCIENT_HAMMER);
            valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                    .addTag(TagList.ItemTags.HAMMER_ENCHANTABLE);
            valueLookupBuilder(ItemTags.MINING_ENCHANTABLE)
                    .addTag(TagList.ItemTags.HAMMER_ENCHANTABLE);
            valueLookupBuilder(ItemTags.PIGLIN_SAFE_ARMOR)
                    .add(Items.NETHERITE_HELMET, Items.NETHERITE_CHESTPLATE, Items.NETHERITE_LEGGINGS, Items.NETHERITE_BOOTS,
                            ItemInit.DEEPSLATE_EMERALD_HELMET, ItemInit.DEEPSLATE_EMERALD_CHESTPLATE, ItemInit.DEEPSLATE_EMERALD_LEGGINGS, ItemInit.DEEPSLATE_EMERALD_BOOTS,
                            ItemInit.END_DIAMOND_HELMET, ItemInit.END_DIAMOND_CHESTPLATE, ItemInit.END_DIAMOND_LEGGINGS, ItemInit.END_DIAMOND_BOOTS,
                            ItemInit.VOID_HELMET, ItemInit.VOID_CHESTPLATE, ItemInit.VOID_LEGGINGS, ItemInit.VOID_BOOTS,
                            ItemInit.ONETHDENDERITE_HELMET, ItemInit.ONETHDENDERITE_CHESTPLATE, ItemInit.ONETHDENDERITE_LEGGINGS, ItemInit.ONETHDENDERITE_BOOTS,
                            ItemInit.OLED_HELMET, ItemInit.OLED_CHESTPLATE, ItemInit.OLED_LEGGINGS, ItemInit.OLED_BOOTS,
                            ItemInit.ANCIENT_HELMET, ItemInit.ANCIENT_CHESTPLATE, ItemInit.ANCIENT_LEGGINGS, ItemInit.ANCIENT_BOOTS);
        }
    }
}
