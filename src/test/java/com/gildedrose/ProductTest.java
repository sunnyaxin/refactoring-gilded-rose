package com.gildedrose;

import com.gildedrose.product.AgedBrieProduct;
import com.gildedrose.product.BackstageProduct;
import com.gildedrose.product.OtherProduct;
import com.gildedrose.product.Product;
import com.gildedrose.product.SulfurasProduct;
import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProductTest {

    @Test
    public void update_product_when_name_is_aged_brie() {
        Product product = new AgedBrieProduct(2, 0);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).name, is(product.name));
        assertThat(app.products.get(0).sellIn, is(1));
        assertThat(app.products.get(0).quality, is(1));
    }

    @Test
    public void update_product_when_name_is_sulfuras_hand_of_ragnaros_with_sellin_is_zero() {
        Product product = new SulfurasProduct(0, 80);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).name, is(product.name));
        assertThat(app.products.get(0).sellIn, is(0));
        assertThat(app.products.get(0).quality, is(80));
    }

    @Test
    public void update_product_when_name_is_sulfuras_hand_of_ragnaros_with_sellin_is_less_than_zero() {
        Product product = new SulfurasProduct(-1, 80);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).name, is(product.name));
        assertThat(app.products.get(0).sellIn, is(-1));
        assertThat(app.products.get(0).quality, is(80));
    }

    @Test
    public void update_product_when_name_is_backstage_passes_to_a_tafkal_80_etc_concert_with_quality_less_than_50() {
        Product product = new BackstageProduct(15, 20);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).name, is(product.name));
        assertThat(app.products.get(0).sellIn, is(14));
        assertThat(app.products.get(0).quality, is(21));
    }

    @Test
    public void update_product_when_name_is_backstage_passes_to_a_tafkal_80_etc_concert_with_quality_is_50() {
        Product product = new BackstageProduct(9, 50);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).name, is(product.name));
        assertThat(app.products.get(0).sellIn, is(8));
        assertThat(app.products.get(0).quality, is(50));
    }

    @Test
    public void update_product_when_name_is_backstage_passes_to_a_tafkal_80_etc_concert_with_quality_is_50_sellin_less_than_6() {
        Product product = new BackstageProduct(1, 20);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).name, is(product.name));
        assertThat(app.products.get(0).sellIn, is(0));
        assertThat(app.products.get(0).quality, is(23));
    }

    @Test
    public void update_product_when_name_is_backstage_passes_to_a_tafkal_80_etc_concert_with_quality_is_less_than_50_sellin_is_0() {
        Product product = new BackstageProduct(0, 23);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).name, is(product.name));
        assertThat(app.products.get(0).sellIn, is(-1));
        assertThat(app.products.get(0).quality, is(0));
    }

    @Test
    public void update_product_when_name_is_conjured_mana_cake() {
        Product product = new OtherProduct("Conjured Mana Cake", 3, 6);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).name, is(product.name));
        assertThat(app.products.get(0).sellIn, is(2));
        assertThat(app.products.get(0).quality, is(5));
    }
}
