package github.mcdatapack.more_tools_and_armor.item;

import github.mcdatapack.more_tools_and_armor.init.EnchantmentInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HammerItem extends PaxelItem {
    private final int range;

    public HammerItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Settings settings, int range) {
        super(new ToolMaterial(toolMaterial.incorrectBlocksForDrops(), toolMaterial.durability() / 4,
                toolMaterial.speed(), toolMaterial.attackDamageBonus(), toolMaterial.enchantmentValue(), toolMaterial.repairItems()),
                attackDamage, attackSpeed, settings);
        this.range = range;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        ToolComponent toolComponent = stack.get(DataComponentTypes.TOOL);
        if (toolComponent == null) {
            return false;
        }

        if (!world.isClient() && state.getHardness(world, pos) != 0.0F && isCorrectForDrops(stack, state)) {
            Registry<Enchantment> registryWrapper = world.getRegistryManager().getOrThrow(RegistryKeys.ENCHANTMENT);
            int range = this.range + stack.getEnchantments().getLevel(registryWrapper.getEntry(registryWrapper.get(EnchantmentInit.RANGE)));

            for (int x = -range; x <= range; x++) {
                for (int y = -range; y <= range; y++) {
                    for (int z = -range; z <= range; z++) {
                        BlockPos targetPos = pos.add(x, y, z);
                        BlockState targetState = world.getBlockState(targetPos);

                        if (!targetState.isAir() && targetState.calcBlockBreakingDelta((PlayerEntity) miner, world, pos) != 0.0F && isCorrectForDrops(stack, targetState)) {
                            world.breakBlock(targetPos, true, miner);

                            Block.getDroppedStacks(world.getBlockState(pos), (ServerWorld) world, pos, null, miner, stack)
                                    .forEach(drop -> world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), drop)));
                        }
                    }
                }
            }

            stack.damage(toolComponent.damagePerBlock(), miner, EquipmentSlot.MAINHAND);
        }

        return true;
    }
}
