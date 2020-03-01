package com.gildedrose.product;

public class BPTAT8ECProduct extends Product {

    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";

    public BPTAT8ECProduct(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    @Override
    public void updateSellIn() {
        sellIn -= 1;
    }

    @Override
    public void updateQuality() {
        if (quality < 50)
            quality += 1;
        if (quality < 50 && sellIn < 11)
            quality += 1;
        if (quality < 50 && sellIn < 6)
            quality += 1;
        if (sellIn < 0)
            quality = 0;
    }
}