package github.mcdatapack.more_tools_and_armor.mixns;

import com.llamalad7.mixinextras.sugar.Local;
import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import github.mcdatapack.more_tools_and_armor.enums.ToolMaterials;
import github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import github.mcdatapack.more_tools_and_armor.item.PaxelItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(ItemStack.class)
public abstract class ToolTipHandler {
    @Shadow
    public abstract Item getItem();

    @Inject(method = "getTooltip", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;appendAttributeModifiersTooltip(Ljava/util/function/Consumer;Lnet/minecraft/entity/player/PlayerEntity;)V", shift = At.Shift.BEFORE))
    private void getTooltip(Item.TooltipContext context, PlayerEntity player, TooltipType tooltipType, CallbackInfoReturnable<List<Text>> info, @Local(ordinal = 0) List<Text> list) {
        if (!MoreToolsAndArmorConfig.getConfig().showTooltip)
            return;
        if (getItem() instanceof ArmorItem armorItem) {
            var material = armorItem.getMaterial();
            if (material == ArmorMaterialInit.DEEPSLATE_EMERALD) {
                addPhantomPassive(list);
            } else if (material == ArmorMaterialInit.END_DIAMOND) {
                addPhantomPassive(list);
                addEndermanSave(list);
            } else if (material == ArmorMaterialInit.VOID) {
                addPhantomPassive(list);
                addEndermanSave(list);
                addPowderSnowWalk(list);
            } else if (material == ArmorMaterialInit.ONETHDENDERITE) {
                addPhantomPassive(list);
                addEndermanSave(list);
                addPowderSnowWalk(list);
                addPiglinPassive(list);
            } else if (material == ArmorMaterialInit.OLED) {
                addPhantomPassive(list);
                addEndermanSave(list);
                addPowderSnowWalk(list);
                addPiglinPassive(list);
                addEndermanPassive(list);
                addIronGolemPassive(list);
            } else if (material == ArmorMaterialInit.ANCIENT) {
                addPhantomPassive(list);
                addEndermanSave(list);
                addPowderSnowWalk(list);
                addPiglinPassive(list);
                addEndermanPassive(list);
                addIronGolemPassive(list);
                addStatusEffectImmune(list);
            }
            if (armorItem == ItemInit.ANCIENT_CHESTPLATE) {
                list.add(Text.translatable("more_tools_and_armor.tooltip.elytra"));
            }
        }
        if (getItem() instanceof PickaxeItem pickaxeItem) {
            if (pickaxeItem.getMaterial() == ToolMaterials.ONETHDENDERITE) {
                addRandomOre(list);
            }
            if (pickaxeItem.getMaterial() == ToolMaterials.OLED) {
                addRandomOre(list);
            }
            if (pickaxeItem.getMaterial() == ToolMaterials.ANCIENT) {
                addRandomOre(list);
                addBedrockMining(list);
            }
        }
        if (getItem() instanceof PaxelItem paxelItem) {
            if (paxelItem.getMaterial() == ToolMaterials.ONETHDENDERITE) {
                addRandomOre(list);
            }
            if (paxelItem.getMaterial() == ToolMaterials.OLED) {
                addRandomOre(list);
            }
            if (paxelItem.getMaterial() == ToolMaterials.ANCIENT) {
                addRandomOre(list);
                addBedrockMining(list);
            }
        }
        if (getItem() instanceof SwordItem swordItem) {
            if (swordItem.getMaterial() == ToolMaterials.DEEPSLATE_EMERALD)
                addMoreXP(5, list);
            if (swordItem.getMaterial() == ToolMaterials.END_DIAMOND)
                addMoreXP(10, list);
            if (swordItem.getMaterial() == ToolMaterials.VOID)
                addMoreXP(50, list);
            if (swordItem.getMaterial() == ToolMaterials.ONETHDENDERITE)
                addMoreXP(100, list);
            if (swordItem.getMaterial() == ToolMaterials.OLED)
                addMoreXP(500, list);
            if (swordItem.getMaterial() == ToolMaterials.ANCIENT)
                addMoreXP(1000, list);
        }
    }

    @Unique
    private void addEndermanSave(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().endermanSave) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.enderman_save"));
        }
    }
    @Unique
    private void addPowderSnowWalk(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().powderSnowWalk) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.powder_snow_walk"));
        }
    }
    @Unique
    private void addPiglinPassive(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().piglinPassive) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.piglin_passive"));
        }
    }
    @Unique
    private void addEndermanPassive(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().endermanPassive) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.enderman_passive"));
        }
    }
    @Unique
    private void addPhantomPassive(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().phantomPassive) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.phantom_passive"));
        }
    }
    @Unique
    private void addIronGolemPassive(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().ironGolemPassive) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.iron_golem_passive"));
        }
    }
    @Unique
    private void addStatusEffectImmune(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().statusEffectImmune) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.status_effect_immune"));
        }
    }
    @Unique
    private void addBedrockMining(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().bedrockMining) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.bedrockMining"));
        }
    }
    @Unique
    private void addRandomOre(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().randomOre) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.randomOre"));
        }
    }
    @Unique
    private void addMoreXP(int multiplier, List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().moreXP) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.moreXP").append(Text.of(String.valueOf(multiplier))));
        }
    }
}
