package com.bogdantataru;

public class PassingCars {

    public static void main(String[] args) {

        System.out.println(PassingCars.solution(new int[] {0, 1, 0, 1, 1}));
    }

    public static int solution(int[] a) {

        int count = 0;

        int[] sums = new int[a.length +1];
        for (int i = a.length - 1; i >= 0; i--) {
            //get the direction for car
            //need to count the number of cars that are oncoming direction 1  with cars with direction 0
            int direction = a[i];
            sums[i] = direction + sums[i+1];
            if (a[i] == 0) count += sums[i];
            if (count > 1000000) return -1;
        }
        return count;
    }
}
