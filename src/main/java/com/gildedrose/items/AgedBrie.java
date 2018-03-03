package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;

public class AgedBrie extends InventoryItemStrategy {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void changeSellIn(Item item) {
        item.sellIn--;
    }

    @Override
    protected void changeQuality(Item item) {
        item.quality++;
        if (item.quality > 50) {
            item.quality = 50;
        }
    }
}
