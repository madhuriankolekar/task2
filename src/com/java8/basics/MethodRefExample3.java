package com.java8.basics;

import java.util.function.Supplier;

class Student {
    Student() {
        System.out.println("Student object created");
    }
}

public class MethodRefExample3 {
    public static void main(String[] args) {
        // Constructor reference
        Supplier<Student> supplier = Student::new;

        // Create object
        Student s = supplier.get();
    }
}
