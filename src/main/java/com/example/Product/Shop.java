package com.example.Product;

import java.util.List;
    public class Shop {
    private List<Product> products;

    public Shop(List<Product> products){
        this.products = products;
    }
    
    public void update(Product product) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public List<Product> getProducts() {
        return products;
    }
}
