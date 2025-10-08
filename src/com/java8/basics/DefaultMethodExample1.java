package com.java8.basics;

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car implements Vehicle {}

public class DefaultMethodExample1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}

//************Multiple Classes Implement Same Default
//interface Printer {
//    default void print() {
//        System.out.println("Default printing...");
//    }
//}
//
//class Inkjet implements Printer {}
//class Laser implements Printer {}
//
//public class DefaultMethodExample4 {
//    public static void main(String[] args) {
//        Printer p1 = new Inkjet();
//        Printer p2 = new Laser();
//
//        p1.print();
//        p2.print();
//    }
//}

//*Add New Method to Interface Without Breaking Code
//interface Shape {
//    void draw();
//    default void area() {
//        System.out.println("Default area calculation");
//    }
//}
//
//class Circle implements Shape {
//    public void draw() {
//        System.out.println("Drawing Circle");
//    }
//}
//
//public class DefaultMethodExample5 {
//    public static void main(String[] args) {
//        Shape s = new Circle();
//        s.draw();
//        s.area(); // works even if Circle didn’t override area()
//    }
//}

