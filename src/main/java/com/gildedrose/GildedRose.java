package com.gildedrose;

import com.gildedrose.product.Product;

import java.util.List;

class GildedRose {
    List<Product> products;

    public GildedRose(List<Product> products) {
        this.products = products;
    }

    public void updateProducts() {
        products.forEach(Product::updateSellIn);
        products.forEach(Product::updateQuality);
    }
}
