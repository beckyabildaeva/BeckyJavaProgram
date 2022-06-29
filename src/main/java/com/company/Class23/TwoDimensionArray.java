package com.company.Class23;

public class TwoDimensionArray {
    public static void main(String[] args) {
        // Declaration and initialization of array
        int data[][]= new int[3][3];

        //Declaration and initialization of array
        int nums[][]={{1,2,3},{5,4,2},{5,7,1},{4,2,1}};

        //Find number of rows
        System.out.println(nums.length); // 4

        //Find number/count of data/numbers in each row
        System.out.println(nums[0].length); //row 0 has 3 numbers

        //Print all data using ForLoop
        for(int j = 0; j < nums.length; j++) { // number of rows!
            for (int i = 0; i < nums[0].length; i++) { // print contents of each row
                System.out.print(nums[j][i] + " ");
            }
            System.out.println();
        }

        //print all data using enhanced for loop
        for(int[] rows: nums){
            for(int d:rows){
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}
