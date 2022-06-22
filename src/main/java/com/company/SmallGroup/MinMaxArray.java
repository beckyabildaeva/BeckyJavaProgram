package com.company.SmallGroup;

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] myArray = new int[5];
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Enter " + (i+1) + " number");
            myArray[i] = sc.nextInt();
        }
        System.out.println("Max: " + maxArray(myArray));
        System.out.println("Min: " + minArray(myArray));

    }
    public static int maxArray(int[] myArray){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<myArray.length; i++){
            if(myArray[i]>max){
                max = myArray[i];
            }
        }
        return max;
    }
    public static int minArray(int[] myArray){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<myArray.length; i++){
            if(myArray[i]<min){
                min = myArray[i];
            }
        }
        return min;
    }


}
