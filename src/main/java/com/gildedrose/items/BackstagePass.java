package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;
import com.gildedrose.algorithm.Algorithm;
import com.gildedrose.algorithm.DecreaseSellIn;
import com.gildedrose.algorithm.StaggeredQualityIncreaseWithDropToZeroAfterSellIn;

public class BackstagePass extends InventoryItemStrategy {

    private Algorithm qualityAlgorithm;

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new DecreaseSellIn());
        this.qualityAlgorithm = new StaggeredQualityIncreaseWithDropToZeroAfterSellIn();
    }

    @Override
    protected void changeQuality(Item item) {
        this.qualityAlgorithm.apply(item);
    }
}
