package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

import static github.mcdatapack.more_tools_and_armor.init.BlockInit.*;
import static github.mcdatapack.more_tools_and_armor.init.ItemInit.*;
import static net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags.*;
import static net.minecraft.item.Items.*;

public class MoreToolsAndArmorRecipeProvider extends FabricRecipeProvider {
    public MoreToolsAndArmorRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter exporter) {
        return new RecipeGenerator(wrapperLookup, exporter) {
            @Override
            public void generate() {
                RegistryEntryLookup<Item> itemLookup = wrapperLookup.getOrThrow(RegistryKeys.ITEM);

                upgradeRecipe(DIAMOND, OVERWORLD_SHARD, EMERALD, DEEPSLATE_EMERALD,itemLookup, exporter);
                upgradeRecipe(DIAMOND, OVERWORLD_SHARD, SCULK, SCULK_EMERALD,itemLookup, exporter);
                upgradeRecipe(DIAMOND, NETHER_SHARD, EMERALD, BLACKSTONE_EMERALD,itemLookup, exporter);
                upgradeRecipe(DIAMOND, END_SHARD, EMERALD, END_EMERALD,itemLookup, exporter);
                upgradeRecipe(DIAMOND, END_SHARD, DIAMOND, END_DIAMOND,itemLookup, exporter);

                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.BUILDING_BLOCKS, ANCIENT_HONEY_BLOCK)
                        .input('A', ANCIENT_HONEY_BOTTLE)
                        .pattern("AA")
                        .pattern("AA")
                        .criterion(hasItem(ANCIENT_HONEY_BOTTLE), conditionsFromItem(ANCIENT_HONEY_BOTTLE))
                        .offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, ANCIENT_HONEY_BOTTLE, 4)
                        .input(ANCIENT_HONEY_BLOCK)
                        .input(GLASS_BOTTLE)
                        .input(GLASS_BOTTLE)
                        .input(GLASS_BOTTLE)
                        .input(GLASS_BOTTLE)
                        .criterion(hasItem(ANCIENT_HONEY_BLOCK), conditionsFromItem(ANCIENT_HONEY_BLOCK))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, ANCIENT_INGOT)
                        .input('A', ANCIENT_HONEY_BLOCK)
                        .input('B', BAT_WING)
                        .input('C', ANCIENT_COIN)
                        .input('D', TORCHFLOWER)
                        .input('E', DEEPSLATE_EMERALD)
                        .pattern("EDE")
                        .pattern("ACA")
                        .pattern("EBE")
                        .criterion(hasItem(DEEPSLATE_EMERALD), conditionsFromItem(DEEPSLATE_EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, ANCIENT_UPGRADE_SMITHING_TEMPLATE)
                        .input('A', DIAMOND)
                        .input('B', ANCIENT_INGOT)
                        .input('C', OLED_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .criterion(hasItem(ANCIENT_INGOT), conditionsFromItem(ANCIENT_INGOT))
                        .offerTo(exporter, "ancient_upgrade_smithing_template");
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, ANCIENT_UPGRADE_SMITHING_TEMPLATE, 2)
                        .input('A', DIAMOND)
                        .input('B', ANCIENT_INGOT)
                        .input('C', ANCIENT_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .criterion(hasItem(ANCIENT_INGOT), conditionsFromItem(ANCIENT_INGOT))
                        .offerTo(exporter, "ancient_upgrade_smithing_template_dupe");



                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, DEEPSLATE_EMERALD, 9)
                        .input(DEEPSLATE_EMERALD_BLOCK)
                        .criterion(hasItem(DEEPSLATE_EMERALD), conditionsFromItem(DEEPSLATE_EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.BUILDING_BLOCKS, DEEPSLATE_EMERALD_BLOCK)
                        .input('A', DEEPSLATE_EMERALD)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .criterion(hasItem(DEEPSLATE_EMERALD), conditionsFromItem(DEEPSLATE_EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, ItemInit.DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE, 2)
                        .input('A', DIAMOND)
                        .input('B', DEEPSLATE_EMERALD)
                        .input('C', NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .criterion(hasItem(DEEPSLATE_EMERALD), conditionsFromItem(DEEPSLATE_EMERALD))
                        .offerTo(exporter, "deepslate_emerald_upgrade_smithing_template");
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE, 2)
                        .input('A', DIAMOND)
                        .input('B', DEEPSLATE_EMERALD)
                        .input('C', DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .criterion(hasItem(DEEPSLATE_EMERALD), conditionsFromItem(DEEPSLATE_EMERALD))
                        .offerTo(exporter, "deepslate_emerald_upgrade_smithing_template_dupe");
                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, END_DIAMOND, 9)
                        .input(END_DIAMOND_BLOCK)
                        .criterion(hasItem(END_DIAMOND), conditionsFromItem(END_DIAMOND))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.BUILDING_BLOCKS, END_DIAMOND_BLOCK)
                        .input('A', END_DIAMOND)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .criterion(hasItem(END_DIAMOND), conditionsFromItem(END_DIAMOND))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, END_DIAMOND_UPGRADE_SMITHING_TEMPLATE)
                        .input('A', DIAMOND)
                        .input('B', END_DIAMOND)
                        .input('C', DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .criterion(hasItem(END_DIAMOND), conditionsFromItem(END_DIAMOND))
                        .offerTo(exporter, "end_diamond_upgrade_smithing_template");
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, END_DIAMOND_UPGRADE_SMITHING_TEMPLATE, 2)
                        .input('A', DIAMOND)
                        .input('B', END_DIAMOND)
                        .input('C', END_DIAMOND_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .criterion(hasItem(END_DIAMOND), conditionsFromItem(END_DIAMOND))
                        .offerTo(exporter, "end_diamond_upgrade_smithing_template_dupe");
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, VOID_INGOT)
                        .input('A', END_DIAMOND)
                        .input('B', NETHERITE_INGOT)
                        .input('C', ELYTRA)
                        .pattern("AAA")
                        .pattern("BCB")
                        .pattern("AAA")
                        .criterion(hasItem(END_DIAMOND), conditionsFromItem(END_DIAMOND))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, VOID_UPGRADE_SMITHING_TEMPLATE)
                        .input('A', END_DIAMOND)
                        .input('B', VOID_INGOT)
                        .input('C', END_DIAMOND_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .criterion(hasItem(VOID_INGOT), conditionsFromItem(VOID_INGOT))
                        .offerTo(exporter, "void_upgrade_smithing_template");
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, VOID_UPGRADE_SMITHING_TEMPLATE, 2)
                        .input('A', END_DIAMOND)
                        .input('B', VOID_INGOT)
                        .input('C', VOID_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .criterion(hasItem(VOID_INGOT), conditionsFromItem(VOID_INGOT))
                        .offerTo(exporter, "void_upgrade_smithing_template_dupe");
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.BUILDING_BLOCKS, SCULK_EMERALD_BLOCK)
                        .input('A', SCULK_EMERALD)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .criterion(hasItem(SCULK_EMERALD), conditionsFromItem(SCULK_EMERALD))
                        .offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, SCULK_EMERALD, 9)
                        .input(SCULK_EMERALD_BLOCK)
                        .criterion(hasItem(SCULK_EMERALD), conditionsFromItem(SCULK_EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.BUILDING_BLOCKS, BLACKSTONE_EMERALD_BLOCK)
                        .input('A', BLACKSTONE_EMERALD)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .criterion(hasItem(BLACKSTONE_EMERALD), conditionsFromItem(BLACKSTONE_EMERALD))
                        .offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, BLACKSTONE_EMERALD, 9)
                        .input(BLACKSTONE_EMERALD_BLOCK)
                        .criterion(hasItem(BLACKSTONE_EMERALD), conditionsFromItem(BLACKSTONE_EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.BUILDING_BLOCKS, END_EMERALD_BLOCK)
                        .input('A', END_EMERALD)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .criterion(hasItem(END_EMERALD), conditionsFromItem(END_EMERALD))
                        .offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, END_EMERALD, 9)
                        .input(END_EMERALD_BLOCK)
                        .criterion(hasItem(END_EMERALD), conditionsFromItem(END_EMERALD))
                        .offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, ONETHDENDERITE_INGOT, 2)
                        .input(SCULK_EMERALD)
                        .input(SCULK_EMERALD)
                        .input(END_EMERALD)
                        .input(END_EMERALD)
                        .input(BLACKSTONE_EMERALD)
                        .input(BLACKSTONE_EMERALD)
                        .input(VOID_INGOT)
                        .input(SCULK_EMERALD_ORE)
                        .input(BLACKSTONE_EMERALD_ORE)
                        .criterion(hasItem(SCULK_EMERALD), conditionsFromItem(SCULK_EMERALD))
                        .criterion(hasItem(BLACKSTONE_EMERALD), conditionsFromItem(BLACKSTONE_EMERALD))
                        .criterion(hasItem(END_EMERALD), conditionsFromItem(END_EMERALD))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE)
                        .input('A', END_DIAMOND)
                        .input('B', ONETHDENDERITE_INGOT)
                        .input('C', VOID_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .criterion(hasItem(ONETHDENDERITE_INGOT), conditionsFromItem(ONETHDENDERITE_INGOT))
                        .offerTo(exporter, "onethdenderite_upgrade_smithing_template");
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE, 2)
                        .input('A', END_DIAMOND)
                        .input('B', ONETHDENDERITE_INGOT)
                        .input('C', ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .criterion(hasItem(ONETHDENDERITE_INGOT), conditionsFromItem(ONETHDENDERITE_INGOT))
                        .offerTo(exporter, "onethdenderite_upgrade_smithing_template_dupe");



                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, OLED_INGOT)
                        .input('A', ONETHDENDERITE_INGOT)
                        .input('B', ZOMBIE_HEAD)
                        .input('C', NETHERITE_BLOCK)
                        .input('D', DIAMOND_BLOCK)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("ADA")
                        .criterion(hasItem(ONETHDENDERITE_INGOT), conditionsFromItem(ONETHDENDERITE_INGOT))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, OLED_UPGRADE_SMITHING_TEMPLATE)
                        .input('A', ONETHDENDERITE_INGOT)
                        .input('B', OLED_INGOT)
                        .input('C', ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .criterion(hasItem(OLED_INGOT), conditionsFromItem(OLED_INGOT))
                        .offerTo(exporter, "oled_upgrade_smithing_template");
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, OLED_UPGRADE_SMITHING_TEMPLATE, 2)
                        .input('A', ONETHDENDERITE_INGOT)
                        .input('B', OLED_INGOT)
                        .input('C', OLED_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .criterion(hasItem(OLED_INGOT), conditionsFromItem(OLED_INGOT))
                        .offerTo(exporter, "oled_upgrade_smithing_template_dupe");


                craftFromResourceRecipes(Items.COAL,
                        COAL_SWORD, COAL_AXE, COAL_PICKAXE, COAL_SHOVEL, COAL_HOE, COAL_HELMET, COAL_CHESTPLATE, COAL_LEGGINGS, COAL_BOOTS, COAL_PAXEL, COAL_HAMMER,itemLookup, exporter);
                craftFromResourceRecipes(COPPER_INGOT, COPPER_SWORD, COPPER_AXE, COPPER_PICKAXE, COPPER_SHOVEL, COPPER_HOE,
                        COPPER_HELMET, COPPER_CHESTPLATE, COPPER_LEGGINGS, COPPER_BOOTS, COPPER_PAXEL, COPPER_HAMMER,itemLookup, exporter);
                craftFromResourceRecipes(LAPIS_LAZULI, LAPIS_SWORD, LAPIS_AXE, LAPIS_PICKAXE, LAPIS_SHOVEL, LAPIS_HOE,
                        LAPIS_HELMET, LAPIS_CHESTPLATE, LAPIS_LEGGINGS, LAPIS_BOOTS, LAPIS_PAXEL, LAPIS_HAMMER,itemLookup, exporter);
                craftFromResourceRecipes(BUDDING_AMETHYST_CRYSTAL, BUDDING_AMETHYST_SWORD, BUDDING_AMETHYST_AXE, BUDDING_AMETHYST_PICKAXE, BUDDING_AMETHYST_SHOVEL, BUDDING_AMETHYST_HOE,
                        BUDDING_AMETHYST_HELMET, BUDDING_AMETHYST_CHESTPLATE, BUDDING_AMETHYST_LEGGINGS, BUDDING_AMETHYST_BOOTS, BUDDING_AMETHYST_PAXEL, BUDDING_AMETHYST_HAMMER,itemLookup, exporter);
                craftFromResourceRecipes(EMERALD, EMERALD_SWORD, EMERALD_AXE, EMERALD_PICKAXE, EMERALD_SHOVEL, EMERALD_HOE,
                        EMERALD_HELMET, EMERALD_CHESTPLATE, EMERALD_LEGGINGS, EMERALD_BOOTS, EMERALD_PAXEL, EMERALD_HAMMER,itemLookup, exporter);
                craftFromResourceRecipes(REDSTONE, REDSTONE_SWORD, REDSTONE_AXE, REDSTONE_PICKAXE, REDSTONE_SHOVEL, REDSTONE_HOE,
                        REDSTONE_HELMET, REDSTONE_CHESTPLATE, REDSTONE_LEGGINGS, REDSTONE_BOOTS, REDSTONE_PAXEL, REDSTONE_HAMMER,itemLookup, exporter);
                craftFromResourceRecipes(OBSIDIAN, OBSIDIAN_SWORD, OBSIDIAN_AXE, OBSIDIAN_PICKAXE, OBSIDIAN_SHOVEL, OBSIDIAN_HOE,
                        OBSIDIAN_HELMET, OBSIDIAN_CHESTPLATE, OBSIDIAN_LEGGINGS, OBSIDIAN_BOOTS, OBSIDIAN_PAXEL, OBSIDIAN_HAMMER,itemLookup, exporter);

                upgradeRecipes(DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE,
                        NETHERITE_HELMET, NETHERITE_CHESTPLATE, NETHERITE_LEGGINGS, NETHERITE_BOOTS, NETHERITE_SWORD,
                        NETHERITE_AXE, NETHERITE_PICKAXE, NETHERITE_SHOVEL, NETHERITE_HOE, NETHERITE_PAXEL, NETHERITE_HAMMER,
                        DEEPSLATE_EMERALD_HELMET, DEEPSLATE_EMERALD_CHESTPLATE, DEEPSLATE_EMERALD_LEGGINGS, DEEPSLATE_EMERALD_BOOTS,DEEPSLATE_EMERALD_SWORD,
                        DEEPSLATE_EMERALD_AXE, DEEPSLATE_EMERALD_PICKAXE, DEEPSLATE_EMERALD_SHOVEL, DEEPSLATE_EMERALD_HOE, DEEPSLATE_EMERALD_PAXEL, DEEPSLATE_EMERALD_HAMMER,
                        DEEPSLATE_EMERALD,itemLookup, exporter);
                upgradeRecipes(END_DIAMOND_UPGRADE_SMITHING_TEMPLATE,
                        DEEPSLATE_EMERALD_HELMET, DEEPSLATE_EMERALD_CHESTPLATE, DEEPSLATE_EMERALD_LEGGINGS, DEEPSLATE_EMERALD_BOOTS, DEEPSLATE_EMERALD_SWORD,
                        DEEPSLATE_EMERALD_AXE, DEEPSLATE_EMERALD_PICKAXE, DEEPSLATE_EMERALD_SHOVEL, DEEPSLATE_EMERALD_HOE, DEEPSLATE_EMERALD_PAXEL, DEEPSLATE_EMERALD_HAMMER,
                        END_DIAMOND_HELMET, END_DIAMOND_CHESTPLATE, END_DIAMOND_LEGGINGS, END_DIAMOND_BOOTS,END_DIAMOND_SWORD,
                        END_DIAMOND_AXE, END_DIAMOND_PICKAXE, END_DIAMOND_SHOVEL, END_DIAMOND_HOE, END_DIAMOND_PAXEL, END_DIAMOND_HAMMER,
                        END_DIAMOND,itemLookup, exporter);
                upgradeRecipes(VOID_UPGRADE_SMITHING_TEMPLATE,
                        END_DIAMOND_HELMET, END_DIAMOND_CHESTPLATE, END_DIAMOND_LEGGINGS, END_DIAMOND_BOOTS, END_DIAMOND_SWORD,
                        END_DIAMOND_AXE, END_DIAMOND_PICKAXE, END_DIAMOND_SHOVEL, END_DIAMOND_HOE, END_DIAMOND_PAXEL, END_DIAMOND_HAMMER,
                        VOID_HELMET, VOID_CHESTPLATE, VOID_LEGGINGS, VOID_BOOTS,VOID_SWORD,
                        VOID_AXE, VOID_PICKAXE, VOID_SHOVEL, VOID_HOE, VOID_PAXEL, VOID_HAMMER,
                        VOID_INGOT,itemLookup, exporter);
                upgradeRecipes(ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE,
                        VOID_HELMET, VOID_CHESTPLATE, VOID_LEGGINGS, VOID_BOOTS, VOID_SWORD,
                        VOID_AXE, VOID_PICKAXE, VOID_SHOVEL, VOID_HOE, VOID_PAXEL, VOID_HAMMER,
                        ONETHDENDERITE_HELMET, ONETHDENDERITE_CHESTPLATE, ONETHDENDERITE_LEGGINGS, ONETHDENDERITE_BOOTS,ONETHDENDERITE_SWORD,
                        ONETHDENDERITE_AXE, ONETHDENDERITE_PICKAXE, ONETHDENDERITE_SHOVEL, ONETHDENDERITE_HOE, ONETHDENDERITE_PAXEL, ONETHDENDERITE_HAMMER,
                        ONETHDENDERITE_INGOT,itemLookup, exporter);
                upgradeRecipes(OLED_UPGRADE_SMITHING_TEMPLATE,
                        ONETHDENDERITE_HELMET, ONETHDENDERITE_CHESTPLATE, ONETHDENDERITE_LEGGINGS, ONETHDENDERITE_BOOTS, ONETHDENDERITE_SWORD,
                        ONETHDENDERITE_AXE, ONETHDENDERITE_PICKAXE, ONETHDENDERITE_SHOVEL, ONETHDENDERITE_HOE, ONETHDENDERITE_PAXEL, ONETHDENDERITE_HAMMER,
                        OLED_HELMET, OLED_CHESTPLATE, OLED_LEGGINGS, OLED_BOOTS,OLED_SWORD,
                        OLED_AXE, OLED_PICKAXE, OLED_SHOVEL, OLED_HOE, OLED_PAXEL, OLED_HAMMER,
                        OLED_INGOT,itemLookup, exporter);
                upgradeRecipes(ANCIENT_UPGRADE_SMITHING_TEMPLATE,
                        OLED_HELMET, OLED_CHESTPLATE, OLED_LEGGINGS, OLED_BOOTS, OLED_SWORD,
                        OLED_AXE, OLED_PICKAXE, OLED_SHOVEL, OLED_HOE, OLED_PAXEL, OLED_HAMMER,
                        ANCIENT_HELMET, ANCIENT_CHESTPLATE, ANCIENT_LEGGINGS, ANCIENT_BOOTS,ANCIENT_SWORD,
                        ANCIENT_AXE, ANCIENT_PICKAXE, ANCIENT_SHOVEL, ANCIENT_HOE, ANCIENT_PAXEL, ANCIENT_HAMMER,
                        ANCIENT_INGOT,itemLookup, exporter);



                paxelAndHammer(ItemTags.PLANKS, WOODEN_PICKAXE, WOODEN_AXE, WOODEN_SHOVEL, WOODEN_HOE, WOODEN_PAXEL, WOODEN_HAMMER,itemLookup, exporter);
                paxelAndHammer(COBBLESTONE, STONE_PICKAXE, STONE_AXE, STONE_SHOVEL, STONE_HOE, STONE_PAXEL, STONE_HAMMER,itemLookup, exporter);
                paxelAndHammer(GOLD_INGOT, GOLDEN_PICKAXE, GOLDEN_AXE, GOLDEN_SHOVEL, GOLDEN_HOE, GOLDEN_PAXEL, GOLDEN_HAMMER,itemLookup, exporter);
                paxelAndHammer(IRON_INGOT, IRON_PICKAXE, IRON_AXE, IRON_SHOVEL, IRON_HOE, IRON_PAXEL, IRON_HAMMER,itemLookup, exporter);
                paxelAndHammer(DIAMOND, DIAMOND_PICKAXE, DIAMOND_AXE, DIAMOND_SHOVEL, DIAMOND_HOE, DIAMOND_PAXEL, DIAMOND_HAMMER,itemLookup, exporter);


                upgradeRecipe(NETHERITE_UPGRADE_SMITHING_TEMPLATE, DIAMOND_PAXEL, NETHERITE_INGOT, NETHERITE_PAXEL,itemLookup, exporter);
                upgradeRecipe(NETHERITE_UPGRADE_SMITHING_TEMPLATE, DIAMOND_HAMMER, NETHERITE_INGOT, NETHERITE_HAMMER,itemLookup, exporter);
            }
            private void craftFromResourceRecipes(Item resource,
                                                  Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item helmet, Item chestplate, Item leggings, Item boots,
                                                  Item paxel, Item hammer, RegistryEntryLookup<Item> itemLookup, RecipeExporter exporter) {
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, sword)
                        .input('A', resource)
                        .input('B', WOODEN_RODS)
                        .pattern("A")
                        .pattern("A")
                        .pattern("B")
                        .criterion(hasItem(resource), conditionsFromItem(resource))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, axe)
                        .input('A', resource)
                        .input('B', WOODEN_RODS)
                        .pattern("AA")
                        .pattern("BA")
                        .pattern("B ")
                        .criterion(hasItem(resource), conditionsFromItem(resource))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, pickaxe)
                        .input('A', resource)
                        .input('B', WOODEN_RODS)
                        .pattern("AAA")
                        .pattern(" B ")
                        .pattern(" B ")
                        .criterion(hasItem(resource), conditionsFromItem(resource))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, shovel)
                        .input('A', resource)
                        .input('B', WOODEN_RODS)
                        .pattern("A")
                        .pattern("B")
                        .pattern("B")
                        .criterion(hasItem(resource), conditionsFromItem(resource))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, hoe)
                        .input('A', resource)
                        .input('B', WOODEN_RODS)
                        .pattern("AA")
                        .pattern("B ")
                        .pattern("B ")
                        .criterion(hasItem(resource), conditionsFromItem(resource))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, hammer)
                        .input('A', resource)
                        .input('B', WOODEN_RODS)
                        .pattern("AAA")
                        .pattern(" A ")
                        .pattern(" B ")
                        .criterion(hasItem(resource), conditionsFromItem(resource))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, helmet)
                        .input('A', resource)
                        .pattern("AAA")
                        .pattern("A A")
                        .criterion(hasItem(resource), conditionsFromItem(resource))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, chestplate)
                        .input('A', resource)
                        .pattern("A A")
                        .pattern("AAA")
                        .pattern("AAA")
                        .criterion(hasItem(resource), conditionsFromItem(resource))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, leggings)
                        .input('A', resource)
                        .pattern("AAA")
                        .pattern("A A")
                        .pattern("A A")
                        .criterion(hasItem(resource), conditionsFromItem(resource))
                        .offerTo(exporter);
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, boots)
                        .input('A', resource)
                        .pattern("A A")
                        .pattern("A A")
                        .criterion(hasItem(resource), conditionsFromItem(resource))
                        .offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, paxel)
                        .input(axe).input(pickaxe).input(shovel).input(hoe)
                        .criterion(hasItem(pickaxe), conditionsFromItem(pickaxe))
                        .offerTo(exporter);
            }

            private void paxelAndHammer(TagKey<Item> resource, Item axe, Item pickaxe, Item shovel, Item hoe, Item paxel, Item hammer, RegistryEntryLookup<Item> itemLookup, RecipeExporter exporter) {
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, hammer)
                        .input('A', resource)
                        .input('B', WOODEN_RODS)
                        .pattern("AAA")
                        .pattern(" A ")
                        .pattern(" B ")
                        .criterion("has_" + resource.id().getNamespace(), conditionsFromTag(resource))
                        .offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, paxel)
                        .input(axe).input(pickaxe).input(shovel).input(hoe)
                        .criterion(hasItem(pickaxe), conditionsFromItem(pickaxe))
                        .offerTo(exporter);
            }

            private void paxelAndHammer(Item resource, Item axe, Item pickaxe, Item shovel, Item hoe, Item paxel, Item hammer, RegistryEntryLookup<Item> itemLookup, RecipeExporter exporter) {
                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, hammer)
                        .input('A', resource)
                        .input('B', WOODEN_RODS)
                        .pattern("AAA")
                        .pattern(" A ")
                        .pattern(" B ")
                        .criterion(hasItem(resource), conditionsFromItem(resource))
                        .offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, paxel)
                        .input(axe).input(pickaxe).input(shovel).input(hoe)
                        .criterion(hasItem(pickaxe), conditionsFromItem(pickaxe))
                        .offerTo(exporter);
            }

            private void upgradeRecipes(Item template,
                                        Item baseHelmet, Item baseChestplate, Item baseLeggings, Item baseBoots, Item baseSword, Item baseAxe, Item basePickaxe, Item baseShovel, Item baseHoe,
                                        Item basePaxel, Item baseHammer,
                                        Item helmet, Item chestplate, Item leggings, Item boots, Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item paxel, Item hammer,
                                        Item addition, RegistryEntryLookup<Item> itemLookup, RecipeExporter exporter)  {
                upgradeRecipe(template, baseHelmet, addition, helmet, itemLookup, exporter);
                upgradeRecipe(template, baseChestplate, addition, chestplate, itemLookup, exporter);
                upgradeRecipe(template, baseLeggings, addition, leggings, itemLookup, exporter);
                upgradeRecipe(template, baseBoots, addition, boots, itemLookup, exporter);
                upgradeRecipe(template, baseSword, addition, sword, itemLookup, exporter);
                upgradeRecipe(template, baseAxe, addition, axe, itemLookup, exporter);
                upgradeRecipe(template, basePickaxe, addition, pickaxe, itemLookup, exporter);
                upgradeRecipe(template, baseShovel, addition, shovel, itemLookup, exporter);
                upgradeRecipe(template, baseHoe, addition, hoe, itemLookup, exporter);
                upgradeRecipe(template, basePaxel, addition, paxel, itemLookup, exporter);
                upgradeRecipe(template, baseHammer, addition, hammer, itemLookup, exporter);
                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.TOOLS, paxel)
                        .input(axe).input(pickaxe).input(shovel).input(hoe)
                        .criterion(hasItem(pickaxe), conditionsFromItem(pickaxe))
                        .offerTo(exporter);
            }

            private void upgradeRecipe(Item template, Item base, Item addition, Item result, RegistryEntryLookup<Item> itemLookup, RecipeExporter exporter) {
                SmithingTransformRecipeJsonBuilder.create( Ingredient.ofItems(template), Ingredient.ofItems(base), Ingredient.ofItems(addition),
                                RecipeCategory.TOOLS, result)
                        .criterion(hasItem(addition), conditionsFromItem(addition))
                        .offerTo(exporter, MoreToolsAndArmor.id(Registries.ITEM.getId(result).toString().split(":")[1] + "_upgrade").toString());
            }
        };
    }

    @Override
    public String getName() {
        return "Recipe Provider";
    }
}
