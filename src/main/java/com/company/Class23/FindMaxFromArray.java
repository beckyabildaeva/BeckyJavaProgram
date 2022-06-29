package com.company.Class23;

public class FindMaxFromArray {
    public static void main(String[] args) {
        int data[] = {35, 33, 75, 43, 23, 67};
        int max = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i]>max) {
                max = data[i];
            }
        }
        System.out.println(max);
    }
}
