package com.java8.basics;
interface Calculator {
    int operation(int a, int b);
}

public class LambdaExample3 {
    public static void main(String[] args) {
        // Implement addition using Lambda
        Calculator add = (a, b) -> a + b;
        // Implement multiplication using Lambda
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Sum: " + add.operation(5, 3));
        System.out.println("Product: " + multiply.operation(5, 3));
    }
}

