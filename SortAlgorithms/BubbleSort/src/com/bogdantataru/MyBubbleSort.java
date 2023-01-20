package com.bogdantataru;

public class MyBubbleSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        myBubbleSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

    public static int[] myBubbleSort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1 ; j++) {
                if (array[j] > array[j+1]){
                    swap(array, j+1, j );
                }
            }
        }
        return array;
    }


   public static void swap(int[] array, int i,  int j) {

        if (array[i] == array[j]){
            return;
        }

        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
   }

}
