package org.patterns.abstractFactory.factories;

import org.patterns.abstractFactory.mages.Mage;
import org.patterns.abstractFactory.warriors.Warrior;

public class CharacterFactory implements AbstractCharacterFactory {

    AbstractCharacterFactory factory;

    public CharacterFactory(CharacterType type) {
        switch (type) {
            case HUMAN:
                factory = new HumanCharacterFactory();
                break;
            case ELF:
                factory = new ElfCharacterFactory();
                break;
        }
    }

    @Override
    public Warrior createWarrior() {
        return factory.createWarrior();
    }

    @Override
    public Mage createMage() {
        return factory.createMage();
    }
}
