package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.algorithm.DecreaseQualityWithZeroGroudTwiceFasterAfterSellIn;
import com.gildedrose.algorithm.DecreaseSellIn;

public class StandardItem extends InventoryItemStrategy {

    public StandardItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new DecreaseSellIn(), new DecreaseQualityWithZeroGroudTwiceFasterAfterSellIn());
    }
}
