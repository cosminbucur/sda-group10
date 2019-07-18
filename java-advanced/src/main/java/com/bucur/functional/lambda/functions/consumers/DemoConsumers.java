package com.bucur.functional.lambda.functions.consumers;

import java.util.Arrays;
import java.util.List;

/**
 * Consumer accepts a generified argument and returns nothing. It is a function that is
 * representing side effects
 */
public class DemoConsumers {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Freddy", "Samuel");

        names.forEach(name -> computeStuff(name));


        names.forEach(name -> System.out.println("Hello, " + name));


        useVarArgs("one", "two", "three");
    }

    private static void computeStuff(String name) {
        System.out.println(name);

        // many other operations
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
    }

    private static void useVarArgs(String... name) {

    }
}
