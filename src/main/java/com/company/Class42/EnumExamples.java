package com.company.Class42;

import java.util.*;

public class EnumExamples {
    public static void main(String[] args) {
        System.out.println("Opening banking input");
        Map<String, String> dataOnInputPage = new HashMap<>();
        System.out.println("Click on transfer button");
        System.out.println("Validate review page is displayed");

        String reviewPageFromAcc = "123";
        String reviewPageToAcc = "456";
        String reviewPageAmount = "200";

        System.out.println(reviewPageFromAcc.equals(dataOnInputPage.get("From Account ")));
        System.out.println(reviewPageToAcc.equals(dataOnInputPage.get("To Account ")));
        System.out.println(reviewPageAmount.equals(dataOnInputPage.get("From Account ")));
    }

    public static Map<String, String> enterDetailsOnInputPage(){
        Map<String, String> dataOnInputPage = new HashMap<>();

        String fromAcc = "123";
        dataOnInputPage.put(Constants.FROM_ACCOUNT.toString(), fromAcc);

        System.out.println("Enter From Account " + fromAcc);
        String toAcc = "456";
        dataOnInputPage.put(Constants.TO_ACCOUNT.toString(), toAcc);

        String amount = "200";
        System.out.println("Enter Amount " + amount);
        dataOnInputPage.put(Constants.AMOUNT.toString(), amount);

        return dataOnInputPage;
    }
}
