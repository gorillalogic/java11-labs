package chapter10.handlingExceptions;

public class UsingTryAndCatchStatements {

    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }

    void fall() {
        throw new RuntimeException();
    }

    private void seeAnimals() {
    }

    private void getUp() {
    }

    /*
        Invalid try statement that the exam might try to trick you with.
     */
    void invalidSyntax() {
//        try
//            fall();
//        catch (Exception e)
//            System.out.println("get up");
    /*
        The try statement are like methods in that the curly braces are required even if there
        is only one statement inside the code blocks, while if statements and loops are special
        and allow you to omit the curly braces.
     */

        /*
            What about this one?
         */
//        try {
//            fall();
//        }
    }
}
