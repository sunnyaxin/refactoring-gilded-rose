package com.gildedrose;

import com.gildedrose.product.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GildedRoseTest {

    @Test
    public void update_products_info_for_each_product() {
        Product product1 = mock(Product.class);
        Product product2 = mock(Product.class);
        List<Product> products = Arrays.asList(product1, product2);
        GildedRose gildedRose = new GildedRose(products);

        gildedRose.updateProducts();

        verify(product1).update();
        verify(product2).update();
    }
}
