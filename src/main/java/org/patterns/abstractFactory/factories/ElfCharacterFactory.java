package org.patterns.abstractFactory.factories;

import org.patterns.abstractFactory.mages.ElfMage;
import org.patterns.abstractFactory.mages.Mage;
import org.patterns.abstractFactory.warriors.ElfWarrior;
import org.patterns.abstractFactory.warriors.Warrior;

class ElfCharacterFactory implements AbstractCharacterFactory {
    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Mage createMage() {
        return new ElfMage();
    }
}
