package com.perscholas.cafe.project2;

public class Cappuccino extends Product {
    protected boolean peppermint = false;
    protected boolean whippedCream = false;

    public Cappuccino(String name, String description, double price, boolean peppermint, boolean whippedCream) {
        super(name, description, price);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    public Cappuccino() {
        super("cappuccino","Hand drawn design by your barista" ,3.65);
        this.peppermint = false;
        this.whippedCream = false;
    }

    @Override
    public double calculateProductTotal() {
        double upCharge = 0.0;
        upCharge += (peppermint ? 2.00 : 0.0);
        upCharge += (whippedCream ? 1.00 : 0.0);
        return(this.getPrice()*this.getQuantity() +upCharge);
    }

}
