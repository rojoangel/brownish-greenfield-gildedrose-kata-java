package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;
import com.gildedrose.algorithm.Algorithm;
import com.gildedrose.algorithm.KeepQuality;
import com.gildedrose.algorithm.KeepSellIn;

public class Sulfuras extends InventoryItemStrategy {

    private Algorithm qualityAlgorithm;

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new KeepSellIn());
        this.qualityAlgorithm = new KeepQuality();
    }

    @Override
    protected void changeQuality(Item item) {
        this.qualityAlgorithm.apply(item);
    }
}
