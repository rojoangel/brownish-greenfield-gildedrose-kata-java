package com.gildedrose.items;

import com.gildedrose.item.InventoryItem;
import org.junit.Test;

import static com.gildedrose.item.Inventory.item;
import static org.junit.Assert.assertEquals;

public class AgedBrieTest {

    @Test
    public void should_increase_in_quality_as_it_gets_older() {
        InventoryItem item = item("Aged Brie", 10, 10);
        item.endOfDay();
        assertEquals(11, item.getQuality());
    }

    @Test
    public void should_decrease_number_of_days_to_sell_at_the_end_of_day() {
        InventoryItem item = item("Aged Brie", 10, 10);
        item.endOfDay();
        assertEquals(9, item.getSellIn());
    }

    @Test
    public void should_never_have_a_quality_bigger_than_50() {
        InventoryItem item = item("Aged Brie", 10, 50);
        item.endOfDay();
        assertEquals(50, item.getQuality());
    }
}
