package com.gildedrose;

import java.util.List;

import static com.gildedrose.ProductRulesName.AGED_BRIE;
import static com.gildedrose.ProductRulesName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT;
import static com.gildedrose.ProductRulesName.SULFURAS_HAND_OF_RAGNAROS;

class GildedRose {
    List<Product> products;

    public GildedRose(List<Product> products) {
        this.products = products;
    }

    public void updateProducts() {
        updateSellIn();
        updateQuality();
    }

    private void updateSellIn() {
        products.stream()
                .filter(product -> !product.name.equals(SULFURAS_HAND_OF_RAGNAROS))
                .forEach(product -> product.sellIn -= 1);
    }

    private void updateQuality() {
        for (Product product : products) {
            switch (product.name) {
                case SULFURAS_HAND_OF_RAGNAROS:
                    break;
                case AGED_BRIE:
                    if (product.quality < 50)
                        product.quality += 1;
                    if (product.quality < 50 && product.sellIn < 0)
                        product.quality += 1;
                    break;
                case BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                    if (product.quality < 50)
                        product.quality += 1;
                    if (product.quality < 50 && product.sellIn < 11)
                        product.quality += 1;
                    if (product.quality < 50 && product.sellIn < 6)
                        product.quality += 1;
                    if (product.sellIn < 0)
                        product.quality = 0;
                    break;
                default:
                    if (product.quality > 0)
                        product.quality -= 1;
                    if (product.quality > 0 && product.sellIn < 0)
                        product.quality -= 1;
                    break;
            }
        }
    }
}
