package com.gorilla.java.intermediate.examples.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        /*ExecutorService executor2 = Executors.newSingleThreadExecutor();
        executor2.submit(() -> {
            System.out.println("Hello from a thread!");
        });

        try {
            System.out.println("attempt to shutdown executor");
            executor2.shutdown();
            executor2.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        } finally {
            if (!executor2.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor2.shutdownNow();
            System.out.println("shutdown finished");
        }

        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            } catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };
        try {
            ExecutorService executor = Executors.newFixedThreadPool(1);
            Future<Integer> future = executor.submit(task);
            if (future.isDone()) {
                Integer result = future.get();
                System.out.println("The result is "+result);
            }
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e);
        }*/
        try {
            ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

            Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
            ScheduledFuture<?> future = executor.schedule(task, 3, TimeUnit.SECONDS);

            TimeUnit.MILLISECONDS.sleep(1337);

            long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
            System.out.printf("Remaining Delay: %sms", remainingDelay);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
