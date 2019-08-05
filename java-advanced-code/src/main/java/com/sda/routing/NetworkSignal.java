package com.sda.routing;

public enum NetworkSignal {

    NO_CONNECTION,
    LOW,
    MEDIUM,
    HIGH;

    public static NetworkSignal getSignalByRandomNumber(int number) {
        switch (number) {
            case 0:
                return NO_CONNECTION;
            case 1:
                return LOW;
            case 2:
                return MEDIUM;
            case 3:
                return HIGH;
            default:
                System.out.println("signal type unknown");
        }
        return null;
    }
}
