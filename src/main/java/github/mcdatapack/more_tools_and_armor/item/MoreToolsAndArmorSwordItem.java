package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class MoreToolsAndArmorSwordItem extends Item implements MoreToolsAndArmorItem<ToolMaterial> {
    private final ToolMaterial material;

    public MoreToolsAndArmorSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(settings.sword(material, attackDamage, attackSpeed));
        this.material = material;
    }

    @Override
    public ToolMaterial getMaterial() {
        return material;
    }
}