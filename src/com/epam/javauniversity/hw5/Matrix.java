package com.epam.javauniversity.hw5;

import java.util.Arrays;

public class Matrix {
    int[][] array;
    int numberRow;
    int numberCol;

    public Matrix() {
        array = new int[][]{};
    }

    public Matrix(Matrix matrix) {
        this.numberRow = matrix.numberRow;
        this.numberCol = matrix.numberCol;
        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberCol; j++) {
                this.array[i][j] = matrix.array[i][j];
            }
        }
    }

    public Matrix(int[][] array) {
        if (isMatrix(array)) {
            numberRow = getNumberRow(array);
            numberCol = getNumberCol(array);
            this.array = new int[numberRow][numberCol];
            for (int i = 0; i < numberRow; i++) {
                for (int j = 0; j < numberCol; j++) {
                    this.array[i][j] = array[i][j];
                }
            }
        }
    }

    public boolean isMatrix(int[][] array) {
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return false;
            }
        }
        if (array[0].length == 0) {
            return false;
        }
        int numberElementInLine = array[0].length;
        for (int i = 1; i < array.length; i++) {
            if (array[i].length != numberElementInLine) {
                return false;
            }
        }
        return true;
    }

    private int getNumberRow(int[][] array) {
        return array.length;
    }

    private int getNumberCol(int[][] array) {
        return array[0].length;
    }

    public Matrix clone() {
        int[][] arrayForClone = new int[numberRow][numberCol];
        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberCol; j++) {
                arrayForClone[i][j] = array[i][j];
            }
        }
        return new Matrix(arrayForClone);
    }
}