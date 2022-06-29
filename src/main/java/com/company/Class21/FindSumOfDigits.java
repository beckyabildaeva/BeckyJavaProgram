package com.company.Class21;

// find sum of each digit
// 2+5+3+4+3 = 17
public class FindSumOfDigits {
    public static void main(String[] args) {
        int num = 25343;
        int sum = 0;

        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
