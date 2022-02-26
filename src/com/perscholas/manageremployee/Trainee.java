package com.perscholas.manageremployee;

public class Trainee extends Employee{
    protected final static double TRAVELALLOWANCEPERCENTAGE = 0.10;

    public Trainee(long id, String Name, String address, long phone, double basicSalary) {
        super(id, Name, address, phone);
        this.basicSalary = basicSalary;
    }

}
