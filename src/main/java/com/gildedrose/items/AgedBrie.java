package com.gildedrose.items;

import com.gildedrose.InventoryItem;
import com.gildedrose.Item;

public class AgedBrie implements InventoryItem {
    private final Item item;

    public AgedBrie(String name, int sellIn, int quality) {
        this.item = new Item(name, sellIn, quality);
    }

    public int getSellIn() {
        return this.item.sellIn;
    }

    public int getQuality() {
        return this.item.quality;
    }

    public void endOfDay() {
        increaseQuality();
    }

    private void increaseQuality() {
        this.item.quality++;
    }
}
