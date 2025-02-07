package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;

public class MoreToolsAndArmorArmorItem extends ArmorItem implements MoreToolsAndArmorItem<ArmorMaterial> {
    private final ArmorMaterial material;

    public MoreToolsAndArmorArmorItem(ArmorMaterial material, EquipmentType type, Settings settings) {
        super(material, type, settings);
        this.material = material;
    }

    @Override
    public ArmorMaterial getMaterial() {
        return material;
    }
}
