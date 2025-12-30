package github.mcdatapack.more_tools_and_armor.item;


import net.minecraft.item.ToolMaterial;

public class HoeItem extends net.minecraft.item.HoeItem {
    public final ToolMaterial material;

    public HoeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.material = material;
    }
}
