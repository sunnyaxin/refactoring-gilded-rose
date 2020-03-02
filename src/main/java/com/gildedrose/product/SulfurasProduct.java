package com.gildedrose.product;

public class SulfurasProduct extends Product {

    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public SulfurasProduct(int sellIn, int quality) {
        super(SULFURAS_HAND_OF_RAGNAROS, sellIn, quality);
    }

    @Override
    public void updateSellIn() {
    }

    @Override
    public void updateQuality() {
    }
}