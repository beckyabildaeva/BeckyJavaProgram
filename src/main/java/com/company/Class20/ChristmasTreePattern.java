package com.company.Class20;

import java.util.Arrays;

public class ChristmasTreePattern {

        public static void main(String[] args) {
            String a = "Hello my name is Vladimir";
            String[] arr = a.split(" ");

        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) != 'l'){
                    System.out.println(arr[i].charAt(j));
                }
            }
            System.out.println();
        }*/

            int count = 0;

                for (int i = 1; i <= 5; i++) {
                    if (count % 2 == 0) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(i);
                        }
                    } else {
                        for (int j = 5; j >= i; j--) {
                            System.out.print(i);
                        }
                    }
                    System.out.println();
                    if (i == 5) {
                        i = 0;
                        count++;
                        if(count == 10){
                            break;
                        }
                    }
                }
            }
        }


