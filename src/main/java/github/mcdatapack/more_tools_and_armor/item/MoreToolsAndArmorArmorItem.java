package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;

public class MoreToolsAndArmorArmorItem extends Item implements MoreToolsAndArmorItem<ArmorMaterial> {
    private final ArmorMaterial material;

    public MoreToolsAndArmorArmorItem(ArmorMaterial material, EquipmentType type, Settings settings) {
        super(settings.armor(material, type));
        this.material = material;
    }

    @Override
    public ArmorMaterial getMaterial() {
        return material;
    }
}