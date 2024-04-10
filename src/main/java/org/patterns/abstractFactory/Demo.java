package org.patterns.abstractFactory;

import org.patterns.abstractFactory.factories.AbstractCharacterFactory;
import org.patterns.abstractFactory.factories.CharacterFactory;
import org.patterns.abstractFactory.mages.Mage;
import org.patterns.abstractFactory.warriors.Warrior;

public class Demo {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory(AbstractCharacterFactory.CharacterType.ELF);
        //CharacterFactory characterFactory = new CharacterFactory(AbstractCharacterFactory.CharacterType.HUMAN);

        Warrior warrior = characterFactory.createWarrior();
        System.out.println(warrior.attack());
        System.out.println(warrior.defend());
        Mage mage = characterFactory.createMage();
        System.out.println(mage.cast());
        System.out.println(mage.escape());
    }
}
