package com.bogdantataru;

public class MatriceaTranspusa {

    public static void main(String[] args) {
        int[][] array = new int[4][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= array.length; j++) {
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

        System.out.println(" -------------------------------------");

//        System.out.print("MultipleOf3And5 array " + Arrays.deepToString(solution(array)) );
        for (int[] line:solution(array)) {
            for (int i : line) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] input) {

        int[][] result = new int[input[0].length][input[1].length];

        // pentru fiecare i (linie) din matrice
        for (int i = 0; i < input.length; i++) {
            // pentru fiecare j (coloana) din matrice
            for (int j = 0; j <= input.length; j++) {

                    result[j][i] = input[i][j];
                // mai avem elemente in input -> trebuie adugate in array-ul input
                // cum ? input[i]
            }
        }

        return result;
    }
}
