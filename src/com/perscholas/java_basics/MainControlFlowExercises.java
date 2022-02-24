package com.perscholas.java_basics;

import java.util.Scanner;
/*
*  Author Johnson, David
 */
public class MainControlFlowExercises {

    public static void main(String[] args) {
      //Write a program that declares 1 integer variable x, and then assigns 7 to it.
      // Write an if statement to print out “Less than 10” if x is less than 10.
      // Change x to equal 15 and notice the result (console should not display anything).
        controlFlowEx1();

//        Write a program that declares 1 integer variable x, and then assigns 7 to it.
//        Write an if-else statement that prints out “Less than 10” if x is less than 10 and “Greater than 10”
//        if x is greater than 10. Change x to 15 and notice the result.
        int x = 7;
        controlFlowEx2(x);
        x = 15;
        controlFlowEx2(x);

//        Write a program that declares 1 integer variable x, and then assigns 15 to it.
//        Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20
//        and prints “In range” if between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
        x = 15;
        controlFlowEx3(x);
        x= 5;
        controlFlowEx3(x);


/*
        Write a program that uses if-else-if statements to print out grades A, B, C, D, F 
        according to the following criteria:

        A: 90-100

        B: 80-89

        C: 70-79

        D: 60-69

        F: <60

        Use the Scanner class to accept a number score from the user to determine the letter grade.
        Print out “Score out of range.” if the score is less than 0 or greater than 100.
*/
//        controlFlowEx4();

//       Write a program that accepts an integer between 1 and 7 from the user.
//       Use a switch statement to print out the corresponding weekday.
//       Print “Out of range” if the number is less than 1 or greater than 7.
//       Don’t forget to include “break” statements in each of your cases.
        controlFlowEx5();

    }

    private static void controlFlowEx5() {
        Scanner kb2 = new Scanner(System.in);
        int dayNum =0;
        System.out.println("Enter a numeric day of the week\n");
        dayNum = kb2.nextInt();
        switch(dayNum) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednsday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Out of Range");
        }
        kb2.close();
        return;
    }

    private static void controlFlowEx4() {
        Scanner kb = new Scanner(System.in);
        int grade =0;
        boolean done = false;
            while (!done) {
                System.out.println("Enter a grade from 1 to 100 , -1 to quit");
                grade = Integer.parseInt(kb.nextLine());
                if (grade >= 90 && grade <= 100) { System.out.println("A"); }
                else if (grade >= 80 && grade <= 89) { System.out.println("B"); }
                else if (grade >= 70 && grade <= 79) { System.out.println("C"); }
                else if (grade >= 60 && grade <= 69) { System.out.println("D"); }
                else if (grade >= 0  && grade < 60) { System.out.println("F"); }
                else { System.out.println("Score out of range."); if (grade == -1) {done = true; } }
            }
        kb.close();
        return;
    }

    private static void controlFlowEx3(int x) {
        if (x < 10 || x > 20) {
            System.out.println("Out of Range");
        } else {
            System.out.println("In Range");
        }
    }

        private static void controlFlowEx2 ( int x){
            if (x < 10) {
                System.out.println("Less than 10");
            } else { System.out.println("Greater than 10"); }
        }

        private static void controlFlowEx1 () {
            int x = 7;
            if (x < 10) {
                System.out.println("Less than 10");
            }
            x = 15;
            if (x < 10) {
                System.out.println("Less than 10");
            }
        }
    }
