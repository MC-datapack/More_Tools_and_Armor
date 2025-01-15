package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class SwordItem extends Item {
    public SwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(settings.sword(material, attackDamage, attackSpeed));
    }
}
