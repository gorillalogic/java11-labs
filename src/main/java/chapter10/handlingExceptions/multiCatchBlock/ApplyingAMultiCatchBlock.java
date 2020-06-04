package chapter10.handlingExceptions.multiCatchBlock;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

public class ApplyingAMultiCatchBlock {
    /*
        Oftentimes, we want the result of an exception being thrown to be the same,
        regardless of which particular exception is thrown.
     */
    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing or invalid input");
        } catch (NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }

        /*
            A multi-catch block allows multiple exception types
            to be caught by the same catch block.
         */
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }

        /*
            The exam might try to trick you with invalid syntax. Remember that the exceptions
            can be listed in any order within the catch clause. However, the variable name
            must appear only once and at the end.

            catch(Exception1 e | Exception2 e | Exception3 e) // DOES NOT COMPILE
            catch(Exception1 e1 | Exception2 e2 | Exception3 e3) // DOES NOT COMPILE
            catch(Exception1 | Exception2 | Exception3 e)

            The first line is correct because the variable name appears three times.
            Just because it happens to be the same variable name doesn't make it okay.
            The second line is incorrect because the variable name again appears three
            times. Using different variable names doesn't make it any better. The third
            line does compile. It shows the correct syntax for specifying three
            exceptions.
        */

        /*
            Java intends multi-catch to be used for exceptions that aren't related,
            and it prevents you from specifying redundant types in a multi-catch.
         */
//        try {
//            throw new IOException();
//        } catch (FileNotFoundException | IOException p) {
//
//        }
    }

    public void doesNotCompile() {
//        try {
//            mightThrow();
//        } catch (FileNotFoundException | IllegalStateException e) {
//        } catch (InputMismatchException e |MissingResourceException e) {
//        } catch (FileNotFoundException | IllegalArgumentException e) {
//        } catch (Exception e) {
//        } catch (IOException e) {
//        }
    }
    private void mightThrow() throws DateTimeParseException, IOException {
    }
}
