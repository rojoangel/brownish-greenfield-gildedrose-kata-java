package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.algorithm.DecreaseSellIn;
import com.gildedrose.algorithm.StaggeredQualityIncreaseWithDropToZeroAfterSellIn;

public class BackstagePass extends InventoryItemStrategy {

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new DecreaseSellIn(), new StaggeredQualityIncreaseWithDropToZeroAfterSellIn());
    }
}
