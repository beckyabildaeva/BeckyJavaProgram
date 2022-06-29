package com.company.JiraProject;

import java.util.Scanner;

public class CodingBatCountYZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str = sc.nextLine().toLowerCase() + " ";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z')
                    && (!Character.isLetter(str.charAt(i + 1))))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
