package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.recipe.Ingredient;
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
