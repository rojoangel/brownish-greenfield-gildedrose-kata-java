package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import com.gildedrose.Item;
import com.gildedrose.algorithm.Algorithm;
import com.gildedrose.algorithm.Decrease;

public class StandardItem extends InventoryItemStrategy {

    private Algorithm sellInAlgorithm;

    public StandardItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        sellInAlgorithm = new Decrease();
    }

    @Override
    protected void changeSellIn(Item item) {
        item.sellIn = sellInAlgorithm.calculate(item.sellIn);
    }

    @Override
    protected void changeQuality(Item item) {
        if (getSellIn() < 0) {
            item.quality--;
        }
        item.quality--;
        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
