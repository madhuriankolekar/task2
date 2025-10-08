package com.java8.basics;

import java.util.*;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "spring", "hibernate");

        // Convert to uppercase
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}

