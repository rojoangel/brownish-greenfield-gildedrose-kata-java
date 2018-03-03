package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;

public class BackstagePass extends InventoryItemStrategy {

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void changeSellIn(Item item) {
        item.sellIn--;
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
    }
}
