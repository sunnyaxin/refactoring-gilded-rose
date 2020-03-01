package com.gildedrose.product;

public abstract class Product {

    public String name;
    public int sellIn;
    public int quality;

    public Product(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public abstract void updateSellIn();

    public abstract void updateQuality();

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
