package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Sku sku1 = new Sku("sku1", "M", 300D);
        Sku sku2 = new Sku("sku2", "L", 250D);
        Sku sku3 = new Sku("sku3", "S", 270D);
        Sku sku4 = new Sku("sku4", "X", 350D);
        Sku sku5 = new Sku("sku5", "M", 330D);

        List<Sku> skuList1 = Arrays.asList(sku1, sku2, sku3);
        List<Sku> skuList2 = Arrays.asList(sku4, sku5, sku3);

        Product product1 = new Product("p1", "product1", skuList1);
        Product product2 = new Product("p2", "product2", skuList2);

        List<Product> productList = Arrays.asList(product1, product2);
        productList.forEach(product -> {
            System.out.println("Product id : "+product.getId() +", Product name :"+product.getName() );
            product.getSku().forEach(sku-> System.out.println("sku id :"+sku.getId()+", Size "+sku.getSize()+", Price "+sku.getPrice()));
        });



    }
}
