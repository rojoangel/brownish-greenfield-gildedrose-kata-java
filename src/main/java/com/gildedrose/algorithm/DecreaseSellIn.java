package com.gildedrose.algorithm;

import com.gildedrose.Item;

public class DecreaseSellIn implements Algorithm {

    public void apply(Item item) {
        item.sellIn--;
    }
}