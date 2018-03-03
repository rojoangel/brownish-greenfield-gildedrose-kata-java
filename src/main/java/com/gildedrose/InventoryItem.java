package com.gildedrose;

import com.gildedrose.algorithm.Algorithm;

public class InventoryItem implements AgingItem {

    private final Item item;
    private Algorithm sellInAlgorithm;
    private Algorithm qualityAlgorithm;

    public InventoryItem(String name, int sellIn, int quality, Algorithm sellInAlgorithm, Algorithm qualityAlgorithm) {
        this.item = new Item(name, sellIn, quality);
        this.sellInAlgorithm = sellInAlgorithm;
        this.qualityAlgorithm = qualityAlgorithm;
    }

    public int getSellIn() {
        return this.item.sellIn;
    }

    public int getQuality() {
        return this.item.quality;
    }

    public void endOfDay() {
        this.sellInAlgorithm.apply(this.item);
        this.qualityAlgorithm.apply(this.item);
    }

}
