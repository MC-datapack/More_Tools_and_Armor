package github.mcdatapack.more_tools_and_armor.enums;

import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public enum ToolMaterials implements ToolMaterial {
    BUDDING_AMETHYST(
            500, 7F, 1F, BlockTags.INCORRECT_FOR_IRON_TOOL, 12,
            Ingredient.ofItems(ItemInit.BUDDING_AMETHYST_CRYSTAL)
    ),
    COPPER(
            121, 6F, 1F, BlockTags.INCORRECT_FOR_STONE_TOOL, 18,
            Ingredient.ofItems(Items.COPPER_INGOT)
    ),
    EMERALD(
            375, 6.5F, 1F, BlockTags.INCORRECT_FOR_IRON_TOOL, 14,
            Ingredient.ofItems(Items.EMERALD)
    ),
    OBSIDIAN(
            1831, 8.5F, 1F, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 10,
            Ingredient.ofItems(Items.OBSIDIAN)
    ),
    DEEPSLATE_EMERALD(
            14571, 40F, 1F, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 100,
            Ingredient.ofItems(ItemInit.DEEPSLATE_EMERALD)
    ),
    END_DIAMOND(
            24581, 80F, 1F, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 100,
            Ingredient.ofItems(ItemInit.END_DIAMOND)
    )
    ;

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
