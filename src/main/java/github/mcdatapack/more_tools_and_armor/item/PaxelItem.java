package github.mcdatapack.more_tools_and_armor.item;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static net.minecraft.item.HoeItem.createTillAction;
import static net.minecraft.item.HoeItem.createTillAndDropAction;

public class PaxelItem extends MiningToolItem {
    protected static final Map<Block, Block> STRIPPED_BLOCKS = new ImmutableMap.Builder<Block, Block>()
            .put(Blocks.OAK_WOOD, Blocks.STRIPPED_OAK_WOOD)
            .put(Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG)
            .put(Blocks.DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_WOOD)
            .put(Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG)
            .put(Blocks.ACACIA_WOOD, Blocks.STRIPPED_ACACIA_WOOD)
            .put(Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG)
            .put(Blocks.CHERRY_WOOD, Blocks.STRIPPED_CHERRY_WOOD)
            .put(Blocks.CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG)
            .put(Blocks.BIRCH_WOOD, Blocks.STRIPPED_BIRCH_WOOD)
            .put(Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG)
            .put(Blocks.JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_WOOD)
            .put(Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG)
            .put(Blocks.SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_WOOD)
            .put(Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG)
            .put(Blocks.WARPED_STEM, Blocks.STRIPPED_WARPED_STEM)
            .put(Blocks.WARPED_HYPHAE, Blocks.STRIPPED_WARPED_HYPHAE)
            .put(Blocks.CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM)
            .put(Blocks.CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_HYPHAE)
            .put(Blocks.MANGROVE_WOOD, Blocks.STRIPPED_MANGROVE_WOOD)
            .put(Blocks.MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_LOG)
            .put(Blocks.BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK)
            .build();

    protected static final Map<Block, Pair<Predicate<ItemUsageContext>, Consumer<ItemUsageContext>>> TILLING_ACTIONS = Maps.newHashMap(
            ImmutableMap.of(
                    Blocks.GRASS_BLOCK,
                    Pair.of(PaxelItem::canTillFarmland, createTillAction(Blocks.DIRT_PATH.getDefaultState())),
                    Blocks.DIRT_PATH,
                    Pair.of(PaxelItem::canTillFarmland, createTillAction(Blocks.FARMLAND.getDefaultState())),
                    Blocks.DIRT,
                    Pair.of(PaxelItem::canTillFarmland, createTillAction(Blocks.DIRT_PATH.getDefaultState())),
                    Blocks.COARSE_DIRT,
                    Pair.of(PaxelItem::canTillFarmland, createTillAction(Blocks.DIRT.getDefaultState())),
                    Blocks.ROOTED_DIRT,
                    Pair.of(itemUsageContext -> true, createTillAndDropAction(Blocks.DIRT.getDefaultState(), Items.HANGING_ROOTS)),
                    Blocks.MOSS_BLOCK,
                    Pair.of(PaxelItem::canTillFarmland, createTillAction(Blocks.GRASS_BLOCK.getDefaultState())),
                    Blocks.PODZOL,
                    Pair.of(PaxelItem::canTillFarmland, createTillAndDropAction(Blocks.DIRT_PATH.getDefaultState(),
                            random(Items.BROWN_MUSHROOM, Items.RED_MUSHROOM))),
                    Blocks.MYCELIUM,
                    Pair.of(PaxelItem::canTillFarmland, createTillAndDropAction(Blocks.DIRT_PATH.getDefaultState(),
                            random(Items.BROWN_MUSHROOM, Items.RED_MUSHROOM)))
            )
    );

