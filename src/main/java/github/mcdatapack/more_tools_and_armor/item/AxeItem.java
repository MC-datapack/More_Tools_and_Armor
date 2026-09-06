package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.world.item.ToolMaterial;

public class AxeItem extends net.minecraft.world.item.AxeItem {
    public final ToolMaterial material;

    public AxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.material = material;
    }
}
