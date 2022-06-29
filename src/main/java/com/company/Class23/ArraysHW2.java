package com.company.Class23;

/*======  Homework ==========
Find sum of Individual row in 2D array
Example input:
3 4 6
7 6 4
9 9 2
Output :
Sum of  row1 = 13
Sum of  row2 = 17
Sum of row3 = 20
   */
public class ArraysHW2 {
    public static void main(String[] args) {
        int[][] nums = {{3, 4, 6}, {7, 6, 4}, {9, 9, 2}};
        sumOfNums(nums);
        transposeMatrix(nums);
    }
    static void sumOfNums(int[][] nums){
        for (int i = 0; i < nums.length; i++) { //to print rows
            int sumRow = 0;
            for (int j = 0; j < nums[i].length; j++) { //to print contents of each row
                sumRow = sumRow + nums[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " is " + sumRow);
        }
    }
    static void transposeMatrix(int[][] nums) {
        System.out.println();
        System.out.println("Transpose Matrix: ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[j][i]);
            }
            System.out.println();
        }
    }
}



/*2.  Find the Transpose of Matrix (interchanging its rows into columns or columns into rows)
Example Input
1 2 3
4 5 6
7 8 9
Output
1 4 7
2 5 8
3 6 9 (edited)*/
