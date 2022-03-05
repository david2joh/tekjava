package com.perscholas.cafe.project3;

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

    @Override
    public void addOptions(boolean o1, boolean o2) {
        this.milk  = o2;
        this.sugar = o1;
    }

    @Override
    public void printOptions() {
        System.out.printf("          Sugar: %-12sMilk: %s%n",(this.sugar?"Yes":"No"),(this.milk?"Yes":"No"));
    }


    public  String toString() {
      return String.format("Item:     Coffee             Price: %-7.2fQty: 1  SubTotal : %-7.2f",this.getPrice(),this.getPrice());
    }
}
