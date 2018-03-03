package com.gildedrose;

import com.gildedrose.items.StandardItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgedBrieTest {

    @Test
    public void should_increase_in_quality_as_it_gets_older() {
        InventoryItem item = new StandardItem("Aged Brie", 10, 10);
        item.endOfDay();
        assertEquals(11, item.getQuality());

    }
}
