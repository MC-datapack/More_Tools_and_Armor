package github.mcdatapack.more_tools_and_armor.item;


import net.minecraft.item.ToolMaterial;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;

public class PickaxeItem extends net.minecraft.item.PickaxeItem {
    public final ToolMaterial material;

    public PickaxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.material = material;
    }
}
