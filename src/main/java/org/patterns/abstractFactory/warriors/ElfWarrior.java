package org.patterns.abstractFactory.warriors;

public class ElfWarrior implements Warrior{
    @Override
    public String attack() {
        return "Elf warrior attacks!";
    }

    @Override
    public String defend() {
        return "Elf warrior defends!";
    }
}
