package com.example.Product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

public class ShopTest {

    public Product lait;
    public Product fromage;
    public Product cereale;
    public Product chocolat;
    public Product steack;

    public Shop setup(){
        List<Product> products = new ArrayList<Product>();
        this.lait = new Product("Brique de lait", "Produit laitier", 5, 10);
        products.add(this.lait);
        this.fromage = new Product("Brie vieilli", "Produit laitier", 5, 10);
        products.add(this.fromage);
        this.cereale = new Product("Cookie crisps", "Céréales", 0, 4);
        products.add(this.cereale);
        this.chocolat = new Product("Chocobons", "Chocolat", 0, 0);
        products.add(this.chocolat);
        this.steack = new Product("Steak", "Viande", 20, 60);
        products.add(this.steack);
    
        Shop shop = new Shop(products);
        return shop;
    }

    @Test
    public void whenSellInEquals0_QualityLowerTwiceFaster(){
        Shop shop = this.setup();
        shop.update(this.cereale);

        Assert.assertEquals((Integer) 2, this.cereale.getQuality());
    }

    @Test
    public void whenQualityEqualsZero_QualityDontGoNegative(){
        Shop shop = this.setup();
        shop.update(this.chocolat);

        Assert.assertTrue(this.chocolat.getQuality() >= 0);
    }

    @Test
    public void checkIfQuality_IsNotHigherThan50(){
        Shop shop = this.setup();
        shop.update(this.steack);

        Assert.assertFalse(this.steack.getQuality() > 50);
    }

    @Test
    public void whenBrieVieilliUpdate_QualityIncreaseBy2(){
        Shop shop = this.setup();
        shop.update(this.fromage);

        Assert.assertEquals((Integer) 12, this.fromage.getQuality());
    }

    @Test
    public void whenMilk_LowerQualityBy2(){
        Shop shop = this.setup();
        shop.update(this.lait);

        Assert.assertEquals((Integer) 8, this.lait.getQuality());
    }
}
