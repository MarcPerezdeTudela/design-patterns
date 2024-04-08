package org.patterns.factoryMethod.factory;

import org.patterns.factoryMethod.deliveryTypes.DeliveryTime;
import org.patterns.factoryMethod.deliveryTypes.ExpressDelivery;
import org.patterns.factoryMethod.transports.Plane;
import org.patterns.factoryMethod.transports.Transport;

public class PremiumDeliveryFactory extends DeliveryFactory{
    @Override
    public DeliveryTime createDeliveryType() {
        return new ExpressDelivery();
    }

    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
