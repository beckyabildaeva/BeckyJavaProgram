package com.company.Class23;
// Write a program to find second maximum from an array
public class FindSecondMaxFromArray {
    public static void main(String[] args) {

        int data[] = {35, 33, 75, 43, 23, 67};
        int max = data[0];
        int secondMax = data[0];

        for (int i = 0; i < data.length; i++){
            if(data[i]>=max){
                max = data[i];
            } else if(data[i]>secondMax){
                secondMax = data[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
