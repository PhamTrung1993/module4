package com.service;

import com.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> products;

    static{
        products = new HashMap<>();
        products.put(1, new Product(1,"car",5000));
        products.put(2, new Product(2,"bike",200));
        products.put(3, new Product(3,"motorbike",1000));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findByID(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }
}