package com.perscholas.java_basics;

public class MainLoops {

    public static void main(String[] args) {

//        Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.
        print1to10();

//        Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10
//        and prints out each number.
        print0to100in10();

 //       Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.
        print1to10dowhile();

//        Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number
//        if is a multiple of 5, but do not print out any numbers between 25 and 75.
//        Use the “continue” statement to accomplish this.
        printby5();

//        Write a program that uses a for-loop to loop through the numbers 1-100.
//        Print out each number if is a multiple of 5, but do not print out any numbers greater than 50.
//        Use the “break” keyword to accomplish this.
        printby5lessthan50();

//        Write a program that uses nested for-loops to output the following:
//        Week 1:
//        Day 1
//        Day 2
//        Day 3
//        Day 4
//        Day 5
//        Week 2:
//        Day 1
//        Day 2
//        Day 3
//        Day 4
//        Day 5
        print2workweeks();

//        Write a program that returns all the available palindromes within 10 and 200.
//        The following output will be produced:
//        11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,
        palindromes10to200();

//        Write a program that prints the Fibonacci Sequence from 0 to 50.
//        The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        fibonacci0to50();

//        Write a program that nests a for-loop inside another. Print out the inner and outer variable
//         (e.g., i or j) in the inner loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
        nestedFors();
    } //Main

    private static void nestedFors() {
        for ( int i =0 ; i < 3; i++) {
            for ( int j = 0 ; j <2 ; j++) { System.out.println("Inner loop: i: " + i + ", j: " + j); }
        }
        System.out.println();
    }

    private static void fibonacci0to50() {
        int i = 0,j=1,x = i +j;
        System.out.print("0 1 "); // print first of sequence to intialize
        while ( x < 50) {
            System.out.print(x + " ");
            i = j;
            j = x;
            x = i + j;
        }
        System.out.println();
    }

    private static void palindromes10to200() {
        for (int i = 10; i<= 200; i++) {
            int rem,sum=0,j;
            j=i;
            while(j>0){ //Check for palindrome by reversing and adding digits
                rem=j%10;
                sum=(sum*10)+rem;
                j=j/10;
            }
            if(i==sum) { System.out.print(i + " "); }
        }
        System.out.println();
    }

    private static void print2workweeks() {
        for ( int i = 1 ;i <=2; i++) {
            System.out.println("Week " + i);
            for (int j =1 ; j <= 5; j++) {
                System.out.println("Day " + j);
            }
        }
        System.out.println();
    }

    private static void printby5lessthan50() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if (i >= 50) { break; }
                else { System.out.print(i + " "); }

            }
        }
        System.out.println();
    }

    private static void printby5() {
        for (int i = 1; i <= 100 ; i++) {
            if (i%5 == 0 ) {
                if ((i >= 25) && (i <= 75)) {
                    continue;
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    private static void print1to10dowhile() {
        int i = 1;
        do { System.out.print(i + " ");  i+=1; } while (i <= 10);
        System.out.println();
    }

    private static void print0to100in10() {
        int i = 0;

        while (i <= 100) { System.out.print(i + " ");  i+=10;}
        System.out.println();
    }

    private static void print1to10() {
        for (int i = 1 ; i <= 10; i++) System.out.print(i + " ");
        System.out.println();
    }

}
