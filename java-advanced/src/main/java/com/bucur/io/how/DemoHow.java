package com.bucur.io.how;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoHow {

    public static void main(String[] args) {
    }

    private static void readFileWithFileInputStream() {
        File file = new File("C:\\dev\\sda\\group10\\java-advanced\\src\\main\\resources\\simple-file.txt");

        // try catch

        FileInputStream fileInputStream = null;

        try {
            // might not find file
            fileInputStream = new FileInputStream(file);

            int content;
            // might not be able to read
            while ((content = fileInputStream.read()) != -1) {
                // convert to char and display it
                System.out.println((char) content);
            }
        } catch (FileNotFoundException e) {
            System.out.println("exception for FileInputStream: file not found");
        } catch (IOException e) {
            System.out.println("exception for read(): could not read content");
        } finally {
            try {
                if (fileInputStream != null) {
                    // might not work
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("could not close stream");
            }
        }

    }

    private static void readFileWithFileInputStreamJava7() {
        File file = new File("C:\\dev\\sda\\group10\\java-advanced\\src\\main\\resources\\simple-file.txt");

        // try with resources (java 7)
        try (FileInputStream fileInputStream = new FileInputStream(file)) {

            int content;
            // might not be able to read
            while ((content = fileInputStream.read()) != -1) {
                // convert to char and display it
                System.out.println((char) content);
            }
        } catch (FileNotFoundException e) {
            System.out.println("exception for FileInputStream: file not found");
        } catch (IOException e) {
            System.out.println("exception for read(): could not read content");
        }
    }
}
