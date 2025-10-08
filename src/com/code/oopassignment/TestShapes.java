
// Demonstrates polymorphism with Shape
package com.code.oopassignment;
//Public class definition for TestShapes-->// TestShapes.java
public class TestShapes {
 
 // Main method: entry point of program
 public static void main(String[] args) {
     
     // ***** Create an array of Shape objects
     // Since Shape is abstract, we cannot create Shape directly,
     // but we can store Circle and Rectangle objects inside it (polymorphism).
     Shape[] shapes = new Shape[3];  // Array can hold 3 Shape references

     // Store a Circle object with radius 5 at index 0
     shapes[0] = new Circle(5);

     // Store a Rectangle object with length=4 and width=6 at index 1
     shapes[1] = new Rectangle(4, 6);

     // Store another Circle object with radius 7 at index 2
     shapes[2] = new Circle(7);

     // ***** Iterate through the array using enhanced for-loop
     // Each element 'shape' refers to a Shape object (could be Circle or Rectangle)
     for (Shape shape : shapes) {
         //*** Calls the overridden area() method of the actual object (Circle or Rectangle)
         // ****This demonstrates runtime polymorphism
         System.out.println("Area: " + shape.area());
         System.out.println("Area: " + shape.area());
     }
 }
}

