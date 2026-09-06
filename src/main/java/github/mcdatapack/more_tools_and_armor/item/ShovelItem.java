package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.world.item.ToolMaterial;

public class ShovelItem extends net.minecraft.world.item.ShovelItem {
    public final ToolMaterial material;

    public ShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.material = material;
    }
}
