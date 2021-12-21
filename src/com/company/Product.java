package com.company;

import java.util.List;

public class Product {
    public Product(String id, String name, List<Sku> sku) {
        Id = id;
        this.name = name;
        this.sku = sku;
    }

    private  String Id;
    private String name;
    private List<Sku> sku;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Sku> getSku() {
        return sku;
    }

    public void setSku(List<Sku> sku) {
        this.sku = sku;
    }
}
