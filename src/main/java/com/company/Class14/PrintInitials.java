package com.company.Class14;

import java.util.Scanner;

// Take full name from user and print initials of it
public class PrintInitials {
    public static void main(String[] args) {
        System.out.println("Enter you first, middle and last names");
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine(); // C.B.K.

        String[] parts = fullName.split(" ");

        String firstName = parts [0];
        String middleName = parts[1];
        String lastName = parts[2];

        System.out.println(firstName.charAt(0)+"."
            + middleName.charAt(0) + "."
            + lastName.charAt(0) + ".");
        }
    }

