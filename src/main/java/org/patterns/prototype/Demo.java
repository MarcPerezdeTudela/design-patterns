package org.patterns.prototype;

import org.patterns.prototype.products.Keyboard;
import org.patterns.prototype.products.Mouse;

public class Demo {
    public static void main(String[] args) {
        Keyboard originalKeyboard = new Keyboard();
        Mouse originalMouse = new Mouse();

        Keyboard clonedKeyboard = (Keyboard) originalKeyboard.clone();
        Mouse clonedMouse = (Mouse) originalMouse.clone();

        Keyboard originalKeyboard2 = new Keyboard("Keyboard with backlight", 150, "This is a keyboard with backlight");
        Mouse originalMouse2 = new Mouse("Wireless Mouse", 70, "This is a wireless mouse");

        Keyboard clonedKeyboard2 = (Keyboard) originalKeyboard2.clone();
        Mouse clonedMouse2 = (Mouse) originalMouse2.clone();

        System.out.printf("Original Keyboard: %s%n", originalKeyboard);
        System.out.printf("Cloned Keyboard: %s%n", clonedKeyboard);
        System.out.printf("Original Mouse: %s%n", originalMouse);
        System.out.printf("Cloned Mouse: %s%n", clonedMouse);
        System.out.printf("Original Keyboard 2: %s%n", originalKeyboard2);
        System.out.printf("Cloned Keyboard 2: %s%n", clonedKeyboard2);
        System.out.printf("Original Mouse 2: %s%n", originalMouse2);
        System.out.printf("Cloned Mouse 2: %s%n", clonedMouse2);

    }
}
