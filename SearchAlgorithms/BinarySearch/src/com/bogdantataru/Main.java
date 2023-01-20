package com.bogdantataru;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { -22, -15, 1, 7, 20, 35, 55};
        int value = 55;

//        System.out.println(iterativeBinarySearch(intArray, -15));
//        System.out.println(iterativeBinarySearch(intArray, 35));
//        System.out.println(iterativeBinarySearch(intArray, 8885));
//        System.out.println(iterativeBinarySearch(intArray, 1));

        System.out.println(recursiveBinarySearch(intArray, value));

    }

    public static int iterativeBinarySearch(int[] input, int value){

        int start = 0;
        int end = input.length;

        while(start < end) {
            int midpoint = (start + end)/2;
            System.out.println("midpoint = " + midpoint + " midpoint value = " + input[midpoint]);

            if (input[midpoint] == value) {
                return midpoint;
            }
            else if (input[midpoint] < value){
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value){

        return recursiveSearch(input, 0, input.length, value);
    }

    public static int recursiveSearch(int[] input, int start, int end, int value){

        if (start >= end){
            return -1;
        }

        int midpoint = (start+end)/2;

        if (input[midpoint] == value){
            return midpoint;

        }
        else if(input[midpoint] > value){
            return recursiveSearch(input, start, midpoint, value);
        }
        else {
            return recursiveSearch(input, midpoint+1, end, value);
        }
    }
}


