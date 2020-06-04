package chapter10.callingMethodsThatThrowExceptions.declaringAndOverridingMethodsWithExceptions;

public class Hopper {

    public void hop() {}

    public void hopWithException() throws CanNotHopException {}

    public void hopBroaderTypeException() throws Exception {}

    public void hopUncheckedException() throws IllegalStateException {}
}
