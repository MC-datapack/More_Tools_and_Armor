package github.mcdatapack.more_tools_and_armor.mixns.ability;

import net.minecraft.block.AbstractBlock;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractBlock.Settings.class)
public abstract class AbstractBlockSettingsMixin {
    @Shadow RegistryKey<LootTable> lootTableKey;

    @Inject(method = "dropsNothing", at = @At("RETURN"))
    public void dropsNothing(CallbackInfoReturnable<AbstractBlock.Settings> cir) {
        lootTableKey = null;
    }
}