package com.bogdantataru;

import java.util.Arrays;

public class Equilibrium {



    public static void main(String[] args) {
        int[] array = {3,1,2,4,3};
        int[] intArray = {7,2,8,3,5};
        System.out.println("Minimum : "+ solution(array));
    }

    // given an input array containing n items and the aim of this problem is to find the point in this array.
    // We call it point P or the pivot if you like that divides the array into two.
    // It is divided into a left and right part. The left part is every item contained before P.
    // The aim of this puzzle is to find the point where the left and the right part of the array are in balance.
    // What we mean by that is when you sum the left part of the array and you sum the right part of the array
    // the difference between those two sums is at a minimum.
    // The aim, as I said before, is to divide the array in a way where this result where this absolute difference is
    // at a minimum.
    public static int solution(int[] input) {

        int leftSum = input[0];
        int rightSum = 0;// sum of all elements

        for (int elem : input) {
            rightSum += elem;
        }
        rightSum -= leftSum;

        int diff = Math.abs(leftSum - rightSum);
        for (int i = 1; i < input.length -1; i++) {
             leftSum += input[i];
             rightSum -= input[i];
             int currentDiff = Math.abs(leftSum - rightSum);
             if (diff > currentDiff) diff = currentDiff; // minimum absolute difference
        }
        return diff;
    }




}
