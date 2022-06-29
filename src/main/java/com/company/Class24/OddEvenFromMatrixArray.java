package com.company.Class24;

public class OddEvenFromMatrixArray {
    public static void main(String[] args) {
        int data[][] = {{34, 6, 7, 23, 8, 90, 35, 76},
                {53,23,65,12,5,2,5,7},
                {34,6,2,33,7,3,2,6}};


        for (int i = 0; i<data.length; i++) {
            // to clear the value of countEven and countOdd for every run in the loop
            int countEven = 0;
            int countOdd = 0;

            for (int j = 0; j < data.length; j++) {
                if (data[i][j] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
            // print Row-wise
            System.out.println("========Row "+i+"==========");
            System.out.println("Even Count is: " + countEven);
            System.out.println("Odd Count is: " + countOdd);
        }
    }
}
