package com.epam.dan;


public class Matrix {
    private int[][] a;

    public Matrix(int row, int col) {
        a = new int[row][col];
    }

    public void setValue(int row, int col, int val) {
        a[row][col] = val;
    }

    public int getValue(int row, int col) {
        return a[row][col];
    }

    public int getRow() {
        return a.length;
    }

    public int getCol() {
        return a[0].length;
    }

    public void printMatrix() {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getCol(); j++) {
                System.out.print(getValue(i, j) + "\t");
            }
            System.out.println();

        }
    }
}
