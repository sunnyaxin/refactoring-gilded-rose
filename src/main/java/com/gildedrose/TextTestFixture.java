package com.gildedrose;

public class TextTestFixture {

    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Product[] products = new Product[]{
                new Product(ProductRulesName.PLUS_FIVE_DEXTERITY_VEST, 10, 20),
                new Product(ProductRulesName.AGED_BRIE, 2, 0),
                new Product(ProductRulesName.ELIXIR_OF_THE_MONGOOSE, 5, 7),
                new Product(ProductRulesName.SULFURAS_HAND_OF_RAGNAROS, 0, 80),
                new Product(ProductRulesName.SULFURAS_HAND_OF_RAGNAROS, -1, 80),
                new Product(ProductRulesName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 15, 20),
                new Product(ProductRulesName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 10, 49),
                new Product(ProductRulesName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 5, 49),
                new Product(ProductRulesName.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 1, 20),
                // this conjured item does not work properly yet
                new Product(ProductRulesName.CONJURED_MANA_CAKE, 3, 6)};

        GildedRose app = new GildedRose(products);

        int days = 3;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Product product : products) {
                System.out.println(product);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
