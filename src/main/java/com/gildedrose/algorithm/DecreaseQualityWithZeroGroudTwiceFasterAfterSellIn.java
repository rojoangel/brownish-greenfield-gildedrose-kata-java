package com.gildedrose.algorithm;

import com.gildedrose.AgingAlgorithm;
import com.gildedrose.Item;

public class DecreaseQualityWithZeroGroudTwiceFasterAfterSellIn implements AgingAlgorithm {

    public void apply(Item item) {
        if (item.sellIn < 0) {
            item.quality--;
        }
        item.quality--;
        if (item.quality < 0) {
            item.quality = 0;
        }

    }
}
