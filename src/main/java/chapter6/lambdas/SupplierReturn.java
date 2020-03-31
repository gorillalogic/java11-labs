package chapter6.lambdas;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierReturn {

    /*
        A good use case for a Supplier is when generating values.
     */
    public static void main(String[] args) {

        Supplier<Integer> number = () -> 42;
        System.out.println(returnNumber(number));

        Supplier<Integer> random = () -> new Random().nextInt();
        System.out.println(returnNumber(random));
    }

    private static int returnNumber(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
