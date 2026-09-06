package github.mcdatapack.more_tools_and_armor.item;

import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public class ArmorItem extends net.minecraft.world.item.Item {
    public final ArmorMaterial material;

    public ArmorItem(ArmorMaterial material, ArmorType type, Properties settings) {
        super(settings.humanoidArmor(material, type));
        this.material = material;
    }
}
