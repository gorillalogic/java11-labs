package com.gorilla.java.intermediate.examples.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class Count {
    private int c = 0;

    public void decrement() {
        synchronized (this){
            c--;
        }
    }

    public synchronized int value() {
        return c;
    }

    void increment() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            c++;
        } finally {
            lock.unlock();
        }
    }
}

