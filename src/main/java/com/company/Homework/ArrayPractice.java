package com.company.Homework;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6};

        System.out.println(sumOfArray(array));
        reverseArray(array);
        findMaxOfArray(array);
    }

    private static int sumOfArray(int[] array) {
        int l = array.length;
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.print("Sum: ");
        return sum;
    }

    private static void reverseArray(int [] array) {
        System.out.print("Reverse: ");
        for(int i = array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void findMaxOfArray(int[] array) {
        int maxSoFar = 0;
        for(int i = 0; i<array.length; i++){
            maxSoFar = array[i];
        }
        System.out.println("Max: " + maxSoFar);
    }

}
