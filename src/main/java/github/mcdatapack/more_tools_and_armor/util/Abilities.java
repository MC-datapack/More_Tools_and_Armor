package github.mcdatapack.more_tools_and_armor.util;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import github.mcdatapack.more_tools_and_armor.enums.ToolMaterials;
import github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit;
import github.mcdatapack.more_tools_and_armor.item.PaxelItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;

public class Abilities {
    public static boolean isWearingEndermanSaveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().endermanSave)
            return false;
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.END_DIAMOND
                 || item.getMaterial() == ArmorMaterialInit.VOID
                || item.getMaterial() == ArmorMaterialInit.ONETHDENDERITE
                || item.getMaterial() == ArmorMaterialInit.OLED
                || item.getMaterial() == ArmorMaterialInit.ANCIENT) {
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
        if (!MoreToolsAndArmorConfig.getConfig().piglinPassive)
            return false;
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.ONETHDENDERITE
                        || item.getMaterial() == ArmorMaterialInit.OLED
                        || item.getMaterial() == ArmorMaterialInit.ANCIENT) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingIronGolemPassiveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().ironGolemPassive)
            return false;
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.OLED
                        || item.getMaterial() == ArmorMaterialInit.ANCIENT) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingEndermanPassiveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().endermanPassive)
            return false;
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.OLED
                        || item.getMaterial() == ArmorMaterialInit.ANCIENT) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isWearingPhantomPassiveArmor(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().phantomPassive)
            return false;
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.DEEPSLATE_EMERALD ||
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

    public static boolean isWearingPowderSnowWalkArmor(LivingEntity entity) {
        if (!MoreToolsAndArmorConfig.getConfig().powderSnowWalk)
            return false;
        for (ItemStack itemStack : entity.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.VOID
                        || item.getMaterial() == ArmorMaterialInit.ONETHDENDERITE
                        || item.getMaterial() == ArmorMaterialInit.OLED
                        || item.getMaterial() == ArmorMaterialInit.ANCIENT) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWearingStatusEffectImmuneArmor(LivingEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().statusEffectImmune)
            return false;
        for (ItemStack itemStack : player.getArmorItems()) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.getMaterial() == ArmorMaterialInit.ANCIENT) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isHoldingBedrockBreakingTool(PlayerEntity player) {
        if (!MoreToolsAndArmorConfig.getConfig().bedrockMining)
            return false;
        return (player.getMainHandStack().getItem() instanceof PickaxeItem pickaxe && pickaxe.getMaterial() == ToolMaterials.ANCIENT) ||
                (player.getMainHandStack().getItem() instanceof PaxelItem paxel && paxel.getMaterial() == ToolMaterials.ANCIENT);
    }
}
