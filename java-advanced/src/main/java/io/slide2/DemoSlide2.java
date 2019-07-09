package io.slide2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSlide2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeUsingFileOutputStream();

        readUsingFileInputStream();
    }

    public static void writeUsingFileOutputStream() throws IOException {
        // create object to serialize (save)
        Person person = new Person("alex", "vasile");

        // create destination
        File file = new File("C:\\dev\\sda\\group10\\java-advanced\\src\\main\\resources\\output-stream.txt");

        // serialize object
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
        }
    }

    public static void readUsingFileInputStream() throws IOException, ClassNotFoundException {
        File source = new File("C:\\dev\\sda\\group10\\java-advanced\\src\\main\\resources\\output-stream.txt");

        Person person;

        // read from file with input stream
        try (FileInputStream fileInputStream = new FileInputStream(source)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // cast object read result to a Person object
            person = (Person) objectInputStream.readObject();
            System.out.println(person);
        }
    }
}
