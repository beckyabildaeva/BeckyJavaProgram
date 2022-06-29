package com.company.Class30;

// Parent - Super - Base Class
public class QuickbooksBasic {
    public void SocialSecurityTax(int wages, float rate) {
        System.out.println("Social Security Tax: " + (wages*rate));
    }
    public void MedicareTax(int wages, float rate) {
        System.out.println("Medicare Tax: " + (wages*rate));
    }
}
// Child - Sub - Derived Class
class QuickbooksEssentials extends QuickbooksBasic {
    public void FICAEmployerTax(int wages, float rate) {
        System.out.println("FICA Tax: " + (wages*rate));
    }
    public void SalesTax(int sales, float rate) {
        System.out.println("Sales Tax: " + sales*rate);
    }
}
// Multilevel Inheritance
class QuickbooksPremium extends QuickbooksEssentials {
    public void FUTA_Tax(int wages, float rate) {
        System.out.println("FUTA Tax: " + (wages*rate));
    }
}