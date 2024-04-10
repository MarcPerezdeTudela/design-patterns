package org.patterns.abstractFactory.factories;

import org.patterns.abstractFactory.mages.HumanMage;
import org.patterns.abstractFactory.mages.Mage;
import org.patterns.abstractFactory.warriors.HumanWarrior;
import org.patterns.abstractFactory.warriors.Warrior;

class HumanCharacterFactory implements AbstractCharacterFactory {
    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Mage createMage() {
        return new HumanMage();
    }
}
