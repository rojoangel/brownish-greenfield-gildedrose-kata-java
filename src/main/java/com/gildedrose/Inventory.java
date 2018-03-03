package com.gildedrose;

import com.gildedrose.algorithm.*;

public class Inventory {

    private static final int LEGENDARY_QUALITY = 80;

    public static InventoryItem item(String name, int sellIn, int quality) {
        if ("Aged Brie".equals(name)) {
            return new InventoryItem(name, sellIn, quality, new DecreaseSellIn(), new IncreaseQualityWithCeiling(50));
        }

        if ("Sulfuras".equals(name)) {
            return new InventoryItem(name, sellIn, LEGENDARY_QUALITY, new KeepSellIn(), new KeepQuality());
        }

        if ("Backstage Pass".equals(name)) {
            return new InventoryItem(name, sellIn, quality, new DecreaseSellIn(), new StaggeredQualityIncreaseWithDropToZeroAfterSellIn());
        }

        return new InventoryItem(name, sellIn, quality, new DecreaseSellIn(), new DecreaseQualityWithZeroGroudTwiceFasterAfterSellIn());
    }
}
