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
}
