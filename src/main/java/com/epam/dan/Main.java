package com.epam.dan;

public class Main {
    public static void main(String[] args) {
        Matrix first = new Matrix (2,4);
        Actions z = new Actions();

        System.out.println("First matrix:");
        z.randomFillMatrix(first);
        first.printMatrix();


        System.out.println("\n Second matrix:");

        Matrix second = new Matrix (4,3);
        z.randomFillMatrix(second);
        second.printMatrix();
        System.out.println("\n Result of multiplying matrices:");

        z.MultiplexMatrix(first, second);

    }
}
