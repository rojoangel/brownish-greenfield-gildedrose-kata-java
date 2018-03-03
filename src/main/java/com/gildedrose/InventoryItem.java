package com.gildedrose;

public class InventoryItem implements AgingItem {

    private final Item item;
    private AgingAlgorithm sellInAgingAlgorithm;
    private AgingAlgorithm qualityAgingAlgorithm;

    public InventoryItem(String name, int sellIn, int quality, AgingAlgorithm sellInAgingAlgorithm, AgingAlgorithm qualityAgingAlgorithm) {
        this.item = new Item(name, sellIn, quality);
        this.sellInAgingAlgorithm = sellInAgingAlgorithm;
        this.qualityAgingAlgorithm = qualityAgingAlgorithm;
    }

    public int getSellIn() {
        return this.item.sellIn;
    }

    public int getQuality() {
        return this.item.quality;
    }

    public void endOfDay() {
        this.sellInAgingAlgorithm.apply(this.item);
        this.qualityAgingAlgorithm.apply(this.item);
    }

}
