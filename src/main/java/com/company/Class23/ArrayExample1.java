package com.company.Class23;

public class ArrayExample1 {
    public static void main(String[] args) {
        // Declaration of simple int
        int num;

        // Declaration of array
        int listOfNum[];

        // Initialization of array
        listOfNum = new int[5];

        // Store data into array
        listOfNum[0] = 20;
        listOfNum[1] = 50;
        listOfNum[2] = 100;
        listOfNum[3] = 40;
        listOfNum[4] = 60;

        // Declaration and initialization
        int data[] = {23, 42, 56, 76, 52, 12};

        // print array using loop
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        // Find Length of array
        System.out.println("Length of array is "+listOfNum.length);
        System.out.println(listOfNum[4]);

        // there are 2 types of error: compiler error (the code will not run) and runtime error (the code runs but gives out of bound result)
    }
}
