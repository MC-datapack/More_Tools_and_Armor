package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.ToolMaterial;

public class MoreToolsAndArmorFlintAndSteelItem extends FlintAndSteelItem {
    public MoreToolsAndArmorFlintAndSteelItem(ToolMaterial material, Settings settings) {
        super(settings.maxDamage(material.getDurability()));
    }
}
