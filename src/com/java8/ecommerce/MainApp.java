package com.java8.ecommerce;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 1000);
        Product p3 = new Product("Keyboard", 1500);

        Order order = new Order(101, Arrays.asList(p1, p2, p3));

        OrderService service = new OrderService();

        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Total Amount: ₹" + service.calculateTotal(order));
        System.out.println("Products: " + service.getProductNames(order));
    }
}
