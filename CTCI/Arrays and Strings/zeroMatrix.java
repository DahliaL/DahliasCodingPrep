package com.company;

import java.util.Scanner;

public class zeroMatrix {
    public static void zeroify(int[][] arr, int r, int c) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i == r)
                    arr[i][j] = 0;
                if(j == c)
                    arr[i][j] = 0;
            }
        }
    }


    public static void main(String[] args) throws Exception {
        /*
        Zero Matrix: Write an algorithm such that if an element
        in an MxN matrix is 0, its entire row and column are set to 0.
        * */

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        int[][] matrixCopy = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                matrix[i][j] = temp;
                matrixCopy[i][j] = temp;
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0 )
                    zeroify(matrixCopy, i, j);
            }
        }

        for(int i=0; i <n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print(matrixCopy[i][j] + " ");
            }
            System.out.println("\n");
        }

    }
}
