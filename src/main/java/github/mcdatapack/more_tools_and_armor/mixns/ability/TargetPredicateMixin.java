package github.mcdatapack.more_tools_and_armor.mixns.ability;

import github.mcdatapack.more_tools_and_armor.util.Abilities;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.PhantomEntity;
import net.minecraft.entity.mob.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TargetPredicate.class)
public class TargetPredicateMixin {
    @Inject(method = "test", at = @At("RETURN"), cancellable = true)
    private void canTarget(ServerWorld world, LivingEntity baseEntity, LivingEntity targetEntity, CallbackInfoReturnable<Boolean> cir) {
        if (baseEntity instanceof IronGolemEntity ironGolem && targetEntity instanceof PlayerEntity player) {
            if (Abilities.isWearingIronGolemPassiveArmor(player)) {
                cir.setReturnValue(false);
            }
        }
        if ((baseEntity instanceof AbstractPiglinEntity piglinEntity || baseEntity instanceof ZombifiedPiglinEntity zombifiedPiglinEntity) && targetEntity instanceof PlayerEntity player) {
            if (Abilities.isWearingPiglinPassiveArmor(player)) {
                cir.setReturnValue(false);
            }
        }
        if (baseEntity instanceof EndermanEntity endermanEntity && targetEntity instanceof PlayerEntity player) {
            if (Abilities.isWearingEndermanPassiveArmor(player)) {
                cir.setReturnValue(false);
            }
        }
        if (baseEntity instanceof PhantomEntity phantomEntity && targetEntity instanceof PlayerEntity player) {
            if (Abilities.isWearingPhantomPassiveArmor(player)) {
                cir.setReturnValue(false);
            }
        }
    }
}
