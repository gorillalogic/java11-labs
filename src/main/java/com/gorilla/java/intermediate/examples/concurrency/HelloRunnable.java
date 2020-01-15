package com.gorilla.java.intermediate.examples.concurrency;

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }
}
