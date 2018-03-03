package com.gildedrose.items;

import com.gildedrose.item.InventoryItem;
import org.junit.Test;

import static com.gildedrose.item.Inventory.item;
import static org.junit.Assert.assertEquals;

public class ConjuredTest {

    @Test
    public void should_decrease_quality_at_the_end_of_day() {
        InventoryItem item = item("Conjured Generic Item", 10, 10);
        item.endOfDay();
        assertEquals(8, item.getQuality());
    }

    @Test
    public void should_increase_aged_brie_aged_brie_twice_as_fast() {
        InventoryItem item = item("Conjured Aged Brie", 10, 10);
        item.endOfDay();
        assertEquals(12, item.getQuality());
    }

    @Test
    public void should_increase_backstage_pass_quality_twice_as_fast() {
        InventoryItem item = item("Conjured Backstage Pass", 20, 10);
        item.endOfDay();
        assertEquals(12, item.getQuality());
    }

    @Test
    public void should_increase_backstage_pass_quality_twice_as_fast_when_the_sell_in_is_in_10_days_or_less() {
        InventoryItem item = item("Conjured Backstage Pass", 9, 10);
        item.endOfDay();
        assertEquals(14, item.getQuality());
    }

    @Test
    public void should_increase_backstage_pass_quality_twice_as_fast_when_the_sell_in_is_in_5_days_or_less() {
        InventoryItem item = item("Conjured Backstage Pass", 4, 10);
        item.endOfDay();
        assertEquals(16, item.getQuality());
    }

    @Test
    public void should_keep_sulfuras_quality_equal_to_80() {
        InventoryItem item = item("Conjured Sulfuras", 10, 10);
        item.endOfDay();
        assertEquals(80, item.getQuality());
    }
}
