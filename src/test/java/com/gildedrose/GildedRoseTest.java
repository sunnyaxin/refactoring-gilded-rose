package com.gildedrose;

import com.gildedrose.product.ABProduct;
import com.gildedrose.product.BPTAT8ECProduct;
import com.gildedrose.product.OtherProduct;
import com.gildedrose.product.Product;
import com.gildedrose.product.SHORProduct;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.gildedrose.product.ABProduct.AGED_BRIE;
import static com.gildedrose.product.BPTAT8ECProduct.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT;
import static com.gildedrose.product.OtherProduct.OTHER_PRODUCT_NAME;
import static com.gildedrose.product.SHORProduct.SULFURAS_HAND_OF_RAGNAROS;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GildedRoseTest {

    @Test
    public void update_product_when_name_is_AGED_BRIE() {
        List<Product> products = new ArrayList<>();
        products.add(new ABProduct(2, 0));
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products.get(0).name, is(AGED_BRIE));
        assertThat(app.products.get(0).sellIn, is(1));
        assertThat(app.products.get(0).quality, is(1));
    }

    @Test
    public void update_product_when_name_is_SULFURAS_HAND_OF_RAGNAROS_with_sellin_is_zero() {
        List<Product> products = new ArrayList<>();
        products.add(new SHORProduct(0, 80));
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products.get(0).name, is(SULFURAS_HAND_OF_RAGNAROS));
        assertThat(app.products.get(0).sellIn, is(0));
        assertThat(app.products.get(0).quality, is(80));
    }

    @Test
    public void update_product_when_name_is_SULFURAS_HAND_OF_RAGNAROS_with_sellin_is_less_than_zero() {
        List<Product> products = new ArrayList<>();
        products.add(new SHORProduct(-1, 80));
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products.get(0).name, is(SULFURAS_HAND_OF_RAGNAROS));
        assertThat(app.products.get(0).sellIn, is(-1));
        assertThat(app.products.get(0).quality, is(80));
    }

    @Test
    public void update_product_when_name_is_BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_with_quality_less_than_50() {
        List<Product> products = new ArrayList<>();
        products.add(new BPTAT8ECProduct(15, 20));
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products.get(0).name, is(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT));
        assertThat(app.products.get(0).sellIn, is(14));
        assertThat(app.products.get(0).quality, is(21));
    }

    @Test
    public void update_product_when_name_is_BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_with_quality_is_50() {
        List<Product> products = new ArrayList<>();
        products.add(new BPTAT8ECProduct(9, 50));
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products.get(0).name, is(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT));
        assertThat(app.products.get(0).sellIn, is(8));
        assertThat(app.products.get(0).quality, is(50));
    }

    @Test
    public void update_product_when_name_is_BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_with_quality_is_50_sellin_less_than_6() {
        List<Product> products = new ArrayList<>();
        products.add(new BPTAT8ECProduct(1, 20));
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products.get(0).name, is(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT));
        assertThat(app.products.get(0).sellIn, is(0));
        assertThat(app.products.get(0).quality, is(23));
    }

    @Test
    public void update_product_when_name_is_BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_with_quality_is_less_than_50_sellin_is_0() {
        List<Product> products = new ArrayList<>();
        products.add(new BPTAT8ECProduct(0, 23));
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products.get(0).name, is(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT));
        assertThat(app.products.get(0).sellIn, is(-1));
        assertThat(app.products.get(0).quality, is(0));
    }

    @Test
    public void update_product_when_name_is_OTHER_PRODUCT_NAME() {
        List<Product> products = new ArrayList<>();
        products.add(new OtherProduct(3, 6));
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products.get(0).name, is(OTHER_PRODUCT_NAME));
        assertThat(app.products.get(0).sellIn, is(2));
        assertThat(app.products.get(0).quality, is(5));
    }
}
