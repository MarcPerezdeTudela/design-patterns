package org.patterns.factoryMethod.transports;

public class Ship implements Transport{
    public String getTransportMethod() {
        return "Deliver by sea in a container";
    }
}
