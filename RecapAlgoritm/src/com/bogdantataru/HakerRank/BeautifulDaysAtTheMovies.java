package com.bogdantataru.HakerRank;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {

        System.out.println(beautifulDays(20,23, 6));
    }

    public static int beautifulDays(int i, int j, int k) {

        int count = 0;

        for (int l = i; l <= j; l++) {
            if ((l - reverse(l)) % k == 0) {
                count++;
            }
        }
        return count;

    }

    public static int reverse (int num) {

        int reverseNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            if (reverseNum == 0) {
                reverseNum = lastDigit;
            } else {
                reverseNum = (reverseNum * 10) + lastDigit;
            }
            num = num / 10;
        }

        return reverseNum;
    }
}
