package com.company.Class23;

import java.util.Scanner;

/*============= Homework ==============
Write a program to find sum Of Array Elements (Example input - 5, 2, 3, 6, 1    Output - 17)
Write a program to Calculate the Average of Array Elements (Example input - 5, 6, 4, 3, 2    Output - 4.0)
Write a program to Find index of a given number (Example input - 5, 6, 4, 3, 2 and number = 4    Output - 2(index of 4))
Write a program of Find maximum number from an array (Example input - 5, 6, 4, 3, 2    Output - 6) (edited)
*/
public class ArraysHWEnhanceForLoop {
    public static void main(String[] args) {
        int[] data = {5, 2, 3, 6, 1};
        System.out.println(sumOfArrayElements(data));
        System.out.println(averageOfArrayElements(data));
        System.out.println(maximumNumFromAnArray(data));
        indexOfaGivenNumber(data);
        System.out.println(getIndexOfNum(data, 6));
    }

    private static int sumOfArrayElements(int[] data) {
        int sum = 0;
        for (int num : data) {
            sum = sum + num;
        }
        return sum;
    }

    private static double averageOfArrayElements(int[] data) {
        int sum1 = 0;
        int average = 0;
        for (int num : data) {
            sum1 = sum1 + num;
            average = sum1 / (data.length - 1);
        }
        return average;
    }

    private static int maximumNumFromAnArray(int[] data) {
        int max = 0;
        for (int num : data) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    private static void indexOfaGivenNumber(int[] data) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num from given array:{5,2,3,6,1}");
        int num = sc.nextInt();
        int index = 0;
        for (int m = 0; m < data.length; m++) {
            if (data[m] == num) {
                index = m;
            }
        }
        System.out.println(index);
    }
    static int getIndexOfNum(int data[], int num){
        for(int i=0; i<data.length; i++){
            if(data[i]==num){
                return i;
            }
        }
        return -1;
    }

}


