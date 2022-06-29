package com.company.Class35;

class Bank{
    public void displayRateOfInterest(){
        System.out.println("6.0%");
    }
}
class ChaseBank extends Bank{
    public void displayRateOfInterest(){
        System.out.println("7.0%");
    }
}
class CitiBank extends Bank{
    public void displayRateOfInterest(){
        System.out.println("0.06%");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.displayRateOfInterest();
    }
}
