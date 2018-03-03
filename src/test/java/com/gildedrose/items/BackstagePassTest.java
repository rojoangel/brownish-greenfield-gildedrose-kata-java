package com.gildedrose.items;

import org.junit.Test;

import static com.gildedrose.Inventory.item;
import static org.junit.Assert.assertEquals;

public class BackstagePassTest {

    @Test
    public void should_decrease_number_of_days_to_sell_at_the_end_of_day() {
        BackstagePass item = (BackstagePass) item("Backstage Pass", 10, 10);
        item.endOfDay();
        assertEquals(9, item.getSellIn());
    }

    @Test
    public void should_increase_in_quality_as_it_gets_older() {
        BackstagePass item = (BackstagePass) item("Backstage Pass", 20, 10);
        item.endOfDay();
        assertEquals(11, item.getQuality());
    }

    @Test
    public void should_increase_in_quality_by_2_when_the_sell_in_is_in_10_days_or_less() {
        BackstagePass item = (BackstagePass) item("Backstage Pass", 9, 10);
        item.endOfDay();
        assertEquals(12, item.getQuality());
    }

}
