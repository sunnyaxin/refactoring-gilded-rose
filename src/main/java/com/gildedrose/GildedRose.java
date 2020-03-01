package com.gildedrose;

class GildedRose {
    Product[] products;

    public GildedRose(Product[] products) {
        this.products = products;
    }

    public void updateQuality() {
        for (int i = 0; i < products.length; i++) {
            if (!products[i].name.equals("Aged Brie")
                    && !products[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (products[i].quality > 0) {
                    if (!products[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        products[i].quality = products[i].quality - 1;
                    }
                }
            } else {
                if (products[i].quality < 50) {
                    products[i].quality = products[i].quality + 1;

                    if (products[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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

            if (!products[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                products[i].sellIn = products[i].sellIn - 1;
            }

            if (products[i].sellIn < 0) {
                if (!products[i].name.equals("Aged Brie")) {
                    if (!products[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (products[i].quality > 0) {
                            if (!products[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                products[i].quality = products[i].quality - 1;
                            }
                        }
                    } else {
                        products[i].quality = products[i].quality - products[i].quality;
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
