package github.mcdatapack.more_tools_and_armor.util;

import github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit;
import github.mcdatapack.more_tools_and_armor.item.MoreToolsAndArmorArmorItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class Abilities {
    public static boolean isWearingEndermanSaveArmor(PlayerEntity player) {
        for (ItemStack itemStack : player.getArmorItems()) {
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
        for (ItemStack itemStack : player.getArmorItems()) {
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
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof MoreToolsAndArmorArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingEndermanPassiveArmor(PlayerEntity player) {
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof MoreToolsAndArmorArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }
}