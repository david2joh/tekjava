package com.perscholas.cafe.project1;



import java.util.Scanner;

public class CafeApp {

    public final static double SALES_TAX = 5.0;   // We don't have no stinking sales tax here but we have a food tax!

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Product coffee = new Product("coffee","Hot Hot Hot" ,1.99);
        Product cappuccino = new Product("cappuccino","Hand drawn design by your barista" ,3.65);
        Product espresso = new Product("espresso","Wake up Call" ,2.50);

        // int quantity = 0;  //do not neet this quite yet as we don't
        System.out.println("How many coffees would you like?");
        //Not going to surround this with try/catch , going to assume a rational order
        coffee.setQuantity(Integer.parseInt(kb.nextLine()));;
        double p1 = coffee.calculateProductTotal();
        System.out.printf("%s Subtotal %s  = %-5.2f%n",coffee.getName(),coffee.getDescription(),p1);

        System.out.println("How many cappuccino would you like?");
        //Not going to surround this with try/catch , going to assume a rational order
        cappuccino.setQuantity(Integer.parseInt(kb.nextLine()));
        double p2 = cappuccino.calculateProductTotal();
        System.out.printf("%s Subtotal %s  = %-5.2f%n",cappuccino.getName(),cappuccino.getDescription(),p2);

        System.out.println("How many espressos would you like?");
        //Not going to surround this with try/catch , going to assume a rational order
        espresso.setQuantity(Integer.parseInt(kb.nextLine()));
        double p3 = espresso.calculateProductTotal();
        System.out.printf("%s Subtotal %s  = %-5.2f%n",espresso.getName(),espresso.getDescription(),p3);
        double subTotal = p1+p2+p3;
        double salesTax = subTotal* SALES_TAX/100;
        double totalSale = subTotal + salesTax;
        System.out.printf("Subtotal = %-5.2f  SalesTax = %-5.2f   Total = %-5.2f%n-----%n",subTotal,salesTax,totalSale);

   }
}
