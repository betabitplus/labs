package org.nmu.sau.lab.two;

public class Matrix {
    protected int rowNum;
    protected int colNum;
    protected int[][] values;

    Matrix(int n, int m) {
        this.rowNum = n;
        this.colNum = m;
        this.values = new int[n][m];
    }
}
