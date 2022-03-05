package com.perscholas.cafe.project2;

public class Espresso extends Product {
    protected boolean extraShot = false;
    protected boolean macchiato = false; //what is a macchiato?

    public Espresso(String name, String description, double price, boolean extraShot, boolean macchiato) {
        super(name, description, price);
        this.extraShot = extraShot;
        this.macchiato = macchiato;
    }

    public Espresso() {
        super("espresso","Wake up Call" ,2.50);
        this.extraShot = false;
        this.macchiato = false;
    }

    public boolean getExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean getMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }


    @Override
    public double calculateProductTotal() {
        double upCharge = 0.0;
         upCharge += (extraShot ? 2.00 : 0.0);
         upCharge += (macchiato ? 1.00 : 0.0);
         return(this.getPrice()*this.getQuantity() +upCharge);
    }
}
