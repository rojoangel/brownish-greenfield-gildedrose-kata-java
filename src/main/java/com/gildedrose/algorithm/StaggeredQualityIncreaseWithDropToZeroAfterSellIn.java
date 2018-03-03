package com.gildedrose.algorithm;

import com.gildedrose.Item;

public class StaggeredQualityIncreaseWithDropToZeroAfterSellIn implements Algorithm {

    public void apply(Item item) {
        if (item.sellIn <= 5) {
            item.quality++;
        }

        if (item.sellIn <= 10) {
            item.quality++;
        }

        item.quality++;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
