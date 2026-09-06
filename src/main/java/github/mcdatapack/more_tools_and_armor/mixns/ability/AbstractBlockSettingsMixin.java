package github.mcdatapack.more_tools_and_armor.mixns.ability;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.DependantName;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.storage.loot.LootTable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(BlockBehaviour.Properties.class)
public abstract class AbstractBlockSettingsMixin {
    @Shadow private DependantName<Block, Optional<ResourceKey<LootTable>>> drops;

    @Inject(method = "noLootTable", at = @At("RETURN"))
    public void dropsNothing(CallbackInfoReturnable<BlockBehaviour.Properties> cir) {
        drops = registryKey -> Optional.of(
                ResourceKey.create(Registries.LOOT_TABLE, registryKey.identifier().withPrefix("blocks/"))
        );
    }
}