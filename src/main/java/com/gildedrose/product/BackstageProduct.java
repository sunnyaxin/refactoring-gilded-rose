package com.gildedrose.product;

public class BackstageProduct extends Product {

    private static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    public BackstageProduct(int sellIn, int quality) {
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
        if (quality < 50 && sellIn < 11)
            quality++;
        if (quality < 50 && sellIn < 6)
            quality++;
        if (sellIn < 0)
            quality = 0;
    }
}