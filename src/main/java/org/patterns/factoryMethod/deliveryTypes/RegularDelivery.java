package org.patterns.factoryMethod.deliveryTypes;

public class RegularDelivery implements DeliveryTime {

    @Override
    public String getDeliveryTime() {
       return "Regular delivery";
    }
}
