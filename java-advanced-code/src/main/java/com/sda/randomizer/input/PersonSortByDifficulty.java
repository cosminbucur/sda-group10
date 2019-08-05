package com.sda.randomizer.input;

import com.sda.randomizer.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonSortByDifficulty {

    List<Person> persons = new ArrayList<>();

    public List<Person> sortByDifficultySetting(List<Person> persons) {
        persons.sort(Comparator.comparingInt(Person::getDifficulty));
        return persons;
    }
}
