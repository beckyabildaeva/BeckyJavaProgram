package com.company.Class24;
//Input
//1 2 3
//4 5 6
//7 8 9
//Output
//1 4 7
//2 5 8
//3 6 9
// System.out.println(i+""+j+" "); // to print position of each row and columns
public class FindMaxInMatrixRows {
    public static void main(String[] args) {
        int data[][] = {{100, 13, 3}, {-24, -51, -36}, {70, 28, 59}};

        for(int i = 0; i<data.length; i++){
            // initialize first number from each row as max
            int max = data[i][0]; // visualize rows 0, 1, 2, and columns 0, 1, 2, etc.

            // in this for loop check if we have any number
            // which is greater than our max number
            for(int j = 0; j<data[i].length; j++){
                if(data[i][j]>max){ // will compare num from each row with max
                    max = data[i][j];
                }
            }
            System.out.println(max);
            }
    }
}
