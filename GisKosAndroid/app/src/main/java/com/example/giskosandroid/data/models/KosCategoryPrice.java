package com.example.giskosandroid.data.models;

public class KosCategoryPrice {
    private String name;
    private String price;

    public KosCategoryPrice(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
