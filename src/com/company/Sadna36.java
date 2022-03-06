package com.company;

import java.util.Scanner;

public class Sadna36 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
       /* System.out.println("enter size");
        int size = s.nextInt();
        double[] grades = new double[size];    // [0.0, 0.0 , 0.0 , 0.0 , 0.0]
        */
        double[] numbers = {2.3, 6.7, 6, 4.8}; //short way to declare an array

        printMyArray(numbers);
    }


    public static double biggestValue(double[] arr){
        double big = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(big < arr[i])
                big = arr[i];
        }
        return big;

    }



    public static void printMyArray(double[] jumps) {

        for (int i = 0; i < jumps.length; i++) {
            System.out.print(jumps[i] + " ");
        }
        System.out.println();

    }


    public static double avgGrades(double[] grades) {
        return 0;
    }


    public static void q2(int[] array) {
        //todo

    }


    /**
     * @param n - size of wanted array
     * @return - array filled with random values (range: -20 -> 20)
     */
    public static int[] fillArry(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * (20 - (-20) + 1))) + (-20);
        }
        return arr;
    }
}
