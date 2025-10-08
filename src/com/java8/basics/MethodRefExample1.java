package com.java8.basics;

import java.util.*;

public class MethodRefExample1 {
    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "World");

        // Use method reference instead of lambda
        list.forEach(MethodRefExample1::printMessage);
    }
}
