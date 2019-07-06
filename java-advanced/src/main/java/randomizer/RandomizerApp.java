package randomizer;

import java.util.Scanner;

public class RandomizerApp {

    public static void main(String[] args) {
        // create application objects
        Menu menu = new Menu();
        MainController mainController = new MainController();
        Scanner scanner = new Scanner(System.in);

        // display menu
        menu.buildMenu();

        // grab user input
        int option = scanner.nextInt();

        // redirect option to the appropriate object
        mainController.dispatch(option);
        System.out.println("test");
        // load data

        // present

    }
}
