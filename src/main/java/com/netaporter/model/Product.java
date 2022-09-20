package com.netaporter.model;

public class Product {
    private String productId;
    private double price;
    private String name;

    public Product() {
    }

    public Product(String productId, double price, String name) {
        this.productId = productId;
        this.price = price;
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
