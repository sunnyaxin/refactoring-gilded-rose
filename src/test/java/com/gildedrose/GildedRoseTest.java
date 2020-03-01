package com.gildedrose;

import org.junit.Test;

import static com.gildedrose.ProductRulesName.AGED_BRIE;
import static com.gildedrose.ProductRulesName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT;
import static com.gildedrose.ProductRulesName.CONJURED_MANA_CAKE;
import static com.gildedrose.ProductRulesName.ELIXIR_OF_THE_MONGOOSE;
import static com.gildedrose.ProductRulesName.PLUS_FIVE_DEXTERITY_VEST;
import static com.gildedrose.ProductRulesName.SULFURAS_HAND_OF_RAGNAROS;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GildedRoseTest {

    @Test
    public void update_product_when_rule_is_PLUS_FIVE_DEXTERITY_VEST() {
        Product[] products = new Product[]{new Product(PLUS_FIVE_DEXTERITY_VEST, 10, 20)};
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products[0].name, is(PLUS_FIVE_DEXTERITY_VEST));
        assertThat(app.products[0].sellIn, is(9));
        assertThat(app.products[0].quality, is(19));
    }

    @Test
    public void update_product_when_rule_is_AGED_BRIE() {
        Product[] products = new Product[]{new Product(AGED_BRIE, 2, 0)};
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products[0].name, is(AGED_BRIE));
        assertThat(app.products[0].sellIn, is(1));
        assertThat(app.products[0].quality, is(1));
    }

    @Test
    public void update_product_when_rule_is_ELIXIR_OF_THE_MONGOOSE() {
        Product[] products = new Product[]{new Product(ELIXIR_OF_THE_MONGOOSE, 5, 7)};
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products[0].name, is(ELIXIR_OF_THE_MONGOOSE));
        assertThat(app.products[0].sellIn, is(4));
        assertThat(app.products[0].quality, is(6));
    }

    @Test
    public void update_product_when_rule_is_SULFURAS_HAND_OF_RAGNAROS_with_sellin_is_zero() {
        Product[] products = new Product[]{new Product(SULFURAS_HAND_OF_RAGNAROS, 0, 80)};
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products[0].name, is(SULFURAS_HAND_OF_RAGNAROS));
        assertThat(app.products[0].sellIn, is(0));
        assertThat(app.products[0].quality, is(80));
    }

    @Test
    public void update_product_when_rule_is_SULFURAS_HAND_OF_RAGNAROS_with_sellin_is_less_than_zero() {
        Product[] products = new Product[]{new Product(SULFURAS_HAND_OF_RAGNAROS, -1, 80)};
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products[0].name, is(SULFURAS_HAND_OF_RAGNAROS));
        assertThat(app.products[0].sellIn, is(-1));
        assertThat(app.products[0].quality, is(80));
    }

    @Test
    public void update_product_when_rule_is_BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_with_quality_less_than_50() {
        Product[] products = new Product[]{new Product(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 15, 20)};
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products[0].name, is(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT));
        assertThat(app.products[0].sellIn, is(14));
        assertThat(app.products[0].quality, is(21));
    }

    @Test
    public void update_product_when_rule_is_BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_with_quality_is_50() {
        Product[] products = new Product[]{new Product(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 9, 50)};
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products[0].name, is(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT));
        assertThat(app.products[0].sellIn, is(8));
        assertThat(app.products[0].quality, is(50));
    }

    @Test
    public void update_product_when_rule_is_BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_with_quality_is_50_sellin_less_than_6() {
        Product[] products = new Product[]{new Product(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 1, 20)};
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products[0].name, is(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT));
        assertThat(app.products[0].sellIn, is(0));
        assertThat(app.products[0].quality, is(23));
    }

    @Test
    public void update_product_when_rule_is_BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_with_quality_is_less_than_50_sellin_is_0() {
        Product[] products = new Product[]{new Product(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 0, 23)};
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products[0].name, is(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT));
        assertThat(app.products[0].sellIn, is(-1));
        assertThat(app.products[0].quality, is(0));
    }

    @Test
    public void update_product_when_rule_is_CONJURED_MANA_CAKE() {
        Product[] products = new Product[]{new Product(CONJURED_MANA_CAKE, 3, 6)};
        GildedRose app = new GildedRose(products);

        app.updateProducts();

        assertThat(app.products[0].name, is(CONJURED_MANA_CAKE));
        assertThat(app.products[0].sellIn, is(2));
        assertThat(app.products[0].quality, is(5));
    }
}
