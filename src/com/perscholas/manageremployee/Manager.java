package com.perscholas.manageremployee;

public class Manager extends Employee{
    protected final static double TRAVELALLOWANCEPERCENTAGE = 0.15;

    public Manager(long id, String Name, String address, long phone, double basicSalary) {
        super(id, Name, address, phone);
        this.basicSalary = basicSalary;
    }

    @Override
    protected double calculateTransportAllowance() {
        double transportAllowance = TRAVELALLOWANCEPERCENTAGE * basicSalary;
        System.out.printf("Transport Allowance = %.2f%n",transportAllowance);
        return transportAllowance;
    }

}
