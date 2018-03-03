package com.gildedrose.algorithm;

import com.gildedrose.Item;

public class DecreaseQualityWithZeroGroudTwiceFasterAfterSellIn implements Algorithm {

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
