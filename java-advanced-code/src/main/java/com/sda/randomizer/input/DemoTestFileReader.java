package com.sda.randomizer.input;

import com.sda.randomizer.TxtFileReader;

import java.util.ArrayList;
import java.util.List;

public class DemoTestFileReader {
    public static void main(String[] args) {
        List<String> peopleList = new ArrayList<>();

        TxtFileReader txtFileReader = new TxtFileReader();
        peopleList = txtFileReader.readFromFile("D:\\JAVA CLASS\\Cursuri\\sda-demo\\src\\main\\resources\\people.txt");

        peopleList.forEach(name -> System.out.println(name));


    }


}
