package com.gildedrose;

import com.gildedrose.items.StandardItem;

public class Inventory {

    public static InventoryItem item(String name, int sellIn, int quantity) {
        return new StandardItem(name, sellIn, quantity);
    }
}
