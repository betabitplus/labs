package org.nmu.sau.lab.three;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixManagerTest {
    private Matrix exampleOne = new Matrix(3, 3);
    private Matrix exampleTwo = new Matrix(4, 4);

    @Before
    public void init() {
        int[][] arrOne = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] arrTwo = new int[][]{
                {-8, -7, -6, -5},
                {-4, -3, -2, -1},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        exampleOne.setValues(arrOne);
        exampleTwo.setValues(arrTwo);
    }

    @Test
    public void testGetSumMatrixElements() {
        assertEquals(45, MatrixManager.getSumMatrixElements(this.exampleOne));
        assertEquals(0, MatrixManager.getSumMatrixElements(this.exampleTwo));
    }

    @Test
    public void testGetMinMatrixElement() {
        assertEquals(1, MatrixManager.getMinMatrixElement(this.exampleOne));
        assertEquals(-8, MatrixManager.getMinMatrixElement(this.exampleTwo));
    }

    @Test
    public void testGetMaxMatrixElement() {
        assertEquals(9, MatrixManager.getMaxMatrixElement(this.exampleOne));
        assertEquals(8, MatrixManager.getMaxMatrixElement(this.exampleTwo));
    }
}