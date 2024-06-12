package com.example.Product;

import java.util.List;
    public class Shop {
    private List<Product> products;

    public Shop(List<Product> products){
        this.products = products;
    }
    
    public void update(Product product) {
        if (product.getQuality() == 0) {
            System.out.println(product.name + " as a quality of 0, can't go lower");
            return;
        }
        if (product.quality > 50) {
            System.out.println(product.name + " quality exceed 50, can't go higher");
            product.quality = 50;
        }

        if (product.name.equals("Brie vieilli")) {
            product.increaseQuality(2);
        }
        else if (product.type.equals("Produit laitier")) {
            product.lowerQuality(2);
        }
        else if (product.getSellIn() <= 0 && product.getQuality() > 1) {
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
