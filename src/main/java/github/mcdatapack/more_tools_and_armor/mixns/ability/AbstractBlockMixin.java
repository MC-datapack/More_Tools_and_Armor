package github.mcdatapack.more_tools_and_armor.mixns.ability;

import github.mcdatapack.more_tools_and_armor.util.Abilities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockBehaviour.class)
public abstract class AbstractBlockMixin {
    @Inject(method = "getDestroyProgress", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;getDestroySpeed(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)F"), cancellable = true)
    private void getHardness(BlockState state, Player player, BlockGetter world, BlockPos pos, CallbackInfoReturnable<Float> cir) {
        if (Abilities.isHoldingBedrockBreakingTool(player)) {
            if (state.is(Blocks.BEDROCK) || state.is(Blocks.END_PORTAL_FRAME)) {
                cir.setReturnValue(player.getDestroySpeed(state) / 1.25F / 30F);
            }
        }
    }
}
