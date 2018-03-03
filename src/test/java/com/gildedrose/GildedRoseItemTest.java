package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseItemTest {

    @Test
    public void should_decrease_number_of_days_to_sell_at_the_end_of_day() {
        GildedRoseItem item = new GildedRoseItem("Generic Item", 10, 10);
        item.endOfDay();
        assertEquals(9, item.getSellIn());
    }
}