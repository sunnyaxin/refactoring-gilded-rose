package com.gildedrose.product;

public class SulfurasProduct extends Product {

    private static final String NAME = "Sulfuras, Hand of Ragnaros";

    public SulfurasProduct(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    public void updateSellIn() {
    }

    @Override
    public void updateQuality() {
    }
}