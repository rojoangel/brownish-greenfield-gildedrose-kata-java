package com.gildedrose;

import org.junit.Test;

import static com.gildedrose.Inventory.item;
import static org.junit.Assert.assertEquals;

public class AgedBrieTest {

    @Test
    public void should_increase_in_quality_as_it_gets_older() {
        InventoryItem item = item("Aged Brie", 10, 10);
        item.endOfDay();
        assertEquals(11, item.getQuality());

    }
}
