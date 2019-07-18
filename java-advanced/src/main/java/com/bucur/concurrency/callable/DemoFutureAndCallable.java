package com.bucur.concurrency.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoFutureAndCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            // some computation
            System.out.println("entered callable");
            Thread.sleep(2000);
            return "hello from callable";
        };

        System.out.println("submitting callable");
        Future<String> future = executorService.submit(callable);

        String result = future.get();
        System.out.println(result);
    }
}
