package com.sda.io;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomYmlWriter {

    public void write(Student student) {
        // write it to an yml file
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        try {
            Path shortPath = Paths.get(this.getClass()
                    .getClassLoader()
                    .getResource("io/person-output.yml").toURI());

            File file = new File(shortPath.toString());
            mapper.writeValue(file, student);
        } catch (URISyntaxException e) {
            System.out.println("wrong output path");
        } catch (IOException e) {
            System.out.println("error writing to file");
        }
    }
}
