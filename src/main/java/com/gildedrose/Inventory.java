package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.StandardItem;
import com.gildedrose.items.Sulfuras;

public class Inventory {

    public static InventoryItem item(String name, int sellIn, int quality) {
        if ("Aged Brie".equals(name)) {
            return new AgedBrie(name, sellIn, quality);
        }

        if ("Sulfuras".equals(name)) {
            return new Sulfuras(name, sellIn, 80);
        }

        return new StandardItem(name, sellIn, quality);
    }
}
