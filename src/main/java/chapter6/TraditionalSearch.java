package chapter6;

import util.List.ListAdd;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

    public static void main(String[] args) {
        //list of animals
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // pass class that does check
        //print(animals, new CheckIfHopper());

        /**
         * This code uses a concept called deferred execution.
         * It means that code is specified now but it will run later
         * In this case, later is when the print() method calls it.
         */
        // using a lambda for the checker
        //print(animals, a -> a.canHop());// Java tries to map our lambda to the CheckTrait interface

        /*
            Using a lambda for a swimmer animal
         */
        //print(animals, a -> a.canSwim());

        /*
            Animal that cannot swim
         */
        //print(animals, a -> ! a.canSwim());

        /*
            Lambda Syntax is tricky because many parts are optional.
            a -> a.canHop()
            (Animal a) -> { return a.canHop(); }
         */
        //print(animals, (Animal a) -> { return a.canHop(); });

    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            // the general check
            if (checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }

    /*
        VALID LAMBDAS
     */

    // Lambda                                       #Parameters
    //() -> true                                        0
    // a -> a.startsWith("test")                        1
    // (String a) -> a.startsWith("test")               1
    // (a, b) -> a.startWith("test")                    2
    // (String a, String b) -> a.startsWith("test")     2


    /*
        FUN FACT: s -> {} is a valid lambda

        If there is no code on the right side of the
        expression, you don't need the semicolon or
        return statement.
     */


    /*
        INVALID LAMBDAS
     */

    // Lambda                                       Reason
    // a, b -> a.startsWith("test")                 Missing parentheses
    // a -> { a.startsWith("test"); }               Missing return
    // a -> { return a.startsWith("test") }         Missing semicolon

}
