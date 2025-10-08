
// Circle is a subclass of Shape--// Circle.java
package com.code.oopassignment;


public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of area method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

