package com.gildedrose.product;

public class OtherProduct extends Product {

    public OtherProduct(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
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