package org.patterns.factoryMethod.deliveryTypes;

public class ExpressDelivery implements DeliveryTime {

    @Override
    public String getDeliveryTime() {
        return "Express delivery";
    }
}
