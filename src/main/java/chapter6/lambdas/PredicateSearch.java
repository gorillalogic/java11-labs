package chapter6.lambdas;

import chapter6.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));

        print(animals, a -> a.canHop());
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }
}
