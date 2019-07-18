package com.bucur.functional.lambda.functions.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator {

    public static void main(String[] args) {
        // 1. define list of integers
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        // 3. define operator to square integers
        UnaryOperator<Integer> unaryOperator = i -> i * i;

        // 4. use method
        useUnaryOperator(unaryOperator, list).forEach(x -> System.out.println(x));
    }

    // 2. a method that iterates a list of ints and applies an operator
    private static List<Integer> useUnaryOperator(UnaryOperator<Integer> unaryOperator,
                                                  List<Integer> list) {
        List<Integer> uniList = new ArrayList<>();

        // for each integer in list, add entry with applied operator
        list.forEach(integer -> uniList.add(unaryOperator.apply(integer)));
        return uniList;
    }
}
