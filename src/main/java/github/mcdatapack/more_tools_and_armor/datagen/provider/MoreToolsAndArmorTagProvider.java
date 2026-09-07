package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class MoreToolsAndArmorTagProvider{
    public static class BlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
        public BlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
            super(output, registryLookupFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            builder(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            builder(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            builder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            builder(BlockTags.INCORRECT_FOR_IRON_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            builder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            builder(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            builder(TagList.BlockTags.INCORRECT_FOR_DEEPSLATE_EMERALD_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            builder(TagList.BlockTags.INCORRECT_FOR_END_DIAMOND_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            builder(TagList.BlockTags.INCORRECT_FOR_VOID_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            builder(TagList.BlockTags.INCORRECT_FOR_ONETHDENDERITE_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            builder(TagList.BlockTags.INCORRECT_FOR_OLED_TOOL)
                    .addTag(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
            builder(TagList.BlockTags.INCORRECT_FOR_ANCIENT_TOOL);
            builder(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(BlockInit.DEEPSLATE_EMERALD_BLOCK.properties().blockId())
                    .add(BlockInit.END_DIAMOND_BLOCK.properties().blockId())
                    .add(BlockInit.END_COAL_ORE.properties().blockId())
                    .add(BlockInit.END_COPPER_ORE.properties().blockId())
                    .add(BlockInit.END_IRON_ORE.properties().blockId())
                    .add(BlockInit.END_GOLD_ORE.properties().blockId())
                    .add(BlockInit.END_LAPIS_LAZULI_ORE.properties().blockId())
                    .add(BlockInit.END_EMERALD_ORE.properties().blockId())
                    .add(BlockInit.END_REDSTONE_ORE.properties().blockId())
                    .add(BlockInit.END_DIAMOND_ORE.properties().blockId())
                    .add(BlockInit.END_EMERALD_BLOCK.properties().blockId())
                    .add(BlockInit.BLACKSTONE_EMERALD_ORE.properties().blockId())
                    .add(BlockInit.SCULK_EMERALD_BLOCK.properties().blockId())
                    .add(BlockInit.BLACKSTONE_EMERALD_BLOCK.properties().blockId())
                    .add(BlockInit.OVERWORLD_UNSTABLE_ORE.properties().blockId())
                    .add(BlockInit.NETHER_UNSTABLE_ORE.properties().blockId())
                    .add(BlockInit.END_UNSTABLE_ORE.properties().blockId());
            builder(BlockTags.MINEABLE_WITH_HOE)
                    .add(BlockInit.SCULK_EMERALD_ORE.properties().blockId());
            builder(BlockTags.NEEDS_STONE_TOOL)
                    .add(BlockInit.END_IRON_ORE.properties().blockId())
                    .add(BlockInit.END_COPPER_ORE.properties().blockId())
                    .add(BlockInit.END_LAPIS_LAZULI_ORE.properties().blockId());
            builder(BlockTags.NEEDS_IRON_TOOL)
                    .add(BlockInit.END_GOLD_ORE.properties().blockId())
                    .add(BlockInit.END_EMERALD_ORE.properties().blockId())
                    .add(BlockInit.END_REDSTONE_ORE.properties().blockId())
                    .add(BlockInit.END_DIAMOND_ORE.properties().blockId())
                    .add(BlockInit.SCULK_EMERALD_ORE.properties().blockId())
                    .add(BlockInit.BLACKSTONE_EMERALD_ORE.properties().blockId());
            builder(TagList.BlockTags.NEEDS_NETHERITE_TOOL)
                    .add(BlockInit.DEEPSLATE_EMERALD_BLOCK.properties().blockId())
                    .add(BlockInit.END_DIAMOND_BLOCK.properties().blockId())
                    .add(BlockInit.SCULK_EMERALD_BLOCK.properties().blockId())
                    .add(BlockInit.BLACKSTONE_EMERALD_BLOCK.properties().blockId());
            builder(TagList.BlockTags.NEEDS_DEEPSLATE_EMERALD_TOOL)
                    .add(BlockInit.END_EMERALD_BLOCK.properties().blockId());
            builder(TagList.BlockTags.NEEDS_END_DIAMOND_TOOL);
            builder(TagList.BlockTags.NEEDS_VOID_TOOL);
            builder(TagList.BlockTags.NEEDS_ONETHDENDERITE_TOOL);
            builder(TagList.BlockTags.NEEDS_OLED_TOOL);
            builder(TagList.BlockTags.NEEDS_ANCIENT_TOOL);
        }
    }
    public static class ItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
        public ItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
            super(output, registryLookupFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            Registry<Item> registry = BuiltInRegistries.ITEM;
            builder(ItemTags.SWORDS)
                    .add(registry.getResourceKey(ItemInit.BUDDING_AMETHYST_SWORD).get(), registry.getResourceKey(ItemInit.COAL_SWORD).get(),
                            registry.getResourceKey(ItemInit.LAPIS_SWORD).get(), registry.getResourceKey(ItemInit.REDSTONE_SWORD).get())
                    .add(registry.getResourceKey(ItemInit.EMERALD_SWORD).get())
                    .add(registry.getResourceKey(ItemInit.OBSIDIAN_SWORD).get())
                    .add(registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_SWORD).get())
                    .add(registry.getResourceKey(ItemInit.END_DIAMOND_SWORD).get())
                    .add(registry.getResourceKey(ItemInit.VOID_SWORD).get())
                    .add(registry.getResourceKey(ItemInit.ONETHDENDERITE_SWORD).get())
                    .add(registry.getResourceKey(ItemInit.OLED_SWORD).get())
                    .add(registry.getResourceKey(ItemInit.ANCIENT_SWORD).get());
            builder(ItemTags.AXES)
                    .add(registry.getResourceKey(ItemInit.BUDDING_AMETHYST_AXE).get(), registry.getResourceKey(ItemInit.COAL_AXE).get(),
                            registry.getResourceKey(ItemInit.LAPIS_AXE).get(), registry.getResourceKey(ItemInit.REDSTONE_AXE).get())
                    .add(registry.getResourceKey(ItemInit.EMERALD_AXE).get())
                    .add(registry.getResourceKey(ItemInit.OBSIDIAN_AXE).get())
                    .add(registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_AXE).get())
                    .add(registry.getResourceKey(ItemInit.END_DIAMOND_AXE).get())
                    .add(registry.getResourceKey(ItemInit.VOID_AXE).get())
                    .add(registry.getResourceKey(ItemInit.ONETHDENDERITE_AXE).get())
                    .add(registry.getResourceKey(ItemInit.OLED_AXE).get())
                    .add(registry.getResourceKey(ItemInit.ANCIENT_AXE).get())
                    .add(registry.getResourceKey(ItemInit.WOODEN_PAXEL).get(), registry.getResourceKey(ItemInit.STONE_PAXEL).get(),
                            registry.getResourceKey(ItemInit.IRON_PAXEL).get(), registry.getResourceKey(ItemInit.GOLDEN_PAXEL).get(),
                            registry.getResourceKey(ItemInit.DIAMOND_PAXEL).get(), registry.getResourceKey(ItemInit.COAL_PAXEL).get(),
                            registry.getResourceKey(ItemInit.LAPIS_PAXEL).get(), registry.getResourceKey(ItemInit.REDSTONE_PAXEL).get(),
                            registry.getResourceKey(ItemInit.NETHERITE_PAXEL).get(), registry.getResourceKey(ItemInit.COPPER_PAXEL).get(),
                            registry.getResourceKey(ItemInit.BUDDING_AMETHYST_PAXEL).get(), registry.getResourceKey(ItemInit.EMERALD_PAXEL).get(),
                            registry.getResourceKey(ItemInit.OBSIDIAN_PAXEL).get(), registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_PAXEL).get(),
                            registry.getResourceKey(ItemInit.END_DIAMOND_PAXEL).get(), registry.getResourceKey(ItemInit.VOID_PAXEL).get(),
                            registry.getResourceKey(ItemInit.ONETHDENDERITE_PAXEL).get(), registry.getResourceKey(ItemInit.OLED_PAXEL).get(),
                            registry.getResourceKey(ItemInit.ANCIENT_PAXEL).get());
            builder(ItemTags.PICKAXES)
                    .add(registry.getResourceKey(ItemInit.BUDDING_AMETHYST_PICKAXE).get(), registry.getResourceKey(ItemInit.COAL_PICKAXE).get(),
                            registry.getResourceKey(ItemInit.LAPIS_PICKAXE).get(), registry.getResourceKey(ItemInit.REDSTONE_PICKAXE).get())
                    .add(registry.getResourceKey(ItemInit.EMERALD_PICKAXE).get())
                    .add(registry.getResourceKey(ItemInit.OBSIDIAN_PICKAXE).get())
                    .add(registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_PICKAXE).get())
                    .add(registry.getResourceKey(ItemInit.END_DIAMOND_PICKAXE).get())
                    .add(registry.getResourceKey(ItemInit.VOID_PICKAXE).get())
                    .add(registry.getResourceKey(ItemInit.ONETHDENDERITE_PICKAXE).get())
                    .add(registry.getResourceKey(ItemInit.OLED_PICKAXE).get())
                    .add(registry.getResourceKey(ItemInit.ANCIENT_PICKAXE).get());
            builder(ItemTags.SHOVELS)
                    .add(registry.getResourceKey(ItemInit.BUDDING_AMETHYST_SHOVEL).get(), registry.getResourceKey(ItemInit.COAL_SHOVEL).get(),
                            registry.getResourceKey(ItemInit.LAPIS_SHOVEL).get(), registry.getResourceKey(ItemInit.REDSTONE_SHOVEL).get())
                    .add(registry.getResourceKey(ItemInit.EMERALD_SHOVEL).get())
                    .add(registry.getResourceKey(ItemInit.OBSIDIAN_SHOVEL).get())
                    .add(registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_SHOVEL).get())
                    .add(registry.getResourceKey(ItemInit.END_DIAMOND_SHOVEL).get())
                    .add(registry.getResourceKey(ItemInit.VOID_SHOVEL).get())
                    .add(registry.getResourceKey(ItemInit.ONETHDENDERITE_SHOVEL).get())
                    .add(registry.getResourceKey(ItemInit.OLED_SHOVEL).get())
                    .add(registry.getResourceKey(ItemInit.ANCIENT_SHOVEL).get());
            builder(ItemTags.HOES)
                    .add(registry.getResourceKey(ItemInit.BUDDING_AMETHYST_HOE).get(), registry.getResourceKey(ItemInit.COAL_HOE).get(),
                            registry.getResourceKey(ItemInit.LAPIS_HOE).get(), registry.getResourceKey(ItemInit.REDSTONE_HOE).get())
                    .add(registry.getResourceKey(ItemInit.EMERALD_HOE).get())
                    .add(registry.getResourceKey(ItemInit.OBSIDIAN_HOE).get())
                    .add(registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_HOE).get())
                    .add(registry.getResourceKey(ItemInit.END_DIAMOND_HOE).get())
                    .add(registry.getResourceKey(ItemInit.VOID_HOE).get())
                    .add(registry.getResourceKey(ItemInit.ONETHDENDERITE_HOE).get())
                    .add(registry.getResourceKey(ItemInit.OLED_HOE).get())
                    .add(registry.getResourceKey(ItemInit.ANCIENT_HOE).get());
            builder(ItemTags.HEAD_ARMOR)
                    .add(registry.getResourceKey(ItemInit.BUDDING_AMETHYST_HELMET).get(), registry.getResourceKey(ItemInit.COAL_HELMET).get(),
                            registry.getResourceKey(ItemInit.LAPIS_HELMET).get(), registry.getResourceKey(ItemInit.REDSTONE_HELMET).get())
                    .add(registry.getResourceKey(ItemInit.EMERALD_HELMET).get())
                    .add(registry.getResourceKey(ItemInit.OBSIDIAN_HELMET).get())
                    .add(registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_HELMET).get())
                    .add(registry.getResourceKey(ItemInit.END_DIAMOND_HELMET).get())
                    .add(registry.getResourceKey(ItemInit.VOID_HELMET).get())
                    .add(registry.getResourceKey(ItemInit.ONETHDENDERITE_HELMET).get())
                    .add(registry.getResourceKey(ItemInit.OLED_HELMET).get())
                    .add(registry.getResourceKey(ItemInit.ANCIENT_HELMET).get());
            builder(ItemTags.CHEST_ARMOR)
                    .add(registry.getResourceKey(ItemInit.BUDDING_AMETHYST_CHESTPLATE).get(), registry.getResourceKey(ItemInit.COAL_CHESTPLATE).get(),
                            registry.getResourceKey(ItemInit.LAPIS_CHESTPLATE).get(), registry.getResourceKey(ItemInit.REDSTONE_CHESTPLATE).get())
                    .add(registry.getResourceKey(ItemInit.EMERALD_CHESTPLATE).get())
                    .add(registry.getResourceKey(ItemInit.OBSIDIAN_CHESTPLATE).get())
                    .add(registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_CHESTPLATE).get())
                    .add(registry.getResourceKey(ItemInit.END_DIAMOND_CHESTPLATE).get())
                    .add(registry.getResourceKey(ItemInit.VOID_CHESTPLATE).get())
                    .add(registry.getResourceKey(ItemInit.ONETHDENDERITE_CHESTPLATE).get())
                    .add(registry.getResourceKey(ItemInit.OLED_CHESTPLATE).get())
                    .add(registry.getResourceKey(ItemInit.ANCIENT_CHESTPLATE).get());
            builder(ItemTags.LEG_ARMOR)
                    .add(registry.getResourceKey(ItemInit.BUDDING_AMETHYST_LEGGINGS).get(), registry.getResourceKey(ItemInit.COAL_LEGGINGS).get(),
                            registry.getResourceKey(ItemInit.LAPIS_LEGGINGS).get(), registry.getResourceKey(ItemInit.REDSTONE_LEGGINGS).get())
                    .add(registry.getResourceKey(ItemInit.EMERALD_LEGGINGS).get())
                    .add(registry.getResourceKey(ItemInit.OBSIDIAN_LEGGINGS).get())
                    .add(registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_LEGGINGS).get())
                    .add(registry.getResourceKey(ItemInit.END_DIAMOND_LEGGINGS).get())
                    .add(registry.getResourceKey(ItemInit.VOID_LEGGINGS).get())
                    .add(registry.getResourceKey(ItemInit.ONETHDENDERITE_LEGGINGS).get())
                    .add(registry.getResourceKey(ItemInit.OLED_LEGGINGS).get())
                    .add(registry.getResourceKey(ItemInit.ANCIENT_LEGGINGS).get());
            builder(ItemTags.FOOT_ARMOR)
                    .add(registry.getResourceKey(ItemInit.BUDDING_AMETHYST_BOOTS).get(), registry.getResourceKey(ItemInit.COAL_BOOTS).get(),
                            registry.getResourceKey(ItemInit.LAPIS_BOOTS).get(), registry.getResourceKey(ItemInit.REDSTONE_BOOTS).get())
                    .add(registry.getResourceKey(ItemInit.EMERALD_BOOTS).get())
                    .add(registry.getResourceKey(ItemInit.OBSIDIAN_BOOTS).get())
                    .add(registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_BOOTS).get())
                    .add(registry.getResourceKey(ItemInit.END_DIAMOND_BOOTS).get())
                    .add(registry.getResourceKey(ItemInit.VOID_BOOTS).get())
                    .add(registry.getResourceKey(ItemInit.ONETHDENDERITE_BOOTS).get())
                    .add(registry.getResourceKey(ItemInit.OLED_BOOTS).get())
                    .add(registry.getResourceKey(ItemInit.ANCIENT_BOOTS).get());
            builder(ItemTags.SPEARS)
                    .add(registry.getResourceKey(ItemInit.COAL_SPEAR).get(), registry.getResourceKey(ItemInit.LAPIS_SPEAR).get(),
                            registry.getResourceKey(ItemInit.REDSTONE_SPEAR).get(), registry.getResourceKey(ItemInit.BUDDING_AMETHYST_SPEAR).get(),
                            registry.getResourceKey(ItemInit.EMERALD_SPEAR).get(), registry.getResourceKey(ItemInit.OBSIDIAN_SPEAR).get(),
                            registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_SPEAR).get(), registry.getResourceKey(ItemInit.END_DIAMOND_SPEAR).get(),
                            registry.getResourceKey(ItemInit.VOID_SPEAR).get(), registry.getResourceKey(ItemInit.ONETHDENDERITE_SPEAR).get(),
                            registry.getResourceKey(ItemInit.OLED_SPEAR).get(), registry.getResourceKey(ItemInit.ANCIENT_SPEAR).get());
            builder(TagList.ItemTags.HAMMER_ENCHANTABLE)
                    .add(registry.getResourceKey(ItemInit.WOODEN_HAMMER).get(), registry.getResourceKey(ItemInit.STONE_HAMMER).get(),
                            registry.getResourceKey(ItemInit.IRON_HAMMER).get(), registry.getResourceKey(ItemInit.GOLDEN_HAMMER).get(),
                            registry.getResourceKey(ItemInit.DIAMOND_HAMMER).get(), registry.getResourceKey(ItemInit.COAL_HAMMER).get(),
                            registry.getResourceKey(ItemInit.LAPIS_HAMMER).get(), registry.getResourceKey(ItemInit.REDSTONE_HAMMER).get(),
                            registry.getResourceKey(ItemInit.NETHERITE_HAMMER).get(), registry.getResourceKey(ItemInit.COPPER_HAMMER).get(),
                            registry.getResourceKey(ItemInit.BUDDING_AMETHYST_HAMMER).get(), registry.getResourceKey(ItemInit.EMERALD_HAMMER).get(),
                            registry.getResourceKey(ItemInit.OBSIDIAN_HAMMER).get(), registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_HAMMER).get(),
                            registry.getResourceKey(ItemInit.END_DIAMOND_HAMMER).get(), registry.getResourceKey(ItemInit.VOID_HAMMER).get(),
                            registry.getResourceKey(ItemInit.ONETHDENDERITE_HAMMER).get(), registry.getResourceKey(ItemInit.OLED_HAMMER).get(),
                            registry.getResourceKey(ItemInit.ANCIENT_HAMMER).get());
            builder(ItemTags.DURABILITY_ENCHANTABLE)
                    .addTag(TagList.ItemTags.HAMMER_ENCHANTABLE);
            builder(ItemTags.MINING_ENCHANTABLE)
                    .addTag(TagList.ItemTags.HAMMER_ENCHANTABLE);
            builder(ItemTags.PIGLIN_SAFE_ARMOR)
                    .add(registry.getResourceKey(Items.NETHERITE_HELMET).get(), registry.getResourceKey(Items.NETHERITE_CHESTPLATE).get(),
                            registry.getResourceKey(Items.NETHERITE_LEGGINGS).get(), registry.getResourceKey(Items.NETHERITE_BOOTS).get(),
                            registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_HELMET).get(), registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_CHESTPLATE).get(),
                            registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_LEGGINGS).get(), registry.getResourceKey(ItemInit.DEEPSLATE_EMERALD_BOOTS).get(),
                            registry.getResourceKey(ItemInit.END_DIAMOND_HELMET).get(), registry.getResourceKey(ItemInit.END_DIAMOND_CHESTPLATE).get(),
                            registry.getResourceKey(ItemInit.END_DIAMOND_LEGGINGS).get(), registry.getResourceKey(ItemInit.END_DIAMOND_BOOTS).get(),
                            registry.getResourceKey(ItemInit.VOID_HELMET).get(), registry.getResourceKey(ItemInit.VOID_CHESTPLATE).get(),
                            registry.getResourceKey(ItemInit.VOID_LEGGINGS).get(), registry.getResourceKey(ItemInit.VOID_BOOTS).get(),
                            registry.getResourceKey(ItemInit.ONETHDENDERITE_HELMET).get(), registry.getResourceKey(ItemInit.ONETHDENDERITE_CHESTPLATE).get(),
                            registry.getResourceKey(ItemInit.ONETHDENDERITE_LEGGINGS).get(), registry.getResourceKey(ItemInit.ONETHDENDERITE_BOOTS).get(),
                            registry.getResourceKey(ItemInit.OLED_HELMET).get(), registry.getResourceKey(ItemInit.OLED_CHESTPLATE).get(),
                            registry.getResourceKey(ItemInit.OLED_LEGGINGS).get(), registry.getResourceKey(ItemInit.OLED_BOOTS).get(),
                            registry.getResourceKey(ItemInit.ANCIENT_HELMET).get(), registry.getResourceKey(ItemInit.ANCIENT_CHESTPLATE).get(),
                            registry.getResourceKey(ItemInit.ANCIENT_LEGGINGS).get(), registry.getResourceKey(ItemInit.ANCIENT_BOOTS).get());
        }
    }
}