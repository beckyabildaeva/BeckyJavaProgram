package com.company.Class38;

import java.io.IOException;

// Create a class with 4 methods (Bank with methods withdraw(amount), deposit(amount), transferMoney(amount), payBills(amount))
// From transferMoney() call withdraw() method, and also payBills() call withdraw() method.
// Implement withdraw() method with check if amount is less than balance then it’ll throw IOException -> Insufficient Balance.
public class Bank {
    static int balance;
    public static void main(String[] args) throws IOException {
        Bank.balance = 3000;
        transferMoney(5000);
        payBills(4000);
    }

    public static void withdraw(int amount) throws IOException {
        if (amount > balance) {
            throw new IOException("Insufficient Balance");
        } else {
            balance -= amount;
        }
    }
    public void deposit(int amount) {

    }
    public static void transferMoney(int amount) throws IOException {
        withdraw(amount);
        System.out.println(amount + " was transferred from your account");

    }
    public static void payBills(int amount) throws IOException {
        withdraw(amount);
        System.out.println(amount + " was used to pay the bill");
    }
}

