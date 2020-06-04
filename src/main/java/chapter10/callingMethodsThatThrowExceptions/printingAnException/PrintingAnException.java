package chapter10.callingMethodsThatThrowExceptions.printingAnException;

public class PrintingAnException {

    /*
        There are three ways to print an exception.
        1. You can let Java print it out.
        2. Print just the message.
        3. Print where the stack trace comes from.
        This example shows all three approaches.
     */
    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
}
