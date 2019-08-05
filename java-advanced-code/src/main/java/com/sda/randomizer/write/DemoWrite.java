package com.sda.randomizer.write;

import com.sda.randomizer.Person;

import java.io.IOException;

public class DemoWrite {
    public static void main(String[] args) throws IOException {
        Person person = new Person("Name", 1);
        BufferedDataExporter bufferedDataExporter = new BufferedDataExporter("Andrei", 1);
        bufferedDataExporter.persist(person);
        NioCustomFileWriter nioCustomFileWriter = new NioCustomFileWriter("Alex", 15);
        nioCustomFileWriter.persist(person);
    }
}
