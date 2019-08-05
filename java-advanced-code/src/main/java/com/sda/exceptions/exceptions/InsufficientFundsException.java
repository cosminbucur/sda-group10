package com.sda.exceptions.exceptions;

public class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException() {
        super("insufficient funds!");
    }

}
