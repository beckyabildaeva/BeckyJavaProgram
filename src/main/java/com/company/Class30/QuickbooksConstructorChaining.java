package com.company.Class30;

// Parent - Super - Base Class
class QuickbooksBasic1 {
    //parameterized constructor of current parent class
    QuickbooksBasic1(int wages) {
        System.out.println("Social Security Tax: " + (wages*0.062));
        System.out.println("Medicare Tax: " + (wages*0.0145));
    }
}
// Child - Sub - Derived Class
class QuickbooksEssentials1 extends QuickbooksBasic1 {
    //parameterized constructor of current child class
    QuickbooksEssentials1(int wages) {
        super(wages);
        System.out.println("FICA Tax: " + (wages*0.153));
    }
}
// Multilevel Inheritance
class QuickbooksPremium1 extends QuickbooksEssentials1 {
    //parameterized constructor of current child class
    QuickbooksPremium1(int wages) {
        super(wages);
        System.out.println("FUTA Tax: " + (wages*0.06));
    }
}
public class QuickbooksConstructorChaining {
    public static void main(String[] args) {
        QuickbooksPremium1 qb = new QuickbooksPremium1(6000);
    }
}


