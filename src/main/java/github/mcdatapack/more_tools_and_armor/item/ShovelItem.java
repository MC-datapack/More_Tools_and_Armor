package github.mcdatapack.more_tools_and_armor.item;


import net.minecraft.item.ToolMaterial;

public class ShovelItem extends net.minecraft.item.ShovelItem {
    public final ToolMaterial material;

    public ShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.material = material;
    }
}
