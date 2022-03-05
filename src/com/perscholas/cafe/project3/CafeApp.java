package com.perscholas.cafe.project3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.perscholas.cafe.project3.Cappuccino;
import com.perscholas.cafe.project3.Coffee;
import com.perscholas.cafe.project3.Espresso;
import com.perscholas.cafe.project3.Product;

public class CafeApp {

    public final static double SALES_TAX = 5.0;   // We don't have no stinking sales tax here but we have a food tax!
    static Scanner kb;

    public static void main(String[] args) {
        kb = new Scanner(System.in);
        List<Product> orderList = new ArrayList<>();

//        Product coffee = new Coffee("coffee","Hot Hot Hot" ,1.99,false,false);
//        Product cappuccino = new Cappuccino("cappuccino","Hand drawn design by your barista" ,3.65,false,false);
//        Product espresso = new Espresso("espresso","Wake up Call" ,2.50,false,false);
        //Obviously we could extend this a lot, allowing multiple quantity orders,
        // setting up list of lists of subclass product
        //sorting by price etc... etc... etc...
        boolean orderComplete = false;
        int choice = 0;
        Product p;
        while (!orderComplete) {
            p  = null;
            choice = displayMainMenu();
            switch (choice) {
                case 1:
                    p = OrderCoffee();
                    if (p != null) {
                        orderList.add(p);
                    }
                    break;
                case 2:
                    p = OrderCappuccino();
                    if (p != null) {
                        orderList.add(p);
                    }
                    break;
                case 3:
                    p = OrderEspresso();
                    if (p != null) {
                        orderList.add(p);
                    }
                    break;
                case 4:
                    orderComplete = true;
                    break;
                default:
                    System.out.println("Please Select a valid entry from 1 to 4\n");
            }

        }
        double subTotal = 0.0;
        for ( Product p1 : orderList) {
            System.out.println(p1);
            p1.printOptions();
            subTotal += p1.calculateProductTotal();
        }
            System.out.printf("Purchase Subtotal : %7.2f%n" +
                              "Sales Tax :         %7.2f%n" +
                              "Purchase Total :    %7.2f%n",subTotal,(subTotal*SALES_TAX/100),subTotal*(1+SALES_TAX/100));
    }


    private static int displayMainMenu () {
            System.out.println("Please select from the following menu\n");
            System.out.printf("1: Coffee%n2: Cappuccino%n3: Espresso%n4: Check Out%n:");
            int choice = -1;
            try {
                choice = Integer.parseInt(kb.nextLine());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            return choice;
        }

    private static Coffee OrderCoffee() {

        Coffee c = new Coffee();
        String menu = "%nPlease select your Coffee type%n1. Black%n2. With Sugar%n3. With Cream%n4. With Cream and Sugar%n5. Cancel Order%n";
        orderBeverage(c, menu);
//        System.out.println("\n"+c.toString());
//        c.printOptions();
        return c;
    }

    private static Cappuccino OrderCappuccino() {
        Cappuccino c = new Cappuccino();
        String menu = "%nPlease select your Cappuccino type%n1. Clean%n2. With Peppermint%n3. With Whipped Cream%n" +
                "4. With Whipped Cream and Peppermint%n5. Cancel Order%n";
        orderBeverage(c, menu);
//        System.out.println("\n"+c.toString());
//        c.printOptions();
        return c;
    }
    private static Product OrderEspresso() {
        Espresso e = new Espresso();
        String menu = "%nPlease select your Espresso type%n1. Straight%n2. Extra Shot%n3. Machiatto%n" +
        "4. Extra Shot Machiatto%n5. Cancel Order%n";
        orderBeverage(e, menu);
//        System.out.println("\n"+e.toString());
//        e.printOptions();
        return e;
    }


    private static void orderBeverage(Product p,String menu) {
        boolean orderComplete = false;
        System.out.printf(menu);
        while(!orderComplete) {
            int choice = -1;
            try {
                choice = Integer.parseInt(kb.nextLine());
                switch (choice) {
                    case 1:
                        orderComplete = true;
                        break;
                    case 2:
                        orderComplete = true;
                        p.addOptions(true,false);
                        break;
                    case 3:
                        orderComplete = true;
                        p.addOptions(false,true);
                        break;
                    case 4:
                        p.addOptions(true,true);
                        orderComplete = true;
                        break;
                    default:
                        System.out.println("Please Select a valid entry from 1 to 4\n");
                }

            } catch (Exception e) {
                System.out.println(e.toString());
                orderComplete = true;
                p = null;
            }
        }
        return;
    }


}