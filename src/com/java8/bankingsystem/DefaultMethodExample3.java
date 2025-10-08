package com.java8.bankingsystem;

interface Vehicle {
    default void start() {
        System.out.println("Vehicle starting...");
    }
}

interface Engine {
    default void start() {
        System.out.println("Engine starting...");
    }
}

class Car implements Vehicle, Engine {
    // Resolve conflict
    @Override
    public void start() {
        Vehicle.super.start();
        Engine.super.start();
    }
}

public class DefaultMethodExample3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
