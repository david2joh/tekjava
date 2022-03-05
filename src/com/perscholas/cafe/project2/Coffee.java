package com.perscholas.cafe.project2;

public class Coffee extends Product {
    protected boolean sugar = false;
    protected boolean milk = false;

    public Coffee(String name, String description, double price, boolean sugar, boolean milk) {
        super(name, description, price);
        this.sugar = sugar;
        this.milk = milk;
    }

    Coffee() {
        super("coffee","Fresh Brew",1.99);
        this.sugar = false;
        this.milk =  false;
    }

    public boolean getSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean getMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    @Override
    public double calculateProductTotal() {
        return (this.getPrice()*this.getQuantity());
    }
}
