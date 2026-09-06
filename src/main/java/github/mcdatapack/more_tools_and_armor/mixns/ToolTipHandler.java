package github.mcdatapack.more_tools_and_armor.mixns;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import github.mcdatapack.more_tools_and_armor.enums.ToolMaterials;
import github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import github.mcdatapack.more_tools_and_armor.item.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(ItemStack.class)
public abstract class ToolTipHandler {
    @Shadow
    public abstract Item getItem();

    @Inject(method = "addDetailsToTooltip", at = @At("HEAD"))
    private void appendTooltip(Item.TooltipContext context, TooltipDisplay display, @Nullable Player player, TooltipFlag tooltipFlag, Consumer<Component> builder, CallbackInfo info) {
        if (!MoreToolsAndArmorConfig.getConfig().showTooltip)
            return;
        if (getItem() instanceof ArmorItem armorItem) {
            var material = armorItem.material;
            if (material == ArmorMaterialInit.DEEPSLATE_EMERALD) {
                addPhantomPassive(builder);
            } else if (material == ArmorMaterialInit.END_DIAMOND) {
                addPhantomPassive(builder);
                addEndermanSave(builder);
            } else if (material == ArmorMaterialInit.VOID) {
                addPhantomPassive(builder);
                addEndermanSave(builder);
                addPowderSnowWalk(builder);
            } else if (material == ArmorMaterialInit.ONETHDENDERITE) {
                addPhantomPassive(builder);
                addEndermanSave(builder);
                addPowderSnowWalk(builder);
            } else if (material == ArmorMaterialInit.OLED) {
                addPhantomPassive(builder);
                addEndermanSave(builder);
                addPowderSnowWalk(builder);
                addEndermanPassive(builder);
                addIronGolemPassive(builder);
            } else if (material == ArmorMaterialInit.ANCIENT) {
                addPhantomPassive(builder);
                addEndermanSave(builder);
                addPowderSnowWalk(builder);
                addEndermanPassive(builder);
                addIronGolemPassive(builder);
                addStatusEffectImmune(builder);
            }
            if (armorItem == ItemInit.ANCIENT_CHESTPLATE) {
                builder.accept(Component.translatable("more_tools_and_armor.tooltip.elytra"));
            }
        }
        if (getItem() instanceof PickaxeItem pickaxeItem) {
            if (pickaxeItem.material == ToolMaterials.ONETHDENDERITE) {
                addRandomOre(builder);
            }
            if (pickaxeItem.material == ToolMaterials.OLED) {
                addRandomOre(builder);
            }
            if (pickaxeItem.material == ToolMaterials.ANCIENT) {
                addRandomOre(builder);
                addBedrockMining(builder);
            }
        }
        if (getItem() instanceof PaxelItem paxelItem) {
            if (paxelItem.material == ToolMaterials.ONETHDENDERITE) {
                addRandomOre(builder);
            }
            if (paxelItem.material == ToolMaterials.OLED) {
                addRandomOre(builder);
            }
            if (paxelItem.material == ToolMaterials.ANCIENT) {
                addRandomOre(builder);
                addBedrockMining(builder);
            }
        }
        if (getItem() instanceof SwordItem swordItem) {
            if (swordItem.material == ToolMaterials.DEEPSLATE_EMERALD)
                addMoreXP(5, builder);
            if (swordItem.material == ToolMaterials.END_DIAMOND)
                addMoreXP(10, builder);
            if (swordItem.material == ToolMaterials.VOID)
                addMoreXP(50, builder);
            if (swordItem.material == ToolMaterials.ONETHDENDERITE)
                addMoreXP(100, builder);
            if (swordItem.material == ToolMaterials.OLED)
                addMoreXP(500, builder);
            if (swordItem.material == ToolMaterials.ANCIENT)
                addMoreXP(1000, builder);
        }
        if (getItem() instanceof SpearItem spearItem) {
            if (spearItem.material == ToolMaterials.DEEPSLATE_EMERALD)
                addMoreXP(5, builder);
            if (spearItem.material == ToolMaterials.END_DIAMOND)
                addMoreXP(10, builder);
            if (spearItem.material == ToolMaterials.VOID)
                addMoreXP(50, builder);
            if (spearItem.material == ToolMaterials.ONETHDENDERITE)
                addMoreXP(100, builder);
            if (spearItem.material == ToolMaterials.OLED)
                addMoreXP(500, builder);
            if (spearItem.material == ToolMaterials.ANCIENT)
                addMoreXP(1000, builder);
        }
    }

    @Unique
    private void addEndermanSave(Consumer<Component> list) {
        if (MoreToolsAndArmorConfig.getConfig().endermanSave) {
            list.accept(Component.translatable("more_tools_and_armor.tooltip.enderman_save"));
        }
    }
    @Unique
    private void addPowderSnowWalk(Consumer<Component> list) {
        if (MoreToolsAndArmorConfig.getConfig().powderSnowWalk) {
            list.accept(Component.translatable("more_tools_and_armor.tooltip.powder_snow_walk"));
        }
    }
    @Unique
    private void addEndermanPassive(Consumer<Component> list) {
        if (MoreToolsAndArmorConfig.getConfig().endermanPassive) {
            list.accept(Component.translatable("more_tools_and_armor.tooltip.enderman_passive"));
        }
    }
    @Unique
    private void addPhantomPassive(Consumer<Component> list) {
        if (MoreToolsAndArmorConfig.getConfig().phantomPassive) {
            list.accept(Component.translatable("more_tools_and_armor.tooltip.phantom_passive"));
        }
    }
    @Unique
    private void addIronGolemPassive(Consumer<Component> list) {
        if (MoreToolsAndArmorConfig.getConfig().ironGolemPassive) {
            list.accept(Component.translatable("more_tools_and_armor.tooltip.iron_golem_passive"));
        }
    }
    @Unique
    private void addStatusEffectImmune(Consumer<Component> list) {
        if (MoreToolsAndArmorConfig.getConfig().statusEffectImmune) {
            list.accept(Component.translatable("more_tools_and_armor.tooltip.status_effect_immune"));
        }
    }
    @Unique
    private void addBedrockMining(Consumer<Component> list) {
        if (MoreToolsAndArmorConfig.getConfig().bedrockMining) {
            list.accept(Component.translatable("more_tools_and_armor.tooltip.bedrockMining"));
        }
    }
    @Unique
    private void addRandomOre(Consumer<Component> list) {
        if (MoreToolsAndArmorConfig.getConfig().randomOre) {
            list.accept(Component.translatable("more_tools_and_armor.tooltip.randomOre"));
        }
    }
    @Unique
    private void addMoreXP(int multiplier, Consumer<Component> list) {
        if (MoreToolsAndArmorConfig.getConfig().moreXP) {
            list.accept(Component.translatable("more_tools_and_armor.tooltip.moreXP").append(Component.literal(String.valueOf(multiplier))));
        }
    }
}
