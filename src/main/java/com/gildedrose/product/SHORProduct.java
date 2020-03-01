package com.gildedrose.product;

public class SHORProduct extends Product {

    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public SHORProduct(int sellIn, int quality) {
        super(SULFURAS_HAND_OF_RAGNAROS, sellIn, quality);
    }

    @Override
    public void updateSellIn() {
    }

    @Override
    public void updateQuality() {
    }
}