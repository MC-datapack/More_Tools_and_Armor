package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class PickaxeItem extends Item {
    public final ToolMaterial material;

    public PickaxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties settings) {
        super(settings.pickaxe(material, attackDamage, attackSpeed));
        this.material = material;
    }
}
