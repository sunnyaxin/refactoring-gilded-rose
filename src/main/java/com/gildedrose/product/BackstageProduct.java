package com.gildedrose.product;

public class BackstageProduct extends Product {

    private static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    public BackstageProduct(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    public void updateSellIn() {
        decreaseSellIn();
    }

    @Override
    public void updateQuality() {
        increaseQualityIf(quality < 50);
        increaseQualityIf(quality < 50 && sellIn < 11);
        increaseQualityIf(quality < 50 && sellIn < 6);
        resetQualityIf(sellIn < 0);
    }
}