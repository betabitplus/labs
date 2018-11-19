package org.nmu.sau.lab.four;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MatrixManagerTest {
    private Matrix exampleOne = new Matrix(3, 3);
    private Matrix exampleTwo = new Matrix(4, 4);

    @Before
    public void init() {
        List<List<Integer>> arrOne = new ArrayList<List<Integer>>();

        for (int i = 0; i < exampleOne.getRowNum(); i++) {
            arrOne.add(new ArrayList<Integer>());

            for (int j = 0; j < exampleOne.getColNum(); j++) {
                arrOne.get(i).add(exampleOne.getRowNum() * i + j + 1);
            }
        }

        Integer[][] arrTwoSource = {
                {-8, -7, -6, -5},
                {-4, -3, -2, -1},
                { 1,  2,  3,  4},
                { 5,  6,  7,  8}
        };

        List arrTwo = new ArrayList();
        for (Integer[] array : arrTwoSource) {
            arrTwo.add(new ArrayList<Integer>(Arrays.asList(array)));
        }

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