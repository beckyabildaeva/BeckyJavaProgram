package com.company.Class20;

public class NestedLoop2 {
    public static void main(String[] args) {
        for(int i = 5; i>=1; i--){
            int k = 9;

            for(int j = 1; j<=i; j++){
                System.out.print(k);
                k--;
            }
            System.out.println();
        }

        for(int i = 5; i>=1; i=i-1){

            for(int j = 1; j<=i; j=j+1){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= 5; i=i+1){
            int k = 5;
            for(int j =1; j<=6-j; j=j+1){ // initialize, condition/limit, increase/decrease value, plug in the value
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

}
