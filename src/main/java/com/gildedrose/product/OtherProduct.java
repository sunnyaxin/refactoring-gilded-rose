package com.gildedrose.product;

public class OtherProduct extends Product {

    public static final String OTHER_PRODUCT_NAME = "other product name";

    public OtherProduct(int sellIn, int quality) {
        super(OTHER_PRODUCT_NAME, sellIn, quality);
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }

    @Override
    public void updateQuality() {
        if (quality > 0)
            quality--;
        if (quality > 0 && sellIn < 0)
            quality--;
    }
}