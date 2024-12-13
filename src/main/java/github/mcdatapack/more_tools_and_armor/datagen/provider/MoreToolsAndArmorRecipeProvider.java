package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.recipe.book.RecipeCategory;
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
    }
}
