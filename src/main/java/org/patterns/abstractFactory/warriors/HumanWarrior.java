package org.patterns.abstractFactory.warriors;

public class HumanWarrior implements Warrior{
    @Override
    public String attack() {
        return "Human warrior attacks!";
    }

    @Override
    public String defend() {
        return "Human warrior defends!";
    }
}
