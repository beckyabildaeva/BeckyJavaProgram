package com.company.Class30;

public class QuickbooksInheritance {
    public static void main(String[] args) {
        QuickbooksBasic qbBasic = new QuickbooksBasic();
        qbBasic.SocialSecurityTax(5365, 0.062f);
        qbBasic.MedicareTax(5365, 0.0145f);
        System.out.println();

        QuickbooksEssentials qbEssentials = new QuickbooksEssentials();
        qbEssentials.SocialSecurityTax(5365, 0.062f);
        qbEssentials.MedicareTax(5365, 0.0145f);
        qbEssentials.FICAEmployerTax(25675, 0.153f);
        qbEssentials.SalesTax(45342, 0.0625f);
        System.out.println();

        QuickbooksPremium qbPremium = new QuickbooksPremium();
        qbPremium.SocialSecurityTax(5365, 0.062f);
        qbPremium.MedicareTax(5365, 0.0145f);
        qbPremium.FICAEmployerTax(25675, 0.0153f);
        qbPremium.SalesTax(45342, 0.0625f);
        qbPremium.FUTA_Tax(25675, 0.06f);
    }
}
