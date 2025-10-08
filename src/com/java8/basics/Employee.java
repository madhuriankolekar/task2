package com.java8.basics;

import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }

//public class LambdaRT1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Madhuri", 50000),
            new Employee("Rahul", 75000),
            new Employee("Ankita", 60000)
        );

        // Sort employees by salary using Lambda
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        employees.forEach(System.out::println);
    
}}
