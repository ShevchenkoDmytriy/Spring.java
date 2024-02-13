package com.example.demo.services;

import com.example.demo.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    private int ID = 0;

    {
        products.add(new Product(++ID, "ASUS ROG STRIX f17", "Simple description", 120000, "Dnipro", "Alex"));
        products.add(new Product(++ID, "iPhone 15 PRO MAX", "Simple description", 86000, "Dnipro", "Tom"));
    }


    public List<Product> listProducts(){
        return products;
    }


    public Product getProductById(int id) {
        for(Product product : products)
        {
            if(product.getId() == id)
            {
                return  product;
            }
        }
        return null;
    }
}
