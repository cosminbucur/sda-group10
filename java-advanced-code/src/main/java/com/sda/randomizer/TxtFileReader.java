package com.sda.randomizer;

import com.sda.randomizer.write.DataLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TxtFileReader implements DataLoader {
    public List<String> readFromFile(String path) {
        List<String> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            list = stream
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }
}
