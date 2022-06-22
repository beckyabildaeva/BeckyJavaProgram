package com.company.Homework;

import java.util.Scanner;
// user input weekday
// output: weekday or weekend
public class SwitchCaseAlice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter day of the week: ");
        String weekday = sc.nextLine();

        switch(weekday){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println(weekday+" is weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println(weekday+" is weekend");
                break;
        }
    }
}
