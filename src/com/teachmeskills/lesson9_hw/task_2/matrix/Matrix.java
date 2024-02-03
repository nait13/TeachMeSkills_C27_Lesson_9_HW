package com.teachmeskills.lesson9_hw.task_2.matrix;


public class Matrix {
    public static int[][] multiplyTwoMatrix(int[][] arr1, int[][]arr2){
        int[][] arr3 = new int[arr1.length][arr2[0].length];
        if(arr1[0].length != arr2.length){
            System.out.println("Не возможно перемножить эти матрицы!");
            System.exit(1);
            return null;
        }else {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    int value = 0;
                    for (int k = 0; k < arr2.length; k++) {
                        value += arr1[i][k] * arr2[k][j];
                        arr3[i][j] = value;
                    }
                }
            }
        }
        return arr3;
    }
}
