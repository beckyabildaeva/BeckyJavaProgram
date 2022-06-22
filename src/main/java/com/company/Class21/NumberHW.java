package com.company.Class21;

//============== Homework =======================
//Write a program to find maximum digit from the given number (Example input - 4346345, Output - 6)
//Write a program to Count Number of Digit (Example input - 4345, Output - 4)
//Write a program to Reverse number (Example input - 4345, Output - 5434)
//Write a program to Check Given number is Palindrome or not (Example input - 23532, Output - Yes)
public class NumberHW {
    public static void main(String[] args) {
        System.out.println(maximumDigit(4346345));
        System.out.println(countDigits(4345));
        System.out.println(reverseNumber(4345));
        System.out.println(numberPalindrome(23532));
    }

    public static int maximumDigit(int num) {
        int max = Integer.MIN_VALUE;
        int lastN = 0;
        while (num != 0) {
            lastN = num%10; // last digit
            if(lastN>max){
                max=lastN;
            }
            num=num/10; // drop the last digit
        }
        return max;
    }

    public static int countDigits(int num1) {
        int count = 0;
        while (num1 > 0) {
            num1 = num1 / 10;
            count++;
        }
        return count;
    }

    public static int reverseNumber(int num2) {
        int rev = 0;
        int lastDigit = 0;
        while (num2 != 0) {
            lastDigit = num2 % 10;
            if(rev>=Integer.MAX_VALUE/10){
                System.out.println("The number is out of bound");
                return 0;
            }
            // to print last digit first, then times 10 to create extra place value and add another digit
            rev = (rev * 10) + lastDigit;
            num2 = num2 / 10; // to drop the last digit
        }
        return rev;
    }
    public static boolean numberPalindrome(int n) {
        return n == reverseNumber(n);
    }
}
