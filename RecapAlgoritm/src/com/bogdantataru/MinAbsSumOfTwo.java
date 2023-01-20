package com.bogdantataru;

import java.util.Arrays;

public class MinAbsSumOfTwo {

    public static void main(String[] args) {

        int[] array = {-8, 4, 5, 0, 3};
        int[] array2 = {-7, 3, -1, 5, -11, 4, -9, 14, 17, -2};

        // System.out.println(new MinAbsSumOfTwo().recursionSolution(array));

        System.out.println(new MinAbsSumOfTwo().schoolMy2(array2));
        System.out.println(new MinAbsSumOfTwo().mySchoolSolution(array2));
        System.out.println(new MinAbsSumOfTwo().solution(array));
        System.out.println(new MinAbsSumOfTwo().solution(array2));

    }

    public int solution (int[] A) {

        int minAbsSumOfTwo = Integer.MAX_VALUE;
        Arrays.sort(A);
        int head = 0;
        int tail = A.length -1;
        while (head <= tail) {
            minAbsSumOfTwo = Math.min(minAbsSumOfTwo, Math.abs(A[head] + A[tail]));
            if (A[head] + A[tail] < 0) head++;
            else tail--;
        }
        return minAbsSumOfTwo;
    }



    //return the min absolute sum of two number
    public int solutionNaive(int[] A) {

        // luam cea mai mare valoare si daca valoare pe care o gasim in insumarea celor doua numere < Max atunci min = abs result
        int minSoFar = Integer.MAX_VALUE;
        // pentru fiecare valoare a lui back trebuie sa ii adunam cu fiecare valoare a lui front si sa acctualizam un min
        for (int back = 0; back < A.length - 1; back ++) {
            for (int front = 0 ; front < A.length ; front++){
                int result = A[back] + A[front];
                int min = Math.abs(result);
                //daca valoare lui back + front este < decat abs value a minim nostru atunci minim = acea valoare
                if (min < minSoFar) {
                    minSoFar = min;
                }
            }
        }
        return minSoFar;
    }

    public int schoolMy2(int[] A) {

        int negativeMaxValue = Integer.MIN_VALUE;
        int positiveMinValue = Integer.MAX_VALUE;

        //if we have a 0 value

        //if number is negative we pick the biggest value from negative numbers
        for (int i = 0; i < A.length ; i++) {
            if (A[i] == 0){
                positiveMinValue = negativeMaxValue = 0;
            }
            if (A[i] > negativeMaxValue && A[i] < 0) {
                negativeMaxValue = A[i];
            }
        }

        //if number is positive we pick the smallest value from positive numbers
        for (int j = 0; j < A.length; j++) {
            if (A[j] < positiveMinValue && A[j] > 0) {
                positiveMinValue = A[j];
            }
        }
        // we sum the biggest negative number with the smallest positive number we get the minimum sum
        int sum = negativeMaxValue + positiveMinValue;
        int minAbsSum = Math.abs(sum);

        return minAbsSum;

    }


    public int mySchoolSolution(int[] A) {

        int minAbsSumOfTwo = Integer.MAX_VALUE;

        //  order the input list by the value of each element.
        Arrays.sort(A);
        int head = 0;
        int tail = A.length-1;

        while (head < A.length/2+1 || tail > A.length/2) {
            int sum = A[head] + A[tail];
            int tempAbs = Math.abs(sum);
            // if we find a 0 value that is the minimum value that we can find
            if (A[head] == 0 || A[tail] == 0) {
                return 0;
            }
            // we compare this number, this positive number with the value of our minimum absolute sum.
            if (tempAbs < minAbsSumOfTwo) {
                minAbsSumOfTwo = tempAbs;
            }
            // make a choice - which pointer we should move :
                // if tail is bigger than head we decrement tail-
                // We can find out which one is bigger, whether it's the 11, the positive value of this or the 17 by looking at the result.
                // If the result is positive, it means that this value of tail is larger than the absolute value of head
            if(sum >0) {
                tail--;
            }

            // if head is bigger than tail we increment head
            if (sum <0) {
                head ++;
            }
        }
        return minAbsSumOfTwo;
    }
}
