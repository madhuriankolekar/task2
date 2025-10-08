package com.java8.basics;

import java.util.*;

public class OptionalExample2 {
    public static void main(String[] args) {
        String name = null;

        // Provide default if null
        String result = Optional.ofNullable(name).orElse("Default Name");

        System.out.println(result);
    }
}

