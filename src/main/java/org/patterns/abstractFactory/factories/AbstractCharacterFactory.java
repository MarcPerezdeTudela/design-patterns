package org.patterns.abstractFactory.factories;
import org.patterns.abstractFactory.mages.Mage;
import org.patterns.abstractFactory.warriors.Warrior;

public interface AbstractCharacterFactory {
    enum CharacterType {
        HUMAN, ELF
    }

    Warrior createWarrior();
    Mage createMage();
}
