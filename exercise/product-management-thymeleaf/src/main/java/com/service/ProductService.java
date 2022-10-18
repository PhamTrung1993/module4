package com.service;

import com.model.Product;

import java.util.*;

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
    public Product search(String name) {
        Iterator<Product> iterator = products.values().iterator();
        Product product = new Product();
        while(iterator.hasNext()) {
            Product holder = iterator.next();
            if (Objects.equals(holder.getName(),name)) {
                product = holder;
                break;
            }
        }
        return product;
    }
}
