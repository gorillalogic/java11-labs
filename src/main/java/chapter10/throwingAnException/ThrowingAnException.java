package chapter10.throwingAnException;

public class ThrowingAnException {
    /*
        Any Java code can throw an exception; this includes code you write.
        The exam is limited to exceptions that someone else has created.
        Most likely, they will be exceptions that are provided with Java.
     */


    public static void main(String[] args) throws Exception {
        /*
            This code throws an ArrayIndexOutOfBoundsException since the array has no
            elements. That means questions about exceptions can be hidden in questions
            that appears to be about something else.
         */
        String[] animals = new String[0];
        System.out.println(animals[0]);

        /*
            On the exam, many questions have a choice about not compiling and about
            throwing an exception. Pay special attention to code that calls a method
            on a null reference or that references an invalid array or List index.
            If you spot this, you know the correct answer is that the code throws
            an exception at runtime.
         */

        /*
            You should know that an Exception is an Object. This means you can
            store in a variable and this is legal:
         */
        Exception e = new RuntimeException();
        throw e;

        /*
            The exam might also try to trick you. Do you see why this code
            doesn't compile?
         */
//        throw RuntimeException();

        /*
            Let's take a look at another place the exam might try to trick you.
            Can you see why the following does not compile?
         */

//        try {
//            throw new RuntimeException();
//            throw new ArrayIndexOutOfBoundsException();
//        } catch (Exception ex) {
//        }
    }
}
