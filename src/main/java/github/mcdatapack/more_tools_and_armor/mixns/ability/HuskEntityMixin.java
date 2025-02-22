package github.mcdatapack.more_tools_and_armor.mixns.ability;

import github.mcdatapack.more_tools_and_armor.util.Abilities;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HuskEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(HuskEntity.class)
public abstract class HuskEntityMixin {
    @Redirect(method = "tryAttack", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;addStatusEffect(Lnet/minecraft/entity/effect/StatusEffectInstance;Lnet/minecraft/entity/Entity;)Z"))
    private boolean statusEffectHandler(LivingEntity instance, StatusEffectInstance effect, Entity source) {
        if (instance instanceof PlayerEntity player && Abilities.isWearingStatusEffectImmuneArmor(player)) {
            return false;
        } else {
            return instance.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 140), source);
        }
    }
}
