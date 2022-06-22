package com.company.ClassProject1;

import java.util.Arrays;

public class FindSumArrayTarget {
    public static void main(String[] args) {
        int[] numbers = {12, 23, 2, 3, 7, 5};
        int target = 9;
        int[] result1 = findIndexOfNumsTarget(numbers, target);
        System.out.println(Arrays.toString(result1));

    }

    static int[] findIndexOfNumsTarget(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) { // to check from index 0 to index 5 (up to 7)
            for (int j = i + 1; j < numbers.length; j++) {  // to get the next index after i, ex: 12 + 23, then 23+2, etc.
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}


