package com.java8.ecommerce;



import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public int getOrderId() { return orderId; }
    public List<Product> getProducts() { return products; }
}
