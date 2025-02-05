package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.item.ShearsItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

import java.util.List;

public class MoreToolsAndArmorShearsItem extends ShearsItem {
    public MoreToolsAndArmorShearsItem(ToolMaterial material, Settings settings) {
        super(settings.maxDamage(material.getDurability()).component(DataComponentTypes.TOOL, createBetterToolComponent(material)));
    }

    private static ToolComponent createBetterToolComponent(ToolMaterial material) {
        return new ToolComponent(
                List.of(
                        ToolComponent.Rule.ofAlwaysDropping(List.of(Blocks.COBWEB), material.getMiningSpeedMultiplier() * 15.0F),
                        ToolComponent.Rule.of(BlockTags.LEAVES, material.getMiningSpeedMultiplier() * 15.0F),
                        ToolComponent.Rule.of(BlockTags.WOOL, material.getMiningSpeedMultiplier() * 5.0F),
                        ToolComponent.Rule.of(List.of(Blocks.VINE, Blocks.GLOW_LICHEN), material.getMiningSpeedMultiplier() * 2.0F)
                ),
                1.0F,
                1
        );
    }
}
