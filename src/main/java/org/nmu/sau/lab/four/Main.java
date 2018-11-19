package org.nmu.sau.lab.four;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = MatrixManager.generateMatrix(4, 4, 20, 70);

        System.out.println("Matrix output:");
        MatrixManager.displayMatrix(matrix);

        System.out.println();

        System.out.println("Sum of matrix: " + MatrixManager.getSumMatrixElements(matrix));
        System.out.println("Min element in matrix: " + MatrixManager.getMinMatrixElement(matrix));
        System.out.println("Max element in matrix: " + MatrixManager.getMaxMatrixElement(matrix));
    }
}
