package com.gildedrose.product;

public class AgedBrieProduct extends Product {

    private static final String NAME = "Aged Brie";

    public AgedBrieProduct(int sellIn, int quality) {
        super(NAME, sellIn, quality);
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