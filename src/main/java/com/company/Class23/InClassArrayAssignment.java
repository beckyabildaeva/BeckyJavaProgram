package com.company.Class23;

import java.util.Scanner;

// create array of 5 integers and print all numbers from array
public class InClassArrayAssignment {
    public static void main(String[] args) {
        // By default, array elements are initialized with zero

       int data[] = {10, 20, 30, 40, 50, 60};

        // print array using loop
        for (int i = 0; i < data.length; i++) {
            System.out.println("data["+i+"]="+data[i]);
        }

        int data1[] = new int[5];
        System.out.println(data1[0]);
    }
}
