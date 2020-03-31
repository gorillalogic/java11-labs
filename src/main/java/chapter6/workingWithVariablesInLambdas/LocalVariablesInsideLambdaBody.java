package chapter6.workingWithVariablesInLambdas;

import java.util.function.Predicate;

/*
    When writing your own code, a lambda block with a local variable is a good hint
    that you should extract that code into a method.
 */
public class LocalVariablesInsideLambdaBody {

    /*
        Local variable that is scoped to the lambda block
     */

    // (a, b) -> { int c = 0; return 5;}

    /*
        What's wrong with the following lambda?
     */
    // (a, b) -> { int a = 0; return 5;}

    //How many syntax errors do you see in this method?
    public void variables(int a) {
//        int b = 1;
//        Predicate<Integer> p1 = a -> {
//            int b = 0;
//            int c = 0;
//            return b == c;}
    }
}
