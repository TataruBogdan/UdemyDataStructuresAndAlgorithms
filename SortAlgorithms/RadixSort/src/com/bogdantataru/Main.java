package com.bogdantataru;

public class Main {

    public static void main(String[] args) {

        // radix - toate numerele sunt numere zecimale
        // width - toate cifrele au o latime de 4 cifre
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);

        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }
    }

    // we start ar the right most position and we sort based on that position
    // - for each position in our values, width 4 - loop 4 times, it'll do the sort based on one of the positions
    public static void radixSort(int[] input, int radix, int width) {
        // the start position is 0 LEAST SIGNIFICANT DIGIT TO MOST SIGNIFICANT DIGIT  - based on the one's position
        // ON EACH PASS WE MODIFY THE POSITION THAT WE SORT THE NUMBERS
        for (int i = 0; i < width; i++) { // -i this gives the POSITION
            radixSingleSort(input, i, radix);
        }
    }

    //we have to use a stable sort algorithm at each stage, so when we sort the values based on the rightmost position,
    // this returns the sorted algorithm for each STEPS
    public static void radixSingleSort(int[] input, int position, int radix) {

        int numItems = input.length; // stores how many items gonna be sorting
        int[] countArray = new int[radix]; // create a countArray large enough to hold all the possible values based on radix 0-9

        for (int value: input ) {
            // count how many values have a certain digit in whatever position we're looking at
            //getDigit going to return the digit -> then we're going to increment the count by one !
            countArray[getDigit(position, value, radix)]++;
        }

        //Adjusting the count array - we want each position in the countArray to contain how values have that digit or less than that digit
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        //STABLE COUNTING SORT - where values should be written back to the original array, and then by writing the values into the in backwards order, we get stability,
        int[] temp  = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex]; // we assign input[tempIndex] - input[5] (5729) to temp[1]
        }

        // copy them back from the temporary array into the input array
        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    //radix - explanation for radix = 10 - return each time the last digit- return value % radix(10)
    public static int getDigit(int position, int value, int radix) {
        int digitCountArray =  (value / (int) Math.pow(radix, position)) % radix;
        return digitCountArray;
    }
}
