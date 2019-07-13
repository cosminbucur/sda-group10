package com.bucur.oop;

public class DemoConstructor {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
    }
}

class Parent {

    public Parent() {
        System.out.println("in parent");
    }
}


class Child extends Parent {

    public Child() {
        super(); // call parent constructor
        System.out.println("in child");
    }
}