package com.example.Product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShopTest {

    public Product lait;
    public Product cereale;
    public Product chocolat;

    public Shop setup(){
        List<Product> products = new ArrayList<Product>();
        this.lait = new Product("Brique de lait", "Produit laitier", 5, 10);
        products.add(this.lait);
        this.cereale = new Product("Cookie crisps", "Céréales", 0, 4);
        products.add(this.cereale);
        this.chocolat = new Product("Chocobons", "Chocolat", 0, 0);
        products.add(this.chocolat);
    
        Shop shop = new Shop(products);
        return shop;
    }

    @Test
    public void whenSellInEquals0_QualityLowerTwiceFaster(){
        Shop shop = this.setup();
        shop.update(this.cereale);

        assertEquals((Integer) 2, this.cereale.getQuality());
    }

    @Test
    public void whenQualityEqualsZero_QualityDontGoNegative(){
        Shop shop = this.setup();
        shop.update(this.chocolat);

        assertTrue(this.chocolat.getQuality() >= 0);
    }
}
