package com.gildedrose;

public class GildedRoseItem implements InventoryItem {
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
        decreaseSellIn();
        decreaseQuality();
    }

    private void decreaseSellIn() {
        this.item.sellIn--;
    }

    private void decreaseQuality() {
        if (getSellIn() < 0) {
            this.item.quality--;
        }
        this.item.quality--;
        if (this.item.quality < 0) {
            this.item.quality = 0;
        }
    }

    public String toString() {
        return "GildedRoseItem{" +
                "item=" + item +
                '}';
    }
}
