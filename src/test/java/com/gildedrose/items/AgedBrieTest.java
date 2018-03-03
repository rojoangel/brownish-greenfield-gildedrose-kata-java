package com.gildedrose.items;

import org.junit.Test;

import static com.gildedrose.Inventory.item;
import static org.junit.Assert.assertEquals;

public class AgedBrieTest {

    @Test
    public void should_increase_in_quality_as_it_gets_older() {
        AgedBrie item = (AgedBrie) item("Aged Brie", 10, 10);
        item.endOfDay();
        assertEquals(11, item.getQuality());
    }

    @Test
    public void should_decrease_number_of_days_to_sell_at_the_end_of_day() {
        AgedBrie item = (AgedBrie) item("Aged Brie", 10, 10);
        item.endOfDay();
        assertEquals(9, item.getSellIn());
    }

}