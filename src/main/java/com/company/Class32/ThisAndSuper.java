package com.company.Class32;

class Parent {
    Parent() {
        this(50);
        System.out.println("1"); // 2) print out 1, go down to line 16
    }
    Parent(int num) {
        System.out.println(num);
    }  // 1) print out 50, go back up to line 6
}

class Child extends Parent {
    Child() {
        super(); // go Parent()
        System.out.println("2"); // 3) print out 2, go down to line
    }
    Child(int num) { // start here
        this(); // go to Child() line 14
        System.out.println(num); // 4) print out 6 (passed num 6 from line 26)
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Child c = new Child(6);
    }
}