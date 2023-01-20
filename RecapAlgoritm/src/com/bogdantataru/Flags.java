package com.bogdantataru;

public class Flags {

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        System.out.println(new Flags().solution(array));
    }


    //input - height of the mountain at the different points
    //return - maxim number of flags that can be placed on the given input
    public int solution(int[] a) {

        // We say what if I have 20 units of space how many flags can I fit?
        // We can never place more flags than the square root of 20 plus 2.
        double MaxFlags = Math.sqrt(a.length) + 2;

        int[] peaks = new int[a.length]; // This will hold the pointer indexes to the next peak.
        // Initially we assign it a value to be outside the boundaries of our array because we are going to start processing from the end
        // and at the end we want to signify that there are no further peaks. So we use an index that is bigger than the size of the array
        int nextPeak = a.length; // will be used while populating the peaks array.
        //populate the last and the first item of the peak array last item represented by peaks at A.length minus 1 can be the length of the array or next
        peaks[a.length - 1] = nextPeak;
        for (int i = a.length - 2; i > 0; i--) {
            //  if it is a peak we set the index of this position to be the value of our second array.
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                //put as a last item in our array the size of our input array.
                nextPeak = i;
            }
            peaks[i] = nextPeak;
        }
        peaks[0] = nextPeak;

        int current_guess = 0;
        int next_guess = 0;
        while (canPlaceFlags(peaks, next_guess)){
            current_guess = next_guess;
            next_guess += 1;
        }
        return current_guess;

    }

    private boolean canPlaceFlags(int[] pecks, int flagsToPlace) {
        int currentPosition = 1 - flagsToPlace;
        for (int i = 0; i < flagsToPlace; i++) {
            if (currentPosition + flagsToPlace > pecks.length -1) return false;
            currentPosition = pecks[currentPosition + flagsToPlace];
        }
        return currentPosition < pecks.length;
    }

}
