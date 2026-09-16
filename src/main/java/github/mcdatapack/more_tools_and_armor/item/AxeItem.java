package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class AxeItem extends Item {
    public final ToolMaterial material;

    public AxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties settings) {
        super(settings.axe(material, attackDamage, attackSpeed));
        this.material = material;
    }
}
