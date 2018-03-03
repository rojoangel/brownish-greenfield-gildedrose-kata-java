package com.gildedrose.item;

import com.gildedrose.AgingAlgorithm;
import com.gildedrose.AgingItem;
import com.gildedrose.Item;

public class InventoryItem implements AgingItem {

    private final Item item;
    private AgingAlgorithm sellInAgingAlgorithm;
    private AgingAlgorithm qualityAgingAlgorithm;

    public InventoryItem(Item item, AgingAlgorithm sellInAgingAlgorithm, AgingAlgorithm qualityAgingAlgorithm) {
        this.item = item;
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
        if (item.name.contains("Conjured")) {
            this.qualityAgingAlgorithm.apply(this.item);
        }
        this.qualityAgingAlgorithm.apply(this.item);
    }

}
