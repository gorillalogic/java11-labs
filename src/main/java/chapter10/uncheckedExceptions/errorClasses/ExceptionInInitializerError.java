package chapter10.uncheckedExceptions.errorClasses;

/*
    Java runs static initializers the first time a class is used.
    If one of the static initializers throws an exception, Java
    can't start using the class. It declares defeat by throwing
    an ExceptionInInitializerError.
 */
public class ExceptionInInitializerError {

    static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }

    public static void main(String[] args) {
        ExceptionInInitializerError ex = new ExceptionInInitializerError();
    }
}
