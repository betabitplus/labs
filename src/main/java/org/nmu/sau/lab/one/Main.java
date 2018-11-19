package org.nmu.sau.lab.one;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final int ROW_NUM = 3;
        final int COL_NUM = 3;

        final int MAX_GEN_NUM = 50;
        final int MIN_GEN_NUM = 10;

        int matrix[][] = new int[ROW_NUM][COL_NUM];

        for (int i = 0; i < ROW_NUM; i++) {
            for (int j = 0; j < COL_NUM; j++) {
                matrix[i][j] = (int) (Math.random() *
                        ((MAX_GEN_NUM - MIN_GEN_NUM) + 1)) + MIN_GEN_NUM;

            }
        }

        System.out.println("Matrix output:");
        for (int x[] : matrix) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        int matrixSum = 0;
        for (int x[] : matrix) {
            for (int y : x) {
                matrixSum += y;
            }
        }
        System.out.println();
        System.out.println("Sum of matrix: " + matrixSum);

        int minElem = matrix[0][0];
        for (int x[] : matrix) {
            for (int y : x) {
                if (minElem > y) {
                    minElem = y;
                }
            }
        }
        System.out.println("Min element in matrix: " + minElem);

        int maxElem = matrix[0][0];
        for (int x[] : matrix) {
            for (int y : x) {
                if (maxElem < y) {
                    maxElem = y;
                }
            }
        }
        System.out.println("Max element in matrix: " + maxElem);
    }
}
