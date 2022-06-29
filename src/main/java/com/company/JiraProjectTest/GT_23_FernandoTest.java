package com.company.JiraProjectTest;

import java.util.Arrays;

import static com.company.JiraProject.GT_23_Fernando.*;

public class GT_23_FernandoTest {
    public static void main(String[] args) {

        System.out.println("Given an array of ints of even length, " +
                "\nreturn a new array length 2 containing the middle two elements from the original array. " +
                "\nThe original array will be length 2 or more.");
        System.out.println();
        System.out.println(Arrays.toString(getMakeMiddle()));
        System.out.println();
        System.out.println(Arrays.toString(getMakeMiddle2()));
        System.out.println();
        System.out.println(Arrays.toString(getMakeMiddle3()));
    }
}
