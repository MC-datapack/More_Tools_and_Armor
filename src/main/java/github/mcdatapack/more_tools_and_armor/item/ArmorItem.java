package github.mcdatapack.more_tools_and_armor.item;


import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;

public class ArmorItem extends net.minecraft.item.ArmorItem {
    public final ArmorMaterial material;

    public ArmorItem(ArmorMaterial material, EquipmentType type, Settings settings) {
        super(material, type, settings);
        this.material = material;
    }
}
