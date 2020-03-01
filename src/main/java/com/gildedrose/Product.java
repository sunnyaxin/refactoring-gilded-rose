package com.gildedrose;

import static com.gildedrose.ProductRulesName.AGED_BRIE;
import static com.gildedrose.ProductRulesName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT;
import static com.gildedrose.ProductRulesName.SULFURAS_HAND_OF_RAGNAROS;

public class Product {

    public String name;
    public int sellIn;
    public int quality;

    public Product(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    void updateSellIn() {
        if (!name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
            sellIn -= 1;
        }
    }

    void updateQuality() {
        switch (name) {
            case SULFURAS_HAND_OF_RAGNAROS:
                break;
            case AGED_BRIE:
                if (quality < 50)
                    quality += 1;
                if (quality < 50 && sellIn < 0)
                    quality += 1;
                break;
            case BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                if (quality < 50)
                    quality += 1;
                if (quality < 50 && sellIn < 11)
                    quality += 1;
                if (quality < 50 && sellIn < 6)
                    quality += 1;
                if (sellIn < 0)
                    quality = 0;
                break;
            default:
                if (quality > 0)
                    quality -= 1;
                if (quality > 0 && sellIn < 0)
                    quality -= 1;
                break;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
