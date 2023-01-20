package com.bogdantataru.eulerProject;

import java.util.Scanner;

public class LargestProductInAGrid_11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for (int grid_i = 0; grid_i < 20; grid_i++) {
            for (int grid_j = 0; grid_j < 20; grid_j++) {
                grid[grid_i][grid_j] = in.nextInt();

            }
        }
        long greatestProduct = 0;
        for (int i = 0; i < grid.length - 3; i++) {
            for (int j = 0; j < grid.length - 3; j++) {

                long productDiagonalLeft = 0;

                long lineValueL0 = grid[i][j];
                long lineValueL1 = grid[i + 1][j + 1];
                long lineValueL2 = grid[i + 2][j + 2];
                long lineValueL3 = grid[i + 3][j + 3];
                productDiagonalLeft = lineValueL0 * lineValueL1 * lineValueL2 * lineValueL3;
                if (productDiagonalLeft > greatestProduct) greatestProduct = productDiagonalLeft;

                long productDiagonalRight = 0;
                long lineValueR0 = grid[i + 3][j];
                long lineValueR1 = grid[i + 2][j + 1];
                long lineValueR2 = grid[i + 1][j + 2];
                long lineValueR3 = grid[i][j + 3];

                productDiagonalRight = lineValueR0 * lineValueR1 * lineValueR2 * lineValueR3;
                if (productDiagonalRight > greatestProduct) greatestProduct = productDiagonalRight;

                int productLine = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
                if (productLine > greatestProduct) greatestProduct = productLine;

                int productColumn = grid[j][i] + grid[j+1][i] * grid[j+2][i] * grid [j+3][i];
                if (productColumn > greatestProduct) greatestProduct = productColumn;

//                greatestProduct = (productDiagonalLeft > greatestProduct || productDiagonalRight > greatestProduct ||
//                                   productLine >  greatestProduct || productColumn > greatestProduct) ? productDiagonalLeft : productDiagonalRight : productLine : productColumn);

            }
        }
        System.out.println(greatestProduct);
    }
}
