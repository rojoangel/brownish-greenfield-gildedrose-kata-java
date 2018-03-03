package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;

public class StandardItem extends InventoryItemStrategy {

    public StandardItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void changeSellIn(Item item) {
        item.sellIn = decrease(item.sellIn);
    }

    private int decrease(int i) {
        return i - 1;
    }

    @Override
    protected void changeQuality(Item item) {
        if (getSellIn() < 0) {
            item.quality--;
        }
        item.quality--;
        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
