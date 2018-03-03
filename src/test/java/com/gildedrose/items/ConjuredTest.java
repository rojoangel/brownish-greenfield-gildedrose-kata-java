package com.gildedrose.items;

import com.gildedrose.item.InventoryItem;
import org.junit.Test;

import static com.gildedrose.item.Inventory.item;
import static org.junit.Assert.assertEquals;

public class ConjuredTest {

    @Test
    public void should_degrade_aged_brie_twice_as_fast() {
        InventoryItem item = item("Conjured Aged Brie", 10, 10);
        item.endOfDay();
        assertEquals(12, item.getQuality());
    }
}
