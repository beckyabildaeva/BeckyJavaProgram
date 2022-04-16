package com.company.Class10;
// looping is used for repetition, like a cycle
// the difference between if and while, is that if prints 1 statement if true, loop prints multiple statements until it's false
// write a program to print Hello 5 times
// write a program to print number from 1 to 50
// if sout is after the {while} then it prints 1 value
// if sout is inside the {while} then it will print multiple

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        while(i<=20) {
            if(i%3==0){
                System.out.println(i);
            }
            i++;
        }

    }
}
