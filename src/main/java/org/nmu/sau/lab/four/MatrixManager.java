package org.nmu.sau.lab.four;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for managing matrix
 */
public class MatrixManager {
    /**
     * Generate matrix
     * @param n amount of rows
     * @param m amount of columns
     * @param minGenNum minimum possible number of matrix
     * @param maxGenNum maximum possible number of matrix
     * @return generated matrix
     */
    public static Matrix generateMatrix(int n, int m, int minGenNum, int maxGenNum) {

        Matrix matrix = new Matrix(n, m);
        List<List<Integer>> arr = new ArrayList<List<Integer>>();

        for (int i = 0; i < matrix.getRowNum(); i++) {
            arr.add(new ArrayList<Integer>());

            for (int j = 0; j < matrix.getColNum(); j++) {
                // Generate integer number in range from minGenNum
                // (inclusive) to maxGenNum (inclusive)
                arr.get(i).add((int) (Math.random() * ((maxGenNum - minGenNum) + 1)) + minGenNum);
            }
        }

        matrix.setValues(arr);

        return matrix;
    }

    /**
     * Print matrix on a screen
     * @param matrix matrix for printing
     */
    public static void displayMatrix(Matrix matrix) {
        for (List<Integer> x : matrix.getValues()) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    /**
     * Return sum of all elements in the matrix
     * @param matrix Matrix
     * @return sum of all elements
     */
    public static int getSumMatrixElements(Matrix matrix) {
        int matrixSum = 0;
        for (List<Integer> x : matrix.getValues()) {
            for (int y : x) {
                matrixSum += y;
            }
        }

        return matrixSum;
    }

    /**
     * Return min element in the matrix
     * @param matrix Matrix
     * @return min element
     */
    public static int getMinMatrixElement(Matrix matrix) {
        int minElem = matrix.getValues().get(0).get(0);
        for (List<Integer> x : matrix.getValues()) {
            for (int y : x) {
                if (minElem > y) {
                    minElem = y;
                }
            }
        }

        return minElem;
    }

    /**
     * Return max element in the matrix
     * @param matrix Matrix
     * @return max element
     */
    public static int getMaxMatrixElement(Matrix matrix) {
        int maxElem = matrix.getValues().get(0).get(0);
        for (List<Integer> x : matrix.getValues()) {
            for (int y : x) {
                if (maxElem < y) {
                    maxElem = y;
                }
            }
        }
        return maxElem;
    }
}