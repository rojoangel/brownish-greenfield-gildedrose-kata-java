package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.StandardItem;
import com.gildedrose.items.Sulfuras;

public class Inventory {

    public static InventoryItem item(String name, int sellIn, int quantity) {
        if ("Aged Brie".equals(name)) {
            return new AgedBrie(name, sellIn, quantity);
        }

        if ("Sulfuras".equals(name)) {
            return new Sulfuras(name, sellIn, quantity);
        }

        return new StandardItem(name, sellIn, quantity);
    }
}
