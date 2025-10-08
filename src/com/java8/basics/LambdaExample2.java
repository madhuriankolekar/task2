package com.java8.basics;
import java.util.*;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Madhuri", "Ankita", "Rahul");

        // Sorting using Lambda instead of Comparator class
        names.sort((a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}

