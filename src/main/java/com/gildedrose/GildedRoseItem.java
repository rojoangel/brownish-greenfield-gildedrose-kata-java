package com.gildedrose;

public class GildedRoseItem {
    private final Item item;

    public GildedRoseItem(String name, int sellIn, int quality) {
        this.item = new Item(name, sellIn, quality);
    }

    public int getSellIn() {
        return this.item.sellIn;
    }

    public int getQuality() {
        return this.item.quality;
    }

    public void endOfDay() {
        this.item.sellIn--;
        if (getSellIn() < 0) {
            this.item.quality--;
        }
        this.item.quality--;
    }

    @Override
    public String toString() {
        return "GildedRoseItem{" +
                "item=" + item +
                '}';
    }
}
