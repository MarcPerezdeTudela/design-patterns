package org.patterns.factoryMethod.factory;

import org.patterns.factoryMethod.deliveryTypes.DeliveryTime;
import org.patterns.factoryMethod.deliveryTypes.RegularDelivery;
import org.patterns.factoryMethod.transports.Ship;
import org.patterns.factoryMethod.transports.Transport;

public class StandardDeliveryFactory extends DeliveryFactory {
    @Override
    public DeliveryTime createDeliveryType() {
        return new RegularDelivery();
    }

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
