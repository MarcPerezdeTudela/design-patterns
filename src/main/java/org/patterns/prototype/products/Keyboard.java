package org.patterns.prototype.products;

public class Keyboard extends Product{
    public Keyboard() {
        this.setName("Keyboard");
        this.setPrice(100);
        this.setDescription("This is a keyboard");
    }

    public Keyboard(String name, int price, String description) {
        this.setName(name);
        this.setPrice(price);
        this.setDescription(description);
    }

    public Keyboard(Keyboard keyboard) {
        super(keyboard);
    }

    @Override
    public Product clone() {
        return new Keyboard(this);
    }

}
