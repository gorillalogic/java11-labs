package chapter6.callingAPIsWithLambdas;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

    public static void main(String[] args) {

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);

        /*
            The removeIf() method works the same way on Set.
            It removes any values in the set that match the Predicate.
         */
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies);

        /*
            There isn't a removeIf() method on Map.
            Maps have both keys and values.
            It wouldn't be clear what one was removing.
         */
    }
}
