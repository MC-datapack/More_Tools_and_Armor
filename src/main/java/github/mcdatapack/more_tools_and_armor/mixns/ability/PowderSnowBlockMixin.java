package github.mcdatapack.more_tools_and_armor.mixns.ability;

import github.mcdatapack.more_tools_and_armor.util.Abilities;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.PowderSnowBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PowderSnowBlock.class)
public class PowderSnowBlockMixin {
    @Inject(method = "canEntityWalkOnPowderSnow", at = @At("RETURN"), cancellable = true)
    private static void canWalkOnPowderSnow(Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (!cir.getReturnValue()) {
            if (entity instanceof LivingEntity livingEntity && Abilities.isWearingPowderSnowWalkArmor(livingEntity)) {
                cir.setReturnValue(true);
            }
        }
    }
}
