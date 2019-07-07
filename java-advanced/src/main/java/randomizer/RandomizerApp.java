package randomizer;

import java.util.Scanner;

public class RandomizerApp {

    public static void main(String[] args) {
        // create application objects
        PersonRepository repository = new PersonRepository();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        // manual instantiation
//        MainController mainController = new MainController();

        // dependency injection
        MainController mainController = new MainController(repository, scanner, menu);

        // display menu
        menu.buildMenu();

        // grab user input from the menu
        int option = scanner.nextInt();

        // redirect option to the appropriate object
        mainController.dispatch(option);

        // load data

        // present

    }
}
