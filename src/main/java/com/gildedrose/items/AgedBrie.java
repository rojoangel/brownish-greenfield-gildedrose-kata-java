package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends ItemStrategy {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void changeSellIn(Item item) {
        item.sellIn--;
    }

    @Override
    protected void changeQuality(Item item) {
        item.quality++;
    }
}
