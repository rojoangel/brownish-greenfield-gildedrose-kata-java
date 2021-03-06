package com.gildedrose.items;

import com.gildedrose.item.InventoryItem;
import org.junit.Test;

import static com.gildedrose.item.Inventory.item;
import static org.junit.Assert.assertEquals;

public class SulfurasTest {

    @Test
    public void should_never_be_sold() {
        InventoryItem item = item("Sulfuras", 10, 10);
        item.endOfDay();
        assertEquals(10, item.getSellIn());
    }

    @Test
    public void should_always_have_a_quality_equal_to_80() {
        InventoryItem item = item("Sulfuras", 10, 10);
        item.endOfDay();
        assertEquals(80, item.getQuality());
    }
}
