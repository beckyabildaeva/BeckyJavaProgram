package com.company.Class18;

import java.util.Scanner;

public class VladExample {
    public static void main(String[] args) {
        VladExample name = new VladExample();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to check if palindrome");
        int n = sc.nextInt();

        System.out.println(name.isPalindrome(n));
    }

    public static int reverse(int n) {
        int rev = 0;
        int remainder = 0;
        while (n != 0) {
            remainder = n % 10; // gives me last digit
            rev = (rev * 10) + remainder; // last digit becomes 1st
            n = n / 10; // drops the last digit
        }
        return rev;
    }
    public boolean isPalindrome(int n) {
        return reverse(n) == n;
    }


}
