package github.mcdatapack.more_tools_and_armor.mixns.ability;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ArmorItem.class)
public class ArmorItemMaterialAccessor {
    @Unique
    private ArmorMaterial material;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void setMaterial(ArmorMaterial material, EquipmentType type, Item.Settings settings, CallbackInfo ci) {
        this.material = material;
    }

    @Unique
    public ArmorMaterial getMaterial() {
        return material;
    }
}
