package com.perscholas.cafe.project2;

public abstract class Product {
    private String name ="";
    private String description ="";
    private double price =0.0;
    private int quantity = 0;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >0 ) { this.quantity = quantity; }
    }

    abstract public double calculateProductTotal();
}
