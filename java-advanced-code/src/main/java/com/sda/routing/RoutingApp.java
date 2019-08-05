package com.sda.routing;

import java.util.stream.Stream;

public class RoutingApp {

    public static void main(String[] args) {

        Network network1 = new Network("ASUS1");
        Network network2 = new Network("ASUS2");
        network2.signal = NetworkSignal.NO_CONNECTION;

        Router router1 = new Router();
        Stream<String> networkNames = Stream.of(network1.getName(), network2.getName());

        NetworkDiscoveryService service = new NetworkDiscoveryService(router1, networkNames);
        service.run();
    }
}
