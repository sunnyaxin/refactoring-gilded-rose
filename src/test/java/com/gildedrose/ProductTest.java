package com.gildedrose;

import com.gildedrose.product.AgedBrie;
import com.gildedrose.product.Backstage;
import com.gildedrose.product.NormalProduct;
import com.gildedrose.product.Product;
import com.gildedrose.product.Sulfuras;
import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProductTest {

    @Test
    public void update_product_when_name_is_aged_brie() {
        Product product = new AgedBrie(2, 0);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).toString(), is(product.toString()));
    }

    @Test
    public void update_product_when_name_is_sulfuras_hand_of_ragnaros_with_sellin_is_zero() {
        Product product = new Sulfuras(0, 80);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).toString(), is(product.toString()));
    }

    @Test
    public void update_product_when_name_is_sulfuras_hand_of_ragnaros_with_sellin_is_less_than_zero() {
        Product product = new Sulfuras(-1, 80);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).toString(), is(product.toString()));
    }

    @Test
    public void update_product_when_name_is_backstage_passes_to_a_tafkal_80_etc_concert_with_quality_less_than_50() {
        Product product = new Backstage(15, 20);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).toString(), is(product.toString()));
    }

    @Test
    public void update_product_when_name_is_backstage_passes_to_a_tafkal_80_etc_concert_with_quality_is_50() {
        Product product = new Backstage(9, 50);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).toString(), is(product.toString()));
    }

    @Test
    public void update_product_when_name_is_backstage_passes_to_a_tafkal_80_etc_concert_with_quality_is_50_sellin_less_than_6() {
        Product product = new Backstage(1, 20);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).toString(), is(product.toString()));
    }

    @Test
    public void update_product_when_name_is_backstage_passes_to_a_tafkal_80_etc_concert_with_quality_is_less_than_50_sellin_is_0() {
        Product product = new Backstage(0, 23);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).toString(), is(product.toString()));
    }

    @Test
    public void update_product_when_name_is_conjured_mana_cake() {
        Product product = new NormalProduct("Conjured Mana Cake", 3, 6);
        GildedRose app = new GildedRose(Collections.singletonList(product));

        app.updateProducts();

        assertThat(app.products.get(0).toString(), is(product.toString()));
    }
}
