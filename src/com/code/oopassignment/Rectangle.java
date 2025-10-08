
// Rectangle is a subclass of Shape
package com.code.oopassignment;

//Rectangle.java class name
public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of area method
    @Override
    public double area() {
        return length * width;
    }
}
