package com.company.PracticeInterview;
// password must consist of 6 digits
// must not contain your date of birth
// no 3 consecutive digits
// same number is not repeated three or more times

import java.util.Scanner;

public class PasswordFormat {
    public static void main(String[] args) {
        passwordFormat();
    }

    private static void passwordFormat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DOB: ");
        String dateOfBirth = sc.nextLine();
        System.out.println("Enter new password: ");
        String password = sc.nextLine();

        if(password.length()<6){
            System.out.println("Please enter at least 6 characters");
        }
        if(password.equals(dateOfBirth)){
            System.out.println("Please do not include your date of birth");
        }
        for(int i = 0; i < password.length(); i++){
            for(int j = 0; j <= 9; j++){
            }
        }
    }
}
