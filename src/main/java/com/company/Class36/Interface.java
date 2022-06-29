package com.company.Class36;

interface Bank{
    // all variables in interface by default are public, static, final
    int ROUTING_NUMBER = 454324;

    // all methods in interface by default are public and static
    void deposit(int amount);
    void withdraw(int amount);

    }

    interface PSUBank extends Bank{

    void createOffers();
    void additionalSecurity();
    }

    class ChaseBank implements PSUBank{

        @Override
        public void deposit(int amount) {

        }

        @Override
        public void withdraw(int amount) {

        }

        @Override
        public void createOffers() {

        }

        @Override
        public void additionalSecurity() {

        }
    }


public class Interface {

}
