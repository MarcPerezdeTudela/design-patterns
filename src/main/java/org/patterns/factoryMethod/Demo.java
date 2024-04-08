package org.patterns.factoryMethod;

import org.patterns.factoryMethod.factory.DeliveryFactory;
import org.patterns.factoryMethod.factory.PremiumDeliveryFactory;
import org.patterns.factoryMethod.factory.StandardDeliveryFactory;

public class Demo {

    private static DeliveryFactory deliveryFactory;

    public static void main(String[] args) {
        DeliveryFactory.DeliveryType deliveryType = DeliveryFactory.DeliveryType.PREMIUM;
        // DeliveryFactory.DeliveryType deliveryType = DeliveryFactory.DeliveryType.STANDARD;
        configure(deliveryType);
        System.out.println(deliveryFactory.printInfo());

    }

    static void configure(DeliveryFactory.DeliveryType deliveryType) {
        switch (deliveryType) {
            case STANDARD:
                deliveryFactory = new StandardDeliveryFactory();
                break;
            case PREMIUM:
                deliveryFactory = new PremiumDeliveryFactory();
                break;
        }
    }
}
