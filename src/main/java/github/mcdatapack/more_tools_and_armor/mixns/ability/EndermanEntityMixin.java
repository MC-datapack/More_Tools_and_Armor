package github.mcdatapack.more_tools_and_armor.mixns.ability;

import github.mcdatapack.more_tools_and_armor.util.Abilities;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnderMan.class)
public abstract class EndermanEntityMixin {

    @Shadow public abstract void setTarget(LivingEntity target);

    @Inject(method = "isBeingStaredBy", at = @At("RETURN"), cancellable = true)
    private void isPlayerStaring(Player player, CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValue()) {
            if (Abilities.isWearingEndermanSaveArmor(player)) {
                cir.setReturnValue(false);
            }
        }
    }

    @Inject(method = "setTarget", at = @At("RETURN"), cancellable = true)
    private void setTarget(LivingEntity entity, CallbackInfo ci) {
        if (entity instanceof Player player && Abilities.isWearingEndermanPassiveArmor(player)) {
            setTarget(null);
            ci.cancel();
        }
    }
}
