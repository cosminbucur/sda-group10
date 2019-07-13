package com.bucur.concurency.threads.slide1;

public class DemoSlide1 {

    public static void main(String[] args) throws InterruptedException {
        StopWatchThread stopWatchThread1 = new StopWatchThread();
        StopWatchThread stopWatchThread2 = new StopWatchThread();
        stopWatchThread1.start();
        stopWatchThread2.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("main thread starts");
        Thread.sleep(5000);
        System.out.println("main thread is still running");
        Thread.sleep(5000);
        System.out.println("main thread ends");
    }
}
