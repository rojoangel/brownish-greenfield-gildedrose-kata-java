package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;
import com.gildedrose.algorithm.Algorithm;
import com.gildedrose.algorithm.DecreaseQualityWithZeroGroudTwiceFasterAfterSellIn;
import com.gildedrose.algorithm.DecreaseSellIn;

public class StandardItem extends InventoryItemStrategy {

    private Algorithm qualityAlgorithm;

    public StandardItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new DecreaseSellIn());
        this.qualityAlgorithm = new DecreaseQualityWithZeroGroudTwiceFasterAfterSellIn();
    }

    @Override
    protected void changeQuality(Item item) {
        this.qualityAlgorithm.apply(item);
    }
}
