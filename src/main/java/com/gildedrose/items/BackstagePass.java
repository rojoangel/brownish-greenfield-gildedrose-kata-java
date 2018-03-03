package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;
import com.gildedrose.algorithm.Decrease;

public class BackstagePass extends InventoryItemStrategy {

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new Decrease());
    }

    @Override
    protected void changeQuality(Item item) {

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
