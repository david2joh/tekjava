package com.perscholas.java_basics;

import java.util.Arrays;

import static java.lang.System.out;

public class MainArraysExercises {
    public static void main(String[] args) {

//        Write a program that creates an array of integers with a length of 3.
//        Assign the values 1, 2, and 3 to the indexes. Print out each array element.
    array3();
//    Write a program that returns the middle element in an array.
//    Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
        int[] myArr = {13, 5, 7, 68, 2};
        int mid = midArr(myArr);
        out.printf("Middle value = %d%n", mid);

//        Write a program that creates an array of String type and initializes it with the
//        strings “red”, “green”, “blue” and “yellow”. Print out the array length.
//        Make a copy using the clone( ) method.
//        Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
        strCopyandPrint();

//        Write a program that creates an integer array with 5 elements (i.e., numbers).
//        The numbers can be any integers.  Print out the value at the first index and the last index
//        using length - 1 as the index.
//        Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
//        Notice the type of exception which is produced.
//        Now try to assign a value to the array index 5.
//        You should get the same type of exception.
        outofBoundsArr();

//        Write a program where you create an integer array of 5 numbers.
//        Loop through the array and assign the value of the loop control variable
//        multiplied by 2 to the corresponding index in the array.
        index2valueArr();

//        Write a program where you create an array of 5 elements.
//        Loop through the array and print the value of each element,
//        except for the middle (index 2) element.
        arrLoopWithoutMiddle();

//        Write a program that creates a String array of 5 elements and swaps
//        the first element with the middle element without creating a new array.
        arrSwap();

//        Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
//        Print the array in ascending order, print the smallest and the largest element of the array. The output will look like the following:
//        Array in ascending order: 0, 1, 2, 4, 9, 13
//        The smallest number is 0
//        The biggest number is 13
        sortAndPrintArr();

//        Create an array that includes an integer, 3 strings, and 1 double. Print the array.
        createObjectArray();

//
//
    } //main

    private static void createObjectArray() {
        // OK lets see if anyone actually reads these exercises , because this is a really stupid way to do this
        Object[] myArr = new Object[5];
        myArr[0] = Integer.valueOf(5);
        myArr[1] = Double.valueOf(187.39);
        myArr[2]= "Hello ";
        myArr[3] = "Darkness ";
        myArr[4] = "my old friend";
        Arrays.stream(myArr).forEach(System.out::println);
        out.println("---------\n");
    }

    private static void sortAndPrintArr() {
        int[] myArr = {4, 2, 9, 13, 1, 0};
        Arrays.sort(myArr);
        System.out.printf("Array sorted in ascending order ");
        for (int i : myArr) { System.out.printf("%d ",i); }
        System.out.println("\nThe smallest number is " +  myArr[0]);
        System.out.println("The largest number is "+ myArr[myArr.length-1]);
        System.out.println("---------");
    }

    private static void arrSwap() {
        int[] myArr = {10,20,30,40,50 };
        int tmp = myArr[myArr.length/2];
        myArr[myArr.length/2] = myArr[0];
        myArr[0] = tmp;
        for (int i : myArr) { System.out.printf("%d ",i); }
        out.println("\n---------");
    }

    private static void arrLoopWithoutMiddle() {
        int[] myArr = {10,20,30,40,50 };
        int mid = myArr.length/2;
        for (int i = 0; i < myArr.length; i++) {
            if (i != mid) { out.print(myArr[i] + " "); }
        }
        out.println("\n---------");
    }

    private static void index2valueArr() {
        int[] myArr = new int[5];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i * 2;
        }
        for (int j : myArr){
            out.printf(" %d",j);
        }
        out.println("\n----------");
    }

    private static void outofBoundsArr() {
        int[] myArr = {10,20,30,40,50 };
        out.printf("First element vale = %d, Last element value = %d%n",myArr[0],myArr[myArr.length-1]);
        try {
            out.println(myArr[myArr.length]);
        } catch (Exception e ) {
            e.printStackTrace();
        }
        try {
            myArr[5] = 0;
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }

    private static void strCopyandPrint() {
        String[] myColours = {"red", "green", "blue", "yellow"};
        String[] cloneStr = myColours.clone();
        out.println(Arrays.toString(myColours));
        out.println(Arrays.toString(cloneStr));
        out.println("----------");


    }

    private static int midArr(int[] myArr) {
       return myArr[(myArr.length/2)]; // well if an array has an even number of elements go long !
    }

    private static void array3() {
        int len = 3;
        int myArr[]  = new int[len];
        for (int i = 0; i < len  ; i++) {
            myArr[i] = i+1;
        }
        Arrays.stream(myArr).forEach(out::println);
    }

} //terminal
