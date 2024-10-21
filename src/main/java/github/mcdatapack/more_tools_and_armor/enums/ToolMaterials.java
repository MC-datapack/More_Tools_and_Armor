package github.mcdatapack.more_tools_and_armor.enums;

import net.minecraft.item.ToolMaterial;

import static github.mcdatapack.more_tools_and_armor.list.TagList.BlockTags.*;
import static github.mcdatapack.more_tools_and_armor.list.TagList.ItemTags.*;
import static net.minecraft.registry.tag.BlockTags.*;

public enum ToolMaterials {
    //Durability, Mining Speed Multiplier, Attack Damage Multiplier, Enchantebility
    BUDDING_AMETHYST(
            new ToolMaterial(
                    INCORRECT_FOR_IRON_TOOL, 500, 7F, 1F, 12,
                    BUDDING_AMETHYST_REPAIR_ITEMS
            )
    ),
    COPPER(
            new ToolMaterial(
                    INCORRECT_FOR_STONE_TOOL, 121, 6F, 1F, 18,
                    COPPER_REPAIR_ITEMS
            )
    ),
    EMERALD(
            new ToolMaterial(
                    INCORRECT_FOR_IRON_TOOL, 375, 6.5F, 1F, 14,
                    EMERALD_REPAIR_ITEMS
            )
    ),
    OBSIDIAN(
            new ToolMaterial(
                    INCORRECT_FOR_DIAMOND_TOOL,1831, 8.5F, 1F,  10,
                    OBSIDIAN_REPAIR_ITEMS
            )
    ),
    DEEPSLATE_EMERALD(
            new ToolMaterial(
                    INCORRECT_FOR_DEEPSLATE_EMERALD_TOOL, 14571, 40F, 1F, 100,
                    DEEPSLATE_EMERALD_REPAIR_ITEMS
            )
    ),
    END_DIAMOND(
            new ToolMaterial(
                    INCORRECT_FOR_END_DIAMOND_TOOL, 24581, 80F, 1F, 100,
                    END_DIAMOND_REPAIR_ITEMS
            )
    ),
    VOID(
            new ToolMaterial(
                    INCORRECT_FOR_VOID_TOOL, 431241, 256F, 1F, 100,
                    VOID_REPAIR_ITEMS
            )
    ),
    ONETHDENDERITE(
            new ToolMaterial(
                    INCORRECT_FOR_ONETHDENDERITE_TOOL, 3141592, 1256F, 1F, 100,
                    ONETHDENDERITE_REPAIR_ITEMS
            )
    );

    private final ToolMaterial material;

    ToolMaterials(ToolMaterial material) {
        this.material = material;
    }

    public ToolMaterial getMaterial() {
        return this.material;
    }
}
