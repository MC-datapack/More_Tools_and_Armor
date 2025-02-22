package github.mcdatapack.more_tools_and_armor.util;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.ItemStack;

public class Abilities {
    public static boolean isWearingEndermanSaveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().endermanSave.activated)
            return false;
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
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
    public static boolean isWearingPiglinSaveArmor(LivingEntity player) {
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterials.NETHERITE ||
                        item.getMaterial() == ArmorMaterialInit.DEEPSLATE_EMERALD ||
                        item.getMaterial() == ArmorMaterialInit.END_DIAMOND ||
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
        if (!MoreToolsAndArmorConfig.getConfig().piglinPassive.activated)
            return false;
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.ONETHDENDERITE ||
                        item.getMaterial() == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingIronGolemPassiveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().ironGolemPassive.activated)
            return false;
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingEndermanPassiveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().endermanPassive.activated)
            return false;
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWearingPowderSnowWalkArmor(LivingEntity entity) {
        if (!MoreToolsAndArmorConfig.getConfig().powderSnowWalk.activated)
            return false;
        for (ItemStack itemStack : entity.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.VOID ||
                        item.getMaterial() == ArmorMaterialInit.ONETHDENDERITE ||
                        item.getMaterial() == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWearingStatusEffectImmuneArmor(LivingEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().statusEffectImmune.activated)
            return false;
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }
}
