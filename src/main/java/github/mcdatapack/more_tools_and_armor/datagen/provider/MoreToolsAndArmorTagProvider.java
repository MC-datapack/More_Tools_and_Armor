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

import static github.mcdatapack.more_tools_and_armor.init.ItemInit.*;

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
                    .add(BlockInit.BLACKSTONE_EMERALD_BLOCK);
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
                    .add(BUDDING_AMETHYST_SWORD)
                    .add(COPPER_SWORD)
                    .add(EMERALD_SWORD)
                    .add(OBSIDIAN_SWORD)
                    .add(DEEPSLATE_EMERALD_SWORD)
                    .add(END_DIAMOND_SWORD)
                    .add(VOID_SWORD)
                    .add(ONETHDENDERITE_SWORD);
            getOrCreateTagBuilder(ItemTags.AXES)
                    .add(BUDDING_AMETHYST_AXE)
                    .add(COPPER_AXE)
                    .add(EMERALD_AXE)
                    .add(OBSIDIAN_AXE)
                    .add(DEEPSLATE_EMERALD_AXE)
                    .add(END_DIAMOND_AXE)
                    .add(VOID_AXE)
                    .add(ONETHDENDERITE_AXE);
            getOrCreateTagBuilder(ItemTags.PICKAXES)
                    .add(BUDDING_AMETHYST_PICKAXE)
                    .add(COPPER_PICKAXE)
                    .add(EMERALD_PICKAXE)
                    .add(OBSIDIAN_PICKAXE)
                    .add(DEEPSLATE_EMERALD_PICKAXE)
                    .add(END_DIAMOND_PICKAXE)
                    .add(VOID_PICKAXE)
                    .add(ONETHDENDERITE_PICKAXE);
            getOrCreateTagBuilder(ItemTags.SHOVELS)
                    .add(BUDDING_AMETHYST_SHOVEL)
                    .add(COPPER_SHOVEL)
                    .add(EMERALD_SHOVEL)
                    .add(OBSIDIAN_SHOVEL)
                    .add(DEEPSLATE_EMERALD_SHOVEL)
                    .add(END_DIAMOND_SHOVEL)
                    .add(VOID_SHOVEL)
                    .add(ONETHDENDERITE_SHOVEL);
            getOrCreateTagBuilder(ItemTags.HOES)
                    .add(BUDDING_AMETHYST_HOE)
                    .add(COPPER_HOE)
                    .add(EMERALD_HOE)
                    .add(OBSIDIAN_HOE)
                    .add(DEEPSLATE_EMERALD_HOE)
                    .add(END_DIAMOND_HOE)
                    .add(VOID_HOE)
                    .add(ONETHDENDERITE_HOE);
            getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                    .add(BUDDING_AMETHYST_HELMET)
                    .add(COPPER_HELMET)
                    .add(EMERALD_HELMET)
                    .add(OBSIDIAN_HELMET)
                    .add(DEEPSLATE_EMERALD_HELMET)
                    .add(END_DIAMOND_HELMET)
                    .add(VOID_HELMET)
                    .add(ONETHDENDERITE_HELMET);
            getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                    .add(BUDDING_AMETHYST_CHESTPLATE)
                    .add(COPPER_CHESTPLATE)
                    .add(EMERALD_CHESTPLATE)
                    .add(OBSIDIAN_CHESTPLATE)
                    .add(DEEPSLATE_EMERALD_CHESTPLATE)
                    .add(END_DIAMOND_CHESTPLATE)
                    .add(VOID_CHESTPLATE)
                    .add(ONETHDENDERITE_CHESTPLATE);
            getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                    .add(BUDDING_AMETHYST_LEGGINGS)
                    .add(COPPER_LEGGINGS)
                    .add(EMERALD_LEGGINGS)
                    .add(OBSIDIAN_LEGGINGS)
                    .add(DEEPSLATE_EMERALD_LEGGINGS)
                    .add(END_DIAMOND_LEGGINGS)
                    .add(VOID_LEGGINGS)
                    .add(ONETHDENDERITE_LEGGINGS);
            getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                    .add(BUDDING_AMETHYST_BOOTS)
                    .add(COPPER_BOOTS)
                    .add(EMERALD_BOOTS)
                    .add(OBSIDIAN_BOOTS)
                    .add(DEEPSLATE_EMERALD_BOOTS)
                    .add(END_DIAMOND_BOOTS)
                    .add(VOID_BOOTS)
                    .add(ONETHDENDERITE_BOOTS);
            getOrCreateTagBuilder(ItemTags.PIGLIN_SAFE_ARMOR)
                    .add(DEEPSLATE_EMERALD_BOOTS)
                    .add(DEEPSLATE_EMERALD_LEGGINGS)
                    .add(DEEPSLATE_EMERALD_CHESTPLATE)
                    .add(DEEPSLATE_EMERALD_HELMET)
                    .add(END_DIAMOND_BOOTS)
                    .add(END_DIAMOND_LEGGINGS)
                    .add(END_DIAMOND_CHESTPLATE)
                    .add(END_DIAMOND_HELMET)
                    .add(VOID_BOOTS)
                    .add(VOID_LEGGINGS)
                    .add(VOID_CHESTPLATE)
                    .add(VOID_HELMET)
                    .add(ONETHDENDERITE_BOOTS)
                    .add(ONETHDENDERITE_LEGGINGS)
                    .add(ONETHDENDERITE_CHESTPLATE)
                    .add(ONETHDENDERITE_HELMET);
        }
    }
}
