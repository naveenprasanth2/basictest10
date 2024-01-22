package org.example.practise3;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixOne = {{1, 2}, {3, 4}};
        int[][] matrixTwo = {{2, 4}, {8, 9}};
        int[][] resultMatrix = new int[matrixOne[1].length][matrixTwo[0].length];
        if (checkEligibility(matrixOne, matrixTwo)) {

            for (int i = 0; i < matrixOne[0].length; i++) {
                int iVal = i;
                int value = 0;
                for (int j = 0; j < matrixTwo[0].length; j++) {
                    value += matrixOne[i][j] * matrixTwo[j][i];
                }
                resultMatrix[i][iVal] = value;
            }

            System.out.println(Arrays.deepToString(resultMatrix));
        } else {
            System.out.println("the matrices are not eligible for multiplication");
        }
    }

    static boolean checkEligibility(int[][] matrixOne, int[][] matrixTwo) {
        return matrixOne[1].length == matrixTwo[0].length;
    }
}
