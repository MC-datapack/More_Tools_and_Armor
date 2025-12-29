package github.mcdatapack.more_tools_and_armor.util;

import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

import java.util.Optional;

public class TradeHandler {
    public static void registerTrades() {
        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, random.nextBetween(12, 24)),
                        Optional.of(new TradedItem(ItemInit.END_DIAMOND)),
                        new ItemStack(ItemInit.END_DIAMOND_UPGRADE_SMITHING_TEMPLATE, random.nextBetween(1, 3)),
                        6, 0, 0
                ));
                factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, random.nextBetween(12, 32)),
                        Optional.of(new TradedItem(ItemInit.VOID_INGOT)),
                        new ItemStack(ItemInit.VOID_UPGRADE_SMITHING_TEMPLATE, random.nextBetween(2, 4)),
                        6, 0, 0
                ));
                factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, random.nextBetween(16, 48)),
                        Optional.of(new TradedItem(ItemInit.ONETHDENDERITE_INGOT)),
                        new ItemStack(ItemInit.ONETHDENDERITE_UPGRADE_SMITHING_TEMPLATE, random.nextBetween(2, 5)),
                        6, 0, 0
                ));
                factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, random.nextBetween(32, 48)),
                        Optional.of(new TradedItem(ItemInit.OLED_INGOT)),
                        new ItemStack(ItemInit.OLED_UPGRADE_SMITHING_TEMPLATE, random.nextBetween(2, 5)),
                        6, 0, 0
                ));
                factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, random.nextBetween(48, 64)),
                        Optional.of(new TradedItem(ItemInit.ANCIENT_INGOT)),
                        new ItemStack(ItemInit.ANCIENT_UPGRADE_SMITHING_TEMPLATE, random.nextBetween(3, 6)),
                        6, 0, 0
                ));
            }
        );
    }
}
