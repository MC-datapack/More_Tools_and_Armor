package github.mcdatapack.more_tools_and_armor.mixns;

import com.llamalad7.mixinextras.sugar.Local;
import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
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
        if (getItem() instanceof ArmorItem armorItem) {
            var material = armorItem.getMaterial();
            if (material == ArmorMaterialInit.END_DIAMOND) {
                addEndermanSave(list);
            } else if (material == ArmorMaterialInit.VOID) {
                addEndermanSave(list);
                addPowderSnowWalk(list);
            } else if (material == ArmorMaterialInit.ONETHDENDERITE) {
                addEndermanSave(list);
                addPowderSnowWalk(list);
                addPiglinPassive(list);
            } else if (material == ArmorMaterialInit.OLED) {
                addEndermanSave(list);
                addPowderSnowWalk(list);
                addPiglinPassive(list);
                addEndermanPassive(list);
                addIronGolemPassive(list);
            } else if (material == ArmorMaterialInit.ANCIENT) {
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
    }

    @Unique
    private void addEndermanSave(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().endermanSave.activated) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.piglin_save"));
        }
    }
    @Unique
    private void addPowderSnowWalk(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().powderSnowWalk.activated) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.powder_snow_walk"));
        }
    }
    @Unique
    private void addPiglinPassive(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().piglinPassive.activated) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.piglin_passive"));
        }
    }
    @Unique
    private void addEndermanPassive(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().endermanPassive.activated) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.enderman_passive"));
        }
    }
    @Unique
    private void addIronGolemPassive(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().ironGolemPassive.activated) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.iron_golem_passive"));
        }
    }
    @Unique
    private void addStatusEffectImmune(List<Text> list) {
        if (MoreToolsAndArmorConfig.getConfig().statusEffectImmune.activated) {
            list.add(Text.translatable("more_tools_and_armor.tooltip.status_effect_immune"));
        }
    }
}
