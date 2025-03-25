package github.mcdatapack.more_tools_and_armor.mixns.ability;

import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import github.mcdatapack.more_tools_and_armor.util.Abilities;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow public abstract int getXpToDrop(ServerWorld world, @Nullable Entity attacker);

    @Redirect(method = "tickFallFlying", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    private boolean isOf(ItemStack instance, Item item) {
        return instance.isOf(Items.ELYTRA) || instance.isOf(ItemInit.ANCIENT_CHESTPLATE);
    }

    @Inject(method = "addStatusEffect(Lnet/minecraft/entity/effect/StatusEffectInstance;Lnet/minecraft/entity/Entity;)Z", at = @At("HEAD"), cancellable = true)
    private void addStatusEffect(StatusEffectInstance effect, Entity source, CallbackInfoReturnable<Boolean> cir) {
        if (Abilities.isWearingStatusEffectImmuneArmor( (LivingEntity) (Object) this) && effect.getEffectType().value().getCategory() == StatusEffectCategory.HARMFUL) {
            cir.setReturnValue(false);
        }
    }

    @Redirect(method = "dropXp", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;getXpToDrop(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/Entity;)I"))
    private int getXpToDrop(LivingEntity instance, ServerWorld world, Entity attacker) {
        if (attacker instanceof PlayerEntity player) {
            ItemStack hand = player.getMainHandStack();
            if (hand.isOf(ItemInit.DEEPSLATE_EMERALD_SWORD))
                return getXpToDrop(world, attacker) * 5;
            if (hand.isOf(ItemInit.END_DIAMOND_SWORD))
                return getXpToDrop(world, attacker) * 10;
            if (hand.isOf(ItemInit.VOID_SWORD))
                return getXpToDrop(world, attacker) * 50;
            if (hand.isOf(ItemInit.ONETHDENDERITE_SWORD))
                return getXpToDrop(world, attacker) * 100;
            if (hand.isOf(ItemInit.OLED_SWORD))
                return getXpToDrop(world, attacker) * 500;
            if (hand.isOf(ItemInit.ANCIENT_SWORD))
                return getXpToDrop(world, attacker) * 1000;
        }
        return getXpToDrop(world, attacker);
    }
}
