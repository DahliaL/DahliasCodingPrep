package com.company;

import java.util.Scanner;

public class rotateMatrix {
    public static void transpose(int[][] arr) {

        for(int i=0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                // store temp value
                int temp1 = arr[i][j];
                // switch the row and column indices
                arr[i][j] = arr[j][i];
                arr[j][i] = temp1;
            }
        }
    }

    public static void reverseRows(int[][] arr) {

        for(int i=0; i < arr.length; i++) {
            for(int j = 0; j < arr.length/2; j++) {
                // opposite index of i
                int oppI = arr.length-1-j;
                // storing temp value
                int temp1 = arr[i][j];
                arr[i][j] = arr[i][oppI];
                arr[i][oppI] = temp1;
            }
        }
    }

    public static void main(String[] args) throws Exception {
    /*
    Rotate Matrix: Given an image represented by an NxN matrix,
    where each pixel in the image is 4 bytes, write a method to
    rotate the image by 90 degrees. Can you do this in place?
    * */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for(int i=0; i <n; i++) {
            for(int j = 0; j<n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        transpose(matrix);
        reverseRows(matrix);

        for(int i=0; i <n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }

    }
}
