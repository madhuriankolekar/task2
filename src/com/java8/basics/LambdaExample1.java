package com.java8.basics;

public class LambdaExample1 {
    public static void main(String[] args) {
        // Runnable implemented using Lambda Expression
        Runnable r = () -> System.out.println("Running in a thread");

        // Start thread
        new Thread(r).start();
    }
}

