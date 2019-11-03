package com.bucur.spring.core.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DemoResourceLoader {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext();

        Resource resourceFromFileSystem = context.getResource("file:/home/cosbuc/dev/sda/sda-group10/spring-core/src/main/resources/data.txt");
        System.out.println(resourceFromFileSystem);
        printResourceContent(resourceFromFileSystem);

        Resource resourceFromClasspath = context.getResource("classpath:classpathData.txt");
        printResourceContent(resourceFromClasspath);
    }

    private static void printResourceContent(Resource resource) throws IOException {
        InputStream in = resource.getInputStream();
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(in));
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
        reader.close();
    }
}
