package github.mcdatapack.more_tools_and_armor.mixns.ability;

import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import github.mcdatapack.more_tools_and_armor.item.PickaxeItem;
import github.mcdatapack.more_tools_and_armor.util.Abilities;
import net.minecraft.core.BlockPos;
import net.minecraft.references.BlockItemIds;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

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
    @Inject(method = "getDrops", at = @At(value = "RETURN"), cancellable = true)
    private void getAncientToolDrops(BlockState state, LootParams.Builder params, CallbackInfoReturnable<List<ItemStack>> cir) {
        ItemInstance instance = params.getParameter(LootContextParams.TOOL);
        if (instance.is(ItemInit.ANCIENT_PICKAXE) || instance.is(ItemInit.ANCIENT_PAXEL) || instance.is(ItemInit.ANCIENT_HAMMER)) {
            if (state.getBlock().properties().blockId() == BlockItemIds.END_PORTAL_FRAME.block())
                cir.setReturnValue(List.of(new ItemStack(Items.END_PORTAL_FRAME)));
            else if (state.getBlock().properties().blockId() == BlockItemIds.BEDROCK.block())
                cir.setReturnValue(List.of(new ItemStack(Items.BEDROCK)));
        }
    }
}
