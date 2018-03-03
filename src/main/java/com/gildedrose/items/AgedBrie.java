package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;
import com.gildedrose.algorithm.Algorithm;
import com.gildedrose.algorithm.DecreaseSellIn;
import com.gildedrose.algorithm.IncreaseQualityWithCeiling;

public class AgedBrie extends InventoryItemStrategy {

    private Algorithm qualityAlgorithm;

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new DecreaseSellIn());
        this.qualityAlgorithm = new IncreaseQualityWithCeiling(50);
    }

    @Override
    protected void changeQuality(Item item) {
        this.qualityAlgorithm.apply(item);
    }
}
