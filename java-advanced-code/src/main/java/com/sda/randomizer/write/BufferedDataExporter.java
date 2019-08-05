package com.sda.randomizer.write;

import com.sda.randomizer.Person;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDataExporter implements DataExporter {
    private String name;
    private int difficulty;

    public BufferedDataExporter(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }


    @Override
    public void persist(Person person) throws IOException {
        File destination = new File("D:\\clone\\sda-demo\\src\\main\\resources\\Name List.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination, true))) {
            String line = name + " " + difficulty;
            bufferedWriter.write(line);
        }
    }
}
