package com.sda.routing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NetworkDiscoveryService {

    private Stream<String> networkNames;
    private List<Network> networks = new ArrayList<>();
    private Router router;

    public NetworkDiscoveryService(Router router, Stream<String> networkNames) {
        this.router = router;
        this.networkNames = networkNames;
    }

    public void run() {
        // for each network name, create a network
        // add each new network to the network list
        networkNames.forEach(name ->
                networks.add(new Network(name)));

        // attempt to connect to each network
        networks.forEach(network -> router.connectTo(network));

        printAllConnectedNetworks();
    }

    private void printAllConnectedNetworks() {
        for (Network network : networks) {
            if (network.isConnected()) {
                System.out.println("Available network: " + network.getName());
            }
        }
    }

    private void printAllConnectedNetworksWithStreams() {
        networks.stream()//list to stream
                .filter(network -> network.isConnected())//filtered stream
                .forEach(network -> System.out.println(network.getName()));//prints filtered stream
    }

}

