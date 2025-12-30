package github.mcdatapack.more_tools_and_armor.item;


import net.minecraft.item.ToolMaterial;

public class SwordItem extends net.minecraft.item.SwordItem {
    public final ToolMaterial material;

    public SwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.material = material;
    }
}
