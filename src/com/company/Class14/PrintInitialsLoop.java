package com.company.Class14;

import java.util.Scanner;

public class PrintInitialsLoop {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your full name:");
            String fullName = sc.nextLine();

            String [] parts = fullName.split(" "); // splits names

            for (int i = 0; i < parts.length; i++) {
                System.out.println(parts[i].charAt(0) + "."); // prints first initial of each name
                // How do I print initials on ONE line instead of separate lines?
            }
        }
    }
