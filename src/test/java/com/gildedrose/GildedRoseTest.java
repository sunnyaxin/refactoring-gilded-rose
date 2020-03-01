package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Product[] products = new Product[] { new Product("foo", 1, 5) };
        GildedRose app = new GildedRose(products);
        app.updateQuality();
        assertEquals("foo", app.products[0].name);
        assertThat(app.products[0].quality, is(4));
        assertThat(app.products[0].sellIn, is(0));
    }
}
