package io.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class DemoEx1 {

    public static void main(String[] args) {
        Path source = Paths.get("C:\\dev\\sda\\group10\\java-advanced\\src\\main\\resources\\simple-file.txt");

        // result is lost
        countWordsJava8(source);

        long count = countWordsJava8(source);
        System.out.println(count);
        System.out.println(countWordsJava8(source));
    }

    private static long countWordsJava8(Path path) {
        long count = 0;
        try {
            // read lines from path to a stream o strings
            Stream<String> lines = Files.lines(path);

            // line1: word1 word2 word3
            count = lines.flatMap(line -> Arrays.stream(line.trim().split(" ")))
                    .count();
        } catch (IOException e) {
            System.out.println("could not read file");
        }

        return count;
    }

    private static long countWordsJava7(Path path) {
        // TODO: implement using java 7
        return 0;
    }
}
