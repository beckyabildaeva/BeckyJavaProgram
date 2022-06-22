package com.company.Class27;

public class PhoneTester {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.memory = 128.12;
        p.color = "white";
        p.model = "Apple Iphone 6";
        p.isTouchScreen = true;

        System.out.println(p.memory);
        System.out.println(p.camera);
        System.out.println(p.color);
        System.out.println(p.isTouchScreen);
        System.out.println(p.typeOfChargingPort);
        System.out.println(p.model);
        System.out.println(p.os);

        p.call("12345");
        p.takePictures();
    }
}
