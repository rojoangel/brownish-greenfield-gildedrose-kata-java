package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;
import com.gildedrose.algorithm.DecreaseSellIn;

public class AgedBrie extends InventoryItemStrategy {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new DecreaseSellIn());
    }

    @Override
    protected void changeQuality(Item item) {
        item.quality++;
        if (item.quality > 50) {
            item.quality = 50;
        }
    }
}
