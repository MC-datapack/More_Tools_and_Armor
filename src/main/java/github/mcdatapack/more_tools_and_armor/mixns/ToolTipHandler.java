package github.mcdatapack.more_tools_and_armor.mixns;

import com.llamalad7.mixinextras.sugar.Local;
import github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit;
import github.mcdatapack.more_tools_and_armor.item.MoreToolsAndArmorArmorItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

@Mixin(ItemStack.class)
public abstract class ToolTipHandler {
    @Shadow
    public abstract Item getItem();

    @Shadow public abstract void increment(int amount);

    @Inject(method = "getTooltip", at = @At("RETURN"), cancellable = true)
    private void getTooltip(Item.TooltipContext context, PlayerEntity player, TooltipType tooltipType, CallbackInfoReturnable<List<Text>> info) {
        List<Text> list = new ArrayList<>();
        var returnV = info.getReturnValue();
        list.add(returnV.getFirst());
        returnV.removeFirst();
        if (getItem() == Items.GOLDEN_HELMET || getItem() == Items.GOLDEN_CHESTPLATE || getItem() == Items.GOLDEN_LEGGINGS || getItem() == Items.GOLDEN_BOOTS ||
                getItem() == Items.NETHERITE_HELMET || getItem() == Items.NETHERITE_CHESTPLATE || getItem() == Items.NETHERITE_LEGGINGS || getItem() == Items.NETHERITE_BOOTS) {
            list.add(1, Text.translatable("more_tools_and_armor.tooltip.piglin_save"));
        } else if (getItem() instanceof MoreToolsAndArmorArmorItem armorItem) {
            var material = armorItem.getMaterial();
            if (material == ArmorMaterialInit.DEEPSLATE_EMERALD) {
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
        list.addAll(returnV);
        info.setReturnValue(list);
    }
}
