package chapter10.callingMethodsThatThrowExceptions.declaringAndOverridingMethodsWithExceptions;

public class Bunny extends Hopper {

//    public void hop() throws CanNotHopException { }

    /*
        An overridden method in a subclass is allowed to declare
        fewer exceptions than the superclass or interface.
        This is legal because callers are already handling them.
     */
    public void hopWithException() {
        /*
            An overridden method not declaring one of the exceptions thrown
            by the parent method is similar to the method declaring it
            throws an exception that it never actually throws. This
            is perfectly legal.
         */
    }

    /*
        Similarly, a class is allowed to declare a subclass of an exception type.
        The idea is the same. The superclass or interface has already taken care
        of a broader type. Here's an example:
     */
    public void hopBroaderTypeException() throws CanNotHopException {}

    /*
        This rule applies only to checked exceptions. The following code is legal
        because it has an unchecked exception in the subclass's version:
     */
    public void hopUncheckedException() {}
}
