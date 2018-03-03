package com.gildedrose;

public class GildedRoseItem {
    private final Item item;

    public GildedRoseItem(String name, int sellIn, int quality) {
        this.item = new Item(name, sellIn, quality);
    }

    public int getSellIn() {
        return this.item.sellIn;
    }

    public void endOfDay() {
        this.item.sellIn--;
    }

    @Override
    public String toString() {
        return "GildedRoseItem{" +
                "item=" + item +
                '}';
    }
}
