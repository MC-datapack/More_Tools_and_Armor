package github.mcdatapack.more_tools_and_armor.init;

import net.minecraft.item.ToolMaterial;

import static github.mcdatapack.more_tools_and_armor.list.TagList.BlockTags.*;
import static github.mcdatapack.more_tools_and_armor.list.TagList.ItemTags.*;
import static net.minecraft.registry.tag.BlockTags.*;

public class ToolMaterialInit {
    //Durability, Mining Speed Multiplier, Attack Damage Multiplier, Enchantebility
    public static final ToolMaterial BUDDING_AMETHYST = new ToolMaterial(
            INCORRECT_FOR_IRON_TOOL, 500, 7F, 1F, 12,
            BUDDING_AMETHYST_REPAIR_ITEMS
    );
    public static final ToolMaterial COPPER = new ToolMaterial(
            INCORRECT_FOR_STONE_TOOL, 121, 6F, 1F, 18,
            COPPER_REPAIR_ITEMS
    );
    public static final ToolMaterial EMERALD = new ToolMaterial(
            INCORRECT_FOR_IRON_TOOL, 375, 6.5F, 1F, 14,
            EMERALD_REPAIR_ITEMS
    );
    public static final ToolMaterial OBSIDIAN = new ToolMaterial(
            INCORRECT_FOR_DIAMOND_TOOL,1831, 8.5F, 1F,  10,
            OBSIDIAN_REPAIR_ITEMS
    );
    public static final ToolMaterial DEEPSLATE_EMERALD = new ToolMaterial(
            INCORRECT_FOR_DEEPSLATE_EMERALD_TOOL, 14571, 40F, 1F, 100,
            DEEPSLATE_EMERALD_REPAIR_ITEMS
    );
    public static final ToolMaterial END_DIAMOND = new ToolMaterial(
            INCORRECT_FOR_END_DIAMOND_TOOL, 24581, 80F, 1F, 100,
            END_DIAMOND_REPAIR_ITEMS
    );
    public static final ToolMaterial VOID = new ToolMaterial(
            INCORRECT_FOR_VOID_TOOL, 431241, 256F, 1F, 100,
            VOID_REPAIR_ITEMS
    );
    public static final ToolMaterial ONETHDENDERITE = new ToolMaterial(
            INCORRECT_FOR_ONETHDENDERITE_TOOL, 3141592, 1256F, 1F, 100,
            ONETHDENDERITE_REPAIR_ITEMS
    );
    public static final ToolMaterial OLED = new ToolMaterial(
            INCORRECT_FOR_OLED_TOOL, Integer.MAX_VALUE, 3141, 1, 100,
            OLED_REPAIR_ITEMS
    );
    public static final ToolMaterial ANCIENT = new ToolMaterial(
            INCORRECT_FOR_ANCIENT_TOOL, Integer.MAX_VALUE, 2712561, 150, 100, ANCIENT_REPAIR_ITEMS
    );
}