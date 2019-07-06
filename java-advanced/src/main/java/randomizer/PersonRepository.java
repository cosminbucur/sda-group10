package randomizer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PersonRepository {

    public static List<Person> people = new ArrayList<>();
    public static Map<Integer, Person> peopleMap = new HashMap<>();

    public void addPerson() {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("next person is: " + nextPerson.getName().toUpperCase());

        // remove this person from list
        people.remove(nextPerson);


//        // take persons from list and put them in a map
//        for (int id = 1; id <= people.size(); id++) {
//            peopleMap.put(id, people.get(id - 1));
//        }



//            nextPerson = personList.get(nextPersonId);
//
//
//        System.out.println(ANSI_CYAN + "I got it! Next person is: " + nextPerson.getName().toUpperCase() + ANSI_RESET);
//
//        // interpret difficulty
//        String difficultyInterpretation = interpretDifficulty(nextPerson.getDifficulty(), nextPerson.getName());
//        System.out.println(difficultyInterpretation);
//
//        // remove random person from list
//        personList.remove(nextPerson);
//        System.out.println("Person ids left in the list: " + personList);
//
//        // remove person from map too
//        if (personMap.size() == 1) {
//            personMap.remove(nextPersonId);
//        } else {
//            personMap.remove(nextPersonId + 1);
//        }
//        System.out.println("Persons left in the map: " + personMap);

    }

    private int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1 + min);
    }

}
