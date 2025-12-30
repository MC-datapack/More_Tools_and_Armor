package github.mcdatapack.more_tools_and_armor.util;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import github.mcdatapack.more_tools_and_armor.enums.ToolMaterials;
import github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit;
import github.mcdatapack.more_tools_and_armor.item.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.ArmorMaterials;

public class Abilities {
    public static boolean isWearingEndermanSaveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().endermanSave)
            return false;
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.material == ArmorMaterialInit.END_DIAMOND
                 || item.material == ArmorMaterialInit.VOID
                || item.material == ArmorMaterialInit.ONETHDENDERITE
                || item.material == ArmorMaterialInit.OLED
                || item.material == ArmorMaterialInit.ANCIENT) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingPiglinSaveArmor(LivingEntity player) {
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.material == ArmorMaterials.NETHERITE ||
                        item.material == ArmorMaterialInit.DEEPSLATE_EMERALD ||
                        item.material == ArmorMaterialInit.END_DIAMOND ||
                        item.material == ArmorMaterialInit.VOID ||
                        item.material == ArmorMaterialInit.ONETHDENDERITE ||
                        item.material == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingPiglinPassiveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().piglinPassive)
            return false;
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.material == ArmorMaterialInit.ONETHDENDERITE
                        || item.material == ArmorMaterialInit.OLED
                        || item.material == ArmorMaterialInit.ANCIENT) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingIronGolemPassiveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().ironGolemPassive)
            return false;
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.material == ArmorMaterialInit.OLED
                        || item.material == ArmorMaterialInit.ANCIENT) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingEndermanPassiveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().endermanPassive)
            return false;
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.material == ArmorMaterialInit.OLED
                        || item.material == ArmorMaterialInit.ANCIENT) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingPhantomPassiveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().phantomPassive)
            return false;
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.material == ArmorMaterialInit.DEEPSLATE_EMERALD ||
                        item.material == ArmorMaterialInit.END_DIAMOND ||
                        item.material == ArmorMaterialInit.VOID ||
                        item.material == ArmorMaterialInit.ONETHDENDERITE ||
                        item.material == ArmorMaterialInit.OLED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWearingPowderSnowWalkArmor(LivingEntity entity) {
        if (!MoreToolsAndArmorConfig.getConfig().powderSnowWalk)
            return false;
        for (ItemStack itemStack : getArmorItems(entity)) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.material == ArmorMaterialInit.VOID
                        || item.material == ArmorMaterialInit.ONETHDENDERITE
                        || item.material == ArmorMaterialInit.OLED
                        || item.material == ArmorMaterialInit.ANCIENT) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWearingStatusEffectImmuneArmor(LivingEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().statusEffectImmune)
            return false;
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.material == ArmorMaterialInit.ANCIENT) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isHoldingBedrockBreakingTool(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().bedrockMining)
            return false;
        return (player.getMainHandStack().getItem() instanceof PickaxeItem pickaxe && pickaxe.material == ToolMaterials.ANCIENT) ||
                (player.getMainHandStack().getItem() instanceof PaxelItem paxel && paxel.material == ToolMaterials.ANCIENT);
    }
    
    private static ItemStack[] getArmorItems(LivingEntity entity) {
        return new ItemStack[]{
                entity.getEquippedStack(EquipmentSlot.HEAD),
                entity.getEquippedStack(EquipmentSlot.CHEST),
                entity.getEquippedStack(EquipmentSlot.LEGS),
                entity.getEquippedStack(EquipmentSlot.FEET)
        };
    }
}
