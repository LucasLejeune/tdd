package com.example.Product;

public class Product {
    String name = "";
    String type = "";
    Integer sellIn = 0;
    Integer quality = 0;
    
    public Product(String name, String type, Integer sellIn, Integer quality){
        this.name = name;
        this.type = type;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSellIn() {
        return sellIn;
    }

    public void setSellIn(Integer sellIn) {
        this.sellIn = sellIn;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    
}
