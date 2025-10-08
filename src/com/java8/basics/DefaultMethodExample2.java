package com.java8.basics;
 
interface Vehicle1 {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Bike implements Vehicle1 {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
}

public class DefaultMethodExample2 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}
