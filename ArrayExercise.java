package com.example.kuldeep;

import java.util.Scanner;

class MatrixMultiplication{
    int[][] matrix1, matrix2;
    int[][] C = new int[3][3];
    MatrixMultiplication(int[][] matrix1, int[][] matrix2){
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] = C[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int[] v : C) {
            for (int i : v) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
class SubArray{
    int[] array;
    SubArray(int[] array){
        this.array = array;
        System.out.println("Printing SubArray");
        for(int i=0; i< array.length; i++){
            if(i>4 && i<9){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }
}
class PatternOperations{
    int n;
    PatternOperations(int n) {
        this.n = n;
        if (n != 1 && n % 2 != 0) {
            System.out.println("Printing Matrix");
            for (int i = 1; i <= n; i++) {
                int m = i;
                for (int j = 1; j <= n; j++) {
                    System.out.print(m + " ");
                    m += n;
                }
                System.out.println();
            }
            System.out.println("Printing First Row");
            for (int i = 1; i <= n;i++) {
                int m = i;
                if(i==1){
                    for (int j = 1; j <= n; j++) {
                        System.out.print(m + " ");
                        m += n;
                    }
                }
            }
            System.out.println();
            System.out.println("Printing Second Column");
            for (int i = 1; i <= n; i++) {
                int m = i;
                for (int j = 1; j <= n; j++) {
                    m += n;
                    if (i >= 1 && j == 1) {
                        System.out.print(m + " ");
                    }
                }
            }
            System.out.println();
            System.out.println("Printing horizontal diagonal bottom-right to top-left");
            for (int i = 1; i <= n; i++) {
                int m = i;
                for (int j = 1; j <= n; j++) {
                    if ((n - i + 1) == j) {
                        System.out.print(m + " ");
                    }
                    m += n;
                }
            }
            System.out.println();
            System.out.println("Printing horizontal diagonal top-right to bottom-left");
            for (int i = n; i >= 1; i--) {
                int m = i;
                for (int j = n; j >= 1; j--) {
                    if ((n - i + 1) == j) {
                        System.out.print(m + " ");
                    }
                    m += n;
                }
            }
            System.out.println();
        }
        else{
            System.out.println("Enter only odd numbers !");
        }
    }
}
public  class ArrayExercise {
    public static void main(String[] args){
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{1,2,3},{4,5,6},{7,8,9}};
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter number : ");
        n = s.nextInt();
        System.out.println("Printing Matrix Multiplication");
        new MatrixMultiplication(A, B);
        new SubArray(array);
        new PatternOperations(n);
    }
}

