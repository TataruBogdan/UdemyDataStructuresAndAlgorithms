package com.bogdantataru;

public class BubblesSortFlag {


    public static void main(String[] args) {


        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        bubbleSortFlag(intArray);

        for (int i = 0; i < intArray.length -1; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static int[] bubbleSortFlag(int[] array){
        int count = 0;
        int n = array.length ;
        for (int i = 0; i < n-1; i++) {
            // set the initial value of the flag as false
            boolean flag = false;
            // while is true that flag is false
            while (!flag) {
                for (int j = 0; j < n-i-1; j++) {
                    if (array[j] > array[j+1]){
                        swap(array, j, j+1);
                        flag = true;
                    }
                }
                count++;
            }
        }
        System.out.println("Number of loop's for sorting our array " + count);
        return array;

    }

    public static void swap(int[] array, int i, int j) {
        //if the values of elements are equal
        if (array[i] == array[j]) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }




}
