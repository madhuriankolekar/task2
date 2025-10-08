package com.java8.ecommerce;

import java.util.*;
import java.util.stream.Collectors;

public class OrderService {
    // Calculate total order amount using Streams
    public double calculateTotal(Order order) {
        return order.getProducts()
                    .stream()
                    .map(Product::getPrice) // method reference
                    .reduce(0.0, Double::sum);
    }

    // Get list of product names using Streams
    public List<String> getProductNames(Order order) {
        return order.getProducts()
                    .stream()
                    .map(Product::getName)
                    .collect(Collectors.toList());
    }
}

