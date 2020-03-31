package chapter6.workingWithVariablesInLambdas;

import java.util.IllegalFormatPrecisionException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ParameterList {

    /*
        var can be used in place of the specific type.
     */
    public static void main(String[] args) {
        /*
        var can be used in place of the specific type.
        That means that all three of these statements are interchangeable:
     */
        Predicate<String> p = x -> true;
        Predicate<String> p2 = (var x) -> true;
        Predicate<String> p3 = (String x) -> true;
        //The exam might ask you to identify the type of the lambda parameter.
        //In our example, the answer is String.
    }

    //What is the type of x?
    public void whatAmI() {
        consume((var x) -> System.out.println(x), 123);
    }

    public void consume(Consumer<Integer> c, int num) {
        c.accept(num);
    }

    /*
        In some cases, we can determine the type without even seeing the method signature
        What is the type of x here?
     */
    public void counts(List<Integer> list) {
        list.sort((var x, var y) -> x.compareTo(y));
    }

}
