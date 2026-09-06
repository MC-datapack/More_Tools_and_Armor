package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.Weapon;

public class SpearItem extends Item {
    public final ToolMaterial material;

    public SpearItem(Properties properties, ToolMaterial material, float attackDuration, float damageMultiplier, float delay, float dismountTime,
                     float dismountThreshold, float knockbackTime, float damageTime) {
        super(properties
                .spear(material, attackDuration, damageMultiplier, delay, dismountTime, dismountThreshold, knockbackTime, 5.1f, damageTime, 4.6f)
                .component(DataComponents.WEAPON, new Weapon((int) (damageMultiplier * material.attackDamageBonus()))));
        this.material = material;
    }
}
