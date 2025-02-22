package github.mcdatapack.more_tools_and_armor.mixns;

import com.llamalad7.mixinextras.sugar.Local;
import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfigData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
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
            if (criteria(material, MoreToolsAndArmorConfig.getConfig().endermanSave)) {
                list.add(Text.translatable("more_tools_and_armor.tooltip.enderman_save"));
            }
            if (criteria(material, MoreToolsAndArmorConfig.getConfig().endermanPassive)) {
                list.add(Text.translatable("more_tools_and_armor.tooltip.enderman_passive"));
            }
            if (criteria(material, MoreToolsAndArmorConfig.getConfig().piglinPassive)) {
                list.add(Text.translatable("more_tools_and_armor.tooltip.piglin_passive"));
            }
            if (criteria(material, MoreToolsAndArmorConfig.getConfig().ironGolemPassive)) {
                list.add(Text.translatable("more_tools_and_armor.tooltip.iron_golem_passive"));
            }
            if (criteria(material, MoreToolsAndArmorConfig.getConfig().powderSnowWalk)) {
                list.add(Text.translatable("more_tools_and_armor.tooltip.powder_snow_walk"));
            }
            if (criteria(material, MoreToolsAndArmorConfig.getConfig().statusEffectImmune)) {
                list.add(Text.translatable("more_tools_and_armor.tooltip.status_effect_immune"));
            }
        }
    }

    @Unique
    private boolean criteria(RegistryEntry<ArmorMaterial> material, MoreToolsAndArmorConfigData.AbilityConfig abilityConfig) {
        return abilityConfig.activated && abilityConfig.isInMaterials(material);
    }
}
