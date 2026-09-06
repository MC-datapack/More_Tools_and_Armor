package github.mcdatapack.more_tools_and_armor.mixns.ability;

import github.mcdatapack.more_tools_and_armor.util.Abilities;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Phantom.class)
public class PhantomMixin {
    @Inject(method = "canAttack", at = @At("RETURN"), cancellable = true)
    private void canAttack(ServerLevel level, LivingEntity target, TargetingConditions targetingConditions, CallbackInfoReturnable<Boolean> cir) {
        if (target instanceof Player player && Abilities.isWearingPhantomPassiveArmor(player))
            cir.setReturnValue(false);
    }
}
