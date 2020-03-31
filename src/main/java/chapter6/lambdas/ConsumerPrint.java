package chapter6.lambdas;

import java.util.function.Consumer;

public class ConsumerPrint {

    public static void main(String[] args) {
        /*
            Why might you want to receive a value and not return it?
            A common reason is when printing a message
        */
        Consumer<String> consumer = x -> System.out.println(x);

        print(consumer, "Hello World!");
    }

    private static void print(Consumer<String> consumer, String value) {
        consumer.accept(value);
    }
}
