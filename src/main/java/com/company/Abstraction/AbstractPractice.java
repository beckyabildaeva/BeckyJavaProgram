package com.company.Abstraction;
// Make an abstract bank class with abstract methods for transfer funds check balance and pay
//Have 2 or more separate classes extend that Bank class
//Make variables for account number and account balance
//That you can do in the abstract class
//Child class can access
//Inside the child class override the transfer method.
//Transfer method will have these params
//Abstract void transferTo(int accNum, int transfer_Amount, Bank bank)
//Add the bank's routing number as a final string to child classes
//Optional: make a credit method -> borrow from bank and then pay back later with interest

abstract class Bank {
    int accNum;
    int accBalance;

    public abstract void transferFunds(int accNum, int transfer_Amount, Bank bank); // Bank bank will take any class that extends bank

    public abstract void checkBalance();

    public abstract void pay(int payment_Amount, int accNum);
}

class WellsFargo extends Bank {
    final long routingNum = 123111005;
    private String bank;

    public void transferFunds(int transfer_Amount, int accNum, Bank bank) {
        System.out.println("Transferred: " + transfer_Amount + " from WF Account # " + accNum + " to " + bank);
    }

    public void checkBalance() {
        System.out.println("Account Number " + accNum + "has a balance of: " + accBalance);
    }

    public void pay(int payment_Amount, int accNum) {
        System.out.println("Paid " + payment_Amount + " from PNC Account # " + accNum);
    }
}

class PNC extends Bank {
    private String bank;

    public void transferFunds(int transfer_Amount, int accNum, Bank bank) {
        System.out.println("Transferred: " + transfer_Amount + " from PNC Account # " + accNum + " from " + bank);
    }

    public void checkBalance() {
        System.out.println("Account Number " + accNum + "has a balance of: " + accBalance);
    }

    public void pay(int payment_Amount, int accNum) {
        System.out.println("Paid " + payment_Amount + " from WF Account # " + accNum);
    }
}

public class AbstractPractice {
    public static void main(String[] args) {
        PNC pnc = new PNC();
        WellsFargo wellsFargo = new WellsFargo();

        pnc.transferFunds(20000, 111222333, pnc);
        wellsFargo.transferFunds(5000, 100200300, wellsFargo);
        wellsFargo.pay(1000, 123123123);
    }
}
