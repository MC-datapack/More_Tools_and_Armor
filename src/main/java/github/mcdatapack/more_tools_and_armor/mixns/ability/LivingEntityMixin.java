package github.mcdatapack.more_tools_and_armor.mixns.ability;

import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import github.mcdatapack.more_tools_and_armor.util.Abilities;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow
    protected abstract int getExperienceReward(ServerLevel world, Entity killer);

    @Inject(method = "addEffect(Lnet/minecraft/world/effect/MobEffectInstance;Lnet/minecraft/world/entity/Entity;)Z", at = @At("HEAD"), cancellable = true)
    private void addStatusEffect(MobEffectInstance effect, Entity source, CallbackInfoReturnable<Boolean> cir) {
        if (Abilities.isWearingStatusEffectImmuneArmor( (LivingEntity) (Object) this) && effect.getEffect().value().getCategory() == MobEffectCategory.HARMFUL) {
            cir.setReturnValue(false);
        }
    }

    @Redirect(method = "dropExperience", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;getExperienceReward(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)I"))
    private int getXpToDrop(LivingEntity instance, ServerLevel world, Entity attacker) {
        if (attacker instanceof Player player) {
            ItemStack hand = player.getMainHandItem();
            if (hand.is(ItemInit.DEEPSLATE_EMERALD_SWORD))
                return getExperienceReward(world, attacker) * 5;
            if (hand.is(ItemInit.END_DIAMOND_SWORD))
                return getExperienceReward(world, attacker) * 10;
            if (hand.is(ItemInit.VOID_SWORD))
                return getExperienceReward(world, attacker) * 50;
            if (hand.is(ItemInit.ONETHDENDERITE_SWORD))
                return getExperienceReward(world, attacker) * 100;
            if (hand.is(ItemInit.OLED_SWORD))
                return getExperienceReward(world, attacker) * 500;
            if (hand.is(ItemInit.ANCIENT_SWORD))
                return getExperienceReward(world, attacker) * 1000;
            if (hand.is(ItemInit.DEEPSLATE_EMERALD_SPEAR))
                return getExperienceReward(world, attacker) * 5;
            if (hand.is(ItemInit.END_DIAMOND_SPEAR))
                return getExperienceReward(world, attacker) * 10;
            if (hand.is(ItemInit.VOID_SPEAR))
                return getExperienceReward(world, attacker) * 50;
            if (hand.is(ItemInit.ONETHDENDERITE_SPEAR))
                return getExperienceReward(world, attacker) * 100;
            if (hand.is(ItemInit.OLED_SPEAR))
                return getExperienceReward(world, attacker) * 500;
            if (hand.is(ItemInit.ANCIENT_SPEAR))
                return getExperienceReward(world, attacker) * 1000;
        }
        return getExperienceReward(world, attacker);
    }
}
