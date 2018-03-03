package com.gildedrose;

import com.gildedrose.algorithm.Algorithm;

public class InventoryItemStrategy implements InventoryItem {

    private final Item item;
    private Algorithm sellInAlgorithm;
    private Algorithm qualityAlgorithm;

    public InventoryItemStrategy(String name, int sellIn, int quality, Algorithm sellInAlgorithm, Algorithm qualityAlgorithm) {
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
        changeSellIn(this.item);
        changeQuality(this.item);
    }

    private void changeSellIn(Item item) {
        this.sellInAlgorithm.apply(item);
    }

    private void changeQuality(Item item) {
        this.qualityAlgorithm.apply(item);
    }
}
