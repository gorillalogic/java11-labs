package chapter10.checkedExceptions;

import java.io.IOException;

public class CheckedExceptions {
    /*
        A checked exception is an exception that must be declared or handled by the application code where it is thrown.
        In Java, checked exceptions all inherit Exception but not RuntimeException.
        Checked Exceptions tend to be more anticipated -- for example, trying to read a file that doesn't exist.
     */

    /*
        NOTE: Checked exceptions also include any class that inherits Throwable, but not Error or RuntimeException.
        For example, a class that directly extends Throwable would be a checked exception.
        For the exam 815, you just need to know about checked exceptions that extend Exception.
     */

    /*
        Notice that you're using two different keywords here. The throw keyboard tells Java
        that you want to throw an Exception, while the throws keyword simply declares that
        the method might throw an Exception. It also might not.
     */
    void fall(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }

    /*
        Now that you know how to declare an exception, how do you instead handle it?
        The following alternate version of the fall() method handles the exception
     */
    void fall(int distance, int secondVersion) {
        try{
            if (distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
