package com.gildedrose.items;

import com.gildedrose.InventoryItem;
import com.gildedrose.Item;

abstract class ItemStrategy implements InventoryItem {

    private final Item item;

    public ItemStrategy(String name, int sellIn, int quality) {
        this.item = new Item(name, sellIn, quality);
    }

    public int getSellIn() {
        return this.item.sellIn;
    }

    public int getQuality() {
        return this.item.quality;
    }

    public void endOfDay() {
        changeSellIn(this.item);
        changeQuality(this.item);
    }

    protected abstract void changeSellIn(Item item);

    protected abstract void changeQuality(Item item);
}
