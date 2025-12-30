package github.mcdatapack.more_tools_and_armor.item;


import net.minecraft.item.ToolMaterial;

public class AxeItem extends net.minecraft.item.AxeItem {
    public final ToolMaterial material;

    public AxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.material = material;
    }
}
