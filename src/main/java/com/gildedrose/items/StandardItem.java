package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;
import com.gildedrose.algorithm.EndOfDay;

public class StandardItem extends InventoryItemStrategy {

    private final EndOfDay endOfDay = new EndOfDay();

    public StandardItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void changeSellIn(Item item) {
        item.sellIn = endOfDay.decrease(item.sellIn);
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
