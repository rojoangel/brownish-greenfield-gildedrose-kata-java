package com.gildedrose.algorithm;

import com.gildedrose.Item;

public class IncreaseQualityWithCeiling implements Algorithm {

    private int ceiling;

    public IncreaseQualityWithCeiling(int ceiling) {
        this.ceiling = ceiling;
    }

    public void apply(Item item) {
        item.quality++;
        if (item.quality > this.ceiling) {
            item.quality = this.ceiling;
        }

    }
}
