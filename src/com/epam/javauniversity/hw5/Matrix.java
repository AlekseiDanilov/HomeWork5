package com.epam.javauniversity.hw5;

import java.util.Arrays;

public class Matrix {
    private int[][] elements;

    public Matrix() {
        elements = new int[][]{};
    }

    public Matrix(int[][] elements) {
        if (isMatrix(elements)) {
            this.elements = copyElements(elements);
        } else {
            this.elements = new int[][]{};
        }
    }

    public boolean isMatrix(int[][] elements) {
        if (elements == null) {
            return false;
        }
        for (int row = 0; row < elements.length; row++) {
            if (elements[row] == null) {
                return false;
            }
        }
        int numberElementFirstLine = elements[0].length;
        for (int row = 0; row < elements.length; row++) {
            if (elements[row].length != numberElementFirstLine) {
                return false;
            }
        }
        return true;
    }

    public int getNumberRow() {
        return elements.length;
    }

    public int getNumberCol() {
        return elements[0].length;
    }

    public int[][] getElements(){
        return elements.clone();
    }

    private int[][] copyElements(int[][] elements) {
        int[][] copyElements = new int[elements.length][elements[0].length];
        for (int row = 0; row < elements.length; row++) {
            for (int col = 0; col < elements[0].length; col++) {
                copyElements[row][col] = elements[row][col];
            }
        }
        return copyElements;
    }

    public Matrix clone() {
        return new Matrix(this.copyElements(this.elements));
    }
}