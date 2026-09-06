package github.mcdatapack.more_tools_and_armor.mixns.ability;

import github.mcdatapack.more_tools_and_armor.util.Abilities;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.golem.IronGolem;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(IronGolem.class)
public class IronGolemMixin {
    @Inject(method = "canAttack", at = @At("HEAD"), cancellable = true)
    private void canAttack(LivingEntity entity, CallbackInfoReturnable<Boolean> cir) {
        if (entity instanceof Player player && Abilities.isWearingIronGolemPassiveArmor(player))
            cir.setReturnValue(false);
    }
}
