package com.example.Product;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ShopTest {

    private Product lait;
    private Product cereale;
    private Product chocolat;

    public Shop setup(){
        List<Product> products = new ArrayList<Product>();
        this.lait = new Product("Brique de lait", "Produit laitier", 5, 10);
        products.add(this.lait);
        this.cereale = new Product("Cookie crisps", "Céréales", 0, 4);
        products.add(this.cereale);
        this.chocolat = new Product("Chocobons", "Chocolat", 8, 7);
        products.add(this.chocolat);
    
        Shop shop = new Shop(products);
        return shop;
    }

    @Test
    public void whenSellInEquals0_QualityLowerTwiceFaster(){
        Shop shop = this.setup();
        shop.update(cereale);

        assertEquals((Integer) 2, cereale.getSellIn());
    }
}
