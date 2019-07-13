package com.bucur.io.slide3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class DemoSlide3 {

    public static void main(String[] args) throws IOException {
//        try {
//            // some operation
//            readFileWithJava8();
//        } catch (IOException e) {
//            System.out.println("complex error");
//        }
//
//        try {
//            writeFileWithJava8();
//        } catch (IOException e) {
//            System.out.println("could not write");
//        }

        createDir();
    }

    private static void readFileWithJava8() throws IOException {
        Path source = Paths.get("C:\\dev\\sda\\group10\\java-advanced\\src\\main\\resources\\simple-file.txt");
        // read line by line
        List<String> lines = Files.readAllLines(source);

        // print result
        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static void writeFileWithJava8() throws IOException {
        // create destinations
        Path destination = Paths.get("C:\\dev\\sda\\group10\\java-advanced\\src\\main\\resources\\output-java8.txt");

        // create content
        List<String> content = Arrays.asList("alex", "ana", "cristi");

        Files.write(destination, content, StandardOpenOption.APPEND);
    }

    private static void createDir() throws IOException {
        String destinationPath = "C:\\dev\\sda\\group10\\java-advanced\\src\\main\\resources";
        String folderName = "generatedFolder";
        Path destinationDir = Paths.get(destinationPath + "\\" + folderName);

        // create directory
        if (Files.exists(destinationDir)) {
            System.out.println("folder already exists: " + destinationDir);
        } else {
            Files.createDirectory(destinationDir);
        }
    }
}
