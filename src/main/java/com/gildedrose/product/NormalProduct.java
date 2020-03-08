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
        decreaseQuality();
    }

    @Override
    protected void updateQualityAfterExpired() {
        decreaseQuality();
    }

    protected void decreaseQuality() {
        if (quality > 0) {
            this.quality--;
        }
    }
}