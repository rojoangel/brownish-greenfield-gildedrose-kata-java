package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackstagePass;
import com.gildedrose.items.StandardItem;
import com.gildedrose.items.Sulfuras;

public class Inventory {

    private static final int LEGENDARY_QUALITY = 80;

    public static InventoryItem item(String name, int sellIn, int quality) {
        if ("Aged Brie".equals(name)) {
            return new AgedBrie(name, sellIn, quality);
        }

        if ("Sulfuras".equals(name)) {
            return new Sulfuras(name, sellIn, LEGENDARY_QUALITY);
        }

        if ("Backstage Pass".equals(name)) {
            return new BackstagePass(name, sellIn, quality);
        }

        return new StandardItem(name, sellIn, quality);
    }
}
