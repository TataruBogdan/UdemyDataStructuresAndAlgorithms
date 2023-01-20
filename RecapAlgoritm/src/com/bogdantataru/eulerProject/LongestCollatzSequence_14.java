package com.bogdantataru.eulerProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestCollatzSequence_14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] arr = new int[t];
        Map<Integer, Integer>  sequences = new HashMap<>();

        for (int a = 0; a < t; a++) {
            int N = scanner.nextInt();
            int maxCount = 0;
            int maxNumber = 0;
            for (int i = 2; i <= N; i++) {
                int k = i;
                int count = 0;
                while (k > 1) {
                    if(isEven(k)) {
                        k = k / 2;
                        if (sequences.containsKey(k)){
                            count += sequences.get(k) + 1;
                            break;
                        }else {
                            count++;
                        }
                    }
                    else if (!isEven(k)){
                        k = (3 * k)+ 1;
                        if (sequences.containsKey(k)){
                            count += sequences.get(k) + 1;
                            break;
                        } else {
                            count++;
                        }
                    }
                }
                if (count >= maxCount){
                    maxCount = count;
                    maxNumber = i;
                }
                if (!sequences.containsKey(i)){
                    sequences.put(i, count);
                }
            }
            arr[a] = maxNumber;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
