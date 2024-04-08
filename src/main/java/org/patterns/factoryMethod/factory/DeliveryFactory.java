package org.patterns.factoryMethod.factory;

import org.patterns.factoryMethod.deliveryTypes.DeliveryTime;
import org.patterns.factoryMethod.transports.Transport;

public abstract class DeliveryFactory {

    public enum DeliveryType {
        STANDARD, PREMIUM
    }

    public abstract DeliveryTime createDeliveryType();
    public abstract Transport createTransport();

    public String printInfo() {
        DeliveryTime deliveryType = createDeliveryType();
        Transport transport = createTransport();

        return "Delivery time: " + deliveryType.getDeliveryTime() + "\nTransport method: " + transport.getTransportMethod();
    }


}
