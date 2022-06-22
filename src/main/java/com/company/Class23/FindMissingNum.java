package com.company.Class23;

// write a program to find missing number from an array
public class FindMissingNum {
    public static void main(String[] args) {

        int sum_j = 0;
        int sum_i = 0;
        int missingNum = sum_j - sum_i;
        int data[] = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        for (int j = 1; j <= 10; j++) {
            sum_j = sum_j + j;
        }
        for (int i = 0; i < data.length; i++) {
            sum_i = sum_i + data[i];
        }
        System.out.println(sum_j-sum_i);
    }
}


