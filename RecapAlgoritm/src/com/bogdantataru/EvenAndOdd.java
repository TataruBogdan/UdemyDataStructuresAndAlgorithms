package com.bogdantataru;

public class EvenAndOdd {

    public static void main(String[] args) {

        int[] nums = {5, 7, 2, 4, 9};

        int counterEven = 0;
        int counterOdd = 0;

        for (int i = 0; i <nums.length ; i++) {

            if (nums[i] % 2 == 0) {
                counterEven++;
            }
            else {
                counterOdd++;
            }

        }
    }

}
