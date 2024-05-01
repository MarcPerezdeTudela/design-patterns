package org.patterns.bridge.shapes;

import org.patterns.bridge.colors.Color;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
