package com.bogdantataru;

public class SumOfElemRightDiagonal {


    public static void main(String[] args) {

        int[][] array = new int[6][6];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int number =(int) ((Math.random() % 10)*10);
                array[i][j] = number;
            }
        }

        for (int[] line:array) {
            for (int i : line) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

//        System.out.println("Sum " + solution(array));
//        System.out.println("SumLeft " + solutionLeft(array));
        System.out.println("SumLeft " + solution2(array));
    }

    // calculam suma elementelor din dreapta sus a diagonalei principale si din stanga sus a diagonalei secundare
    public static int solution (int[][] input) {

        int sum = 0;
        for (int i = 0 ; i < input.length ; i++) {
            for (int j = 0; j < i; j++ ) {
                sum += input[i][j];
            }
        }
        return sum;
    }

    public static int solutionLeft(int[][] input) {

        int sum = 0;
                        // <= ?
        for (int i = input.length/2; i < input.length ; i++) {

            for (int j = input.length/2;  j < input.length; j++) {

                sum += input[i][j];
            }
            // daca i este impar ex matrice 5 nr

            // daca j este par ex matrice 6 nr
            // parcurgem cu j nr peste diagonala principala si pana la aia secundara

        }
        return sum;
    }
    public static int solutionNorthElem(int[][] input) {
        int sum= 0;

        return sum;
    }

    public static int solution2 (int[][] input) {

        int sum = 0;
        int middle = 0;
        if (input.length % 2 == 0) {
            middle = (input.length / 2)+1 ;
        } else {
            middle = (input.length / 2);
        }

        // iau pe i la mijlocul matricei si nu depasim marginile
        for (int i = middle ; i < input.length; i++) {
            // iau pe j - nr de elem ale matricei - i(middle) si verificam daca j este mai mic decat i
            // adica este sub punctul care reprezinta diagonala principala si cea secundara
            // j mergi de la input.length -i pana la i
            for (int j = input.length - i ; j < i; j++) {
                sum += input[i][j];
            }
        }
        return sum;
    }
}
