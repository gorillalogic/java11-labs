package chapter10.callingMethodsThatThrowExceptions;

public class Bunny {

    public static void main(String[] args) { //throws NoMoreCarrotsException //declare exception
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) { // handle exception
            System.out.print("sad rabbit");
        }
    }

    private static void eatCarrot() throws NoMoreCarrotsException {
    }

    /*
        The compiler is still on the lookout for unreachable code.
        Declaring an unused exception isn't considered unreachable code.
        It gives the method the option to change the implementation to
        throw that exception in the future.
     */

    public void bad() {
//        try {
//            eatCarrotWithOutException();
//        } catch (NoMoreCarrotsException e) {
//
//        }
    }

    /*
        Java knows that eatCarrotWithOutException() can't throw a checked
        exception -- which means there's no way for the catch block in bad()
        to be reached. In comparison, good() is free to declare other
        exceptions.
     */
    public void good() throws NoMoreCarrotsException {
        eatCarrotWithOutException();
    }

    private void eatCarrotWithOutException() {
    }
}
