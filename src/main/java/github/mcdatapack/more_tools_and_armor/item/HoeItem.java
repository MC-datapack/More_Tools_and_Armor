package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class HoeItem extends Item {
    public final ToolMaterial material;

    public HoeItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties settings) {
        super(settings.hoe(material, attackDamage, attackSpeed));
        this.material = material;
    }
}
