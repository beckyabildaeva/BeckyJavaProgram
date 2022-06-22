package com.company.Class27;

public class Bank {

        int balance;
        String accNum;
        String accName;

    void deposit(int amount){
        System.out.println("deposited "+amount+" into Hosna's acct");
        balance = balance + amount;
    }

    void withdraw(int amount){
        System.out.println("withdrew "+amount+" from Hosna's acct");
        balance = balance - amount;
    }

    void displayBalance(){
        System.out.println(accName+" 's balance= "+balance);
    }

    int changeMyVar(int num){
        return 50;
    }


}
