package com.gorillalogic.java.starter.cl8;

public class InvalidArgumentException extends Exception {
    public InvalidArgumentException(String argName) {
        super("The argument " + argName + " is invalid");
    }
}
