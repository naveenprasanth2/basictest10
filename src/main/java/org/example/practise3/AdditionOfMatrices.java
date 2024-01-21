package org.example.practise3;

import java.util.Arrays;

public class AdditionOfMatrices {
    public static void main(String[] args) {
        int[][] matrixOne = {{1, 2}, {3, 4}};
        int[][] matrixTwo = {{2, 4}, {8, 9}};

        int[][] resultMatrix = new int[matrixOne.length][matrixTwo.length];

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixTwo.length; j++) {
                resultMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        System.out.println(Arrays.deepToString(resultMatrix));
    }
}
