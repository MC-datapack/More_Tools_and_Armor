package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class MoreToolsAndArmorHoeItem extends HoeItem implements MoreToolsAndArmorItem<ToolMaterial> {
    private final ToolMaterial material;

    public MoreToolsAndArmorHoeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.material = material;
    }

    @Override
    public ToolMaterial getMaterial() {
        return material;
    }
}
