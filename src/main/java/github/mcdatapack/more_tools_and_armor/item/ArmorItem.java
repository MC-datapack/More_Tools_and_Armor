package github.mcdatapack.more_tools_and_armor.item;


import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;

public class ArmorItem extends net.minecraft.item.Item {
    public final ArmorMaterial material;

    public ArmorItem(ArmorMaterial material, EquipmentType type, Settings settings) {
        super(settings.armor(material, type));
        this.material = material;
    }
}
