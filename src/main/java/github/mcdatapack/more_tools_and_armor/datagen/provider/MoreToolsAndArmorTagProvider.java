package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class MoreToolsAndArmorTagProvider{
    public static class BlockTagProvider extends FabricTagProvider.BlockTagProvider {
        public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL);
            getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL);
            getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL);
            getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL);
            getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL);
            getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL);
            getOrCreateTagBuilder(TagList.BlockTags.INCORRECT_FOR_DEEPSLATE_EMERALD_TOOL);
            getOrCreateTagBuilder(TagList.BlockTags.INCORRECT_FOR_END_DIAMOND_TOOL);
            getOrCreateTagBuilder(TagList.BlockTags.INCORRECT_FOR_VOID_TOOL);
            getOrCreateTagBuilder(TagList.BlockTags.INCORRECT_FOR_ONETHDENDERITE_TOOL);
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
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
            getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                    .add(BlockInit.SCULK_EMERALD_ORE);
            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                    .add(BlockInit.END_IRON_ORE)
                    .add(BlockInit.END_COPPER_ORE)
                    .add(BlockInit.END_LAPIS_LAZULI_ORE);
            getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                    .add(BlockInit.END_GOLD_ORE)
                    .add(BlockInit.END_EMERALD_ORE)
                    .add(BlockInit.END_REDSTONE_ORE)
                    .add(BlockInit.END_DIAMOND_ORE)
                    .add(BlockInit.SCULK_EMERALD_ORE)
                    .add(BlockInit.BLACKSTONE_EMERALD_ORE);
            getOrCreateTagBuilder(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .add(BlockInit.DEEPSLATE_EMERALD_BLOCK)
                    .add(BlockInit.END_DIAMOND_BLOCK)
                    .add(BlockInit.SCULK_EMERALD_BLOCK)
                    .add(BlockInit.BLACKSTONE_EMERALD_BLOCK);
            getOrCreateTagBuilder(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .add(BlockInit.END_EMERALD_BLOCK);
        }
    }
    public static class ItemTagProvider extends FabricTagProvider.ItemTagProvider {
        public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            getOrCreateTagBuilder(ItemTags.SWORDS)
                    .add(ItemInit.BUDDING_AMETHYST_SWORD, ItemInit.COAL_SWORD, ItemInit.LAPIS_SWORD, ItemInit.REDSTONE_SWORD)
                    .add(ItemInit.COPPER_SWORD)
                    .add(ItemInit.EMERALD_SWORD)
                    .add(ItemInit.OBSIDIAN_SWORD)
                    .add(ItemInit.DEEPSLATE_EMERALD_SWORD)
                    .add(ItemInit.END_DIAMOND_SWORD)
                    .add(ItemInit.VOID_SWORD)
                    .add(ItemInit.ONETHDENDERITE_SWORD)
                    .add(ItemInit.OLED_SWORD)
                    .add(ItemInit.ANCIENT_SWORD);
            getOrCreateTagBuilder(ItemTags.AXES)
                    .add(ItemInit.BUDDING_AMETHYST_AXE, ItemInit.COAL_AXE, ItemInit.LAPIS_AXE, ItemInit.REDSTONE_AXE)
                    .add(ItemInit.COPPER_AXE)
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
            getOrCreateTagBuilder(ItemTags.PICKAXES)
                    .add(ItemInit.BUDDING_AMETHYST_PICKAXE, ItemInit.COAL_PICKAXE, ItemInit.LAPIS_PICKAXE, ItemInit.REDSTONE_PICKAXE)
                    .add(ItemInit.COPPER_PICKAXE)
                    .add(ItemInit.EMERALD_PICKAXE)
                    .add(ItemInit.OBSIDIAN_PICKAXE)
                    .add(ItemInit.DEEPSLATE_EMERALD_PICKAXE)
                    .add(ItemInit.END_DIAMOND_PICKAXE)
                    .add(ItemInit.VOID_PICKAXE)
                    .add(ItemInit.ONETHDENDERITE_PICKAXE)
                    .add(ItemInit.OLED_PICKAXE)
                    .add(ItemInit.ANCIENT_PICKAXE);
            getOrCreateTagBuilder(ItemTags.SHOVELS)
                    .add(ItemInit.BUDDING_AMETHYST_SHOVEL, ItemInit.COAL_SHOVEL, ItemInit.LAPIS_SHOVEL, ItemInit.REDSTONE_SHOVEL)
                    .add(ItemInit.COPPER_SHOVEL)
                    .add(ItemInit.EMERALD_SHOVEL)
                    .add(ItemInit.OBSIDIAN_SHOVEL)
                    .add(ItemInit.DEEPSLATE_EMERALD_SHOVEL)
                    .add(ItemInit.END_DIAMOND_SHOVEL)
                    .add(ItemInit.VOID_SHOVEL)
                    .add(ItemInit.ONETHDENDERITE_SHOVEL)
                    .add(ItemInit.OLED_SHOVEL)
                    .add(ItemInit.ANCIENT_SHOVEL);
            getOrCreateTagBuilder(ItemTags.HOES)
                    .add(ItemInit.BUDDING_AMETHYST_HOE, ItemInit.COAL_HOE, ItemInit.LAPIS_HOE, ItemInit.REDSTONE_HOE)
                    .add(ItemInit.COPPER_HOE)
                    .add(ItemInit.EMERALD_HOE)
                    .add(ItemInit.OBSIDIAN_HOE)
                    .add(ItemInit.DEEPSLATE_EMERALD_HOE)
                    .add(ItemInit.END_DIAMOND_HOE)
                    .add(ItemInit.VOID_HOE)
                    .add(ItemInit.ONETHDENDERITE_HOE)
                    .add(ItemInit.OLED_HOE)
                    .add(ItemInit.ANCIENT_HOE);
            getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                    .add(ItemInit.BUDDING_AMETHYST_HELMET, ItemInit.COAL_HELMET, ItemInit.LAPIS_HELMET, ItemInit.REDSTONE_HELMET)
                    .add(ItemInit.COPPER_HELMET)
                    .add(ItemInit.EMERALD_HELMET)
                    .add(ItemInit.OBSIDIAN_HELMET)
                    .add(ItemInit.DEEPSLATE_EMERALD_HELMET)
                    .add(ItemInit.END_DIAMOND_HELMET)
                    .add(ItemInit.VOID_HELMET)
                    .add(ItemInit.ONETHDENDERITE_HELMET)
                    .add(ItemInit.OLED_HELMET)
                    .add(ItemInit.ANCIENT_HELMET);
            getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                    .add(ItemInit.BUDDING_AMETHYST_CHESTPLATE, ItemInit.COAL_CHESTPLATE, ItemInit.LAPIS_CHESTPLATE, ItemInit.REDSTONE_CHESTPLATE)
                    .add(ItemInit.COPPER_CHESTPLATE)
                    .add(ItemInit.EMERALD_CHESTPLATE)
                    .add(ItemInit.OBSIDIAN_CHESTPLATE)
                    .add(ItemInit.DEEPSLATE_EMERALD_CHESTPLATE)
                    .add(ItemInit.END_DIAMOND_CHESTPLATE)
                    .add(ItemInit.VOID_CHESTPLATE)
                    .add(ItemInit.ONETHDENDERITE_CHESTPLATE)
                    .add(ItemInit.OLED_CHESTPLATE)
                    .add(ItemInit.ANCIENT_CHESTPLATE);
            getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                    .add(ItemInit.BUDDING_AMETHYST_LEGGINGS, ItemInit.COAL_LEGGINGS, ItemInit.LAPIS_LEGGINGS, ItemInit.REDSTONE_LEGGINGS)
                    .add(ItemInit.COPPER_LEGGINGS)
                    .add(ItemInit.EMERALD_LEGGINGS)
                    .add(ItemInit.OBSIDIAN_LEGGINGS)
                    .add(ItemInit.DEEPSLATE_EMERALD_LEGGINGS)
                    .add(ItemInit.END_DIAMOND_LEGGINGS)
                    .add(ItemInit.VOID_LEGGINGS)
                    .add(ItemInit.ONETHDENDERITE_LEGGINGS)
                    .add(ItemInit.OLED_LEGGINGS)
                    .add(ItemInit.ANCIENT_LEGGINGS);
            getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                    .add(ItemInit.BUDDING_AMETHYST_BOOTS, ItemInit.COAL_BOOTS, ItemInit.LAPIS_BOOTS, ItemInit.REDSTONE_BOOTS)
                    .add(ItemInit.COPPER_BOOTS)
                    .add(ItemInit.EMERALD_BOOTS)
                    .add(ItemInit.OBSIDIAN_BOOTS)
                    .add(ItemInit.DEEPSLATE_EMERALD_BOOTS)
                    .add(ItemInit.END_DIAMOND_BOOTS)
                    .add(ItemInit.VOID_BOOTS)
                    .add(ItemInit.ONETHDENDERITE_BOOTS)
                    .add(ItemInit.OLED_BOOTS)
                    .add(ItemInit.ANCIENT_BOOTS);
            getOrCreateTagBuilder(TagList.ItemTags.HAMMER_ENCHANTABLE)
                    .add(ItemInit.WOODEN_HAMMER, ItemInit.STONE_HAMMER, ItemInit.IRON_HAMMER, ItemInit.GOLDEN_HAMMER, ItemInit.DIAMOND_HAMMER, ItemInit.COAL_HAMMER, ItemInit.LAPIS_HAMMER,
                            ItemInit.REDSTONE_HAMMER,
                            ItemInit.NETHERITE_HAMMER, ItemInit.COPPER_HAMMER, ItemInit.BUDDING_AMETHYST_HAMMER, ItemInit.EMERALD_HAMMER, ItemInit.OBSIDIAN_HAMMER,
                            ItemInit.DEEPSLATE_EMERALD_HAMMER, ItemInit.END_DIAMOND_HAMMER, ItemInit.VOID_HAMMER, ItemInit.ONETHDENDERITE_HAMMER, ItemInit.OLED_HAMMER, ItemInit.ANCIENT_HAMMER);
            getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                    .addTag(TagList.ItemTags.HAMMER_ENCHANTABLE);
            getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                    .addTag(TagList.ItemTags.HAMMER_ENCHANTABLE);
        }
    }
}
