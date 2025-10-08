package com.java8.basics;

import java.util.*;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum using reduce
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Sum = " + sum);
    }
}

