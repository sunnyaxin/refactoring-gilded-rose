package com.gildedrose.product;

public class BackstageProduct extends Product {

    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";

    public BackstageProduct(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
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