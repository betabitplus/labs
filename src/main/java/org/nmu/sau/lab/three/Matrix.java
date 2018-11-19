package org.nmu.sau.lab.three;

/**
 * Class for holding matrix
 */
public class Matrix {
    /**
     * Amount of rows in matrix
     */
    private int rowNum;
    /**
     * Amount of columns in matrix
     */
    private int colNum;
    /**
     * Matrix values
     */
    private int[][] values;

    Matrix(int n, int m) {
        this.setRowNum(n);
        this.setColNum(m);
        this.values = new int[this.rowNum][this.colNum];
    }

    public int getColNum() {
        return this.colNum;
    }

    public void setColNum(int colNum) {
        if (colNum < 1) {
            throw new IllegalArgumentException("Matrix can't have less than one column!");
        }

        this.colNum = colNum;
    }

    public int getRowNum() {
        return this.rowNum;
    }

    public void setRowNum(int rowNum) {
        if (rowNum < 1) {
            throw new IllegalArgumentException("Matrix can't have less than one row!");
        }

        this.rowNum = rowNum;
    }

    public int[][] getValues() {
        return this.values;
    }

    public void setValues(int[][] arr) {
        if (this.rowNum != arr.length && this.colNum != arr[0].length) {
            throw new IllegalArgumentException("Dimension of array is not equal to dimension of the expected matrix!\n" +
                    "Amount of rows must be - " + this.rowNum + " items.\n" +
                    "Amount of columns must be - " + this.colNum + " items.");
        }

        this.values = arr;
    }
}
