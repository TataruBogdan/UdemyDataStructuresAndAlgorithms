package com.bogdantataru;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };

        bucketSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void bucketSort(int[] input){


        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            // using array list for the buckets
            buckets[i] = new ArrayList<>();

            // using linked list for the buckets
            //buckets[i] = new LinkedList<>();
        }

        //scattered each element - we hashed and obtained the position and
        // insert the value of each element into the bucket at position returned by hash()
        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        // we need to sort each bucket - sort algorithm (use the one from Collections)
        for (List bucket :buckets) {
             Collections.sort(bucket);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]){
                input[j++] = value;

            }
        }
    }

    private static int hash(int value){
        int digit = value / (int) 10 % 10; // <=> value / (int)10
        return digit;
    }
}
