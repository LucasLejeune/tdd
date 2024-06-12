package com.example.Product;

import java.util.List;
    public class Shop {
    private List<Product> products;

    public Shop(List<Product> products){
        this.products = products;
    }
    
    public void update(Product product) {
        if (product.name.equals("Brie vieilli")) {
            product.increaseQuality(2);
        }
        else if (product.getSellIn() <= 0 || product.type.equals("Produit laitier")) {
            product.lowerQuality(2);
        }
        else {
            product.lowerQuality(1);
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
