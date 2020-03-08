package com.gildedrose.product;

public abstract class Product {

    protected String name;
    protected int sellIn;
    protected int quality;

    public Product(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void update() {
        updateSellIn();
        updateQuality();
        if (isExpired()) {
            updateQualityAfterExpired();
        }
    }

    protected abstract void updateSellIn();

    protected abstract void updateQuality();

    protected abstract void updateQualityAfterExpired();

    protected void decreaseSellIn() {
        this.sellIn--;
    }

    protected void increaseQuality() {
        if (quality < 50) {
            this.quality++;
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
