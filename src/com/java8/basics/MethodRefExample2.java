package com.java8.basics;

import java.util.*;

public class MethodRefExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Madhuri", "Rahul", "Ankita");

        // Use instance method reference (System.out::println)
        names.forEach(System.out::println);
    }
}

