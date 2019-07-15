package com.bucur.solid.interface_segregation.after;

public class ToyHouse implements Toy {

    double price;
    String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ToyHouse: Toy house- Price: " + price + " Color: " + color;
    }
}
