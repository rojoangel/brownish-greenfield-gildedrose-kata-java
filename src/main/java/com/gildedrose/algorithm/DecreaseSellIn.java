package com.gildedrose.algorithm;

import com.gildedrose.AgingAlgorithm;
import com.gildedrose.Item;

public class DecreaseSellIn implements AgingAlgorithm {

    public void apply(Item item) {
        item.sellIn--;
    }
}