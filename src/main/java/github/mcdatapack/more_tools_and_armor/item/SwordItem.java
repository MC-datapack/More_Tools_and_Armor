package github.mcdatapack.more_tools_and_armor.item;


import net.minecraft.item.ToolMaterial;

public class SwordItem extends net.minecraft.item.Item {
    public final ToolMaterial material;

    public SwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(settings.sword(material, attackDamage, attackSpeed));
        this.material = material;
    }
}
