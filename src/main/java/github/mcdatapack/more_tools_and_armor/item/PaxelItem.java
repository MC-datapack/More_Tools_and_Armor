package github.mcdatapack.more_tools_and_armor.item;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.minecraft.advancements.triggers.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PaxelItem extends Item {
    public final ToolMaterial material;
    protected static final Map<Block, Block> STRIPPED_BLOCKS = AxeItemAccessor.getStrippables();

    protected static final Map<Block, Pair<Predicate<UseOnContext>, Consumer<UseOnContext>>> TILLING_ACTIONS = Maps.newHashMap(
            new ImmutableMap.Builder<Block, Pair<Predicate<UseOnContext>, Consumer<UseOnContext>>>()
                    .put(Blocks.GRASS_BLOCK, Pair.of(PaxelItem::canTillFarmland, createTillAction(Blocks.DIRT_PATH.defaultBlockState())))
                    .put(Blocks.DIRT_PATH, Pair.of(PaxelItem::canTillFarmland, createTillAction(Blocks.FARMLAND.defaultBlockState())))
                    .put(Blocks.DIRT, Pair.of(PaxelItem::canTillFarmland, createTillAction(Blocks.DIRT_PATH.defaultBlockState())))
                    .put(Blocks.COARSE_DIRT, Pair.of(PaxelItem::canTillFarmland, createTillAction(Blocks.DIRT.defaultBlockState())))
                    .put(Blocks.ROOTED_DIRT, Pair.of(itemUsageContext -> true, createTillAndDropAction(Blocks.DIRT.defaultBlockState(), Items.HANGING_ROOTS)))
                    .put(Blocks.MOSS_BLOCK, Pair.of(PaxelItem::canTillFarmland, createTillAction(Blocks.GRASS_BLOCK.defaultBlockState())))
                    .put(Blocks.PODZOL, Pair.of(PaxelItem::canTillFarmland, createRandomTillAndDropAction(Blocks.DIRT_PATH.defaultBlockState(),
                            List.of(Items.BROWN_MUSHROOM, Items.RED_MUSHROOM))))
                    .put(Blocks.MYCELIUM, Pair.of(PaxelItem::canTillFarmland, createRandomTillAndDropAction(Blocks.DIRT_PATH.defaultBlockState(),
                            List.of(Items.BROWN_MUSHROOM, Items.RED_MUSHROOM))))
                    .build()
    );

    public PaxelItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Item.Properties settings) {
        super(settings.tool(toolMaterial, TagList.BlockTags.PAXEL_MINEABLE, attackDamage, attackSpeed, 0.0F));
        this.material = toolMaterial;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        Pair<Predicate<UseOnContext>, Consumer<UseOnContext>> pair = TILLING_ACTIONS.get(world.getBlockState(blockPos).getBlock());
        Player playerEntity = context.getPlayer();
        if (!shouldCancelStripAttempt(context)) {
            Optional<BlockState> optional = this.tryStrip(world, blockPos, playerEntity, world.getBlockState(blockPos));
            if (pair == null && optional.isEmpty()) {
                return InteractionResult.PASS;
            } else if (optional.isEmpty()) {
                Predicate<UseOnContext> predicate = pair.getFirst();
                Consumer<UseOnContext> consumer = pair.getSecond();
                if (predicate.test(context)) {
                    world.playSound(playerEntity, blockPos, SoundEvents.HOE_TILL, SoundSource.BLOCKS, 1.0F, 1.0F);
                        if (!world.isClientSide()) {
                        consumer.accept(context);
                        if (playerEntity != null) {
                            context.getItemInHand().hurtAndBreak(1, playerEntity, context.getHand());
                        }
                    }

                    return InteractionResult.SUCCESS;
                } else {
                    return InteractionResult.PASS;
                }
            } else if (pair == null) {
                ItemStack itemStack = context.getItemInHand();
                if (playerEntity instanceof ServerPlayer) {
                    CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer) playerEntity, blockPos, itemStack);
                }

                world.setBlock(blockPos, optional.get(), Block.UPDATE_ALL);
                world.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(playerEntity, optional.get()));
                if (playerEntity != null) {
                    itemStack.hurtAndBreak(1, playerEntity, context.getHand());
                }

                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }

    private static boolean shouldCancelStripAttempt(UseOnContext context) {
        Player playerEntity = context.getPlayer();
        if (!context.getHand().equals(InteractionHand.MAIN_HAND)) return false;
        assert playerEntity != null;
        return playerEntity.getOffhandItem().is(Items.SHIELD) && !playerEntity.isSecondaryUseActive();
    }

    private Optional<BlockState> tryStrip(Level world, BlockPos pos, Player player, BlockState state) {
        Optional<BlockState> optional = this.getStrippedState(state);
        if (optional.isPresent()) {
            world.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
            return optional;
        } else {
            Optional<BlockState> optional2 = WeatheringCopper.getPrevious(state);
            if (optional2.isPresent()) {
                world.playSound(player, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0F, 1.0F);
                world.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
                return optional2;
            } else {
                Optional<BlockState> optional3 = Optional.ofNullable((Block)((BiMap<?, ?>) HoneycombItem.WAX_OFF_BY_BLOCK.get()).get(state.getBlock()))
                        .map(block -> block.withPropertiesOf(state));
                if (optional3.isPresent()) {
                    world.playSound(player, pos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
                    world.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
                    return optional3;
                } else {
                    return Optional.empty();
                }
            }
        }
    }

    private Optional<BlockState> getStrippedState(BlockState state) {
        return Optional.ofNullable(STRIPPED_BLOCKS.get(state.getBlock()))
                .map(block -> block.defaultBlockState().setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS)));
    }

    public static boolean canTillFarmland(UseOnContext context) {
        return context.getClickedFace() != Direction.DOWN && context.getLevel().getBlockState(context.getClickedPos().above()).isAir();
    }

    public static Consumer<UseOnContext> createTillAction(BlockState state) {
        return context -> {
            context.getLevel().setBlock(context.getClickedPos(), state, 11);
            context.getLevel().gameEvent(GameEvent.BLOCK_CHANGE, context.getClickedPos(), GameEvent.Context.of(context.getPlayer(), state));
        };
    }

    public static Consumer<UseOnContext> createTillAndDropAction(BlockState state, ItemLike item) {
        return context -> {
            context.getLevel().setBlock(context.getClickedPos(), state, 11);
            context.getLevel().gameEvent(GameEvent.BLOCK_CHANGE, context.getClickedPos(), GameEvent.Context.of(context.getPlayer(), state));
            Block.popResourceFromFace(context.getLevel(), context.getClickedPos(), context.getClickedFace(), new ItemStack(item));
        };
    }

    public static Consumer<UseOnContext> createRandomTillAndDropAction(BlockState state, List<ItemLike> items) {
        int index = ThreadLocalRandom.current().nextInt(items.size());
        ItemLike item = items.get(index);
        return context -> {
            context.getLevel().setBlock(context.getClickedPos(), state, 11);
            context.getLevel().gameEvent(GameEvent.BLOCK_CHANGE, context.getClickedPos(), GameEvent.Context.of(context.getPlayer(), state));
            Block.popResourceFromFace(context.getLevel(), context.getClickedPos(), context.getClickedFace(), new ItemStack(item));
        };
    }
}
