package com.sda.routing;

import com.sda.routing.exceptions.NetworkUnavailableException;

public class Router implements Connectable {

    @Override
    public boolean connectTo(Network network) {
        // check if is connectable
        if (!network.isConnected() ||
                network.getSignal() == NetworkSignal.NO_CONNECTION) {
            throw new NetworkUnavailableException("could not connect to network");
        } else {
            network.setConnected(true);
            return true;
        }
    }
}
