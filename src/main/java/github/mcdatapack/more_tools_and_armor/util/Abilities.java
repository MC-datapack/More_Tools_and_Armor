package github.mcdatapack.more_tools_and_armor.util;

import github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit;
import github.mcdatapack.more_tools_and_armor.item.MoreToolsAndArmorArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Abilities {
    public static boolean isWearingEndermanSaveArmor(PlayerEntity player) {
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof MoreToolsAndArmorArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.END_DIAMOND ||
                        item.getMaterial() == ArmorMaterialInit.VOID ||
                        item.getMaterial() == ArmorMaterialInit.ONETHDENDERITE ||
                        item.getMaterial() == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWearingPiglinPassiveArmor(PlayerEntity player) {
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof MoreToolsAndArmorArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.ONETHDENDERITE ||
                        item.getMaterial() == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingIronGolemPassiveArmor(PlayerEntity player) {
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof MoreToolsAndArmorArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingEndermanPassiveArmor(PlayerEntity player) {
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof MoreToolsAndArmorArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }

    private static List<ItemStack> getArmorItems(PlayerEntity player) {
        List<ItemStack> returnV = new ArrayList<>();
        for (EquipmentSlot equipmentSlot : PlayerInventory.equipmentSlots.values()) {
            returnV.add(player.getInventory().getStack(equipmentSlot.getOffsetEntitySlotId(36)));
        }
        return returnV;
    }
}