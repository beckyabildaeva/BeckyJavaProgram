package com.company.Class21;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12321;
        int rev = 0;
        //because our num will be zero at the end
        int backUpOfOriginal = num; // create the backup to save the original num

        while(num>0){
            int lastDigit = num%10; // to get the last digit
            rev = rev*10+ lastDigit; // add last digit to the new rev number (times 10 to create extra place value)
            num = num/10; // drop the last digit
        }
        if(backUpOfOriginal==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
