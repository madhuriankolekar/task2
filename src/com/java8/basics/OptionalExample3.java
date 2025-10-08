package com.java8.basics;

import java.util.*;

public class OptionalExample3 {
    public static void main(String[] args) {
        String name = "Madhuri";

        // Execute only if value exists
        Optional.ofNullable(name)
                .ifPresent(n -> System.out.println("Hello " + n));
    }
}