    public PaxelItem(ToolMaterial toolMaterial, Item.Settings settings) {
        super(toolMaterial, TagList.BlockTags.PAXEL_MINEABLE, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        Pair<Predicate<ItemUsageContext>, Consumer<ItemUsageContext>> pair = TILLING_ACTIONS.get(
                world.getBlockState(blockPos).getBlock()
        );
        TILLING_ACTIONS.replace(Blocks.MYCELIUM, Pair.of(PaxelItem::canTillFarmland, createTillAndDropAction(Blocks.DIRT_PATH.getDefaultState(),
                random(Items.BROWN_MUSHROOM, Items.RED_MUSHROOM))));
        TILLING_ACTIONS.replace(Blocks.PODZOL, Pair.of(PaxelItem::canTillFarmland, createTillAndDropAction(Blocks.DIRT_PATH.getDefaultState(),
                random(Items.BROWN_MUSHROOM, Items.RED_MUSHROOM))));
        PlayerEntity playerEntity = context.getPlayer();
        if (shouldCancelStripAttempt(context)) {
            return ActionResult.PASS;
        } else {
            Optional<BlockState> optional = this.tryStrip(world, blockPos, playerEntity, world.getBlockState(blockPos));
            if (pair == null && optional.isEmpty()) {
                return ActionResult.PASS;
            } else if (optional.isEmpty()) {
                Predicate<ItemUsageContext> predicate = pair.getFirst();
                Consumer<ItemUsageContext> consumer = pair.getSecond();
                if (predicate.test(context)) {
                    world.playSound(playerEntity, blockPos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    if (!world.isClient) {
                        consumer.accept(context);
                        if (playerEntity != null) {
                            context.getStack().damage(1, playerEntity, LivingEntity.getSlotForHand(context.getHand()));
                        }
                    }

                    return ActionResult.success(world.isClient);
                } else {
                    return ActionResult.PASS;
                }
            } else if (pair == null) {
                ItemStack itemStack = context.getStack();
                if (playerEntity instanceof ServerPlayerEntity) {
                    Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity)playerEntity, blockPos, itemStack);
                }

                world.setBlockState(blockPos, optional.get(), Block.NOTIFY_ALL_AND_REDRAW);
                world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, optional.get()));
                if (playerEntity != null) {
                    itemStack.damage(1, playerEntity, LivingEntity.getSlotForHand(context.getHand()));
                }

                return ActionResult.success(world.isClient);
            }
            return ActionResult.PASS;
        }
    }

    private static boolean shouldCancelStripAttempt(ItemUsageContext context) {
        PlayerEntity playerEntity = context.getPlayer();
        return context.getHand().equals(Hand.MAIN_HAND) && playerEntity.getOffHandStack().isOf(Items.SHIELD) && !playerEntity.shouldCancelInteraction();
    }

    private Optional<BlockState> tryStrip(World world, BlockPos pos, @Nullable PlayerEntity player, BlockState state) {
        Optional<BlockState> optional = this.getStrippedState(state);
        if (optional.isPresent()) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return optional;
        } else {
            Optional<BlockState> optional2 = Oxidizable.getDecreasedOxidationState(state);
            if (optional2.isPresent()) {
                world.playSound(player, pos, SoundEvents.ITEM_AXE_SCRAPE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                world.syncWorldEvent(player, WorldEvents.BLOCK_SCRAPED, pos, 0);
                return optional2;
            } else {
                Optional<BlockState> optional3 = Optional.ofNullable((Block)((BiMap)HoneycombItem.WAXED_TO_UNWAXED_BLOCKS.get()).get(state.getBlock()))
                        .map(block -> block.getStateWithProperties(state));
                if (optional3.isPresent()) {
                    world.playSound(player, pos, SoundEvents.ITEM_AXE_WAX_OFF, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    world.syncWorldEvent(player, WorldEvents.WAX_REMOVED, pos, 0);
                    return optional3;
                } else {
                    return Optional.empty();
                }
            }
        }
    }

    private Optional<BlockState> getStrippedState(BlockState state) {
        return Optional.ofNullable(STRIPPED_BLOCKS.get(state.getBlock()))
                .map(block -> block.getDefaultState().with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)));
    }

    public static boolean canTillFarmland(ItemUsageContext context) {
        return context.getSide() != Direction.DOWN && context.getWorld().getBlockState(context.getBlockPos().up()).isAir();
    }

    private static Item random(Item i1, Item i2) {
        int i = ThreadLocalRandom.current().nextInt(100);
        if (i <= 50) return i1;
        else return i2;
    }
}
