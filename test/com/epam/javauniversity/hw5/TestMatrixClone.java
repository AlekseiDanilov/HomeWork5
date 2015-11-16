package com.epam.javauniversity.hw5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestMatrixClone {
    @Test
    public void testMatrixCloneTrue() {
        Matrix matrix = new Matrix(new int[][]{{1, 2},
                                               {3, 4},
                                               {5, 6}}).clone();
        assertArrayEquals(matrix.array,new int[][]{{1, 2},
                                                   {3, 4},
                                                   {5, 6}});
        assertTrue(matrix.numberRow == 3);
        assertTrue(matrix.numberCol == 2);
    }
}