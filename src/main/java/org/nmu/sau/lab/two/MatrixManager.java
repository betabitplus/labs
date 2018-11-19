package org.nmu.sau.lab.two;

public class MatrixManager {
    public static Matrix generateMatrix(int n, int m, int minGenNum, int maxGenNum) {

        Matrix matrix = new Matrix(n, m);

        for (int i = 0; i < matrix.rowNum; i++) {
            for (int j = 0; j < matrix.colNum; j++) {
                // Generate intanger number in range from minGenNum
                // (inclusive) to maxGenNum (inclusive)
                matrix.values[i][j] = (int) (Math.random() *
                        ((maxGenNum - minGenNum) + 1)) + minGenNum;

            }
        }

        return matrix;
    }

    public static void displayMatrix(Matrix matrix) {
        for (int x[] : matrix.values) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public static int getSumMatrixElements(Matrix matrix) {
        int matrixSum = 0;
        for (int x[] : matrix.values) {
            for (int y : x) {
                matrixSum += y;
            }
        }

        return matrixSum;
    }

    public static int getMinMatrixElement(Matrix matrix) {
        int minElem = matrix.values[0][0];
        for (int x[] : matrix.values) {
            for (int y : x) {
                if (minElem > y) {
                    minElem = y;
                }
            }
        }

        return minElem;
    }

    public static int getMaxMatrixElement(Matrix matrix) {
        int maxElem = matrix.values[0][0];
        for (int x[] : matrix.values) {
            for (int y : x) {
                if (maxElem < y) {
                    maxElem = y;
                }
            }
        }
        return maxElem;
    }
}