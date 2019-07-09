package io.slide1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoSlide1 {

    public static void main(String[] args) throws IOException {
//        readWithBufferedReader();

//        writeWithBufferedWriter();

        writeWithBufferedWriterAppend();
    }

    private static void readWithBufferedReader() throws IOException {
        // read file using BufferedReader
        File file = new File("C:\\dev\\sda\\group10\\java-advanced\\src\\main\\resources\\simple-file.txt");

        // create buffered reader

        // try with resource
        // try (resource to be handled) {}
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            // read line by line
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }
        }
    }

    private static void writeWithBufferedWriter() throws IOException {
        // file destination
        File destination = new File("C:\\dev\\sda\\group10\\java-advanced\\src\\main\\resources\\output-file.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))) {
            String line = "other text";
            bufferedWriter.write(line);
        }
    }

    private static void writeWithBufferedWriterAppend() throws IOException {
        // file destination
        File destination = new File("C:\\dev\\sda\\group10\\java-advanced\\src\\main\\resources\\output-file.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination, true))) {
            String line = "\nappended text";
            bufferedWriter.write(line);
        }
    }
}
