package chapter10.handlingExceptions.tryWithResources;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FinallyClosingResources {

    public void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("myFile.txt");
            //Read file data
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /*
        To solve this, Java includes the try-with-resources statement to automatically close
        all resources opened in a try clause. This feature is also known as automatic resource
        management, because Java automatically takes care of the closing.
     */
    /*
        Same example using a try-with-resources statement
     */
    public void readFile() {
        try (FileInputStream is = new FileInputStream("myFile.txt")) {
            //Read File Data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
                                AutoCloseable
        You can't just put any random class in a try-with-resources statement.
        Java requires classes used in a try-with-resources implement the
        AutoClosable interface, which includes a void close() method.
     */

    /*
        Invalid try-with-resources declaration
     */
    public void invalidDeclaration() {
//        try (FileInputStream is = new FileInputStream("1"), os = new FileInputStream("2")) {
//
//        } catch (IOException e) {
//        }
//
//        try (FileInputStream is = new FileInputStream("1"), FileInputStream os = new FileInputStream("2")) {
//
//        } catch (IOException e) {
//
//        }
    }

    public void varDeclaration() {
         /*
            You can declare a resource using var as the data type in a try-with-resources
            statement, since resources are local variables.
         */
        try (var is = new BufferedInputStream(new FileInputStream("myFile.txt"))) {
            //Process file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scopeOfTryWithResources() {
//        try (Scanner s = new Scanner(System.in)) {
//            s.nextLine();
//        } catch (Exception e) {
//            s.nextInt();
//        } finally {
//            s.nextInt();
//        }
    }
}
