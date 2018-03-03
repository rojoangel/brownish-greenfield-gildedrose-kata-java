package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;

public class Sulfuras extends InventoryItemStrategy {

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void changeSellIn(Item item) {

    }

    @Override
    protected void changeQuality(Item item) {

    }
}
