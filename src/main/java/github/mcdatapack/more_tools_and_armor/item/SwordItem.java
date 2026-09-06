package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class SwordItem extends Item {
    public final ToolMaterial material;

    public SwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Item.Properties settings) {
        super(settings.sword(material, attackDamage, attackSpeed));
        this.material = material;
    }
}
