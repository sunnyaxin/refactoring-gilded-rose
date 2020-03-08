package com.gildedrose.product;

public class Sulfuras extends Product {

    private static final String NAME = "Sulfuras, Hand of Ragnaros";

    public Sulfuras(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    public void updateSellIn() {
    }

    @Override
    public void updateQuality() {
    }

    @Override
    protected void updateQualityAfterExpired() {
    }
}