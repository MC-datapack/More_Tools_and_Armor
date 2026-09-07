package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import static github.mcdatapack.more_tools_and_armor.init.BlockInit.*;
import static github.mcdatapack.more_tools_and_armor.init.ItemInit.*;
import static net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags.*;
import static net.minecraft.world.item.Items.NETHERITE_SPEAR;

public class MoreToolsAndArmorRecipeProvider extends FabricRecipeProvider {
    public MoreToolsAndArmorRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput exporter) {
        return new RecipeProvider(registries, exporter) {
            @Override
            public void buildRecipes() {
                HolderGetter<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);

                upgradeRecipe(Items.DIAMOND, OVERWORLD_SHARD, Items.EMERALD, DEEPSLATE_EMERALD,itemLookup, exporter);
                upgradeRecipe(Items.DIAMOND, OVERWORLD_SHARD, Items.SCULK, SCULK_EMERALD,itemLookup, exporter);
                upgradeRecipe(Items.DIAMOND, NETHER_SHARD, Items.EMERALD, BLACKSTONE_EMERALD,itemLookup, exporter);
                upgradeRecipe(Items.DIAMOND, END_SHARD, Items.EMERALD, END_EMERALD,itemLookup, exporter);
                upgradeRecipe(Items.DIAMOND, END_SHARD, Items.DIAMOND, END_DIAMOND,itemLookup, exporter);

                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.BUILDING_BLOCKS, ANCIENT_HONEY_BLOCK)
                        .define('A', ANCIENT_HONEY_BOTTLE)
                        .pattern("AA")
                        .pattern("AA")
                        .unlockedBy(getItemName(ANCIENT_HONEY_BOTTLE), has(ANCIENT_HONEY_BOTTLE))
                        .save(exporter);
                ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.MISC, ANCIENT_HONEY_BOTTLE, 4)
                        .requires(ANCIENT_HONEY_BLOCK)
                        .requires(Items.GLASS_BOTTLE)
                        .requires(Items.GLASS_BOTTLE)
                        .requires(Items.GLASS_BOTTLE)
                        .requires(Items.GLASS_BOTTLE)
                        .unlockedBy(getItemName(ANCIENT_HONEY_BLOCK), has(ANCIENT_HONEY_BLOCK))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, ANCIENT_INGOT)
                        .define('A', ANCIENT_HONEY_BLOCK)
                        .define('B', BAT_WING)
                        .define('C', ANCIENT_COIN)
                        .define('D', Items.TORCHFLOWER)
                        .define('E', DEEPSLATE_EMERALD)
                        .pattern("EDE")
                        .pattern("ACA")
                        .pattern("EBE")
                        .unlockedBy(getItemName(DEEPSLATE_EMERALD), has(DEEPSLATE_EMERALD))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, ANCIENT_UPGRADE_SMITHING_TEMPLATE)
                        .define('A', Items.DIAMOND)
                        .define('B', ANCIENT_INGOT)
                        .define('C', OLED_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .unlockedBy(getItemName(ANCIENT_INGOT), has(ANCIENT_INGOT))
                        .save(exporter, "ancient_upgrade_smithing_template");
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, ANCIENT_UPGRADE_SMITHING_TEMPLATE, 2)
                        .define('A', Items.DIAMOND)
                        .define('B', ANCIENT_INGOT)
                        .define('C', ANCIENT_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(ANCIENT_INGOT), has(ANCIENT_INGOT))
                        .save(exporter, "ancient_upgrade_smithing_template_dupe");



                ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.MISC, DEEPSLATE_EMERALD, 9)
                        .requires(DEEPSLATE_EMERALD_BLOCK)
                        .unlockedBy(getItemName(DEEPSLATE_EMERALD), has(DEEPSLATE_EMERALD))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.BUILDING_BLOCKS, DEEPSLATE_EMERALD_BLOCK)
                        .define('A', DEEPSLATE_EMERALD)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(DEEPSLATE_EMERALD), has(DEEPSLATE_EMERALD))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, ItemInit.DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE, 2)
                        .define('A', Items.DIAMOND)
                        .define('B', DEEPSLATE_EMERALD)
                        .define('C', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .unlockedBy(getItemName(DEEPSLATE_EMERALD), has(DEEPSLATE_EMERALD))
                        .save(exporter, "deepslate_emerald_upgrade_smithing_template");
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE, 2)
                        .define('A', Items.DIAMOND)
                        .define('B', DEEPSLATE_EMERALD)
                        .define('C', DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(DEEPSLATE_EMERALD), has(DEEPSLATE_EMERALD))
                        .save(exporter, "deepslate_emerald_upgrade_smithing_template_dupe");
                ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.MISC, END_DIAMOND, 9)
                        .requires(END_DIAMOND_BLOCK)
                        .unlockedBy(getItemName(END_DIAMOND), has(END_DIAMOND))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.BUILDING_BLOCKS, END_DIAMOND_BLOCK)
                        .define('A', END_DIAMOND)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(END_DIAMOND), has(END_DIAMOND))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, END_DIAMOND_UPGRADE_SMITHING_TEMPLATE)
                        .define('A', Items.DIAMOND)
                        .define('B', END_DIAMOND)
                        .define('C', DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .unlockedBy(getItemName(END_DIAMOND), has(END_DIAMOND))
                        .save(exporter, "end_diamond_upgrade_smithing_template");
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, END_DIAMOND_UPGRADE_SMITHING_TEMPLATE, 2)
                        .define('A', Items.DIAMOND)
                        .define('B', END_DIAMOND)
                        .define('C', END_DIAMOND_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(END_DIAMOND), has(END_DIAMOND))
                        .save(exporter, "end_diamond_upgrade_smithing_template_dupe");
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, VOID_INGOT)
                        .define('A', END_DIAMOND)
                        .define('B', Items.NETHERITE_INGOT)
                        .define('C', Items.ELYTRA)
                        .pattern("AAA")
                        .pattern("BCB")
                        .pattern("AAA")
                        .unlockedBy(getItemName(END_DIAMOND), has(END_DIAMOND))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, VOID_UPGRADE_SMITHING_TEMPLATE)
                        .define('A', END_DIAMOND)
                        .define('B', VOID_INGOT)
                        .define('C', END_DIAMOND_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .unlockedBy(getItemName(VOID_INGOT), has(VOID_INGOT))
                        .save(exporter, "void_upgrade_smithing_template");
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, VOID_UPGRADE_SMITHING_TEMPLATE, 2)
                        .define('A', END_DIAMOND)
                        .define('B', VOID_INGOT)
                        .define('C', VOID_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(VOID_INGOT), has(VOID_INGOT))
                        .save(exporter, "void_upgrade_smithing_template_dupe");
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.BUILDING_BLOCKS, SCULK_EMERALD_BLOCK)
                        .define('A', SCULK_EMERALD)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(SCULK_EMERALD), has(SCULK_EMERALD))
                        .save(exporter);
                ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.MISC, SCULK_EMERALD, 9)
                        .requires(SCULK_EMERALD_BLOCK)
                        .unlockedBy(getItemName(SCULK_EMERALD), has(SCULK_EMERALD))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.BUILDING_BLOCKS, BLACKSTONE_EMERALD_BLOCK)
                        .define('A', BLACKSTONE_EMERALD)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(BLACKSTONE_EMERALD), has(BLACKSTONE_EMERALD))
                        .save(exporter);
                ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.MISC, BLACKSTONE_EMERALD, 9)
                        .requires(BLACKSTONE_EMERALD_BLOCK)
                        .unlockedBy(getItemName(BLACKSTONE_EMERALD), has(BLACKSTONE_EMERALD))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.BUILDING_BLOCKS, END_EMERALD_BLOCK)
                        .define('A', END_EMERALD)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(END_EMERALD), has(END_EMERALD))
                        .save(exporter);
                ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.MISC, END_EMERALD, 9)
                        .requires(END_EMERALD_BLOCK)
                        .unlockedBy(getItemName(END_EMERALD), has(END_EMERALD))
                        .save(exporter);
                ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.MISC, ONETHDENDERITE_INGOT, 2)
                        .requires(SCULK_EMERALD)
                        .requires(SCULK_EMERALD)
                        .requires(END_EMERALD)
                        .requires(END_EMERALD)
                        .requires(BLACKSTONE_EMERALD)
                        .requires(BLACKSTONE_EMERALD)
                        .requires(VOID_INGOT)
                        .requires(SCULK_EMERALD_ORE)
                        .requires(BLACKSTONE_EMERALD_ORE)
                        .unlockedBy(getItemName(SCULK_EMERALD), has(SCULK_EMERALD))
                        .unlockedBy(getItemName(BLACKSTONE_EMERALD), has(BLACKSTONE_EMERALD))
                        .unlockedBy(getItemName(END_EMERALD), has(END_EMERALD))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('A', END_DIAMOND)
                        .define('B', ONETHDENDERITE_INGOT)
                        .define('C', VOID_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .unlockedBy(getItemName(ONETHDENDERITE_INGOT), has(ONETHDENDERITE_INGOT))
                        .save(exporter, "onethdenderite_upgrade_smithing_template");
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE, 2)
                        .define('A', END_DIAMOND)
                        .define('B', ONETHDENDERITE_INGOT)
                        .define('C', ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(ONETHDENDERITE_INGOT), has(ONETHDENDERITE_INGOT))
                        .save(exporter, "onethdenderite_upgrade_smithing_template_dupe");



                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, OLED_INGOT)
                        .define('A', ONETHDENDERITE_INGOT)
                        .define('B', Items.ZOMBIE_HEAD)
                        .define('C', Items.NETHERITE_BLOCK)
                        .define('D', Items.DIAMOND_BLOCK)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("ADA")
                        .unlockedBy(getItemName(ONETHDENDERITE_INGOT), has(ONETHDENDERITE_INGOT))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, OLED_UPGRADE_SMITHING_TEMPLATE)
                        .define('A', ONETHDENDERITE_INGOT)
                        .define('B', OLED_INGOT)
                        .define('C', ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("BCB")
                        .pattern("BAB")
                        .pattern("AAA")
                        .unlockedBy(getItemName(OLED_INGOT), has(OLED_INGOT))
                        .save(exporter, "oled_upgrade_smithing_template");
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.MISC, OLED_UPGRADE_SMITHING_TEMPLATE, 2)
                        .define('A', ONETHDENDERITE_INGOT)
                        .define('B', OLED_INGOT)
                        .define('C', OLED_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("ACA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(OLED_INGOT), has(OLED_INGOT))
                        .save(exporter, "oled_upgrade_smithing_template_dupe");


                craftFromResourceRecipes(Items.COAL,
                        COAL_SWORD, COAL_AXE, COAL_PICKAXE, COAL_SHOVEL, COAL_HOE, COAL_HELMET, COAL_CHESTPLATE, COAL_LEGGINGS, COAL_BOOTS, COAL_PAXEL, COAL_HAMMER, COAL_SPEAR, itemLookup, exporter);
                craftFromResourceRecipes(Items.LAPIS_LAZULI, LAPIS_SWORD, LAPIS_AXE, LAPIS_PICKAXE, LAPIS_SHOVEL, LAPIS_HOE,
                        LAPIS_HELMET, LAPIS_CHESTPLATE, LAPIS_LEGGINGS, LAPIS_BOOTS, LAPIS_PAXEL, LAPIS_HAMMER, LAPIS_SPEAR,itemLookup, exporter);
                craftFromResourceRecipes(BUDDING_AMETHYST_CRYSTAL, BUDDING_AMETHYST_SWORD, BUDDING_AMETHYST_AXE, BUDDING_AMETHYST_PICKAXE, BUDDING_AMETHYST_SHOVEL, BUDDING_AMETHYST_HOE,
                        BUDDING_AMETHYST_HELMET, BUDDING_AMETHYST_CHESTPLATE, BUDDING_AMETHYST_LEGGINGS, BUDDING_AMETHYST_BOOTS, BUDDING_AMETHYST_PAXEL, BUDDING_AMETHYST_HAMMER, BUDDING_AMETHYST_SPEAR,itemLookup, exporter);
                craftFromResourceRecipes(Items.EMERALD, EMERALD_SWORD, EMERALD_AXE, EMERALD_PICKAXE, EMERALD_SHOVEL, EMERALD_HOE,
                        EMERALD_HELMET, EMERALD_CHESTPLATE, EMERALD_LEGGINGS, EMERALD_BOOTS, EMERALD_PAXEL, EMERALD_HAMMER, EMERALD_SPEAR,itemLookup, exporter);
                craftFromResourceRecipes(Items.REDSTONE, REDSTONE_SWORD, REDSTONE_AXE, REDSTONE_PICKAXE, REDSTONE_SHOVEL, REDSTONE_HOE,
                        REDSTONE_HELMET, REDSTONE_CHESTPLATE, REDSTONE_LEGGINGS, REDSTONE_BOOTS, REDSTONE_PAXEL, REDSTONE_HAMMER, REDSTONE_SPEAR,itemLookup, exporter);
                craftFromResourceRecipes(Items.OBSIDIAN, OBSIDIAN_SWORD, OBSIDIAN_AXE, OBSIDIAN_PICKAXE, OBSIDIAN_SHOVEL, OBSIDIAN_HOE,
                        OBSIDIAN_HELMET, OBSIDIAN_CHESTPLATE, OBSIDIAN_LEGGINGS, OBSIDIAN_BOOTS, OBSIDIAN_PAXEL, OBSIDIAN_HAMMER, OBSIDIAN_SPEAR,itemLookup, exporter);

                upgradeRecipes(DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE,
                        Items.NETHERITE_HELMET, Items.NETHERITE_CHESTPLATE, Items.NETHERITE_LEGGINGS, Items.NETHERITE_BOOTS,
                        Items.NETHERITE_SWORD, Items.NETHERITE_AXE, Items.NETHERITE_PICKAXE, Items.NETHERITE_SHOVEL, Items.NETHERITE_HOE,
                        NETHERITE_PAXEL, NETHERITE_HAMMER, NETHERITE_SPEAR,
                        DEEPSLATE_EMERALD_HELMET, DEEPSLATE_EMERALD_CHESTPLATE, DEEPSLATE_EMERALD_LEGGINGS, DEEPSLATE_EMERALD_BOOTS,DEEPSLATE_EMERALD_SWORD,
                        DEEPSLATE_EMERALD_AXE, DEEPSLATE_EMERALD_PICKAXE, DEEPSLATE_EMERALD_SHOVEL, DEEPSLATE_EMERALD_HOE, DEEPSLATE_EMERALD_PAXEL, DEEPSLATE_EMERALD_HAMMER, DEEPSLATE_EMERALD_SPEAR,
                        DEEPSLATE_EMERALD,itemLookup, exporter);
                upgradeRecipes(END_DIAMOND_UPGRADE_SMITHING_TEMPLATE,
                        DEEPSLATE_EMERALD_HELMET, DEEPSLATE_EMERALD_CHESTPLATE, DEEPSLATE_EMERALD_LEGGINGS, DEEPSLATE_EMERALD_BOOTS, DEEPSLATE_EMERALD_SWORD,
                        DEEPSLATE_EMERALD_AXE, DEEPSLATE_EMERALD_PICKAXE, DEEPSLATE_EMERALD_SHOVEL, DEEPSLATE_EMERALD_HOE, DEEPSLATE_EMERALD_PAXEL, DEEPSLATE_EMERALD_HAMMER,DEEPSLATE_EMERALD_SPEAR,
                        END_DIAMOND_HELMET, END_DIAMOND_CHESTPLATE, END_DIAMOND_LEGGINGS, END_DIAMOND_BOOTS,END_DIAMOND_SWORD,
                        END_DIAMOND_AXE, END_DIAMOND_PICKAXE, END_DIAMOND_SHOVEL, END_DIAMOND_HOE, END_DIAMOND_PAXEL, END_DIAMOND_HAMMER, END_DIAMOND_SPEAR,
                        END_DIAMOND,itemLookup, exporter);
                upgradeRecipes(VOID_UPGRADE_SMITHING_TEMPLATE,
                        END_DIAMOND_HELMET, END_DIAMOND_CHESTPLATE, END_DIAMOND_LEGGINGS, END_DIAMOND_BOOTS, END_DIAMOND_SWORD,
                        END_DIAMOND_AXE, END_DIAMOND_PICKAXE, END_DIAMOND_SHOVEL, END_DIAMOND_HOE, END_DIAMOND_PAXEL, END_DIAMOND_HAMMER, END_DIAMOND_SPEAR,
                        VOID_HELMET, VOID_CHESTPLATE, VOID_LEGGINGS, VOID_BOOTS,VOID_SWORD,
                        VOID_AXE, VOID_PICKAXE, VOID_SHOVEL, VOID_HOE, VOID_PAXEL, VOID_HAMMER, VOID_SPEAR,
                        VOID_INGOT,itemLookup, exporter);
                upgradeRecipes(ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE,
                        VOID_HELMET, VOID_CHESTPLATE, VOID_LEGGINGS, VOID_BOOTS, VOID_SWORD,
                        VOID_AXE, VOID_PICKAXE, VOID_SHOVEL, VOID_HOE, VOID_PAXEL, VOID_HAMMER, VOID_SPEAR,
                        ONETHDENDERITE_HELMET, ONETHDENDERITE_CHESTPLATE, ONETHDENDERITE_LEGGINGS, ONETHDENDERITE_BOOTS,ONETHDENDERITE_SWORD,
                        ONETHDENDERITE_AXE, ONETHDENDERITE_PICKAXE, ONETHDENDERITE_SHOVEL, ONETHDENDERITE_HOE, ONETHDENDERITE_PAXEL, ONETHDENDERITE_HAMMER, ONETHDENDERITE_SPEAR,
                        ONETHDENDERITE_INGOT,itemLookup, exporter);
                upgradeRecipes(OLED_UPGRADE_SMITHING_TEMPLATE,
                        ONETHDENDERITE_HELMET, ONETHDENDERITE_CHESTPLATE, ONETHDENDERITE_LEGGINGS, ONETHDENDERITE_BOOTS, ONETHDENDERITE_SWORD,
                        ONETHDENDERITE_AXE, ONETHDENDERITE_PICKAXE, ONETHDENDERITE_SHOVEL, ONETHDENDERITE_HOE, ONETHDENDERITE_PAXEL, ONETHDENDERITE_HAMMER,ONETHDENDERITE_SPEAR,
                        OLED_HELMET, OLED_CHESTPLATE, OLED_LEGGINGS, OLED_BOOTS,OLED_SWORD,
                        OLED_AXE, OLED_PICKAXE, OLED_SHOVEL, OLED_HOE, OLED_PAXEL, OLED_HAMMER,OLED_SPEAR,
                        OLED_INGOT,itemLookup, exporter);
                upgradeRecipes(ANCIENT_UPGRADE_SMITHING_TEMPLATE,
                        OLED_HELMET, OLED_CHESTPLATE, OLED_LEGGINGS, OLED_BOOTS, OLED_SWORD,
                        OLED_AXE, OLED_PICKAXE, OLED_SHOVEL, OLED_HOE, OLED_PAXEL, OLED_HAMMER,OLED_SPEAR,
                        ANCIENT_HELMET, ANCIENT_CHESTPLATE, ANCIENT_LEGGINGS, ANCIENT_BOOTS,ANCIENT_SWORD,
                        ANCIENT_AXE, ANCIENT_PICKAXE, ANCIENT_SHOVEL, ANCIENT_HOE, ANCIENT_PAXEL, ANCIENT_HAMMER,ANCIENT_SPEAR,
                        ANCIENT_INGOT,itemLookup, exporter);



                paxelAndHammer(ItemTags.PLANKS, Items.WOODEN_PICKAXE, Items.WOODEN_AXE, Items.WOODEN_SHOVEL, Items.WOODEN_HOE, WOODEN_PAXEL, WOODEN_HAMMER,itemLookup, exporter);
                paxelAndHammer(Items.COBBLESTONE, Items.STONE_PICKAXE, Items.STONE_AXE, Items.STONE_SHOVEL, Items.STONE_HOE, STONE_PAXEL, STONE_HAMMER,itemLookup, exporter);
                paxelAndHammer(Items.GOLD_INGOT, Items.GOLDEN_PICKAXE, Items.GOLDEN_AXE, Items.GOLDEN_SHOVEL, Items.GOLDEN_HOE, GOLDEN_PAXEL, GOLDEN_HAMMER,itemLookup, exporter);
                paxelAndHammer(Items.IRON_INGOT, Items.IRON_PICKAXE, Items.IRON_AXE, Items.IRON_SHOVEL, Items.IRON_HOE, IRON_PAXEL, IRON_HAMMER,itemLookup, exporter);
                paxelAndHammer(Items.DIAMOND, Items.DIAMOND_PICKAXE, Items.DIAMOND_AXE, Items.DIAMOND_SHOVEL, Items.DIAMOND_HOE, DIAMOND_PAXEL, DIAMOND_HAMMER,itemLookup, exporter);
                paxelAndHammer(Items.COPPER_INGOT, Items.COPPER_PICKAXE, Items.COPPER_AXE, Items.COPPER_SHOVEL, Items.COPPER_HOE, COPPER_PAXEL, COPPER_HAMMER,itemLookup, exporter);


                upgradeRecipe(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, DIAMOND_PAXEL, Items.NETHERITE_INGOT, NETHERITE_PAXEL,itemLookup, exporter);
                upgradeRecipe(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, DIAMOND_HAMMER, Items.NETHERITE_INGOT, NETHERITE_HAMMER,itemLookup, exporter);
            }

            private void craftFromResourceRecipes(Item resource,
                                                  Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item helmet, Item chestplate, Item leggings, Item boots,
                                                  Item paxel, Item hammer, Item spear, HolderGetter<Item> itemLookup, RecipeOutput exporter) {
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, sword)
                        .define('A', resource)
                        .define('B', WOODEN_RODS)
                        .pattern("A")
                        .pattern("A")
                        .pattern("B")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, axe)
                        .define('A', resource)
                        .define('B', WOODEN_RODS)
                        .pattern("AA")
                        .pattern("BA")
                        .pattern("B ")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, pickaxe)
                        .define('A', resource)
                        .define('B', WOODEN_RODS)
                        .pattern("AAA")
                        .pattern(" B ")
                        .pattern(" B ")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, shovel)
                        .define('A', resource)
                        .define('B', WOODEN_RODS)
                        .pattern("A")
                        .pattern("B")
                        .pattern("B")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, hoe)
                        .define('A', resource)
                        .define('B', WOODEN_RODS)
                        .pattern("AA")
                        .pattern("B ")
                        .pattern("B ")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, hammer)
                        .define('A', resource)
                        .define('B', WOODEN_RODS)
                        .pattern("AAA")
                        .pattern(" A ")
                        .pattern(" B ")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, helmet)
                        .define('A', resource)
                        .pattern("AAA")
                        .pattern("A A")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, chestplate)
                        .define('A', resource)
                        .pattern("A A")
                        .pattern("AAA")
                        .pattern("AAA")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, leggings)
                        .define('A', resource)
                        .pattern("AAA")
                        .pattern("A A")
                        .pattern("A A")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, boots)
                        .define('A', resource)
                        .pattern("A A")
                        .pattern("A A")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
                ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.TOOLS, paxel)
                        .requires(axe).requires(pickaxe).requires(shovel).requires(hoe)
                        .unlockedBy(getItemName(pickaxe), has(pickaxe))
                        .save(exporter);
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, spear)
                        .define('A', WOODEN_RODS)
                        .define('B', resource)
                        .pattern("  B")
                        .pattern(" A ")
                        .pattern("A  ")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
            }

            private void paxelAndHammer(TagKey<Item> resource, Item axe, Item pickaxe, Item shovel, Item hoe, Item paxel, Item hammer, HolderGetter<Item> itemLookup, RecipeOutput exporter) {
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, hammer)
                        .define('A', resource)
                        .define('B', WOODEN_RODS)
                        .pattern("AAA")
                        .pattern(" A ")
                        .pattern(" B ")
                        .unlockedBy("has_" + resource.registry().identifier().getNamespace(), has(resource))
                        .save(exporter);
                ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.TOOLS, paxel)
                        .requires(axe).requires(pickaxe).requires(shovel).requires(hoe)
                        .unlockedBy(getItemName(pickaxe), has(pickaxe))
                        .save(exporter);
            }

            private void paxelAndHammer(Item resource, Item axe, Item pickaxe, Item shovel, Item hoe, Item paxel, Item hammer, HolderGetter<Item> itemLookup, RecipeOutput exporter) {
                ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.TOOLS, hammer)
                        .define('A', resource)
                        .define('B', WOODEN_RODS)
                        .pattern("AAA")
                        .pattern(" A ")
                        .pattern(" B ")
                        .unlockedBy(getItemName(resource), has(resource))
                        .save(exporter);
                ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.TOOLS, paxel)
                        .requires(axe).requires(pickaxe).requires(shovel).requires(hoe)
                        .unlockedBy(getItemName(pickaxe), has(pickaxe))
                        .save(exporter);
            }

            private void upgradeRecipes(Item template,
                                        Item baseHelmet, Item baseChestplate, Item baseLeggings, Item baseBoots, Item baseSword, Item baseAxe, Item basePickaxe, Item baseShovel, Item baseHoe,
                                        Item basePaxel, Item baseHammer, Item baseSpear,
                                        Item helmet, Item chestplate, Item leggings, Item boots, Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item paxel, Item hammer, Item spear,
                                        Item addition, HolderGetter<Item> itemLookup, RecipeOutput exporter)  {
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
                upgradeRecipe(template, baseSpear, addition, spear, itemLookup, exporter);
                ShapelessRecipeBuilder.shapeless(itemLookup, RecipeCategory.TOOLS, paxel)
                        .requires(axe).requires(pickaxe).requires(shovel).requires(hoe)
                        .unlockedBy(getItemName(pickaxe), has(pickaxe))
                        .save(exporter);
            }

            private void upgradeRecipe(Item template, Item base, Item addition, Item result, HolderGetter<Item> getter, RecipeOutput exporter) {
                SmithingTransformRecipeBuilder.smithing( Ingredient.of(template), Ingredient.of(base), Ingredient.of(addition),
                                RecipeCategory.TOOLS, result)
                        .unlocks(getItemName(addition), has(addition))
                        .save(exporter, ResourceKey.create(Registries.RECIPE, MoreToolsAndArmor.id(getItemName(result) + "_upgrade")));
            }
        };
    }

    @Override
    public String getName() {
        return "Recipe Provider";
    }
}
