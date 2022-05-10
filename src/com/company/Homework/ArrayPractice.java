package com.company.Homework;

public class ReverseGivenArray {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6};
        reverseArray(array);
    }

    private static void reverseArray(int [] array) {
        for(int i = array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
