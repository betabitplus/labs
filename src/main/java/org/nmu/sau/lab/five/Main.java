package org.nmu.sau.lab.five;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = MatrixManager.generateMatrix(4, 4, 20, 70);

        boolean isReadingCorrect = true;
        Matrix readMatrix = null;

        System.out.println("Matrix output:");
        MatrixManager.displayMatrix(matrix);

        System.out.println();

        System.out.println("Sum of matrix: " + MatrixManager.getSumMatrixElements(matrix));
        System.out.println("Min element in matrix: " + MatrixManager.getMinMatrixElement(matrix));
        System.out.println("Max element in matrix: " + MatrixManager.getMaxMatrixElement(matrix));

        System.out.println();

        try {
            System.out.println("Writing matrix to the file...");
            MatrixRW.write(matrix, "E:\\kek\\example1.json");

            System.out.println("Reading matrix from the file...");
            readMatrix = MatrixRW.read("E:\\kek\\example1.json");
        }
        catch (IOException e) {
            System.out.println("Dear programmer, attention!!!");
            System.out.println(e.getMessage());
            isReadingCorrect = false;
        }
        finally {
            System.out.println("An attempt was made to write and read the matrix.");
        }

        if (isReadingCorrect) {
            System.out.println("The number of columns in the read matrix is " +
                    readMatrix.getColNum() + " items.");
        }
    }
}
