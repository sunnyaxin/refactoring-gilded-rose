package com.gildedrose.product;

public class ABProduct extends Product {

    public static final String AGED_BRIE = "Aged Brie";

    public ABProduct(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public void updateSellIn() {
        sellIn -= 1;
    }

    @Override
    public void updateQuality() {
        if (quality < 50)
            quality += 1;
        if (quality < 50 && sellIn < 0)
            quality += 1;
    }
}