package com.example.ProjetDigitApi2;

public class Product{
    private String productName;
    private int id;


    public Product(String productName, int id) {
        this.productName = productName;
        this.id = id;
    }
    
    public String getProductName() {
        return productName;
    }

    public int getId() {
        return id;
    }
    
}