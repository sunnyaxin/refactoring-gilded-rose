package com.gildedrose.product;

public class AgedBrieProduct extends Product {

    public static final String AGED_BRIE = "Aged Brie";

    public AgedBrieProduct(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }

    @Override
    public void updateQuality() {
        if (quality < 50)
            quality++;
        if (quality < 50 && sellIn < 0)
            quality++;
    }
}