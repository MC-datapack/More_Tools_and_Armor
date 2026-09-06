package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.world.item.ToolMaterial;

public class HoeItem extends net.minecraft.world.item.HoeItem {
    public final ToolMaterial material;

    public HoeItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.material = material;
    }
}
