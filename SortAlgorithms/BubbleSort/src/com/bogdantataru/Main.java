package com.bogdantataru;

public class Main {

    public static void main(String[] args) {


        int[] intArray = { 20, 35, 15, 7, 55, 1, -22};

        for (int lastUnsortedPartition = intArray.length - 1; lastUnsortedPartition >0 ; lastUnsortedPartition-- ){
            for (int i = 0; i < lastUnsortedPartition; i++) {
                if(intArray[i] > intArray[i+1]){
                    swap(intArray,i,i+1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {

        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
