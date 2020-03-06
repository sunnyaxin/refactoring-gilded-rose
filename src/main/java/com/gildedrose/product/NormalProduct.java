package com.gildedrose.product;

public class NormalProduct extends Product {

    public NormalProduct(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateSellIn() {
        decreaseSellIn();
    }

    @Override
    public void updateQuality() {
        decreaseQualityIf(quality > 0);
        decreaseQualityIf(quality > 0 && sellIn < 0);
    }
}