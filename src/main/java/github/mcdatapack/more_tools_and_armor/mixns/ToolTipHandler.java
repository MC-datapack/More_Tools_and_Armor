package github.mcdatapack.more_tools_and_armor.mixns;

import com.llamalad7.mixinextras.sugar.Local;
import github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
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
            if (material == ArmorMaterials.GOLD || material == ArmorMaterials.NETHERITE || material == ArmorMaterialInit.DEEPSLATE_EMERALD) {
                list.add(Text.translatable("more_tools_and_armor.tooltip.piglin_save"));
            } else if (material == ArmorMaterialInit.END_DIAMOND || material == ArmorMaterialInit.VOID) {
                list.add(Text.translatable("more_tools_and_armor.tooltip.piglin_save"));
                list.add(Text.translatable("more_tools_and_armor.tooltip.enderman_save"));
            } else if (material == ArmorMaterialInit.ONETHDENDERITE) {
                list.add(Text.translatable("more_tools_and_armor.tooltip.piglin_save"));
                list.add(Text.translatable("more_tools_and_armor.tooltip.enderman_save"));
                list.add(Text.translatable("more_tools_and_armor.tooltip.piglin_passive"));
            } else if (material == ArmorMaterialInit.OLED) {
                list.add(Text.translatable("more_tools_and_armor.tooltip.piglin_save"));
                list.add(Text.translatable("more_tools_and_armor.tooltip.enderman_save"));
                list.add(Text.translatable("more_tools_and_armor.tooltip.piglin_passive"));
                list.add(Text.translatable("more_tools_and_armor.tooltip.enderman_passive"));
                list.add(Text.translatable("more_tools_and_armor.tooltip.iron_golem_passive"));
            }
        }
    }
}
