package com.gildedrose;

public interface InventoryItem {
    
    int getSellIn();

    int getQuality();

    void endOfDay();

    @Override
    String toString();
}
