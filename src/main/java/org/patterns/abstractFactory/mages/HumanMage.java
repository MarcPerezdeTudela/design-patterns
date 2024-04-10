package org.patterns.abstractFactory.mages;

public class HumanMage implements Mage{
    @Override
    public String cast() {
        return "Human mage casts!";
    }

    @Override
    public String escape() {
        return "Human mage escapes!";
    }
}
