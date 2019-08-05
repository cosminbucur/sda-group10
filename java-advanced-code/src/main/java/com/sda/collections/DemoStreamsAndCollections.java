package com.sda.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class DemoStreamsAndCollections {

    private static final Logger logger = Logger
            .getLogger(DemoStreamsAndCollections.class.getName());

    public static void main(String[] args) {
        // read from file
        // get first names
        // map names
        // write to file

        List<String> names = new ArrayList<>();
        List<String> firstNames;
        CustomFileReader reader = new CustomFileReader();
        try {
            names = reader.readFromFile("C:\\dev\\rares\\sda-demo\\src\\main\\resources\\people.txt");
        } catch (IOException e) {
            logger.severe("File not found");
        }

        NameMapper mapper = new NameMapper();
        firstNames = mapper.getFirstNames(names);

        Map<Integer, String> map = mapper.mapNames(firstNames);
        map.forEach((key, value) -> logger.info("The key is " + key + " and the value is " + value));

        WriteInFile writer = new WriteInFile();
        try {
            writer.writeInFile(firstNames);
        } catch (IOException e) {
            logger.severe("Could not write to file");
        }

    }
}
