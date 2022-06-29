package com.company.Abstraction1;

public class Person {
    String name;
    int age;
    char gender;
    Bank bankAcc;

    Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setBank(Bank bankAcc) { this.bankAcc = bankAcc; }

    public Bank getBankAcc(){ return bankAcc; }
}
