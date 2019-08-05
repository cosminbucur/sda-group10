package com.sda.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CustomFileReader {

    public List<String> readFromFile(String path) throws IOException {
        Path absolutePath = Paths.get(path);
        return Files.readAllLines(absolutePath);
    }
}


