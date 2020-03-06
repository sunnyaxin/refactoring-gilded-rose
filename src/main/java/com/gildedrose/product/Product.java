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

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public abstract void updateSellIn();

    public abstract void updateQuality();

    protected void decreaseSellIn() {
        this.sellIn--;
    }

    protected void increaseQualityIf(boolean condition) {
        if (condition) {
            this.quality++;
        }
    }

    protected void decreaseQualityIf(boolean condition) {
        if (condition) {
            this.quality--;
        }
    }

    protected void resetQualityIf(boolean condition) {
        if (condition) {
            this.quality = 0;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
