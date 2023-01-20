package com.bogdantataru;

/*
cyclic rotation is that every item in our list shifts to the right.
 array = {7, 2, 8, 3, 5} -> {5, 7, 2, 8, 3}  <-  k =1
 k = the number of cyclic rotations that we need to perform.
 */

/*
whenever you need to do any wrapping around think about Pacman
but also think about using the modulus operator because it gives you this in an easy way to implement.
In fact the modulus t is used for example in the circular buffers and also in hashing algorithms.
 */

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{5, 3, 4, 1, 2}, 2)));
        System.out.println(Arrays.toString(new CyclicRotation().antClockwise(new int[]{5, 3, 4, 1, 2}, 2)));

    }

    // A the array that we need to rotate the right and k is the number of rotations that we need to perform on this array.

    // Clockwise
    public int[] solution(int[] A, int k) {
        // create a new array o copy the values from initial array
        int[] result = new int[A.length];
        // save the last digit - will be erased
        int size = A.length;
        // for each elem from result array we copy i element from A array
        for (int i = 0; i < size ; i++) {
            result[(i + k) % size] = A[i]; // new index where we need to copy the item to the new array.
        }
        // result[0] = lastDigit;
        return result;
    }

    // Anticlockwise
    public int[] antClockwise(int[] A, int k) {

        int[] result = new int[A.length];
        int size = A.length;
        for (int i = 0; i < result.length ; i++) {
            result [(i+ (size - k)) % size] = A[i];
        }
        return result;
    }

    // cycling rotation

    public static int[] solutionCyclingRotationSchool(int[] array, int k){

        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result [(i + k)% array.length] = array[i];
        }
        return result;
    }

    public static int[] solutionCyclingRotationBackwardsSchool(int[] array, int k){

        k = (array.length - k % array.length);
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[(i + k) % array.length] = array[i];
        }
        return result;
    }
}
