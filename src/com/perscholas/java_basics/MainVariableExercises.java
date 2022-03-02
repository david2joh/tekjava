package com.perscholas.java_basics;

public class MainVariableExercises {

    public static void main(String[] args) {
        // Core Java-Exercises-Variables
        //
//        Write a program that declares 2 integer variables,
//        assigns an integer to each, and adds them together.
//        Assign the sum to a variable. Print out the result.
           adder();

//        Write a program that declares 2 double variables,
//        assigns a number to each, and adds them together.
//        Assign the sum to a variable. Print out the result.
           doubleAdder();

        //       Write a program that declares an integer variable and a double variable,
//        assigns numbers to each, and adds them together.
//        Assign the sum to a variable. Print out the result. What variable type must the sum be
           doubletoIntAdder();

//        Write a program that declares 2 integer variables, assigns an integer to each,
//        and divides the larger number by the smaller number. Assign the result to a variable.
//        Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
            divider();

//        Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
//       Assign the result to a variable.  Print out the result. Now, cast the result to an integer. Print out the result again.
        myDoubledivider();

//        Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
//        Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.
        myIntandDoubleDivider();

        // Write a prog ram that declares a named constant and uses it in a calculation. Print the result.
        screamingSnake();

//        Write a program where you create 3 variables that represent products at a cafe.
//        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
//        Assign prices to each product. Create 2 more variables called subtotal and totalSale and
//        complete an “order” for 3 items of the first product, 4 items of the second product,
//        and 2 items of the third product. Add them all together to calculate the subtotal.
//        Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
//        Be sure to format the results to 2 decimal places.
        cafeOrder();

    } //main()

    private static void cafeOrder() {
        final double SALES_TAX = 0.065;
        double coffee = 2.69;
        double donut  = 1.50;
        double latte  = 3.69;
        double subtotal, totalSale;
        subtotal = 3*coffee + 4*donut + 2* latte;
        totalSale = subtotal * (1+SALES_TAX);
        System.out.printf("Sale before Tax %.2f   Total Sale %.2f%n--------%n", subtotal, totalSale);
    }

    private static void screamingSnake() {
        final int MY_CONSTANT_VAL = 6;
        int res = MY_CONSTANT_VAL * 7;
        System.out.printf("The answer to Douglas adam's book is ? %-3d%n--------%n", res);
    }

    private static void myIntandDoubleDivider() {
        int x = 5;
        int y = 6;
        double q = x/y;
        double  qq = x / ((double)y);
        System.out.printf("Int result = %-3f : iDouble widening %-3f%n--------%n", q, qq);
    }

    private static void myDoubledivider() {
        double i = 789.56;
        double j = 32322.5;
        double k = j / i;
        int x = (int) k;
        System.out.printf("Double result = %-3f : int narrowing %-3d%n--------%n", k, x);
    }

    private static void adder() {
        int i = 7;
        int j = 5;
        int sum = i + j;
        System.out.println("Sum of two int vars = " + sum);
    }


    private static void divider() {
        int i = 7;
        int j = 5;
        int result = i / j;
        System.out.println("Result of two int division = " + result);
        double id = (double) i;
        // Taking advantage of auto widening
        double resd = id/j;
        System.out.println("Result of one double one int division = " + resd);
        System.out.println("round 3.5 " + Math.rint(3.5) + " Round 2.5 " + Math.rint(2.5));
    }

    private static void doubletoIntAdder() {
        double i = 5.678;
        int j = 11;
        double sum = i + j;
        System.out.println("Sum of one double one int = " + sum);
    }

    private static void doubleAdder() {
        double i = 5.678;
        double j = 11.2345;
        double sum = i + j;
        System.out.println("Sum of two doubles = " + sum);
    }



} //MAIN class


