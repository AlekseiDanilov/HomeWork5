package com.epam.javauniversity.hw5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestIntArrayUtilFilter {

    @Test
    public void testIntArrayUtilFilterParity() {
        assertArrayEquals(IntArrayUtil.filter(new int[]{1, 2, 3, 4}, new Predicate() {
            @Override
            public boolean apply(int value) {
                if (value % 2 == 0) {
                    return true;
                }
                return false;
            }
        }), new int[]{2, 4});
    }

    @Test
    public void testIntArrayUtilFilterMoreHundred() {
            assertArrayEquals(IntArrayUtil.filter(new int[]{1, 100, 200, 400, 25}, new Predicate() {
            @Override
            public boolean apply(int value) {
                if (value > 100) {
                    return true;
                }
                return false;
            }
        }), new int[]{200, 400});
    }

    @Test
    public void testIntArrayUtilFilterNullPredicate() {
        assertArrayEquals(IntArrayUtil.filter(new int[]{1}, null), new int[]{});
    }
}