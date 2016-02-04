package com.epam.dan;


public class Actions {

    public void randomFillMatrix(Matrix t) {
        int z;
        for (int i = 0; i < t.getRow(); i++) {
            for (int j = 0; j < t.getCol(); j++) {
                z = (int) (Math.random() * 100);
                t.setValue(i, j, z);
            }

        }
    }


    public void MultiplexMatrix(Matrix a, Matrix b) {
        Matrix res = new Matrix(a.getRow(), b.getCol());
        if (b.getRow() != a.getCol()) {
            System.out.println("Multiplication is impossible. Incompatible matrices");
        } else {

            for (int i = 0; i < a.getRow(); i++) {
                for (int j = 0; j < b.getCol(); j++) {
                    int z = 0;
                    for (int s = 0; s < b.getRow(); s++) {
                        z += a.getValue(i, s) * b.getValue(s, j);

                    }
                    System.out.print(z + "\t");
                }
                System.out.println();
            }

        }

    }
}
