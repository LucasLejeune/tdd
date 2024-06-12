package com.example.Product;

import java.util.List;
    public class Shop {
    private List<Product> products;

    public Shop(List<Product> products){
        this.products = products;
    }
    
    public void update(Product product) {
        if (product.getSellIn() <= 0) {
            product.lowerQuality(2);
            System.out.println("oui");
            }
            else {
                product.lowerQuality(1);
                System.out.println("non");
            }
            System.out.println("aaaaaaaaaaaaaaa");
        }

    public List<Product> getProducts() {
        return products;
    }
}
