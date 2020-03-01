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
        for (Product product : products) {
            if (!product.name.equals(AGED_BRIE) && !product.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                if (product.quality > 0) {
                    if (!product.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                        product.quality = product.quality - 1;
                    }
                }
            } else {
                if (product.quality < 50) {
                    product.quality = product.quality + 1;

                    if (product.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                        if (product.sellIn < 11) {
                            if (product.quality < 50) {
                                product.quality = product.quality + 1;
                            }
                        }

                        if (product.sellIn < 6) {
                            if (product.quality < 50) {
                                product.quality = product.quality + 1;
                            }
                        }
                    }
                }
            }

            if (!product.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                product.sellIn = product.sellIn - 1;
            }

            if (product.sellIn < 0) {
                if (!product.name.equals(AGED_BRIE)) {
                    if (!product.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                        if (product.quality > 0) {
                            if (!product.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                                product.quality = product.quality - 1;
                            }
                        }
                    } else {
                        product.quality = 0;
                    }
                } else {
                    if (product.quality < 50) {
                        product.quality = product.quality + 1;
                    }
                }
            }
        }
    }
}
