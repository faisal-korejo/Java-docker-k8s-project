package com.example.productcatalogue;

import java.util.*;

public class ProductService {
    private final Map<String, Product> productMap = new HashMap<>();

    public List<Product> getAll() {
        return new ArrayList<>(productMap.values());
    }

    public Product get(String id) {
        return productMap.get(id);
    }

    public void add(Product product) {
        productMap.put(product.getId(), product);
    }
}