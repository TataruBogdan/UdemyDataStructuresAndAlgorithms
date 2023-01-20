package com.bogdantataru.HakerRank;

import java.util.Arrays;
import java.util.List;

public class FormingAMagicSquare {

    public static void main(String[] args) {


        List<List<Integer>> intList = Arrays.asList(Arrays.asList(4,9,2),
                Arrays.asList(3,5,7), Arrays.asList(8,1,5));


        //intList.forEach(System.out :: println);

        System.out.println(formingMagicSquareMy(intList));

        // TODO Must study !

    }

    /*
     * Complete the 'formingMagicSquareMy' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static int formingMagicSquareMy(List<List<Integer>> s) {

        int magicConst = 0;
        int n = s.size();
        int diff = 0;

        int[] sums = new int[n*n];
        int index = 0;

        int k = 0;
        int l = s.size() -1;

        for (int y = 0; y < s.size(); y++) {
            for (int i = 0; i < s.get(y).size(); i++) {
                sums[index] += s.get(y).get(i);
                if (sums[index] % n == 0) {
                    magicConst = sums[index];
                }
            }
            index++;
        }
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < s.get(i).size(); j++) {
                sums[index] += s.get(j).get(i);
                if (sums[index] % n == 0 && sums[index] >= magicConst){
                    magicConst = sums[index];
                }
            }
            index++;
        }
        while (k < n) {
            sums[index] += s.get(k).get(k);
            if (sums[index] % n == 0 && sums[index] >= magicConst){
                magicConst = sums[index];
            }
            k++;
        }
        index++;

        while (l >= 0) {
            sums[index] += s.get(l).get(l);
            if (sums[index] % n == 0 && sums[index] >= magicConst){
                magicConst = sums[index];
            }
            l--;
        }


        for (int i = 0; i < n; i++) {
            if (sums[i] != 0) {
                diff += Math.abs(sums[i] - magicConst);
            }
        }

        return diff;
    }

    public static int formingMagicSquareNet(List<List<Integer>> s) {

        //list of all possible magic squares for ints 1-9
        int[][] magic = new int[][]{{8, 1, 6, 3, 5, 7, 4, 9, 2},
                {6, 1, 8, 7, 5, 3, 2, 9, 4},
                {4, 9, 2, 3, 5, 7, 8, 1, 6},
                {2, 9, 4, 7, 5, 3, 6, 1, 8},
                {8, 3, 4, 1, 5, 9, 6, 7, 2},
                {4, 3, 8, 9, 5, 1, 2, 7, 6},
                {6, 7, 2, 1, 5, 9, 8, 3, 4},
                {2, 7, 6, 9, 5, 1, 4, 3, 8}};
        int[] input = new int[9];
        int minCost = Integer.MAX_VALUE;
        int diff = 0;
        int inputIndex = 0;
        //convert 2D Array List s into a 1D array
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < s.get(i).size(); j++) {
                input[inputIndex] = s.get(i).get(j);
                inputIndex++;
            }
        }
        for (int i = 0; i < magic.length; i++) {
            for (int j = 0; j < magic[i].length; j++) {
                diff += Math.abs((magic[i][j] - input[j]));
            }
            if (diff < minCost) {
                minCost = diff;
            }
            diff = 0;   //reset back to 0 to test the next row
        }
        return minCost;
    }
}
