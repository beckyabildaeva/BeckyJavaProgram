package com.company.Class24;
//Input
//1 2 3
//4 5 6
//7 8 9
//Output
//1 4 7
//2 5 8
//3 6 9
public class FindTransposeOfMatrix {
    public static void main(String[] args) {
        int data[][] = {{4, 13, 3}, {24, 51, 36}, {70, 28, 59}};
        int max = 0;
        for(int i = 0; i<data.length; i++){
            for(int j = 0; j<data.length; j++){
                if(data[i][j]>max){
                    max = data[i][j];
                }
            }
            System.out.println(max);
            }
    }
}
