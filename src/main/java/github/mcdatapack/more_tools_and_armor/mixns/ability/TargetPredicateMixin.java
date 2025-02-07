package github.mcdatapack.more_tools_and_armor.mixns.ability;

import github.mcdatapack.more_tools_and_armor.util.Abilities;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.entity.mob.EndermanEntity;
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
    private void canTarget(ServerWorld world, LivingEntity tester, LivingEntity target, CallbackInfoReturnable<Boolean> cir) {
        if (tester instanceof IronGolemEntity ironGolem && target instanceof PlayerEntity player) {
            if (Abilities.isWearingIronGolemPassiveArmor(player)) {
                cir.setReturnValue(false);
            }
        }
        if ((tester instanceof AbstractPiglinEntity piglinEntity || tester instanceof ZombifiedPiglinEntity zombifiedPiglinEntity) && target instanceof PlayerEntity player) {
            if (Abilities.isWearingPiglinPassiveArmor(player)) {
                cir.setReturnValue(false);
            }
        }
        if (tester instanceof EndermanEntity endermanEntity && target instanceof PlayerEntity player) {
            if (Abilities.isWearingEndermanPassiveArmor(player)) {
                cir.setReturnValue(false);
            }
        }
    }
}