package com.sda.streams;

import java.util.List;

public class DemoStreams {

    public static void main(String[] args) {
        StreamOperations operations = new StreamOperations();

        // var 1
        // create list and use it as param

        // var 2 initialize list in operation constructor
        List<Integer> listOfInts = operations.convertToIntList();

        System.out.println("List of Ints: " + listOfInts);

        listOfInts.size();  // 6
        long count = listOfInts.stream().count();      // 6

        System.out.println("Total number of characters: " + count);

        listOfInts.stream()
                .map(number -> number * number) // stream<Integer>
                .forEach(System.out::println);
//                .forEach(number -> System.out.println(number));

        int sumOfInts = listOfInts.stream()
                .reduce(0, (firstElement, secondElement) ->
                        firstElement + secondElement);
        System.out.println("Printing sumOfInts: " + sumOfInts);
    }
}
