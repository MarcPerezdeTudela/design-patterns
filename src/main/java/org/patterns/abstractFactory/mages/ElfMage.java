package org.patterns.abstractFactory.mages;

public class ElfMage implements Mage{
    @Override
    public String cast() {
        return "Elf mage casts!";
    }

    @Override
    public String escape() {
        return "Elf mage escapes!";
    }
}
