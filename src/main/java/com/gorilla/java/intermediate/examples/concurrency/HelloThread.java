package com.gorilla.java.intermediate.examples.concurrency;

public class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
    }
}
