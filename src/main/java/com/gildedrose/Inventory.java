package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.StandardItem;

public class Inventory {

    public static InventoryItem item(String name, int sellIn, int quantity) {
        if ("Aged Brie".equals(name)) {
            return new AgedBrie(name, sellIn, quantity);
        }
        return new StandardItem(name, sellIn, quantity);
    }
}
