package com.gildedrose.items;

import com.gildedrose.InventoryItemStrategy;
import org.junit.Test;

import static com.gildedrose.Inventory.item;
import static org.junit.Assert.assertEquals;

public class StandardItemTest {

    @Test
    public void should_decrease_number_of_days_to_sell_at_the_end_of_day() {
        InventoryItemStrategy item = item("Generic Item", 10, 10);
        item.endOfDay();
        assertEquals(9, item.getSellIn());
    }

    @Test
    public void should_decrease_quality_at_the_end_of_day() {
        InventoryItemStrategy item = item("Generic Item", 10, 10);
        item.endOfDay();
        assertEquals(9, item.getQuality());
    }

    @Test
    public void should_decrease_quality_twice_as_fast_once_the_sell_by_date_has_passed() {
        InventoryItemStrategy item = item("Generic Item", 0, 10);
        item.endOfDay();
        assertEquals(8, item.getQuality());
    }

    @Test
    public void should_not_have_negative_quality() {
        InventoryItemStrategy item = item("Generic Item", 12, 0);
        item.endOfDay();
        assertEquals(0, item.getQuality());
    }
}