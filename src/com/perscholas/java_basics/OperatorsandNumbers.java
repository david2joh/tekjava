package com.perscholas.java_basics;

import java.util.ArrayList;
import java.util.Arrays;

public class OperatorsandNumbers {

    public static void main(String[] args) {

//        Write a program that declares an integer a variable x and assigns the value 2 to it
//        and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
//        Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
//        Before printing the results, write a comment with the predicted decimal value and binary string.
//        Now, print out x in decimal form and in binary notation.
//
//        Do the preceding exercise with the following values: 9 , 17 ,88
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 9, 17 , 88));
        for ( Integer x : arr) {  binarybyBitShift(x); }


//        Write a program that declares a variable x and assigns 150 to it
//        and prints out the binary string version of the number.
//        Now use the right shift operator (>>) to shift by 2 and assign the result to x.
//        Write a comment indicating what you anticipate the decimal and binary values to be.
//        Now print the value of x and the binary string.
//
//        Do the preceding exercise with the following values: 225,1555, 32456
        arr = new ArrayList<>(Arrays.asList(150, 255, 1555, 32456));
        for ( Integer x : arr) {  dotheBinaryTwist(x); }


//        Write a program that declares 3 int variables x, y, and z. Assign 7 to x and 17 to y.
//        Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y.
//        Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
//
//        Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y.
//        As before, write a comment that indicates what you predict the values to be before printing them out.
        bitWiseAndOr();

//        Write a program that declares an integer variable, assigns a number,
//        and uses a postfix increment operator to increase the value.
//        Print the value before and after the increment operator.
        int x = 7;
        System.out.printf("Before postfix %d After postfix %d%n------%n",x++,x);

        // Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times.
        // Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print again.
        myIncr(x);

        // Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y.
        // Create another variable sum and assign the value of ++x added to y and print the result.
        // Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program.
        // Notice what the value of sum is.
        // The first configuration incremented x and then calculated the sum while the second configuration calculated the sum
        // and then incremented x.
        myprepost();
    }

    private static void myprepost() {
        int x = 5;
        int y = 8;
        int sum = ++x + y;
        System.out.printf("Prefix   X = : %d, Y = : %d Sum = %d%n",x,y,sum);
        x = 5;
        y = 8;
        sum = x++ + y;
        System.out.printf("Postfix  X = : %d, Y = : %d Sum = %d%n------%n",x,y,sum);
    }

    private static void myIncr(int x) {
        int y = x/2;
        int z = x*2;
        for (int i = 0 ;i < 3 ; i++)
        {
            System.out.println( x +" "+ y +" "+ z);
            x += 1;   //adding 1
            y++;      //postfix
            ++z;      //prefix
        }
        System.out.println("------");
    }

    private static void bitWiseAndOr() {
        int x = 7;
        int y = 17;
        int z = x&y;  //Just 0111 & 1 0001  so just 0 0001
        int i = x|y;  //0111 | 1 0001 -> 10111
        System.out.printf("7&17 base10 %4d : base2 %8s    7|17 base10 %4d : base2 %8s%n-------%n",
                z,Integer.toString(z,2),i,Integer.toString(i,2));
    }

    private static void dotheBinaryTwist(Integer x) {
        System.out.printf("Initial base10 %-5d  Now with toBinaryString %-8s  And Finally by radix %-8s%n"
                ,x,Integer.toBinaryString(x),Integer.toString(x,2));
        x = x >> 2;
        System.out.println("Now integer divide by 4 by using right shift operator , left zero fill");
        System.out.printf("Initial base10 %-5d  Now with toBinaryString %-8s  And Finally by radix %-8s%n-------%n"
                ,x,Integer.toBinaryString(x),Integer.toString(x,2));
    }

    private static void binarybyBitShift(Integer x) {
        System.out.printf("Initial base10 %-5d  Now with toBinaryString %-8s  And Finally by radix %-8s%n"
        ,x,Integer.toBinaryString(x),Integer.toString(x,2));
        x = x << 1;
        System.out.println("Now multiply by 2 by using left shift operator  , right zero fill ");
        System.out.printf("Initial base10 %-5d  Now with toBinaryString %-8s  And Finally by radix %-8s%n-------%n"
                ,x,Integer.toBinaryString(x),Integer.toString(x,2));
    }

}
//
//        1                     01
//        8                   1000
//        33                100001
//        78               1001110
//        787           1100010011
//        33,987  1000010011000011
//

//    Convert the following binary numbers to decimal notation.
//        0010                       4
//        1001                       9
//        0011 0100                 52
//        0111 0010                114
//        0010 0001 1111           543
//        0010 1100 0110 0111    11367


