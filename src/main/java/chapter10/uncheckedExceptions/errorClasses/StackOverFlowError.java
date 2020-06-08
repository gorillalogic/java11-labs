package chapter10.uncheckedExceptions.errorClasses;

/*
    When Java calls methods, it puts parameters and local variable on the stack.
    After doing this a very large number of  times, the stack runs out of room
    and overflows.
 */
public class StackOverFlowError {

    /*
        This is called a StackOverFlowError. Most of the time, this error occurs when
        a method calls itself.
     */
    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }
    /*
        Since the method call itself, it will never end. Eventually, Java runs out of room
        on the stack and throws the error. This is called infinite recursion. It is better
        than an infinite loop because at least Java will catch it and throw the error. With
        an infinite loop, Java just uses all your CPU until you can kill the program.
     */
    public static void main(String[] args) {
        doNotCodeThis(2);
    }
}
