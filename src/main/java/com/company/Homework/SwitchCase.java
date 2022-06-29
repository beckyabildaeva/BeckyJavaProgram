package com.company.Homework;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter month: ");
        String month = sc.nextLine();

        switch(month){
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println(month+" - 31 days");
                break;
            case "February":
                System.out.println(month+" - 28 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println(month+" - 30 days");
                break;
            default:
                System.out.println("Invalid Input");
        }

    }
}
