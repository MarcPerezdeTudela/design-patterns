package org.patterns.bridge.shapes;

import org.patterns.bridge.colors.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}
