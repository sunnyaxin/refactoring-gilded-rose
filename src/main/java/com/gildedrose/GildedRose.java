package com.gildedrose;

import static com.gildedrose.ProductRulesName.AGED_BRIE;
import static com.gildedrose.ProductRulesName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT;
import static com.gildedrose.ProductRulesName.SULFURAS_HAND_OF_RAGNAROS;

class GildedRose {
    Product[] products;

    public GildedRose(Product[] products) {
        this.products = products;
    }

    public void updateQuality() {
        for (int i = 0; i < products.length; i++) {
            if (!products[i].name.equals(AGED_BRIE)
                    && !products[i].name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                if (products[i].quality > 0) {
                    if (!products[i].name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                        products[i].quality = products[i].quality - 1;
                    }
                }
            } else {
                if (products[i].quality < 50) {
                    products[i].quality = products[i].quality + 1;

                    if (products[i].name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                        if (products[i].sellIn < 11) {
                            if (products[i].quality < 50) {
                                products[i].quality = products[i].quality + 1;
                            }
                        }

                        if (products[i].sellIn < 6) {
                            if (products[i].quality < 50) {
                                products[i].quality = products[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!products[i].name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                products[i].sellIn = products[i].sellIn - 1;
            }

            if (products[i].sellIn < 0) {
                if (!products[i].name.equals(AGED_BRIE)) {
                    if (!products[i].name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                        if (products[i].quality > 0) {
                            if (!products[i].name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                                products[i].quality = products[i].quality - 1;
                            }
                        }
                    } else {
                        products[i].quality = 0;
                    }
                } else {
                    if (products[i].quality < 50) {
                        products[i].quality = products[i].quality + 1;
                    }
                }
            }
        }
    }
}
