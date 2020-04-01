package chapter6.callingAPIsWithLambdas;

import java.util.ArrayList;
import java.util.List;

/*
    While you can call Collections.sort(list),
    you can now sort directly on the list object.
 */
public class Sort {

    public static void main(String[] args) {

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);

        /*
            We sort the list alphabetically.
            The sort() method takes Comparator that provides the sort order.
            Comparator takes two parameters and returns an int.
         */
        bunnies.sort((b1, b2) -> b1.compareTo(b2));
        System.out.println(bunnies);
    }

    /*
        There is not a sort method on Set or Map.
        Neither of those types has indexing, so
        it wouldn't make sense to sort them.
     */

}
