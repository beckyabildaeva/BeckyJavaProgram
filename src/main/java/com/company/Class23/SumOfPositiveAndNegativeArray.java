package com.company.Class23;

// write a program to print sum of positive
// and negative number from an array
public class SumOfPositiveAndNegativeArray {
    public static void main(String[] args) {
        int data[] = {5, 8, 2, -4, -13, 3, -7, 12};
        int sumP = 0;
        int sumN = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                sumP = sumP + data[i];
            }else{
                sumN = sumN + data[i];
            }
        }
        System.out.println(sumP);
        System.out.println(sumN);
    }
}
