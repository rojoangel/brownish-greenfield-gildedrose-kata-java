package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;
import com.gildedrose.algorithm.Decrease;

public class AgedBrie extends InventoryItemStrategy {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new Decrease());
    }

    @Override
    protected void changeQuality(Item item) {
        item.quality++;
        if (item.quality > 50) {
            item.quality = 50;
        }
    }
}
