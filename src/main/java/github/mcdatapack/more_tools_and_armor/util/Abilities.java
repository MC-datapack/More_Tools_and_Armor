package github.mcdatapack.more_tools_and_armor.util;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import github.mcdatapack.more_tools_and_armor.enums.ToolMaterials;
import github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit;
import github.mcdatapack.more_tools_and_armor.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterials;

public class Abilities {
    public static boolean isWearingEndermanSaveArmor(Player player) {
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
    public static boolean isWearingIronGolemPassiveArmor(Player player) {
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
    public static boolean isWearingEndermanPassiveArmor(Player player) {
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
    public static boolean isWearingPhantomPassiveArmor(Player player) {
        if (!MoreToolsAndArmorConfig.getConfig().phantomPassive)
            return false;
        for (ItemStack itemStack : getArmorItems(player)) {
            if (itemStack.getItem() instanceof ArmorItem item) {
                if (item.material == ArmorMaterialInit.DEEPSLATE_EMERALD ||
                        item.material == ArmorMaterialInit.END_DIAMOND ||
                        item.material == ArmorMaterialInit.VOID ||
                        item.material == ArmorMaterialInit.ONETHDENDERITE ||
                        item.material == ArmorMaterialInit.OLED ||
                        item.material == ArmorMaterialInit.ANCIENT) {
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

    public static boolean isHoldingBedrockBreakingTool(Player player) {
        if (!MoreToolsAndArmorConfig.getConfig().bedrockMining)
            return false;
        return (player.getMainHandItem().getItem() instanceof PickaxeItem pickaxe && pickaxe.material == ToolMaterials.ANCIENT) ||
                (player.getMainHandItem().getItem() instanceof PaxelItem paxel && paxel.material == ToolMaterials.ANCIENT);
    }
    
    private static ItemStack[] getArmorItems(LivingEntity entity) {
        return new ItemStack[]{
                entity.getItemBySlot(EquipmentSlot.HEAD),
                entity.getItemBySlot(EquipmentSlot.CHEST),
                entity.getItemBySlot(EquipmentSlot.LEGS),
                entity.getItemBySlot(EquipmentSlot.FEET)
        };
    }
}
