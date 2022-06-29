package com.company.SmallGroup;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 numbers to find the max and min from an array");
        int [] arr = {sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        System.out.println(maxInArray(arr));
        System.out.println(minInArray(arr));
    }

    private static int maxInArray(int[] arr){
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    private static int minInArray(int[] arr) {
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr [i];
            }
        }
        return min;
    }

}

