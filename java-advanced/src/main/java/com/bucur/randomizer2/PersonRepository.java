package com.bucur.randomizer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PersonRepository {

    private Scanner scanner = new Scanner(System.in);

    public static List<Person> people = new ArrayList<>();

    public void addPerson() {
        while (true) {
            System.out.println("Who's next? (press 'n' if all are ready)");

            // grab name
            String name = scanner.nextLine();

            if (name.equals("n")) {
                break;
            }

            // get random difficulty between 1 and 5
            int randomDifficulty = getRandomNumberInRange(1, 5);

            // create person
            Person person = new Person(name, randomDifficulty);
            person.setPresent(true);

            // add person
            people.add(person);
        }
    }

    // select random person from list
    public void selectNextPerson() {
        if (people.isEmpty()) {
            System.out.println("Everybody finished coding.");
            return;
        }

        // get random person from list
        Random random = new Random();
        int nextPersonId = random.nextInt(people.size());

        // get person by index
        Person nextPerson = people.get(nextPersonId);

        // print next person
        System.out.println("next person is: " + nextPerson.getName().toUpperCase() +
                " with task difficulty " + nextPerson.getDifficulty());

        // remove this person from list
        people.remove(nextPerson);
    }

    // TODO move this to utils
    private int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1 + min);
    }

}
