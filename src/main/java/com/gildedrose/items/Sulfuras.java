package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;
import com.gildedrose.algorithm.Algorithm;
import com.gildedrose.algorithm.Decrease;
import com.gildedrose.algorithm.Keep;

public class Sulfuras extends InventoryItemStrategy {

    private final Algorithm sellInAlgorithm;

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        sellInAlgorithm = new Keep();
    }

    @Override
    protected void changeSellIn(Item item) {
        item.sellIn = sellInAlgorithm.calculate(item.sellIn);
    }

    @Override
    protected void changeQuality(Item item) {

    }
}
