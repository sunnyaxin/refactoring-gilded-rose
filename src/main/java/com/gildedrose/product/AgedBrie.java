package com.gildedrose.product;

public class AgedBrie extends Product {

    private static final String NAME = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(NAME, sellIn, quality);
    }

    @Override
    public void updateSellIn() {
        decreaseSellIn();
    }

    @Override
    public void updateQuality() {
        increaseQuality();
    }

    @Override
    protected void updateQualityAfterExpired() {
        increaseQuality();
    }
}