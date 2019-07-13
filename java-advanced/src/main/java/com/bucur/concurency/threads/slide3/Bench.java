package com.bucur.concurency.threads.slide3;

public class Bench {

    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void takeSeat() {
        if (availableSeats > 0) {
            System.out.println("taking a seat");
            availableSeats--;
            System.out.println("free seats left: " + availableSeats);
        } else {
            System.out.println("no more places");
        }
    }
}
