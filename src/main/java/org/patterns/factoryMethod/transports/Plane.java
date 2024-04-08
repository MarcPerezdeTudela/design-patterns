package org.patterns.factoryMethod.transports;

public class Plane implements Transport{
    @Override
    public String getTransportMethod() {
        return "Deliver by air in a container";
    }
}
