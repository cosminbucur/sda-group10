package com.sda.randomizer.write;

import com.sda.randomizer.Person;

import java.io.IOException;

public interface DataExporter {
    void persist(Person person) throws IOException;
}
