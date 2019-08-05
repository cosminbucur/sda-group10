package com.sda.randomizer.write;

import com.sda.randomizer.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class NioCustomFileWriter implements DataExporter {
    private String name;
    private int difficulty;

    public NioCustomFileWriter(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    @Override
    public void persist(Person person) throws IOException {
        Path destination = Paths.get("D:\\clone\\sda-demo\\src\\main\\resources\\Name List.txt");
        List<String> content = Arrays.asList("\n" + name + " " + difficulty);
        Files.write(destination, content, StandardOpenOption.APPEND);

    }
}
