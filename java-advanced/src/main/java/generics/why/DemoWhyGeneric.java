package generics.why;

import java.util.ArrayList;
import java.util.List;

public class DemoWhyGeneric {

    public static void main(String[] args) {
        // create a list designed for strings
        List listOfIntegers = new ArrayList();
        listOfIntegers.add(1);
        listOfIntegers.add(2);

        // a bad developer adds some other types beside strings
        listOfIntegers.add("ana");
        listOfIntegers.add(true);

        System.out.println(listOfIntegers);

        // i can't iterate because I have different objects inside
//        for (int integer : listOfIntegers) {
//            int squaredInteger = integer * integer;
//            System.out.println(squaredInteger);
//        }
    }
}

