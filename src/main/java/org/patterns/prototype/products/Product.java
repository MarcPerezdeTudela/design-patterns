package org.patterns.prototype.products;

public abstract class Product {
    private String name;
    private int price;
    private String description;

    public Product() {
    }

    public Product(Product product) {
        this.name = product.name;
        this.price = product.price;
        this.description = product.description;
    }

    public abstract Product clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
