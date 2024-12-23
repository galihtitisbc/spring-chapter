package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product("sapi", 2123));
        products.add(new Product("kambing", 2123));
        products.add(new Product("jerapah", 2123));
        products.add(new Product("iyo", 2123));
    }

    public List<Product> findAll() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
