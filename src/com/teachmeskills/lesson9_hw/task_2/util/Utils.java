package com.teachmeskills.lesson9_hw.task_2.util;

/**
 * This class contains a static method for displaying a matrix on the screen.
 */
public class Utils {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("\n");
    }
}
