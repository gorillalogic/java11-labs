package chapter6.lambdas;

import java.util.Comparator;
import java.util.function.Supplier;

/*
    We only have to know compare() for the exam
 */
public class ComparatorWithCompareMethod {

    /*
        The Comparator interface existed prior to lambdas being added to Java.
        As a result, it is in a different package.
        It is in java.util
     */

    public static void main(String[] args) {
        /*
            The ints comparator uses natural sort order.

            Number                          Return
            First number is bigger          Positive number
            First number is smaller         Negative number
            The numbers are equal           Zero
         */
        Comparator<Integer> ints = (i1, i2) -> i1 - i2;
        System.out.println(compareIntegers(ints));


        /*
            Both sort in descending order
         */
        /*
            The first example, the call to compareTo() is backwards,
            making it descending from Z to A
         */
        Comparator<String> string = (s1, s2) -> s2.compareTo(s1);
        System.out.println(compareStrings(string));

        /*
            The second call uses the default order; however,
            it applies a negative sign to the result,
            which reverses it
         */
        Comparator<String> moreStrings = (s1, s2) -> s1.compareTo(s2);
        System.out.println(compareStrings(moreStrings));
    }

    private static int compareIntegers(Comparator<Integer> comparator) {
        return comparator.compare(5, 3);
    }

    private static int compareStrings(Comparator<String> comparator) {
        return comparator.compare("a", "z");
    }
}
