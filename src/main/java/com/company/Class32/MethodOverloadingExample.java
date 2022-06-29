package com.company.Class32;

class FlightBooking {
    public void bookTicket() {
        System.out.println("Booking with your username ");
    }

    public void bookTicket(String name) {
        System.out.println("Booking with your name " + name);
    }

    public void bookTicket(int seatNum, String name) {
        System.out.println("Booking with your seat & name " + seatNum + " " + name);
    }

    public void bookTicket(String name, int price) {
        System.out.println("Booking with your name & price " + name + price);
    }

    public void bookTicket(int price) {
        System.out.println("Booking with your ticket price " + " $" + price);
    }
}


public class MethodOverloadingExample {
    public static void main(String[] args) {
        FlightBooking flightBooking = new FlightBooking();
        flightBooking.bookTicket();
        flightBooking.bookTicket("Becky");
        flightBooking.bookTicket(15, "Guzal");
        flightBooking.bookTicket("Ayida", 16);
        flightBooking.bookTicket(750);
    }
}