package com.epam.javauniversity.hw5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestMatrixClone {
    @Test
    public void testMatrixCloneTrue() {
        Matrix matrix = new Matrix(new int[][]{{1, 2},
                                               {3, 4},
                                               {5, 6}}).clone();
        assertArrayEquals(matrix.getElements(),new int[][]{{1, 2},
                                                           {3, 4},
                                                           {5, 6}});
    }
}