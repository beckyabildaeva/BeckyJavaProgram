package com.company.ClassProject1;

public class MaximumFrom2DArray {
    // Write a program to find maximum number from below array

// Array = {{44,35,26,81},{38,93,14,61},{12,47,64,20}};

// Output = 93


        public static void main(String[] args) {
            int data[][] = {{44,35,26,81},{38,93,14,61},{12,47,64,20}};

            System.out.println(returnMaxFromArray(data));
        }

        public static int returnMaxFromArray(int[][] arrayNums) {
            // Write code here
            int max = arrayNums[0][0];
            for(int i = 0 ; i<arrayNums.length; i++) {
                for (int j = 0; j < arrayNums[i].length; j++) {
                    if(arrayNums[i][j]>max){
                        max = arrayNums[i][j];
                    }
                }
            }
            return max;
        }
    }

