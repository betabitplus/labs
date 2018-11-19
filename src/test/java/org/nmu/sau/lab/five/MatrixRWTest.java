package org.nmu.sau.lab.five;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MatrixRWTest {
    private Matrix matrix = MatrixManager.generateMatrix(4, 4, 20, 70);

    @Test
    public void readWrite() throws IOException {
        MatrixRW.write(matrix, "E:\\kek\\example1.json");
        Matrix readMatrix = MatrixRW.read("E:\\kek\\example1.json");
        assertEquals(matrix, readMatrix);
    }

    @Test(expected = IOException.class)
    public void readException() throws IOException {
        MatrixRW.read("E:\\kkkek\\example1.json");
    }

    @Test(expected = IOException.class)
    public void writeException() throws IOException {
        MatrixRW.write(matrix, "E:\\kkek\\example1.json");
    }
}