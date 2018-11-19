package org.nmu.sau.lab.five;

import java.util.ArrayList;
import java.util.List;

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
    private List<List<Integer>> values;
    /**
     * Matrix copyright :))
     */
    private final static String AUTHOR = "Stas Avramenko, SAit-15-1";

    Matrix(int n, int m) {
        this.setRowNum(n);
        this.setColNum(m);
        this.values = new ArrayList<List<Integer>>();
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

    public List<List<Integer>> getValues() {
        return this.values;
    }

    public String getAuthor() { return Matrix.AUTHOR; }

    public void setValues(List<List<Integer>> arr) {
        if (this.rowNum != arr.size() && this.colNum != arr.get(0).size()) {
            throw new IllegalArgumentException("Dimension of array is not equal to " +
                    "dimension of the expected matrix!\n" +
                    "Amount of rows must be - " + this.rowNum + " items.\n" +
                    "Amount of columns must be - " + this.colNum + " items.");
        }

        this.values = arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return getRowNum() == matrix.getRowNum() &&
                getColNum() == matrix.getColNum() &&
                (getValues() == matrix.getValues() ||
                        (getValues() != null && getValues().equals(matrix.getValues())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getColNum();
        result = prime * result + getRowNum();
        result = prime * result + ((getValues() == null) ? 0 : getValues().hashCode());
        return result;
    }
}