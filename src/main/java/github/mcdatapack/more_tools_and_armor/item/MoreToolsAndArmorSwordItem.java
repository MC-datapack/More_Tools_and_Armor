package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class MoreToolsAndArmorSwordItem extends SwordItem implements MoreToolsAndArmorItem<ToolMaterial> {
    private final ToolMaterial material;

    public MoreToolsAndArmorSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.material = material;
    }

    @Override
    public ToolMaterial getMaterial() {
        return material;
    }
}