package github.mcdatapack.more_tools_and_armor.enums;

import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public enum ToolMaterials implements ToolMaterial {
    //DEV NOTE 14w34a = 14, w->23->2+3, 34->3+4, a->1
    //DEV NOTE 14571(10) -> 431241(5)
    //DEV NOTE PI 3.1415926535897932384626433832795
    COAL(
            135, 3F, 1F, BlockTags.INCORRECT_FOR_STONE_TOOL, 6,
            Ingredient.ofItems(Items.COAL)
    ),
    BUDDING_AMETHYST(
            500, 7F, 1F, BlockTags.INCORRECT_FOR_IRON_TOOL, 12,
            Ingredient.ofItems(ItemInit.BUDDING_AMETHYST_CRYSTAL)
    ),
    COPPER(
            210, 6F, 1F, BlockTags.INCORRECT_FOR_STONE_TOOL, 15,
            Ingredient.ofItems(Items.COPPER_INGOT)
    ),
    LAPIS(280, 5F, 1F, BlockTags.INCORRECT_FOR_IRON_TOOL, 8,
            Ingredient.ofItems(Items.LAPIS_LAZULI)
    ),
    EMERALD(
            375, 6.5F, 1F, BlockTags.INCORRECT_FOR_IRON_TOOL, 14,
            Ingredient.ofItems(Items.EMERALD)
    ),
    REDSTONE(855, 7.5F, 1F, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 13,
            Ingredient.ofItems(Items.REDSTONE)
    ),
    OBSIDIAN(
            1331, 8.5F, 1F, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 10,
            Ingredient.ofItems(Items.OBSIDIAN)
    ),
    DEEPSLATE_EMERALD(
            14_571, 40F, 1F, TagList.BlockTags.INCORRECT_FOR_DEEPSLATE_EMERALD_TOOL, 100,
            Ingredient.ofItems(ItemInit.DEEPSLATE_EMERALD)
    ),
    END_DIAMOND(
            24_581, 80F, 1F, TagList.BlockTags.INCORRECT_FOR_END_DIAMOND_TOOL, 100,
            Ingredient.ofItems(ItemInit.END_DIAMOND)
    ),
    VOID(
            431_241, 256F, 1F, TagList.BlockTags.INCORRECT_FOR_VOID_TOOL, 100,
            Ingredient.ofItems(ItemInit.VOID_INGOT)
    ),
    ONETHDENDERITE(
            3_141_592, 1256F, 1F, TagList.BlockTags.INCORRECT_FOR_ONETHDENDERITE_TOOL, 100,
            Ingredient.ofItems(ItemInit.ONETHDENDERITE_INGOT)
    ),
    OLED(
            31_415_926, 3141F, 1F, TagList.BlockTags.INCORRECT_FOR_OLED_TOOL, 100,
            Ingredient.ofItems(ItemInit.OLED_INGOT)
    ),
    ANCIENT(
            Integer.MAX_VALUE, 2712561F, 150F, TagList.BlockTags.INCORRECT_FOR_ANCIENT_TOOL, 100,
            Ingredient.ofItems(ItemInit.ANCIENT_INGOT)
    );

    private final int durability;
    private final float miningSpeedMultiplier, attackDamage;
    private final TagKey<Block> inverseTag;
    private final int enchantability;
    private final Ingredient repairIngredient;

    ToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, TagKey<Block> inverseTag, int enchantability,
                  Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.inverseTag = inverseTag;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
