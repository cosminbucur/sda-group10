package com.sda.randomizer;

import java.util.List;

public class PersonRepository {

    private List<Person> list;

    public PersonRepository(List<Person> list) {
        this.list = list;
    }

/*
    public Person selectStandard(String name) {
        Person person = null;
        for (Person p : list) {
            if (p.getName().equals(name)) {
                person = p;
                break;
            }
        }
        return person;
    }
*/

    public Person select(String name) {
        Person person = list.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst()
                .get();
        return person;
    }

    public void remove(Person person) {
        list.remove(person);
    }

    public void update(Person person, String newName, int newDifficulty) {
        person.setName(newName);
        person.setDifficulty(newDifficulty);
    }

    public void update(Person person, String newName) {
        person.setName(newName);
    }

    public void update(Person person, int newDifficulty) {
        person.setDifficulty(newDifficulty);
    }
}
