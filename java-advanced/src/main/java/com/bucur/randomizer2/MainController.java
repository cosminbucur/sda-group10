package com.bucur.randomizer2;

import java.util.Scanner;

public class MainController {

    // manual instantiation
//    private PersonRepository repository = new PersonRepository();
//    private Scanner scanner = new Scanner(System.in);
//    private Menu menu = new Menu();

    private PersonRepository repository;
    private Scanner scanner;
    private Menu menu;

    // dependency injection
    public MainController(PersonRepository repository, Scanner scanner, Menu menu) {
        this.repository = repository;
        this.scanner = scanner;
        this.menu = menu;
    }

    public void dispatch(int option) {

        while (option != 0) {
            switch (option) {
                case 1:
                    repository.addPerson();
                    break;
                case 2:
                    repository.selectNextPerson();
                    break;
                default:
                    System.out.println("select an option option from above");
            }
            menu.buildMenu();
            option = scanner.nextInt();
        }
    }
}
