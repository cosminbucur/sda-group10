package com.sda.wordcount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DemoWordCount {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\dev\\rares\\sda-demo\\src\\main\\resources\\words.txt"));

        HashMap<String, Integer> map = new HashMap<>();
        while (input.hasNext()) {
            String word = input.next();

            if (map.containsKey(word)) {
                // if word is already there, increment count
                map.put(word, map.get(word) + 1);
            } else {
                // just add it
                map.put(word, 1);
            }
        }
        input.close();

        printMap(map);
    }

    private static void printMap(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());

        // TODO: implement usin lambda
    }
}
