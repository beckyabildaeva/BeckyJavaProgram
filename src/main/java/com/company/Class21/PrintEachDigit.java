package com.company.Class21;
// write a program to print each digit fo number into each line
// find sum of each digit
public class PrintEachDigit {
    public static void main(String[] args) {
        int num = 25343;
        // output
        // 3
        // 4
        // 3
        // 5
        // 2

            while (num > 0) {
            System.out.println(num%10);
            num=num/10;
        }
    }
}
