package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.algorithm.DecreaseSellIn;
import com.gildedrose.algorithm.IncreaseQualityWithCeiling;

public class AgedBrie extends InventoryItemStrategy {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new DecreaseSellIn(), new IncreaseQualityWithCeiling(50));
    }
}
