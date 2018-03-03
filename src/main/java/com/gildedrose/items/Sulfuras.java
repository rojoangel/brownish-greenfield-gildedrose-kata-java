package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;
import com.gildedrose.algorithm.KeepSellIn;

public class Sulfuras extends InventoryItemStrategy {

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new KeepSellIn());
    }

    @Override
    protected void changeQuality(Item item) {

    }
}
