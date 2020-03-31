package chapter6.workingWithVariablesInLambdas;

import java.util.function.Consumer;

public class VariablesReferencedFromLambdaBody {

    private String color;

    //Instance variables (and class variables) are always allowed
    public void caw(String name) {
        //Method parameters and local variables are allowed to
        // be referenced if they are effectively final.
        String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                + volume + " that she is " + color);
    }
}

class Crow {
    private String color;

    public void caw(String name) {
        String volume = "loudly";
        //name = "Caty";
        color = "black";

        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                        + volume + " that she is " + color);
       // volume = "softly";
    }
}

    /*
        Rules for accessing a variable from a lambda body inside a method
    */
    /*    Variable Type               Rule

    *   Instance Variable           Allowed
    *   Static variable             Allowed
    *   Local variable              Allowed if effectively final
    *   Method parameter            Allowed if effectively final
    *   Lambda parameter            Allowed
    * */
