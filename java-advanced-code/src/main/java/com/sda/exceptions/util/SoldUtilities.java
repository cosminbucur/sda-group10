package com.sda.exceptions.util;

import com.sda.exceptions.exceptions.InsufficientFundsException;

import java.util.logging.Logger;

public class SoldUtilities {

    private static final Logger logger = Logger.getLogger(SoldUtilities.class.getName());

    private int sold;

    public SoldUtilities(int sold) {
        this.sold = sold;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        sold -= amount;
        if (sold < 0) {
            throw new InsufficientFundsException();
        } else {
            logger.info("available funds = " + sold);
        }
        logger.info("Transaction finished");
    }

    public void withdrawWithTry(int amount) {
        try {
            sold -= amount;
            if (sold < 0)
                throw new InsufficientFundsException();
        } catch (InsufficientFundsException e) {
            logger.severe("insufficient funds error");
        } finally {
            System.out.println("Transaction finished!");
        }
    }
}
