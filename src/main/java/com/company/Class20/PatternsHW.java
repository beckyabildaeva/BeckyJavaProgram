package com.company.Class20;
/* =============== Pattern 1 =======================
12345
12345
12345
12345
12345
=============== Pattern 2 =======================
1
12
123
1234
12345
=============== Pattern 3 =======================
5
54
543
5432
54321
=============== Pattern 4 =======================
1
33
555
7777
99999*/

public class PatternsHW {
    public static void main(String[] args) {
        myPattern1();
        myPattern2();
        myPattern3();
        myPattern4();
    }

    static void myPattern1(){
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("==============");
    }
    static void myPattern2(){
        for(int i = 1; i<=5; i=i+1){
            for(int j = 1; j<=i; j=j+1){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("==============");
    }
    static void myPattern3(){
        for(int i = 5; i>=1; i--){
            for(int j = 5; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("==============");
    }
    static void myPattern4(){
        for(int i = 1; i <= 9; i=i+2){
            for(int j = 1; j<=i; j=j+2){
                    System.out.print(i);
                }
            System.out.println();
            }
        }
    }
