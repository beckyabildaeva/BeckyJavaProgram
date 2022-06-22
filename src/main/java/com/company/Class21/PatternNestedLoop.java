package com.company.Class21;
//      1
//     12
//    123
//   1234
//  12345
public class PatternNestedLoop {
    public static void main(String[] args) {
        // number of rows
        for(int i=1; i<=5; i++){
            // number of spaces
            for(int s=1; s<=5-i; s++){
                System.out.print(" ");
            }
            // number of digits
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
