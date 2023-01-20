package com.bogdantataru.HakerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {


    public static void main(String[] args) {


        System.out.println(arrayLeftRotation(Arrays.asList(3,4,5), 2));
    }

    /*
    John Watson knows of an operation called a right circular rotation on an array of integers.
    One rotation operation moves the last array element to the first position and shifts all remaining elements right one.
    To test Sherlock's abilities, Watson provides Sherlock with an array of integers.
    Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

For each array, perform a number of right circular rotations and return the values of the elements at the given indices.
            * Complete the 'circularArrayRotation' function below.
            *
            * The function is expected to return an INTEGER_ARRAY.
            * The function accepts following parameters:
            *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

        List<Integer> result = new ArrayList<>();

        List<Integer> rotateArray = arrayLeftRotation(a, k);
        for (Integer q: queries) {
            result.add(rotateArray.get(q));
        }

        return result;

    }

    public static List<Integer> arrayLeftRotation (List<Integer> integerList, int k) {

        List<Integer> resultArray = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            resultArray.add(i,0);
        }

        for (int i = 0; i < integerList.size(); i++) {
            resultArray.set((i + k) % integerList.size(), integerList.get(i));
        }

        return resultArray;
    }
}
