package org.patterns.bridge;

import org.patterns.bridge.colors.Blue;
import org.patterns.bridge.colors.Red;
import org.patterns.bridge.shapes.Circle;
import org.patterns.bridge.shapes.Shape;
import org.patterns.bridge.shapes.Square;

public class Demo {
    public static void main(String[] args) {
        Shape redSquare = new Square(new Red());
        Shape blueCircle = new Circle(new Blue());
        System.out.println(redSquare.draw());
        System.out.println(blueCircle.draw());
    }
}
