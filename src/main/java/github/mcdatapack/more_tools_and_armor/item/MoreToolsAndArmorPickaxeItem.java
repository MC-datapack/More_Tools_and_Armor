package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class MoreToolsAndArmorPickaxeItem extends Item implements MoreToolsAndArmorItem<ToolMaterial> {
    private final ToolMaterial material;

    public MoreToolsAndArmorPickaxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(settings.pickaxe(material, attackDamage, attackSpeed));
        this.material = material;
    }

    @Override
    public ToolMaterial getMaterial() {
        return material;
    }
}