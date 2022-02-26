package com.perscholas.manageremployee;

public class Employee {

    protected final static double TRAVELALLOWANCEPERCENTAGE = 0.10;

    private long employeeID;
    private String employeeName;
    private String employeeAddress;
    private long employeePphone;
    protected double basicSalary;
    protected double specialAllowance;;
    private double Hra;  //Wow this is huge, I want to work for this company

    public Employee() {
        this.specialAllowance = 250.80;
        this.Hra = 1000.50;
    }

    public Employee(long employeeID, String employeeName, String address,
            long phone, double basicSalary, double specialAllowance, double HRA) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAddress = address;
        this.employeePphone = phone;
        this.basicSalary = basicSalary;
        this.specialAllowance = specialAllowance;
        this.Hra = HRA;
    }

    public Employee(long ID, String Name, String address, long phone) {
        this();
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAddress = address;
        this.employeePphone = phone;
     }

    protected double calculateSalary() {
        double salary = basicSalary*(1 +(specialAllowance/100) + (Hra/100));  //well school project but HRA = 1000.50 is ??
        System.out.printf("Calculated salary = %.2f%n",salary);
        return salary;
    }

    protected double calculateTransportAllowance() {
        double transportAllowance = TRAVELALLOWANCEPERCENTAGE * basicSalary;
        System.out.printf("Transport Allowance = %.2f%n",transportAllowance);
        return transportAllowance;
    }
}
