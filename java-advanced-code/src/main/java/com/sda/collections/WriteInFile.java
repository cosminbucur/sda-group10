package com.sda.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteInFile {

    public void writeInFile(List<String> list) throws IOException {
        Path path = Paths.get("C:\\dev\\rares\\sda-demo\\src\\main\\resources\\people-output.txt");
        Files.write(path, list);
    }

}
