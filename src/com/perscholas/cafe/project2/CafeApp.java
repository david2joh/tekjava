package com.perscholas.cafe.project2;

import com.perscholas.cafe.project2.Cappuccino;
import com.perscholas.cafe.project2.Coffee;
import com.perscholas.cafe.project2.Espresso;

import java.util.Scanner;

public class CafeApp {

    public final static double SALES_TAX = 5.0;   // We don't have no stinking sales tax here but we have a food tax!

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Product coffee = new Coffee("coffee","Hot Hot Hot" ,1.99,false,false);
        Product cappuccino = new Cappuccino("cappuccino","Hand drawn design by your barista" ,3.65,false,false);
        Product espresso = new Espresso("espresso","Wake up Call" ,2.50,false,false);

        System.out.println("How many coffees would you like?");
        //Not going to surround this with try/catch , going to assume a rational order
        coffee.setQuantity(Integer.parseInt(kb.nextLine()));
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
