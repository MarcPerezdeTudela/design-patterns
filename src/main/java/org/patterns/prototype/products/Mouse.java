package org.patterns.prototype.products;

public class Mouse extends Product{
    public Mouse() {
        this.setName("Mouse");
        this.setPrice(50);
        this.setDescription("This is a mouse");
    }

    public Mouse(String name, int price, String description) {
        this.setName(name);
        this.setPrice(price);
        this.setDescription(description);
    }

    public Mouse(Mouse mouse) {
        super(mouse);
    }

    @Override
    public Product clone() {
        return new Mouse(this);
    }
}
