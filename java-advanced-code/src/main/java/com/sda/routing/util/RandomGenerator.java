package com.sda.routing.util;

import java.util.Random;

public class RandomGenerator {

    public static int generateRandomNumber() {
        int max = 3;
        int min = 0;
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
