package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;

public class ArmorItem extends Item {
    public ArmorItem(ArmorMaterial material, EquipmentType equipmentType, Settings settings) {
        super(settings.armor(material, equipmentType));
    }
}
