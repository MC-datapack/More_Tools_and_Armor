package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;

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
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ANCIENT_HONEY_BLOCK)
                .input('A', ANCIENT_HONEY_BOTTLE)
                .pattern("AA")
                .pattern("AA")
                .criterion(hasItem(ANCIENT_HONEY_BOTTLE), conditionsFromItem(ANCIENT_HONEY_BOTTLE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ANCIENT_HONEY_BOTTLE, 4)
                .input(ANCIENT_HONEY_BLOCK)
                .input(GLASS_BOTTLE)
                .input(GLASS_BOTTLE)
                .input(GLASS_BOTTLE)
                .input(GLASS_BOTTLE)
                .criterion(hasItem(ANCIENT_HONEY_BLOCK), conditionsFromItem(ANCIENT_HONEY_BLOCK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ANCIENT_INGOT)
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ANCIENT_UPGRADE_SMITHING_TEMPLATE)
                .input('A', DIAMOND)
                .input('B', ANCIENT_INGOT)
                .input('C', OLED_UPGRADE_SMITHING_TEMPLATE)
                .pattern("BCB")
                .pattern("BAB")
                .pattern("AAA")
                .criterion(hasItem(ANCIENT_INGOT), conditionsFromItem(ANCIENT_INGOT))
                .offerTo(exporter, "ancient_upgrade_smithing_template");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ANCIENT_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('A', DIAMOND)
                .input('B', ANCIENT_INGOT)
                .input('C', ANCIENT_UPGRADE_SMITHING_TEMPLATE)
                .pattern("ACA")
                .pattern("ABA")
                .pattern("AAA")
                .criterion(hasItem(ANCIENT_INGOT), conditionsFromItem(ANCIENT_INGOT))
                .offerTo(exporter, "ancient_upgrade_smithing_template_dupe");




        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, WOODEN_PAXEL)
                .input(WOODEN_AXE).input(WOODEN_PICKAXE).input(WOODEN_SHOVEL).input(WOODEN_HOE)
                .criterion(hasItem(WOODEN_PICKAXE), conditionsFromItem(WOODEN_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, STONE_PAXEL)
                .input(STONE_AXE).input(STONE_PICKAXE).input(STONE_SHOVEL).input(STONE_HOE)
                .criterion(hasItem(STONE_PICKAXE), conditionsFromItem(STONE_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, IRON_PAXEL)
                .input(IRON_AXE).input(IRON_PICKAXE).input(IRON_SHOVEL).input(IRON_HOE)
                .criterion(hasItem(IRON_PICKAXE), conditionsFromItem(IRON_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOLDEN_PAXEL)
                .input(GOLDEN_AXE).input(GOLDEN_PICKAXE).input(GOLDEN_SHOVEL).input(GOLDEN_HOE)
                .criterion(hasItem(GOLDEN_PICKAXE), conditionsFromItem(GOLDEN_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, DIAMOND_PAXEL)
                .input(DIAMOND_AXE).input(DIAMOND_PICKAXE).input(DIAMOND_SHOVEL).input(DIAMOND_HOE)
                .criterion(hasItem(DIAMOND_PICKAXE), conditionsFromItem(DIAMOND_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, NETHERITE_PAXEL)
                .input(NETHERITE_AXE).input(NETHERITE_PICKAXE).input(NETHERITE_SHOVEL).input(NETHERITE_HOE)
                .criterion(hasItem(NETHERITE_PICKAXE), conditionsFromItem(NETHERITE_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, COPPER_PAXEL)
                .input(COPPER_AXE).input(COPPER_PICKAXE).input(COPPER_SHOVEL).input(COPPER_HOE)
                .criterion(hasItem(COPPER_PICKAXE), conditionsFromItem(COPPER_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUDDING_AMETHYST_PAXEL)
                .input(BUDDING_AMETHYST_AXE).input(BUDDING_AMETHYST_PICKAXE).input(BUDDING_AMETHYST_SHOVEL).input(BUDDING_AMETHYST_HOE)
                .criterion(hasItem(BUDDING_AMETHYST_PICKAXE), conditionsFromItem(BUDDING_AMETHYST_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMERALD_PAXEL)
                .input(EMERALD_AXE).input(EMERALD_PICKAXE).input(EMERALD_SHOVEL).input(EMERALD_HOE)
                .criterion(hasItem(EMERALD_PICKAXE), conditionsFromItem(EMERALD_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, OBSIDIAN_PAXEL)
                .input(OBSIDIAN_AXE).input(OBSIDIAN_PICKAXE).input(OBSIDIAN_SHOVEL).input(OBSIDIAN_HOE)
                .criterion(hasItem(OBSIDIAN_PICKAXE), conditionsFromItem(OBSIDIAN_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, DEEPSLATE_EMERALD_PAXEL)
                .input(DEEPSLATE_EMERALD_AXE).input(DEEPSLATE_EMERALD_PICKAXE).input(DEEPSLATE_EMERALD_SHOVEL).input(DEEPSLATE_EMERALD_HOE)
                .criterion(hasItem(DEEPSLATE_EMERALD_PICKAXE), conditionsFromItem(DEEPSLATE_EMERALD_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, END_DIAMOND_PAXEL)
                .input(END_DIAMOND_AXE).input(END_DIAMOND_PICKAXE).input(END_DIAMOND_SHOVEL).input(END_DIAMOND_HOE)
                .criterion(hasItem(END_DIAMOND_PICKAXE), conditionsFromItem(END_DIAMOND_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, VOID_PAXEL)
                .input(VOID_AXE).input(VOID_PICKAXE).input(VOID_SHOVEL).input(VOID_HOE)
                .criterion(hasItem(VOID_PICKAXE), conditionsFromItem(VOID_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ONETHDENDERITE_PAXEL)
                .input(ONETHDENDERITE_AXE).input(ONETHDENDERITE_PICKAXE).input(ONETHDENDERITE_SHOVEL).input(ONETHDENDERITE_HOE)
                .criterion(hasItem(ONETHDENDERITE_PICKAXE), conditionsFromItem(ONETHDENDERITE_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, OLED_PAXEL)
                .input(OLED_AXE).input(OLED_PICKAXE).input(OLED_SHOVEL).input(OLED_HOE)
                .criterion(hasItem(OLED_PICKAXE), conditionsFromItem(OLED_PICKAXE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ANCIENT_PAXEL)
                .input(ANCIENT_AXE).input(ANCIENT_PICKAXE).input(ANCIENT_SHOVEL).input(ANCIENT_HOE)
                .criterion(hasItem(ANCIENT_PICKAXE), conditionsFromItem(ANCIENT_PICKAXE))
                .offerTo(exporter);



        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, DEEPSLATE_EMERALD, 9)
                .input(DEEPSLATE_EMERALD_BLOCK)
                .criterion(hasItem(DEEPSLATE_EMERALD), conditionsFromItem(DEEPSLATE_EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DEEPSLATE_EMERALD_BLOCK)
                .input('A', DEEPSLATE_EMERALD)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(DEEPSLATE_EMERALD), conditionsFromItem(DEEPSLATE_EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('A', DIAMOND)
                .input('B', DEEPSLATE_EMERALD)
                .input('C', NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("BCB")
                .pattern("BAB")
                .pattern("AAA")
                .criterion(hasItem(DEEPSLATE_EMERALD), conditionsFromItem(DEEPSLATE_EMERALD))
                .offerTo(exporter, "deepslate_emerald_upgrade_smithing_template");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('A', DIAMOND)
                .input('B', DEEPSLATE_EMERALD)
                .input('C', DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE)
                .pattern("ACA")
                .pattern("ABA")
                .pattern("AAA")
                .criterion(hasItem(DEEPSLATE_EMERALD), conditionsFromItem(DEEPSLATE_EMERALD))
                .offerTo(exporter, "deepslate_emerald_upgrade_smithing_template_dupe");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, END_DIAMOND, 9)
                .input(END_DIAMOND_BLOCK)
                .criterion(hasItem(END_DIAMOND), conditionsFromItem(END_DIAMOND))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, END_DIAMOND_BLOCK)
                .input('A', END_DIAMOND)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(END_DIAMOND), conditionsFromItem(END_DIAMOND))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, END_DIAMOND_UPGRADE_SMITHING_TEMPLATE)
                .input('A', DIAMOND)
                .input('B', END_DIAMOND)
                .input('C', DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE)
                .pattern("BCB")
                .pattern("BAB")
                .pattern("AAA")
                .criterion(hasItem(END_DIAMOND), conditionsFromItem(END_DIAMOND))
                .offerTo(exporter, "end_diamond_upgrade_smithing_template");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, END_DIAMOND_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('A', DIAMOND)
                .input('B', END_DIAMOND)
                .input('C', END_DIAMOND_UPGRADE_SMITHING_TEMPLATE)
                .pattern("ACA")
                .pattern("ABA")
                .pattern("AAA")
                .criterion(hasItem(END_DIAMOND), conditionsFromItem(END_DIAMOND))
                .offerTo(exporter, "end_diamond_upgrade_smithing_template_dupe");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, VOID_INGOT)
                .input('A', END_DIAMOND)
                .input('B', NETHERITE_INGOT)
                .input('C', ELYTRA)
                .pattern("AAA")
                .pattern("BCB")
                .pattern("AAA")
                .criterion(hasItem(END_DIAMOND), conditionsFromItem(END_DIAMOND))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, VOID_UPGRADE_SMITHING_TEMPLATE)
                .input('A', END_DIAMOND)
                .input('B', VOID_INGOT)
                .input('C', END_DIAMOND_UPGRADE_SMITHING_TEMPLATE)
                .pattern("BCB")
                .pattern("BAB")
                .pattern("AAA")
                .criterion(hasItem(VOID_INGOT), conditionsFromItem(VOID_INGOT))
                .offerTo(exporter, "void_upgrade_smithing_template");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, VOID_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('A', END_DIAMOND)
                .input('B', VOID_INGOT)
                .input('C', VOID_UPGRADE_SMITHING_TEMPLATE)
                .pattern("ACA")
                .pattern("ABA")
                .pattern("AAA")
                .criterion(hasItem(VOID_INGOT), conditionsFromItem(VOID_INGOT))
                .offerTo(exporter, "void_upgrade_smithing_template_dupe");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, SCULK_EMERALD_BLOCK)
                .input('A', SCULK_EMERALD)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(SCULK_EMERALD), conditionsFromItem(SCULK_EMERALD))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, SCULK_EMERALD, 9)
                .input(SCULK_EMERALD_BLOCK)
                .criterion(hasItem(SCULK_EMERALD), conditionsFromItem(SCULK_EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BLACKSTONE_EMERALD_BLOCK)
                .input('A', BLACKSTONE_EMERALD)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(BLACKSTONE_EMERALD), conditionsFromItem(BLACKSTONE_EMERALD))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BLACKSTONE_EMERALD, 9)
                .input(BLACKSTONE_EMERALD_BLOCK)
                .criterion(hasItem(BLACKSTONE_EMERALD), conditionsFromItem(BLACKSTONE_EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, END_EMERALD_BLOCK)
                .input('A', END_EMERALD)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(END_EMERALD), conditionsFromItem(END_EMERALD))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, END_EMERALD, 9)
                .input(END_EMERALD_BLOCK)
                .criterion(hasItem(END_EMERALD), conditionsFromItem(END_EMERALD))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ONETHDENDERITE_INGOT, 2)
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE)
                .input('A', END_DIAMOND)
                .input('B', ONETHDENDERITE_INGOT)
                .input('C', VOID_UPGRADE_SMITHING_TEMPLATE)
                .pattern("BCB")
                .pattern("BAB")
                .pattern("AAA")
                .criterion(hasItem(ONETHDENDERITE_INGOT), conditionsFromItem(ONETHDENDERITE_INGOT))
                .offerTo(exporter, "onethdenderite_upgrade_smithing_template");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('A', END_DIAMOND)
                .input('B', ONETHDENDERITE_INGOT)
                .input('C', ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("ACA")
                .pattern("ABA")
                .pattern("AAA")
                .criterion(hasItem(ONETHDENDERITE_INGOT), conditionsFromItem(ONETHDENDERITE_INGOT))
                .offerTo(exporter, "onethdenderite_upgrade_smithing_template_dupe");



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, OLED_INGOT)
                .input('A', ONETHDENDERITE_INGOT)
                .input('B', ZOMBIE_HEAD)
                .input('C', NETHERITE_BLOCK)
                .input('D', DIAMOND_BLOCK)
                .pattern("ACA")
                .pattern("ABA")
                .pattern("ADA")
                .criterion(hasItem(ONETHDENDERITE_INGOT), conditionsFromItem(ONETHDENDERITE_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, OLED_UPGRADE_SMITHING_TEMPLATE)
                .input('A', ONETHDENDERITE_INGOT)
                .input('B', OLED_INGOT)
                .input('C', ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("BCB")
                .pattern("BAB")
                .pattern("AAA")
                .criterion(hasItem(OLED_INGOT), conditionsFromItem(OLED_INGOT))
                .offerTo(exporter, "oled_upgrade_smithing_template");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, OLED_UPGRADE_SMITHING_TEMPLATE, 2)
                .input('A', ONETHDENDERITE_INGOT)
                .input('B', OLED_INGOT)
                .input('C', OLED_UPGRADE_SMITHING_TEMPLATE)
                .pattern("ACA")
                .pattern("ABA")
                .pattern("AAA")
                .criterion(hasItem(OLED_INGOT), conditionsFromItem(OLED_INGOT))
                .offerTo(exporter, "oled_upgrade_smithing_template_dupe");



        //BUDDING AMETHYST
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUDDING_AMETHYST_SWORD)
                .input('A', BUDDING_AMETHYST_CRYSTAL)
                .input('B', WOODEN_RODS)
                .pattern("A")
                .pattern("A")
                .pattern("B")
                .criterion(hasItem(BUDDING_AMETHYST_CRYSTAL), conditionsFromItem(BUDDING_AMETHYST_CRYSTAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUDDING_AMETHYST_AXE)
                .input('A', BUDDING_AMETHYST_CRYSTAL)
                .input('B', WOODEN_RODS)
                .pattern("AA")
                .pattern("BA")
                .pattern("B ")
                .criterion(hasItem(BUDDING_AMETHYST_CRYSTAL), conditionsFromItem(BUDDING_AMETHYST_CRYSTAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUDDING_AMETHYST_PICKAXE)
                .input('A', BUDDING_AMETHYST_CRYSTAL)
                .input('B', WOODEN_RODS)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .criterion(hasItem(BUDDING_AMETHYST_CRYSTAL), conditionsFromItem(BUDDING_AMETHYST_CRYSTAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUDDING_AMETHYST_SHOVEL)
                .input('A', BUDDING_AMETHYST_CRYSTAL)
                .input('B', WOODEN_RODS)
                .pattern("A")
                .pattern("B")
                .pattern("B")
                .criterion(hasItem(BUDDING_AMETHYST_CRYSTAL), conditionsFromItem(BUDDING_AMETHYST_CRYSTAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUDDING_AMETHYST_HOE)
                .input('A', BUDDING_AMETHYST_CRYSTAL)
                .input('B', WOODEN_RODS)
                .pattern("AA")
                .pattern("B ")
                .pattern("B ")
                .criterion(hasItem(BUDDING_AMETHYST_CRYSTAL), conditionsFromItem(BUDDING_AMETHYST_CRYSTAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUDDING_AMETHYST_HELMET)
                .input('A', BUDDING_AMETHYST_CRYSTAL)
                .pattern("AAA")
                .pattern("A A")
                .criterion(hasItem(BUDDING_AMETHYST_CRYSTAL), conditionsFromItem(BUDDING_AMETHYST_CRYSTAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUDDING_AMETHYST_CHESTPLATE)
                .input('A', BUDDING_AMETHYST_CRYSTAL)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(BUDDING_AMETHYST_CRYSTAL), conditionsFromItem(BUDDING_AMETHYST_CRYSTAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUDDING_AMETHYST_LEGGINGS)
                .input('A', BUDDING_AMETHYST_CRYSTAL)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .criterion(hasItem(BUDDING_AMETHYST_CRYSTAL), conditionsFromItem(BUDDING_AMETHYST_CRYSTAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, BUDDING_AMETHYST_BOOTS)
                .input('A', BUDDING_AMETHYST_CRYSTAL)
                .pattern("A A")
                .pattern("A A")
                .criterion(hasItem(BUDDING_AMETHYST_CRYSTAL), conditionsFromItem(BUDDING_AMETHYST_CRYSTAL))
                .offerTo(exporter);



        //COPPER
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, COPPER_SWORD)
                .input('A', COPPER_INGOT)
                .input('B', WOODEN_RODS)
                .pattern("A")
                .pattern("A")
                .pattern("B")
                .criterion(hasItem(COPPER_INGOT), conditionsFromItem(COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, COPPER_AXE)
                .input('A', COPPER_INGOT)
                .input('B', WOODEN_RODS)
                .pattern("AA")
                .pattern("BA")
                .pattern("B ")
                .criterion(hasItem(COPPER_INGOT), conditionsFromItem(COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, COPPER_PICKAXE)
                .input('A', COPPER_INGOT)
                .input('B', WOODEN_RODS)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .criterion(hasItem(COPPER_INGOT), conditionsFromItem(COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, COPPER_SHOVEL)
                .input('A', COPPER_INGOT)
                .input('B', WOODEN_RODS)
                .pattern("A")
                .pattern("B")
                .pattern("B")
                .criterion(hasItem(COPPER_INGOT), conditionsFromItem(COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, COPPER_HOE)
                .input('A', COPPER_INGOT)
                .input('B', WOODEN_RODS)
                .pattern("AA")
                .pattern("B ")
                .pattern("B ")
                .criterion(hasItem(COPPER_INGOT), conditionsFromItem(COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, COPPER_HELMET)
                .input('A', COPPER_INGOT)
                .pattern("AAA")
                .pattern("A A")
                .criterion(hasItem(COPPER_INGOT), conditionsFromItem(COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, COPPER_CHESTPLATE)
                .input('A', COPPER_INGOT)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(COPPER_INGOT), conditionsFromItem(COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, COPPER_LEGGINGS)
                .input('A', COPPER_INGOT)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .criterion(hasItem(COPPER_INGOT), conditionsFromItem(COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, COPPER_BOOTS)
                .input('A', COPPER_INGOT)
                .pattern("A A")
                .pattern("A A")
                .criterion(hasItem(COPPER_INGOT), conditionsFromItem(COPPER_INGOT))
                .offerTo(exporter);




        //EMERALD
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMERALD_SWORD)
                .input('A', EMERALD)
                .input('B', WOODEN_RODS)
                .pattern("A")
                .pattern("A")
                .pattern("B")
                .criterion(hasItem(EMERALD), conditionsFromItem(EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMERALD_AXE)
                .input('A', EMERALD)
                .input('B', WOODEN_RODS)
                .pattern("AA")
                .pattern("BA")
                .pattern("B ")
                .criterion(hasItem(EMERALD), conditionsFromItem(EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMERALD_PICKAXE)
                .input('A', EMERALD)
                .input('B', WOODEN_RODS)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .criterion(hasItem(EMERALD), conditionsFromItem(EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMERALD_SHOVEL)
                .input('A', EMERALD)
                .input('B', WOODEN_RODS)
                .pattern("A")
                .pattern("B")
                .pattern("B")
                .criterion(hasItem(EMERALD), conditionsFromItem(EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMERALD_HOE)
                .input('A', EMERALD)
                .input('B', WOODEN_RODS)
                .pattern("AA")
                .pattern("B ")
                .pattern("B ")
                .criterion(hasItem(EMERALD), conditionsFromItem(EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMERALD_HELMET)
                .input('A', EMERALD)
                .pattern("AAA")
                .pattern("A A")
                .criterion(hasItem(EMERALD), conditionsFromItem(EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMERALD_CHESTPLATE)
                .input('A', EMERALD)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(EMERALD), conditionsFromItem(EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMERALD_LEGGINGS)
                .input('A', EMERALD)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .criterion(hasItem(EMERALD), conditionsFromItem(EMERALD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMERALD_BOOTS)
                .input('A', EMERALD)
                .pattern("A A")
                .pattern("A A")
                .criterion(hasItem(EMERALD), conditionsFromItem(EMERALD))
                .offerTo(exporter);



        //OBSIDIAN
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OBSIDIAN_SWORD)
                .input('A', OBSIDIAN)
                .input('B', WOODEN_RODS)
                .pattern("A")
                .pattern("A")
                .pattern("B")
                .criterion(hasItem(OBSIDIAN), conditionsFromItem(OBSIDIAN))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OBSIDIAN_AXE)
                .input('A', OBSIDIAN)
                .input('B', WOODEN_RODS)
                .pattern("AA")
                .pattern("BA")
                .pattern("B ")
                .criterion(hasItem(OBSIDIAN), conditionsFromItem(OBSIDIAN))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OBSIDIAN_PICKAXE)
                .input('A', OBSIDIAN)
                .input('B', WOODEN_RODS)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .criterion(hasItem(OBSIDIAN), conditionsFromItem(OBSIDIAN))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OBSIDIAN_SHOVEL)
                .input('A', OBSIDIAN)
                .input('B', WOODEN_RODS)
                .pattern("A")
                .pattern("B")
                .pattern("B")
                .criterion(hasItem(OBSIDIAN), conditionsFromItem(OBSIDIAN))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OBSIDIAN_HOE)
                .input('A', OBSIDIAN)
                .input('B', WOODEN_RODS)
                .pattern("AA")
                .pattern("B ")
                .pattern("B ")
                .criterion(hasItem(OBSIDIAN), conditionsFromItem(OBSIDIAN))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OBSIDIAN_HELMET)
                .input('A', OBSIDIAN)
                .pattern("AAA")
                .pattern("A A")
                .criterion(hasItem(OBSIDIAN), conditionsFromItem(OBSIDIAN))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OBSIDIAN_CHESTPLATE)
                .input('A', OBSIDIAN)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(OBSIDIAN), conditionsFromItem(OBSIDIAN))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OBSIDIAN_LEGGINGS)
                .input('A', OBSIDIAN)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .criterion(hasItem(OBSIDIAN), conditionsFromItem(OBSIDIAN))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OBSIDIAN_BOOTS)
                .input('A', OBSIDIAN)
                .pattern("A A")
                .pattern("A A")
                .criterion(hasItem(OBSIDIAN), conditionsFromItem(OBSIDIAN))
                .offerTo(exporter);

        upgradeRecipes(DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE,
                NETHERITE_HELMET, NETHERITE_CHESTPLATE, NETHERITE_LEGGINGS, NETHERITE_BOOTS,NETHERITE_SWORD, NETHERITE_AXE, NETHERITE_PICKAXE, NETHERITE_SHOVEL, NETHERITE_HOE, NETHERITE_PAXEL,
                DEEPSLATE_EMERALD_HELMET, DEEPSLATE_EMERALD_CHESTPLATE, DEEPSLATE_EMERALD_LEGGINGS, DEEPSLATE_EMERALD_BOOTS,DEEPSLATE_EMERALD_SWORD, DEEPSLATE_EMERALD_AXE, DEEPSLATE_EMERALD_PICKAXE, DEEPSLATE_EMERALD_SHOVEL, DEEPSLATE_EMERALD_HOE, DEEPSLATE_EMERALD_PAXEL,
                DEEPSLATE_EMERALD, exporter);
        upgradeRecipes(END_DIAMOND_UPGRADE_SMITHING_TEMPLATE,
                DEEPSLATE_EMERALD_HELMET, DEEPSLATE_EMERALD_CHESTPLATE, DEEPSLATE_EMERALD_LEGGINGS, DEEPSLATE_EMERALD_BOOTS,DEEPSLATE_EMERALD_SWORD, DEEPSLATE_EMERALD_AXE, DEEPSLATE_EMERALD_PICKAXE, DEEPSLATE_EMERALD_SHOVEL, DEEPSLATE_EMERALD_HOE, DEEPSLATE_EMERALD_PAXEL,
                END_DIAMOND_HELMET, END_DIAMOND_CHESTPLATE, END_DIAMOND_LEGGINGS, END_DIAMOND_BOOTS,END_DIAMOND_SWORD, END_DIAMOND_AXE, END_DIAMOND_PICKAXE, END_DIAMOND_SHOVEL, END_DIAMOND_HOE, END_DIAMOND_PAXEL,
                END_DIAMOND, exporter);
        upgradeRecipes(VOID_UPGRADE_SMITHING_TEMPLATE,
                END_DIAMOND_HELMET, END_DIAMOND_CHESTPLATE, END_DIAMOND_LEGGINGS, END_DIAMOND_BOOTS,END_DIAMOND_SWORD, END_DIAMOND_AXE, END_DIAMOND_PICKAXE, END_DIAMOND_SHOVEL, END_DIAMOND_HOE, END_DIAMOND_PAXEL,
                VOID_HELMET, VOID_CHESTPLATE, VOID_LEGGINGS, VOID_BOOTS,VOID_SWORD, VOID_AXE, VOID_PICKAXE, VOID_SHOVEL, VOID_HOE, VOID_PAXEL,
                VOID_INGOT, exporter);
        upgradeRecipes(ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE,
                VOID_HELMET, VOID_CHESTPLATE, VOID_LEGGINGS, VOID_BOOTS,VOID_SWORD, VOID_AXE, VOID_PICKAXE, VOID_SHOVEL, VOID_HOE, VOID_PAXEL,
                ONETHDENDERITE_HELMET, ONETHDENDERITE_CHESTPLATE, ONETHDENDERITE_LEGGINGS, ONETHDENDERITE_BOOTS,ONETHDENDERITE_SWORD, ONETHDENDERITE_AXE, ONETHDENDERITE_PICKAXE, ONETHDENDERITE_SHOVEL, ONETHDENDERITE_HOE, ONETHDENDERITE_PAXEL,
                ONETHDENDERITE_INGOT, exporter);
        upgradeRecipes(OLED_UPGRADE_SMITHING_TEMPLATE,
                ONETHDENDERITE_HELMET, ONETHDENDERITE_CHESTPLATE, ONETHDENDERITE_LEGGINGS, ONETHDENDERITE_BOOTS,ONETHDENDERITE_SWORD, ONETHDENDERITE_AXE, ONETHDENDERITE_PICKAXE, ONETHDENDERITE_SHOVEL, ONETHDENDERITE_HOE, ONETHDENDERITE_PAXEL,
                OLED_HELMET, OLED_CHESTPLATE, OLED_LEGGINGS, OLED_BOOTS,OLED_SWORD, OLED_AXE, OLED_PICKAXE, OLED_SHOVEL, OLED_HOE, OLED_PAXEL,
                OLED_INGOT, exporter);
        upgradeRecipes(ANCIENT_UPGRADE_SMITHING_TEMPLATE,
                OLED_HELMET, OLED_CHESTPLATE, OLED_LEGGINGS, OLED_BOOTS,OLED_SWORD, OLED_AXE, OLED_PICKAXE, OLED_SHOVEL, OLED_HOE, OLED_PAXEL,
                ANCIENT_HELMET, ANCIENT_CHESTPLATE, ANCIENT_LEGGINGS, ANCIENT_BOOTS,ANCIENT_SWORD, ANCIENT_AXE, ANCIENT_PICKAXE, ANCIENT_SHOVEL, ANCIENT_HOE, ANCIENT_PAXEL,
                ANCIENT_INGOT, exporter);






        upgradeRecipe(NETHERITE_UPGRADE_SMITHING_TEMPLATE, DIAMOND_PAXEL, NETHERITE_INGOT, NETHERITE_PAXEL, exporter);
    }

    private void upgradeRecipes(Item template,
                                Item baseHelmet, Item baseChestplate, Item baseLeggings, Item baseBoots, Item baseSword, Item baseAxe, Item basePickaxe, Item baseShovel, Item baseHoe, Item basePaxel,
                                Item helmet, Item chestplate, Item leggings, Item boots, Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item paxel, Item
                                        addition, RecipeExporter exporter)  {
        upgradeRecipe(template, baseHelmet, addition, helmet, exporter);
        upgradeRecipe(template, baseChestplate, addition, chestplate, exporter);
        upgradeRecipe(template, baseLeggings, addition, leggings, exporter);
        upgradeRecipe(template, baseBoots, addition, boots, exporter);
        upgradeRecipe(template, baseSword, addition, sword, exporter);
        upgradeRecipe(template, baseAxe, addition, axe, exporter);
        upgradeRecipe(template, basePickaxe, addition, pickaxe, exporter);
        upgradeRecipe(template, baseShovel, addition, shovel, exporter);
        upgradeRecipe(template, baseHoe, addition, hoe, exporter);
        upgradeRecipe(template, basePaxel, addition, paxel, exporter);
    }

    private void upgradeRecipe(Item template, Item base, Item addition, Item result, RecipeExporter exporter) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(template), Ingredient.ofItems(base), Ingredient.ofItems(addition),
                RecipeCategory.TOOLS, result)
                .criterion(hasItem(addition), conditionsFromItem(addition))
                .offerTo(exporter, MoreToolsAndArmor.id(Registries.ITEM.getId(result).toString().split(":")[1] + "_upgrade"));
    }
}
