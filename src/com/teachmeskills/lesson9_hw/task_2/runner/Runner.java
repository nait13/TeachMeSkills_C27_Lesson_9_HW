package com.teachmeskills.lesson9_hw.task_2.runner;

import com.teachmeskills.lesson9_hw.task_2.matrix.Matrix;
import com.teachmeskills.lesson9_hw.task_2.util.Utils;

/**
 * This class runs the project
 */
public class Runner {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0},
        };

        int[][] arr3 = Matrix.multiplyTwoMatrix(arr1, arr2);
        Utils.printArray(arr1);
        Utils.printArray(arr2);
        Utils.printArray(arr3);

    }
}
