package github.mcdatapack.more_tools_and_armor.mixns.ability;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeyedValue;
import net.minecraft.registry.RegistryKeys;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AbstractBlock.Settings.class)
public abstract class AbstractBlockSettingsMixin {
    @Shadow private RegistryKeyedValue<Block, Optional<RegistryKey<LootTable>>> lootTable;

    @Inject(method = "dropsNothing", at = @At("RETURN"))
    public void dropsNothing(CallbackInfoReturnable<AbstractBlock.Settings> cir) {
        lootTable = registryKey -> Optional.of(
                RegistryKey.of(RegistryKeys.LOOT_TABLE, registryKey.getValue().withPrefixedPath("blocks/"))
        );
    }
}