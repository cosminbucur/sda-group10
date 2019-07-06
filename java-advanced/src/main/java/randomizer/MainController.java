package randomizer;

public class MainController {

    private PersonRepository repository = new PersonRepository();

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

        }

    }
}
