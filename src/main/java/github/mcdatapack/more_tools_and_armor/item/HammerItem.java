package github.mcdatapack.more_tools_and_armor.item;

import github.mcdatapack.more_tools_and_armor.init.EnchantmentInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class HammerItem extends PaxelItem {
    private final int range;

    public HammerItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Properties settings, int range) {
        super(new ToolMaterial(toolMaterial.incorrectBlocksForDrops(), toolMaterial.durability() / 4,
                toolMaterial.speed(), toolMaterial.attackDamageBonus(), toolMaterial.enchantmentValue(), toolMaterial.repairItems()),
                attackDamage, attackSpeed, settings);
        this.range = range;
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level world, BlockState state, BlockPos pos, LivingEntity owner) {
        Tool toolComponent = stack.get(DataComponents.TOOL);
        if (toolComponent == null) {
            return false;
        }

        if (!world.isClientSide() && state.getDestroySpeed(world, pos) != 0.0F && isCorrectToolForDrops(stack, state)) {
            Registry<Enchantment> registryWrapper = world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT);
            int range = this.range + stack.getEnchantments().getLevel(registryWrapper.getOrThrow(EnchantmentInit.RANGE));

            for (int x = -range; x <= range; x++) {
                for (int y = -range; y <= range; y++) {
                    for (int z = -range; z <= range; z++) {
                        BlockPos targetPos = pos.offset(x, y, z);
                        BlockState targetState = world.getBlockState(targetPos);

                        if (!targetState.isAir() && targetState.getDestroyProgress((Player) owner, world, pos) != 0.0F && isCorrectToolForDrops(stack, targetState)) {
                                world.destroyBlock(targetPos, true, owner);

                            Block.getDrops(world.getBlockState(pos), (ServerLevel) world, pos, null, owner, stack)
                                    .forEach(drop -> world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), drop)));
                        }
                    }
                }
            }

            stack.hurtAndBreak(toolComponent.damagePerBlock(), owner, EquipmentSlot.MAINHAND);
        }

        return true;
    }
}
