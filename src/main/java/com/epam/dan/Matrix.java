package com.epam.dan;


public class Matrix {
    int a, b, i, j;
    int [][]firstMatrix = new int [5][5];
    int [][]secondMatrix = new int [5][5];
    public static void main(String[] args) {
Matrix multipleMatrix = new Matrix();
        multipleMatrix.firstMatrix();
        System.out.println();
        multipleMatrix.secondMatrix();
        System.out.println();
        multipleMatrix.multiple();
    }
    public void firstMatrix (){
        for (a=0; a<firstMatrix.length; a++){
            for (b=0; b<5; b++){
                firstMatrix[a][b]=(int)(Math.random()*100);
System.out.print(firstMatrix[a][b]+"\t");

            }
            System.out.println();
        }
    }
    public void secondMatrix (){
               for (i=0; i<5; i++){
            for (j=0; j<5; j++){
                secondMatrix[i][j]=(int)(Math.random()*100);
                System.out.print(secondMatrix[i][j]+"\t");

            }
            System.out.println();
        }
    }
public void multiple (){
        int [][]multiple = new int [5][5];
    int q, s;
    for (q=0; q<5; q++){
        for (s=0; s<5; s++){
            multiple[q][s]=firstMatrix[q][s]*secondMatrix[q][s];
            System.out.print(multiple[q][s]+"\t");
        }
        System.out.println();
    }
    }
}