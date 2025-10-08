package com.java8.basics;
import java.util.*;

public class OptionalExample1 {
    public static void main(String[] args) {
        String name = null;

        // ofNullable handles null safely
        Optional<String> opt = Optional.ofNullable(name);

        System.out.println("Is value present? " + opt.isPresent());
    }
}
//********get() after Checking Presence
//import java.util.*;
//
//public class OptionalExample4 {
//    public static void main(String[] args) {
//        Optional<String> opt = Optional.of("Hello");
//
//        // Safe get
//        if (opt.isPresent()) {
//            System.out.println(opt.get());
//        }
//    }
//}
