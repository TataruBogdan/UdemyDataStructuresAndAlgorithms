package com.bogdantataru;

public class Main {

    public static void main(String[] args) {


        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};


        System.out.println(linearSearch(intArray, -15));
        System.out.println(linearSearch(intArray, 1));
        System.out.println(linearSearch(intArray, 8888));
        System.out.println(linearSearch(intArray, -22));
       //valueToSearch(-15, intArray);

    }

    //my version
    public static void valueToSearch (int value, int[] input){
        //my linear search algorithm
        for (int i = 0; i < input.length; i++) {
            if (input[i] != value) {
                continue;

            }else {
                System.out.println("Found value" + input[i] + " at index " + i);
            }
        }
    }

    //after school transcript
    public static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value){
                return i;
            }
        }
        return -1;
    }
}
