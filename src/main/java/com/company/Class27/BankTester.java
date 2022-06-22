package com.company.Class27;

public class BankTester {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        b1.balance = 1000;
        b1.accName = "Hosna";
        b1.accNum = "2492";

        b1.deposit(2000);
        b1.withdraw(300);
        b1.displayBalance();

        b2.deposit(1000);
        b2.withdraw(500);
        b2.displayBalance();

        int a = 10;
        a = b1.changeMyVar(a);
        System.out.println(a);

    }
}
