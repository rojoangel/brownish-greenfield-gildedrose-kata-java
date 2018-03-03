package com.gildedrose;

import com.gildedrose.algorithm.Algorithm;

public abstract class InventoryItemStrategy implements InventoryItem {

    private final Item item;
    private Algorithm sellInAlgorithm;

    public InventoryItemStrategy(String name, int sellIn, int quality, Algorithm sellInAlgorithm) {
        this.item = new Item(name, sellIn, quality);
        this.sellInAlgorithm = sellInAlgorithm;
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
        item.sellIn = this.sellInAlgorithm.calculate(item.sellIn);
    }

    protected abstract void changeQuality(Item item);
}
