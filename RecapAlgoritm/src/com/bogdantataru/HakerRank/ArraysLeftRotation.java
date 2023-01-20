package com.bogdantataru.HakerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysLeftRotation {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        //System.out.println(Arrays.toString(rotLeft(a, 2)));


        List<Integer> newList = Arrays.asList(5, 9, 8, 6, 7);
        Collections.sort(newList);
        System.out.println(newList);
        miniMaxSum(newList);

    }

    public static void miniMaxSum(List<Integer> arr) {

        Long min = Long.MAX_VALUE;
        Long max = Long.MIN_VALUE;


        Collections.sort(arr);


        int j = arr.size() - 4;

        int i =0;

        while(i < 4) {
            min += arr.get(i);
            i++;
        }

        while(j < arr.size()) {
            max += arr.get(j);
            j++;
        }

        System.out.println(min + " " + max);
    }

    public static int[] rotLeft(int[] array, int d){

        int i = 0;
        int[] result = new int[array.length];
        //(i * d) % array.length
        while(i < array.length) {
            result[(i + (array.length - d)) % array.length] = array[i];
            i++;
        }
        return result;

    }

}
